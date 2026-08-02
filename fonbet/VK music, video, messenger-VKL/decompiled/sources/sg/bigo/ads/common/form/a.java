package sg.bigo.ads.common.form;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.common.form.b;

/* loaded from: classes9.dex */
public final class a {
    public static String a;
    public static Locale b;

    public static String a(Context context, int i) {
        return sg.bigo.ads.common.utils.a.a(context, i, b);
    }

    public static void b(int i) {
        b.a();
        b.b(i);
    }

    public static String a(String str, Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        try {
            JSONObject jSONObject = (JSONObject) map.get("form_qa");
            if (jSONObject != null) {
                return jSONObject.getString(str);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Nullable
    public static Map<String, Object> a(int i) {
        b.a();
        return b.a(i);
    }

    public static Map<String, Object> a(@NonNull e eVar, boolean z, @NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject(eVar.g());
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject3.optString(next, ""));
            }
            jSONObject2.put("privacy", z ? "1" : "0");
            jSONObject2.put("style_id", String.valueOf(eVar.f()));
        } catch (Exception unused) {
        }
        hashMap.put("extra", jSONObject2);
        hashMap.put("form_qa", jSONObject);
        hashMap.put("form_id", Long.valueOf(eVar.c()));
        hashMap.put("timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    public static void a(final int i, int i2) {
        b.a().a(a(i), new b.a() { // from class: sg.bigo.ads.common.form.a.1
            @Override // sg.bigo.ads.common.form.b.a
            public final void a(int i3) {
                a.b(i);
            }

            @Override // sg.bigo.ads.common.form.b.a
            public final void a(Map<String, Object> map) {
            }
        }, i2);
    }

    public static void a(int i, @Nullable Map<String, Object> map) {
        if (map != null) {
            b.a();
            b.a(i, map);
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null) {
            return true;
        }
        String str = "";
        try {
            JSONObject jSONObject = (JSONObject) map.get("extra");
            if (jSONObject != null && jSONObject.has("privacy")) {
                str = jSONObject.optString("privacy", "0");
            }
        } catch (Exception unused) {
        }
        return "1".equals(str);
    }
}
