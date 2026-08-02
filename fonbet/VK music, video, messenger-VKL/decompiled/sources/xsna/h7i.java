package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CompatHttpRequestExecutorPrefs.kt */
/* loaded from: classes.dex */
public final class h7i {
    public final Context a;
    public final bpn0 b = new bpn0(new rx2(this, 1));
    public List<a> c;

    /* compiled from: CompatHttpRequestExecutorPrefs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;

        public a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public final long a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    public h7i(Context context) {
        this.a = context;
    }

    public final synchronized List<a> a() {
        try {
            List<a> list = this.c;
            if (list == null) {
                list = b();
                this.c = list;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a) obj).a() > currentTimeMillis) {
                    arrayList.add(obj);
                }
            }
            if (list.size() == arrayList.size()) {
                return list;
            }
            this.c = new ArrayList(arrayList);
            c(arrayList);
            return this.c;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList b() {
        String str = "[]";
        try {
            ArrayList arrayList = new ArrayList();
            String string = ((SharedPreferences) this.b.getValue()).getString("redirect_rules", "[]");
            if (string != null) {
                str = string;
            }
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new a(jSONObject.getString("origin_host"), jSONObject.getString("redirect_host"), jSONObject.getLong("expires_at_ms")));
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public final void c(List<a> list) {
        JSONArray jSONArray = new JSONArray();
        for (a aVar : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin_host", aVar.b());
            jSONObject.put("redirect_host", aVar.c());
            jSONObject.put("expires_at_ms", aVar.a());
            jSONArray.put(jSONObject);
        }
        ((SharedPreferences) this.b.getValue()).edit().putString("redirect_rules", jSONArray.toString()).apply();
    }
}
