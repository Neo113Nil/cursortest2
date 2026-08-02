package xsna;

import com.vk.dto.hints.HintCategories;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: CacheConfig.kt */
/* loaded from: classes18.dex */
public final class pv8 implements bxx {
    public static final long j = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int k = 0;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final String h;
    public final boolean i;

    /* compiled from: CacheConfig.kt */
    public static final class a {
        public static final int a(long j) {
            int i = pv8.k;
            return j >= 0 ? (int) (j / 1000) : (int) j;
        }

        public static long b() {
            return pv8.j;
        }

        public static pv8 c(JSONObject jSONObject) {
            JSONObject optJSONObject;
            String optString;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("discover");
            long d = d(optJSONObject2 != null ? Integer.valueOf(optJSONObject2.optInt("preload")) : null);
            long d2 = d(optJSONObject2 != null ? Integer.valueOf(optJSONObject2.optInt("preload_not_seen")) : null);
            JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("valid_from") : null;
            long d3 = d(optJSONObject3 != null ? Integer.valueOf(optJSONObject3.optInt("posts")) : null);
            long d4 = d(optJSONObject3 != null ? Integer.valueOf(optJSONObject3.optInt(HintCategories.PARAM_NAME)) : null);
            JSONObject optJSONObject4 = jSONObject.optJSONObject("newsfeed");
            int optInt = optJSONObject4 != null ? optJSONObject4.optInt("fetch_items_limit", -1) : -1;
            Integer valueOf = optJSONObject4 != null ? Integer.valueOf(optJSONObject4.optInt("ttl")) : null;
            long j = pv8.j;
            if (valueOf != null && valueOf.intValue() > 0) {
                j = valueOf.intValue() * 1000;
            }
            long j2 = j;
            JSONObject optJSONObject5 = optJSONObject4 != null ? optJSONObject4.optJSONObject("smart_feed_merge") : null;
            String str = "append";
            if (optJSONObject5 != null && (optString = optJSONObject5.optString("type", "append")) != null) {
                str = optString;
            }
            return new pv8(d, d2, d3, d4, optInt, j2, str, (optJSONObject5 == null || (optJSONObject = optJSONObject5.optJSONObject(str)) == null || !optJSONObject.optBoolean("enable_button")) ? false : true);
        }

        public static long d(Integer num) {
            if (num == null || num.intValue() <= 0) {
                return 0L;
            }
            return num.intValue() * 1000;
        }
    }

    public pv8(long j2, long j3, long j4, long j5, int i, long j6, String str, boolean z) {
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = i;
        this.g = j6;
        this.h = str;
        this.i = z;
    }

    public final long a() {
        return this.g;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("preload", a.a(this.b));
        jSONObject2.put("preload_not_seen", a.a(this.c));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("posts", a.a(this.d));
        jSONObject3.put(HintCategories.PARAM_NAME, a.a(this.e));
        s3q0 s3q0Var = s3q0.a;
        jSONObject2.put("valid_from", jSONObject3);
        jSONObject.put("discover", jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("fetch_items_limit", this.f);
        jSONObject4.put("ttl", a.a(this.g));
        JSONObject jSONObject5 = new JSONObject();
        String str = this.h;
        jSONObject5.put("type", str);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("enable_button", this.i);
        jSONObject5.put(str, jSONObject6);
        jSONObject4.put("smart_feed_merge", jSONObject5);
        jSONObject.put("newsfeed", jSONObject4);
        return jSONObject;
    }
}
