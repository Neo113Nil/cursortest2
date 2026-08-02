package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HttpCacheConfig.kt */
/* loaded from: classes11.dex */
public final class hiv implements ax8 {
    public static final a k = new a();
    public static final jgp l;
    public static final EmptyList m;
    public static final EmptyList n;
    public static final hiv o;
    public static final hiv p;
    public final Map<String, String> a;
    public final boolean b;
    public final String c;
    public final int d;
    public final List<yv8> e;
    public final List<zw8> f;
    public final int g;
    public final boolean h;
    public final int i;
    public final bpn0 j = new bpn0(new b67(this, 4));

    /* compiled from: HttpCacheConfig.kt */
    public static final class a {
        public static List a(JSONArray jSONArray) {
            int length = jSONArray.length();
            if (length <= 0) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("path");
                    if (!drm0.N(optString)) {
                        arrayList.add(new yv8(optString, f370.A(HiAnalyticsConstant.Direction.REQUEST, optJSONObject), f370.A("res", optJSONObject)));
                    }
                }
            }
            return arrayList;
        }

        public static List b(JSONArray jSONArray) {
            int length = jSONArray.length();
            if (length <= 0) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("path");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("ignore_params");
                    List O = optJSONArray != null ? f370.O(optJSONArray) : EmptyList.b;
                    if (!drm0.N(optString) && !O.isEmpty()) {
                        arrayList.add(new zw8(optString, O));
                    }
                }
            }
            return arrayList;
        }

        public static HashMap c(JSONArray jSONArray) {
            int length = jSONArray.length();
            int min = Math.min(length, 16);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < min; i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                hashMap.put(jSONObject.getString("path"), f370.A("cache_control", jSONObject));
            }
            if (min != length) {
                HashSet hashSet = new HashSet();
                while (min < length) {
                    hashSet.add(((JSONObject) jSONArray.get(min)).getString("path"));
                    min++;
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"HttpCacheConfig", "Number of cacheable URL paths exceeds the limit of 16. You set " + length + ". These paths are discarded: " + hashSet + JwtParser.SEPARATOR_CHAR});
                    return hashMap;
                }
            }
            return hashMap;
        }
    }

    static {
        jgp jgpVar = jgp.b;
        l = jgpVar;
        EmptyList emptyList = EmptyList.b;
        m = emptyList;
        n = emptyList;
        hiv hivVar = new hiv(jgpVar, false, null, 1, emptyList, emptyList, 0, false, 1);
        o = hivVar;
        p = hivVar;
    }

    public hiv(Map<String, String> map, boolean z, String str, int i, List<yv8> list, List<zw8> list2, int i2, boolean z2, int i3) {
        this.a = map;
        this.b = z;
        this.c = str;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.g = i2;
        this.h = z2;
        this.i = i3;
        if (map.size() > 16) {
            throw new IllegalArgumentException(("Number of cacheable URL paths exceeds the limit of 16. You set " + map.size() + ". It's time to enable HTTP cache for all API methods by default.").toString());
        }
        if (i2 > 100) {
            throw new IllegalArgumentException(tgw.b(i2, "HTTP cache size can't be greater than 100MB. You set ", "MB.").toString());
        }
        if (z && str == null) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.w, new Object[]{"HttpCacheConfig", "HTTP cache is enabled for all API methods but no fallback Cache-Control is set. Default HTTP client's Cache-Control will be used."});
            }
        }
        if (map.size() == 16) {
            L l3 = L.a;
            l3.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l3, L.LogType.w, new Object[]{"HttpCacheConfig", "Number of cacheable URL paths has reached the limit of 16. It's time to enable HTTP cache for all API methods by default."});
            return;
        }
        if (10 <= map.size()) {
            L l4 = L.a;
            l4.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l4, L.LogType.w, new Object[]{"HttpCacheConfig", "Number of cacheable URL paths is approaching the limit of 16. You set " + this.a.size() + ". It's time to enable HTTP cache for all API methods by default."});
        }
    }

    @Override // xsna.ax8
    public final zw8 a(String str) {
        Object obj;
        Iterator<T> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zw8) obj).a(str)) {
                break;
            }
        }
        return (zw8) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiv)) {
            return false;
        }
        hiv hivVar = (hiv) obj;
        return epx.f(this.a, hivVar.a) && this.b == hivVar.b && epx.f(this.c, hivVar.c) && this.d == hivVar.d && epx.f(this.e, hivVar.e) && epx.f(this.f, hivVar.f) && this.g == hivVar.g && this.h == hivVar.h && this.i == hivVar.i;
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.i) + qoy.b(shy.a(this.g, fw3.a(fw3.a(shy.a(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpCacheConfig(urlPathToCacheControl=");
        sb.append(this.a);
        sb.append(", isTryToCacheAllMethods=");
        sb.append(this.b);
        sb.append(", fallbackCacheControl=");
        sb.append(this.c);
        sb.append(", version=");
        sb.append(this.d);
        sb.append(", cacheControlOverrides=");
        sb.append(this.e);
        sb.append(", cacheKeyTransformers=");
        sb.append(this.f);
        sb.append(", maxSizeInMb=");
        sb.append(this.g);
        sb.append(", collectStatistics=");
        sb.append(this.h);
        sb.append(", statisticsMaxSizeInMb=");
        return vu5.b(sb, this.i, ')');
    }
}
