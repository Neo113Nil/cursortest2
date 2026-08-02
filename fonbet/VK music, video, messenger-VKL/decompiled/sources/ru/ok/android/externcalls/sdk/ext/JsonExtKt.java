package ru.ok.android.externcalls.sdk.ext;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.wzs;

/* compiled from: JsonExt.kt */
/* loaded from: classes9.dex */
public final class JsonExtKt {
    public static final boolean getBooleanOrDefault(JSONObject jSONObject, String str, boolean z) {
        Boolean booleanOrNull = getBooleanOrNull(jSONObject, str);
        return booleanOrNull != null ? booleanOrNull.booleanValue() : z;
    }

    public static final Boolean getBooleanOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final double getDoubleOrDefault(JSONObject jSONObject, String str, double d) {
        Double doubleOrNull = getDoubleOrNull(jSONObject, str);
        return doubleOrNull != null ? doubleOrNull.doubleValue() : d;
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Double.valueOf(jSONObject.getDouble(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final int getIntOrDefault(JSONObject jSONObject, String str, int i) {
        Integer intOrNull = getIntOrNull(jSONObject, str);
        return intOrNull != null ? intOrNull.intValue() : i;
    }

    public static final Integer getIntOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(jSONObject.getInt(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final long getLongOrDefault(JSONObject jSONObject, String str, long j) {
        Long longOrNull = getLongOrNull(jSONObject, str);
        return longOrNull != null ? longOrNull.longValue() : j;
    }

    public static final Long getLongOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Long.valueOf(jSONObject.getLong(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static final <T> T getSafe(JSONObject jSONObject, String str, wzs<? super JSONObject, ? super String, ? extends T> wzsVar) {
        try {
            if (jSONObject.has(str)) {
                return wzsVar.invoke(jSONObject, str);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String getStringOrDefault(JSONObject jSONObject, String str, String str2) {
        String stringOrNull = getStringOrNull(jSONObject, str);
        return stringOrNull == null ? str2 : stringOrNull;
    }

    public static final String getStringOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
