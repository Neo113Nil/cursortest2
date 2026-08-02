package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.smw0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class URLRequest {
    private byte[] body;
    private Map<String, String> headers;
    private String method;
    private String url;

    public URLRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
        this.url = str;
        this.method = str2;
        this.body = bArr;
        this.headers = map;
    }

    public static URLRequest fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("url");
        if (str == null) {
            str = "about:blank";
        }
        return new URLRequest(str, (String) map.get("method"), (byte[]) map.get("body"), (Map) map.get("headers"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            URLRequest uRLRequest = (URLRequest) obj;
            String str = this.url;
            String str2 = uRLRequest.url;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.method;
            String str4 = uRLRequest.method;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            if (!Arrays.equals(this.body, uRLRequest.body)) {
                return false;
            }
            Map<String, String> map = this.headers;
            Map<String, String> map2 = uRLRequest.headers;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public byte[] getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.method;
        int hashCode2 = (Arrays.hashCode(this.body) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        Map<String, String> map = this.headers;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.url);
        hashMap.put("method", this.method);
        hashMap.put("headers", this.headers);
        hashMap.put("body", this.body);
        hashMap.put("allowsCellularAccess", null);
        hashMap.put("allowsConstrainedNetworkAccess", null);
        hashMap.put("allowsExpensiveNetworkAccess", null);
        hashMap.put("cachePolicy", null);
        hashMap.put("httpShouldHandleCookies", null);
        hashMap.put("httpShouldUsePipelining", null);
        hashMap.put("networkServiceType", null);
        hashMap.put("timeoutInterval", null);
        hashMap.put("mainDocumentURL", null);
        hashMap.put("assumesHTTP3Capable", null);
        hashMap.put("attribution", null);
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLRequest{url='");
        sb.append(this.url);
        sb.append("', method='");
        sb.append(this.method);
        sb.append("', body=");
        sb.append(Arrays.toString(this.body));
        sb.append(", headers=");
        return smw0.n(sb, this.headers, '}');
    }
}
