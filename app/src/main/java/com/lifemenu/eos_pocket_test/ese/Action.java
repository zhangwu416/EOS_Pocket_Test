package com.lifemenu.eos_pocket_test.ese;

/**
 * Action
 * 
 * @author espritblock http://eblock.io
 *
 */
public enum Action {

	transfer("4,${quantity}@eosio.token"), account("account"), ram("ram"), delegate("4,${quantity}@eosio.token");

	private String code;

	private Action(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}