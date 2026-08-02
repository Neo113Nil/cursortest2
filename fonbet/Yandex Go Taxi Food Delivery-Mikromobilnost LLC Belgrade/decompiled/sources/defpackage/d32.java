package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d32 implements c32 {
    public static volatile d32 c;
    public final yvi0 a;
    public final ConcurrentHashMap b;

    public d32(yvi0 yvi0Var) {
        cvw.l(yvi0Var);
        this.a = yvi0Var;
        this.b = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, String str2, Bundle bundle) {
        if (nc91.c.contains(str) || nc91.b.contains(str2)) {
            return;
        }
        ImmutableList immutableList = nc91.d;
        int size = immutableList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            boolean containsKey = bundle.containsKey((String) immutableList.get(i2));
            i2++;
            if (containsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (nc91.c.contains(str)) {
                return;
            }
            ImmutableList immutableList2 = nc91.d;
            int size2 = immutableList2.size();
            while (i < size2) {
                boolean containsKey2 = bundle.containsKey((String) immutableList2.get(i));
                i++;
                if (containsKey2) {
                    return;
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != 101200) {
                if (hashCode != 101230) {
                    if (hashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        e eVar = (e) this.a.a;
        eVar.a(new bp91(eVar, str, str2, bundle, true));
    }

    public final ngd0 b(String str, lb7 lb7Var) {
        if (!nc91.c.contains(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                yvi0 yvi0Var = this.a;
                Object wl91Var = equals ? new wl91(yvi0Var, lb7Var) : "clx".equals(str) ? new o370(yvi0Var, lb7Var) : null;
                if (wl91Var != null) {
                    concurrentHashMap.put(str, wl91Var);
                    return new ngd0(16);
                }
            }
        }
        return null;
    }
}
