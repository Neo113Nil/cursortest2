package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.unr0;
import defpackage.vfc;
import java.util.Map;

/* loaded from: classes11.dex */
public class HttpAuthResponse {
    private Integer action;
    private String password;
    boolean permanentPersistence;
    private String username;

    public HttpAuthResponse(String str, String str2, boolean z, Integer num) {
        this.username = str;
        this.password = str2;
        this.permanentPersistence = z;
        this.action = num;
    }

    public static HttpAuthResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new HttpAuthResponse((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD), ((Boolean) map.get("permanentPersistence")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpAuthResponse httpAuthResponse = (HttpAuthResponse) obj;
            if (this.permanentPersistence != httpAuthResponse.permanentPersistence || !this.username.equals(httpAuthResponse.username) || !this.password.equals(httpAuthResponse.password)) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = httpAuthResponse.action;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 == null) {
                return true;
            }
        }
        return false;
    }

    public Integer getAction() {
        return this.action;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int b = (unr0.b(this.username.hashCode() * 31, 31, this.password) + (this.permanentPersistence ? 1 : 0)) * 31;
        Integer num = this.action;
        return b + (num != null ? num.hashCode() : 0);
    }

    public boolean isPermanentPersistence() {
        return this.permanentPersistence;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPermanentPersistence(boolean z) {
        this.permanentPersistence = z;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpAuthResponse{username='");
        sb.append(this.username);
        sb.append("', password='");
        sb.append(this.password);
        sb.append("', permanentPersistence=");
        sb.append(this.permanentPersistence);
        sb.append(", action=");
        return vfc.o(sb, this.action, '}');
    }
}
