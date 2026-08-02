package xsna;

import com.unity3d.ads.BuildConfig;
import java.util.HashMap;

/* compiled from: AggregationUtil.java */
/* loaded from: classes8.dex */
public final class ob1 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        v9l v9lVar = v9l.a;
        hashMap.put(BuildConfig.FLAVOR, v9lVar);
        hashMap.put("sum", t6n0.a);
        hashMap.put("last_value", fmy.a);
        hashMap.put("drop", zlo.a);
        s9q s9qVar = s9q.d;
        hashMap.put("explicit_bucket_histogram", s9qVar);
        hashMap.put("base2_exponential_bucket_histogram", g46.a);
        HashMap hashMap2 = new HashMap();
        a = hashMap2;
        hashMap2.put(v9lVar.getClass(), BuildConfig.FLAVOR);
        hashMap2.put(t6n0.class, "sum");
        hashMap2.put(fmy.class, "last_value");
        hashMap2.put(zlo.class, "drop");
        hashMap2.put(s9qVar.getClass(), "explicit_bucket_histogram");
        hashMap2.put(g46.class, "base2_exponential_bucket_histogram");
    }

    public static String a(x71 x71Var) {
        String str = (String) a.get(x71Var.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(x71Var.getClass().getName()));
    }
}
