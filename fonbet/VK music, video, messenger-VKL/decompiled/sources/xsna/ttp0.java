package xsna;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes11.dex */
public final class ttp0 {
    public static Collection a(Object obj) {
        if ((obj instanceof gcy) && !(obj instanceof hcy)) {
            i(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            epx.i(e, ttp0.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof gcy) && !(obj instanceof jcy)) {
            i(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            epx.i(e, ttp0.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof gcy) && !(obj instanceof kcy)) {
            i(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            epx.i(e, ttp0.class.getName());
            throw e;
        }
    }

    public static void d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return;
        }
        i(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        if (obj instanceof xzs) {
            if ((obj instanceof h0t ? ((h0t) obj).getArity() : obj instanceof gzs ? 0 : obj instanceof izs ? 1 : obj instanceof wzs ? 2 : obj instanceof yzs ? 3 : obj instanceof zzs ? 4 : obj instanceof a0t ? 5 : obj instanceof b0t ? 6 : obj instanceof c0t ? 7 : obj instanceof d0t ? 8 : obj instanceof e0t ? 9 : obj instanceof hzs ? 10 : obj instanceof jzs ? 11 : obj instanceof kzs ? 12 : obj instanceof lzs ? 13 : obj instanceof mzs ? 14 : obj instanceof nzs ? 15 : obj instanceof ozs ? 16 : obj instanceof pzs ? 17 : obj instanceof qzs ? 18 : obj instanceof rzs ? 19 : obj instanceof tzs ? 20 : obj instanceof uzs ? 21 : obj instanceof vzs ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof gcy) || (obj instanceof jcy);
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof gcy) || (obj instanceof kcy);
        }
        return false;
    }

    public static boolean h(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof gcy) || (obj instanceof pcy);
        }
        return false;
    }

    public static void i(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(pzl.b(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        epx.i(classCastException, ttp0.class.getName());
        throw classCastException;
    }
}
