package sg.bigo.ads.db;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class a {
    public int a = 10;
    public int b = 900000;
    public final HashMap<String, C2476a> c;

    /* renamed from: sg.bigo.ads.db.a$a, reason: collision with other inner class name */
    public static class C2476a {
        String a;
        boolean b;
        public boolean c;
        public int d;

        public static C2476a a(String str) {
            C2476a c2476a = new C2476a();
            c2476a.a = str;
            c2476a.b = true;
            c2476a.c = true;
            c2476a.d = 86400000;
            return c2476a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.bn.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.a = jSONObject.optString("event_id");
            this.b = jSONObject.optInt("status") == 1;
            this.c = jSONObject.optInt("delay") == 1;
            int optInt = jSONObject.optInt("expired") * 1000;
            this.d = optInt;
            if (optInt == 0) {
                this.d = 86400000;
            }
        }
    }

    public a() {
        HashMap<String, C2476a> hashMap = new HashMap<>();
        this.c = hashMap;
        b();
        hashMap.put("06002002", C2476a.a("06002002"));
        hashMap.put("06002007", C2476a.a("06002007"));
    }

    private void b() {
        this.a = 10;
        this.b = 900000;
        this.c.clear();
    }

    public final int a() {
        return Math.round(this.a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.a = jSONObject.optInt("delay_num", 10);
        int optInt = jSONObject.optInt("delay_interval") * 1000;
        this.b = optInt;
        if (optInt == 0) {
            this.b = 900000;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("event_config");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            C2476a c2476a = new C2476a();
            c2476a.a(optJSONArray.optJSONObject(i));
            if (r.b((CharSequence) c2476a.a)) {
                this.c.put(c2476a.a, c2476a);
            }
        }
    }

    public final boolean a(String str) {
        C2476a c2476a = this.c.get(str);
        if (c2476a == null) {
            return false;
        }
        return c2476a.b;
    }
}
