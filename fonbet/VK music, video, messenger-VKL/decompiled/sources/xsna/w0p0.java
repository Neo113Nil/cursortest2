package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import org.json.JSONObject;

/* compiled from: ToggleToJson.kt */
/* loaded from: classes6.dex */
public final class w0p0 {
    public static b.d a(String str, String str2) {
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str2);
            boolean optBoolean = jSONObject.optBoolean("enabled", true);
            String optString = jSONObject.optString("value", "");
            if (optString != null) {
                str3 = optString;
            }
            return new b.d(str, str3, optBoolean);
        } catch (Throwable unused) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{y57.a("can't convert toggle: ", str, ", ", str2)});
            }
            return new b.d(str);
        }
    }

    public static boolean b(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONObject c(b.d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", dVar.a);
        jSONObject.put("value", dVar.c.toString());
        return jSONObject;
    }
}
