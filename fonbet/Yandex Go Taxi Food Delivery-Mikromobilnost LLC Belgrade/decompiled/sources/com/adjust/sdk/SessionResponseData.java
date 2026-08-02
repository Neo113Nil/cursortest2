package com.adjust.sdk;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SessionResponseData extends ResponseData {
    private String sdkPlatform;

    public SessionResponseData(ActivityPackage activityPackage) {
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustSessionFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustSessionFailure adjustSessionFailure = new AdjustSessionFailure();
        boolean equals = PluginErrorDetails.Platform.UNITY.equals(this.sdkPlatform);
        String str = this.message;
        if (!equals) {
            adjustSessionFailure.message = str;
            adjustSessionFailure.timestamp = this.timestamp;
            adjustSessionFailure.adid = this.adid;
            adjustSessionFailure.willRetry = this.willRetry;
            adjustSessionFailure.jsonResponse = this.jsonResponse;
            return adjustSessionFailure;
        }
        if (str == null) {
            str = "";
        }
        adjustSessionFailure.message = str;
        String str2 = this.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        adjustSessionFailure.timestamp = str2;
        String str3 = this.adid;
        adjustSessionFailure.adid = str3 != null ? str3 : "";
        adjustSessionFailure.willRetry = this.willRetry;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionFailure.jsonResponse = jSONObject;
        return adjustSessionFailure;
    }

    public AdjustSessionSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustSessionSuccess adjustSessionSuccess = new AdjustSessionSuccess();
        boolean equals = PluginErrorDetails.Platform.UNITY.equals(this.sdkPlatform);
        String str = this.message;
        if (!equals) {
            adjustSessionSuccess.message = str;
            adjustSessionSuccess.timestamp = this.timestamp;
            adjustSessionSuccess.adid = this.adid;
            adjustSessionSuccess.jsonResponse = this.jsonResponse;
            return adjustSessionSuccess;
        }
        if (str == null) {
            str = "";
        }
        adjustSessionSuccess.message = str;
        String str2 = this.timestamp;
        if (str2 == null) {
            str2 = "";
        }
        adjustSessionSuccess.timestamp = str2;
        String str3 = this.adid;
        adjustSessionSuccess.adid = str3 != null ? str3 : "";
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionSuccess.jsonResponse = jSONObject;
        return adjustSessionSuccess;
    }
}
