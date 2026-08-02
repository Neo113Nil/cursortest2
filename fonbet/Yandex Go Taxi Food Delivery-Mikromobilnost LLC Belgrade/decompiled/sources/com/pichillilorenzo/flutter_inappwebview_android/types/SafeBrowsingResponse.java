package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.vfc;
import java.util.Map;

/* loaded from: classes11.dex */
public class SafeBrowsingResponse {
    private Integer action;
    private boolean report;

    public SafeBrowsingResponse(boolean z, Integer num) {
        this.report = z;
        this.action = num;
    }

    public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
            if (this.report != safeBrowsingResponse.report) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = safeBrowsingResponse.action;
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

    public int hashCode() {
        int i = (this.report ? 1 : 0) * 31;
        Integer num = this.action;
        return i + (num != null ? num.hashCode() : 0);
    }

    public boolean isReport() {
        return this.report;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setReport(boolean z) {
        this.report = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SafeBrowsingResponse{report=");
        sb.append(this.report);
        sb.append(", action=");
        return vfc.o(sb, this.action, '}');
    }
}
