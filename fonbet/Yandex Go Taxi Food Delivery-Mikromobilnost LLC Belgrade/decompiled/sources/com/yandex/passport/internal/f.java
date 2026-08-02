package com.yandex.passport.internal;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.cvu0;
import defpackage.scc;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class f {
    public static final JSONObject a(f fVar, String str) {
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("val", str);
        return jSONObject;
    }

    public static JSONObject b(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static long c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong(RemoteBioParameters.TIME);
        }
        return 0L;
    }

    public static String d(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString("val", null)) == null) {
            return null;
        }
        return com.yandex.passport.common.util.a.e(optString);
    }

    public static LegacyExtraData e(String str) {
        String str2 = str;
        if (cvu0.x(str2, "@jsn", false)) {
            str2 = str2.substring(4);
        }
        JSONObject optJSONObject = new JSONObject(str2).optJSONObject("extra_data");
        JSONObject b = b("_uid", optJSONObject);
        JSONObject b2 = b("_display_name", optJSONObject);
        JSONObject b3 = b("_default_avatar", optJSONObject);
        JSONObject b4 = b("_is_avatar_empty", optJSONObject);
        JSONObject b5 = b("_is_staff", optJSONObject);
        JSONObject b6 = b("_is_beta_tester", optJSONObject);
        JSONObject b7 = b("disk.pincode", optJSONObject);
        JSONObject b8 = b("mail.pincode", optJSONObject);
        String d = d(b);
        String d2 = d(b2);
        String d3 = d(b3);
        String d4 = d(b4);
        String d5 = d(b5);
        String d6 = d(b6);
        String d7 = d(b7);
        String d8 = d(b8);
        Long valueOf = d != null ? Long.valueOf(d) : null;
        Boolean valueOf2 = d4 != null ? Boolean.valueOf(d4) : null;
        Boolean valueOf3 = d5 != null ? Boolean.valueOf(d5) : null;
        return new LegacyExtraData(valueOf, d2, d3, valueOf2, valueOf3, d6 != null ? Boolean.valueOf(d6) : null, d7, d8, ((Long) Collections.max(scc.g(Long.valueOf(c(b)), Long.valueOf(c(b2)), Long.valueOf(c(b3)), Long.valueOf(c(b4)), Long.valueOf(c(b5)), Long.valueOf(c(b6)), Long.valueOf(c(b7)), Long.valueOf(c(b8))))).longValue());
    }

    public static LegacyExtraData f(String str) {
        if (str != null) {
            try {
                return e(str);
            } catch (JSONException e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "invalid string", e);
                }
            }
        }
        return null;
    }
}
