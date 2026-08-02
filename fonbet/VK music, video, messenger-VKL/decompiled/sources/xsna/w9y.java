package xsna;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonObj.kt */
/* loaded from: classes17.dex */
public final class w9y {
    public final JSONObject a = new JSONObject();

    public static JSONArray a(Iterable iterable) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : iterable) {
            if (obj instanceof bxx) {
                jSONArray.put(((bxx) obj).e5());
            } else if (obj instanceof Iterable) {
                jSONArray.put(a((Iterable) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public final void b(Boolean bool, String str) {
        if (bool != null) {
            this.a.put(str, bool.booleanValue());
        }
    }

    public final void c(Integer num, String str) {
        if (num != null) {
            this.a.put(str, num.intValue());
        }
    }

    public final void d(Long l, String str) {
        if (l != null) {
            this.a.put(str, l.longValue());
        }
    }

    public final void e(Object obj, String str) {
        if (obj != null) {
            boolean z = obj instanceof Map;
            JSONObject jSONObject = this.a;
            if (z) {
                Map map = (Map) obj;
                JSONObject jSONObject2 = new JSONObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(jSONObject2.put((String) entry.getKey(), entry.getValue()), entry.getValue());
                }
                s3q0 s3q0Var = s3q0.a;
                jSONObject.put(str, jSONObject2);
                return;
            }
            if (obj instanceof Iterable) {
                jSONObject.put(str, a((Iterable) obj));
                return;
            }
            if (!(obj instanceof Bundle)) {
                if (!(obj instanceof JSONObject)) {
                    jSONObject.put(str, obj);
                    return;
                }
                JSONObject jSONObject3 = (JSONObject) obj;
                if (jSONObject3.length() == 0) {
                    return;
                }
                jSONObject.put(str, jSONObject3);
                return;
            }
            Bundle bundle = (Bundle) obj;
            JSONObject jSONObject4 = new JSONObject();
            for (String str2 : bundle.keySet()) {
                jSONObject4.put(str2, bundle.getString(str2));
            }
            s3q0 s3q0Var2 = s3q0.a;
            jSONObject.put(str, jSONObject4);
        }
    }

    public final void f(String str, Double d) {
        if (d != null) {
            this.a.put(str, d.doubleValue());
        }
    }

    public final <T extends bxx> void g(String str, T t) {
        if (t != null) {
            this.a.put(str, t.e5());
        }
    }
}
