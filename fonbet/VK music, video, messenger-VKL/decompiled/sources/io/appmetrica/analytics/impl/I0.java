package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;
import xsna.emb;

/* loaded from: classes8.dex */
public final class I0 {
    public static String a(H0 h0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", h0.a).put("packageName", h0.b).put("reporterType", h0.c.getStringValue()).put("processID", h0.d).put("processSessionID", h0.e).put("errorEnvironment", h0.f).toString().getBytes(emb.b), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static H0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), emb.b));
            return new H0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
