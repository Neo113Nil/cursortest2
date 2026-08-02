package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.vfc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes11.dex */
public class JsConfirmResponse {
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;

    public JsConfirmResponse(String str, String str2, String str3, boolean z, Integer num) {
        this.message = str;
        this.confirmButtonTitle = str2;
        this.cancelButtonTitle = str3;
        this.handledByClient = z;
        this.action = num;
    }

    public static JsConfirmResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsConfirmResponse((String) map.get(Constants.KEY_MESSAGE), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            JsConfirmResponse jsConfirmResponse = (JsConfirmResponse) obj;
            if (this.handledByClient != jsConfirmResponse.handledByClient) {
                return false;
            }
            String str = this.message;
            String str2 = jsConfirmResponse.message;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.confirmButtonTitle;
            String str4 = jsConfirmResponse.confirmButtonTitle;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.cancelButtonTitle;
            String str6 = jsConfirmResponse.cancelButtonTitle;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = jsConfirmResponse.action;
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

    public String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.confirmButtonTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cancelButtonTitle;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
        Integer num = this.action;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public boolean isHandledByClient() {
        return this.handledByClient;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setCancelButtonTitle(String str) {
        this.cancelButtonTitle = str;
    }

    public void setConfirmButtonTitle(String str) {
        this.confirmButtonTitle = str;
    }

    public void setHandledByClient(boolean z) {
        this.handledByClient = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsConfirmResponse{message='");
        sb.append(this.message);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', cancelButtonTitle='");
        sb.append(this.cancelButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", action=");
        return vfc.o(sb, this.action, '}');
    }
}
