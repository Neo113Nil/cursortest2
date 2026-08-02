package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.vfc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes11.dex */
public class JsPromptResponse {
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private String defaultValue;
    private boolean handledByClient;
    private String message;
    private String value;

    public JsPromptResponse(String str, String str2, String str3, String str4, boolean z, String str5, Integer num) {
        this.message = str;
        this.defaultValue = str2;
        this.confirmButtonTitle = str3;
        this.cancelButtonTitle = str4;
        this.handledByClient = z;
        this.value = str5;
        this.action = num;
    }

    public static JsPromptResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsPromptResponse((String) map.get(Constants.KEY_MESSAGE), (String) map.get("defaultValue"), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (String) map.get("value"), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            JsPromptResponse jsPromptResponse = (JsPromptResponse) obj;
            if (this.handledByClient != jsPromptResponse.handledByClient) {
                return false;
            }
            String str = this.message;
            String str2 = jsPromptResponse.message;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.defaultValue;
            String str4 = jsPromptResponse.defaultValue;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.confirmButtonTitle;
            String str6 = jsPromptResponse.confirmButtonTitle;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.cancelButtonTitle;
            String str8 = jsPromptResponse.cancelButtonTitle;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.value;
            String str10 = jsPromptResponse.value;
            if (str9 == null ? str10 != null : !str9.equals(str10)) {
                return false;
            }
            Integer num = this.action;
            Integer num2 = jsPromptResponse.action;
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

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getMessage() {
        return this.message;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.defaultValue;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.confirmButtonTitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cancelButtonTitle;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
        String str5 = this.value;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.action;
        return hashCode5 + (num != null ? num.hashCode() : 0);
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

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public void setHandledByClient(boolean z) {
        this.handledByClient = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsPromptResponse{message='");
        sb.append(this.message);
        sb.append("', defaultValue='");
        sb.append(this.defaultValue);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', cancelButtonTitle='");
        sb.append(this.cancelButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", value='");
        sb.append(this.value);
        sb.append("', action=");
        return vfc.o(sb, this.action, '}');
    }
}
