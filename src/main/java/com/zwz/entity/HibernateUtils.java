package com.zwz.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	//��̬������ʵ��
	static Configuration cfg = null;
	static SessionFactory sessionFactory = null;
	static{
		//���غ��������ļ�
		cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	//�ṩ��������sessinfactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
		
	}
	public static void main(String[] args) {
		
	}

}
	
