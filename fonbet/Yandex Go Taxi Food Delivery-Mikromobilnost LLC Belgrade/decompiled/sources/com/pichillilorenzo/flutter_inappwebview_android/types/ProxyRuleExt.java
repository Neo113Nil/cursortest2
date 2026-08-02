package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.oyr;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class ProxyRuleExt {
    private String schemeFilter;
    private String url;

    public ProxyRuleExt(String str, String str2) {
        this.schemeFilter = str;
        this.url = str2;
    }

    public static ProxyRuleExt fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new ProxyRuleExt(map.get("schemeFilter"), map.get("url"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyRuleExt proxyRuleExt = (ProxyRuleExt) obj;
        String str = this.schemeFilter;
        String str2 = proxyRuleExt.schemeFilter;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.url.equals(proxyRuleExt.url);
        }
        return false;
    }

    public String getSchemeFilter() {
        return this.schemeFilter;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.schemeFilter;
        return this.url.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public void setSchemeFilter(String str) {
        this.schemeFilter = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, String> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.url);
        hashMap.put("schemeFilter", this.schemeFilter);
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProxyRuleExt{schemeFilter='");
        sb.append(this.schemeFilter);
        sb.append("', url='");
        return oyr.t(sb, this.url, "'}");
    }
}
