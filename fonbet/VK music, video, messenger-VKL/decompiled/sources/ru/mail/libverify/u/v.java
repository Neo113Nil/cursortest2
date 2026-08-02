package ru.mail.libverify.u;

import android.content.Context;
import android.provider.Settings;
import com.ironsource.O6;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.drm0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class v {
    private v() {
    }

    public static final String a(ru.mail.libverify.storage.g gVar, ru.mail.libverify.g0.q qVar, ru.mail.libverify.o.e eVar) {
        gVar.u();
        System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, X3.j.Y, new e(gVar));
        a(jSONObject, "defaultLocale", f.a);
        a(jSONObject, "applicationInfo", new g(gVar, eVar));
        a(jSONObject, "device", h.a);
        a(jSONObject, ApiProtocol.PARAM_DEVICE_ID, new i(gVar));
        a(jSONObject, "networkInfo", new j(gVar, qVar));
        a(jSONObject, O6.F, k.a);
        a(jSONObject, SignalingProtocol.KEY_PERMISSIONS, new l(gVar));
        a(jSONObject, "simCardsInfo", new m(gVar));
        jSONObject.put("platform", X3.d);
        return jSONObject.toString();
    }

    public static final JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, context, "android.permission.ACCESS_NETWORK_STATE");
        a(jSONObject, context, "android.permission.CALL_PHONE");
        a(jSONObject, context, "android.permission.READ_CALL_LOG");
        a(jSONObject, context, "android.permission.READ_PHONE_STATE");
        a(jSONObject, context, "android.permission.READ_SMS");
        a(jSONObject, context, "android.permission.RECEIVE_SMS");
        a(jSONObject, context, "com.google.android.gms.permission.AD_ID");
        a(jSONObject, context, "android.permission.READ_PHONE_NUMBERS");
        return jSONObject;
    }

    public static final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "manufacturer", c.a);
        a(jSONObject, "model", d.a);
        return jSONObject;
    }

    public static final JSONObject a(Context context, ru.mail.libverify.g0.q qVar) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "isVoiceCapable", new n(context));
        a(jSONObject, "roaming", new o(context));
        a(jSONObject, "data", new p(context));
        a(jSONObject, "hasVpnConnection", new q(qVar));
        a(jSONObject, "hasCellularConnection", new r(context, qVar));
        return jSONObject;
    }

    public static final JSONObject a(Context context, boolean z) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, O6.h0, a.a);
        if (z) {
            a(jSONObject, "signatures", new b(context));
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, Context context, String str) {
        jSONObject.put(drm0.g0(str, "permission.", str), ru.mail.libverify.n0.e.b(context, str));
    }

    public static final JSONObject a(Context context, ru.mail.libverify.f0.a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (ru.mail.libverify.f0.b bVar : aVar.k()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("operator", bVar.f());
                jSONObject2.put("operatorName", bVar.i());
                jSONObject2.put("countryId", bVar.j());
                jSONObject2.put("roaming", bVar.m());
                jSONObject2.put("networkOperator", bVar.d());
                jSONObject2.put("networkOperatorName", bVar.e());
                jSONObject2.put("networkCountryId", bVar.a());
                jSONObject2.put("slotIndex", bVar.l());
                jSONArray.put(jSONObject2);
            } catch (Throwable th) {
                FileLog.e("ExtendedPhoneInfo", "failed to get sim card info", th);
            }
        }
        a(jSONObject, "simCount", new s(aVar));
        a(jSONObject, "simSlotsCount", new t(aVar));
        a(jSONObject, "isDual4gSupported", new u(context));
        jSONObject.put("simList", jSONArray);
        return jSONObject;
    }

    public static final Boolean a(Context context) {
        Boolean bool;
        try {
            Class<?> cls = Class.forName("miui.telephony.TelephonyManager");
            bool = (Boolean) Class.forName("miui.telephony.TelephonyManagerEx").getMethod("isDualVolteSupported", null).invoke(cls.getMethod("getDefault", null).invoke(cls, null), null);
        } catch (Exception e) {
            FileLog.e("ExtendedPhoneInfo", "Failed to read dual4g info: " + e);
            bool = null;
        }
        if (bool == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            return Boolean.FALSE;
        }
        int i = Settings.Global.getInt(context.getContentResolver(), "dual_4g_mode_enabled", -1);
        if (i == -1) {
            return null;
        }
        return Boolean.valueOf(i == 1);
    }

    private static void a(JSONObject jSONObject, String str, gzs gzsVar) {
        Object obj;
        try {
            obj = gzsVar.invoke();
        } catch (Throwable unused) {
            obj = StringUtils.UNDEFINED;
        }
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }
}
