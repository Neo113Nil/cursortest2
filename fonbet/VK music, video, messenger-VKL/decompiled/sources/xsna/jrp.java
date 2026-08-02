package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Entry.kt */
/* loaded from: classes5.dex */
public final class jrp {
    public final int a;
    public final String b;
    public final Map<String, String> c;
    public final long d;

    /* compiled from: Entry.kt */
    public static final class a {
        public static jrp a(String str) {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("id");
            String optString = jSONObject.optString("tag_id");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    str2 = jSONObject2.get(next).toString();
                } catch (Throwable unused) {
                    str2 = null;
                }
                if (next != null && str2 != null) {
                    hashMap.put(next, str2);
                }
            }
            return new jrp(optString, jSONObject.getLong("saved_timestamp"), i, hashMap);
        }
    }

    public jrp(String str, long j, int i, Map map) {
        this.a = i;
        this.b = str;
        this.c = map;
        this.d = j;
    }

    public final Map<String, String> a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.a);
        jSONObject.put("tag_id", this.b);
        jSONObject.put("data", new JSONObject(this.c));
        jSONObject.put("saved_timestamp", this.d);
        return jSONObject.toString();
    }
}
