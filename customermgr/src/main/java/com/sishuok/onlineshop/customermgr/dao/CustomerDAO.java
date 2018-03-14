package com.sishuok.onlineshop.customermgr.dao;


import com.sishuok.onlineshop.customermgr.vo.CustomerModel;
import com.sishuok.onlineshop.customermgr.vo.CustomerQueryModel;
import java.util.List;


public interface CustomerDAO {
	public CustomerModel getByUuid(int uuid);
	public void delete(int uuid);
	public void update(CustomerModel cm);
	public void create(CustomerModel cm);
	public List<CustomerModel> getByCondition(CustomerQueryModel cqm);
}
