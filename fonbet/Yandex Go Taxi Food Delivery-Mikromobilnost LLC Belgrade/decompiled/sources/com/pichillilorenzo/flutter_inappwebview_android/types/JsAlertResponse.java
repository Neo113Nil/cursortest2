package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.vfc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes11.dex */
public class JsAlertResponse {
    private Integer action;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;

    public JsAlertResponse(String str, String str2, boolean z, Integer num) {
        this.message = str;
        this.confirmButtonTitle = str2;
        this.handledByClient = z;
        this.action = num;
    }

    public static JsAlertResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsAlertResponse((String) map.get(Constants.KEY_MESSAGE), (String) map.get("confirmButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            JsAlertResponse jsAlertResponse = (JsAlertResponse) obj;
            if (this.handledByClient != jsAlertResponse.handledByClient) {
                return false;
            }
            String str = this.message;
            String str2 = jsAlertResponse.message;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.confirmButtonTitle;
            String str4 = jsAlertResponse.confirmButtonTitle;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = jsAlertResponse.action;
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
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
        Integer num = this.action;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public boolean isHandledByClient() {
        return this.handledByClient;
    }

    public void setAction(Integer num) {
        this.action = num;
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
        StringBuilder sb = new StringBuilder("JsAlertResponse{message='");
        sb.append(this.message);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", action=");
        return vfc.o(sb, this.action, '}');
    }
}
