package xsna;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.hfr;

/* compiled from: _Sequences.kt */
/* loaded from: classes11.dex */
public class rli0 extends dli0 {
    public static <T> List<T> A(uki0<? extends T> uki0Var) {
        Iterator<? extends T> it = uki0Var.iterator();
        if (!it.hasNext()) {
            return EmptyList.b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList b = y57.b(next);
        while (it.hasNext()) {
            b.add(it.next());
        }
        return b;
    }

    public static <T> List<T> B(uki0<? extends T> uki0Var) {
        ArrayList arrayList = new ArrayList();
        z(uki0Var, arrayList);
        return arrayList;
    }

    public static <T> Set<T> C(uki0<? extends T> uki0Var) {
        Iterator<? extends T> it = uki0Var.iterator();
        if (!it.hasNext()) {
            return EmptySet.b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> int g(uki0<? extends T> uki0Var) {
        Iterator<? extends T> it = uki0Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public static fhn h(uki0 uki0Var) {
        return new fhn(uki0Var, new cb3(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uki0 i(i5g i5gVar, int i) {
        if (i >= 0) {
            return i == 0 ? i5gVar : i5gVar instanceof mmo ? ((mmo) i5gVar).b(i) : new jmo(i5gVar, i);
        }
        throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
    }

    public static hfr j(uki0 uki0Var, izs izsVar) {
        return new hfr(uki0Var, true, izsVar);
    }

    public static hfr k(uki0 uki0Var, Class cls) {
        return j(uki0Var, new h440(cls, 18));
    }

    public static hfr l(uki0 uki0Var, izs izsVar) {
        return new hfr(uki0Var, false, izsVar);
    }

    public static hfr m(uki0 uki0Var) {
        return l(uki0Var, new ili0());
    }

    public static Object n(hfr hfrVar) {
        hfr.a aVar = new hfr.a(hfrVar);
        if (aVar.hasNext()) {
            return aVar.next();
        }
        return null;
    }

    public static cor o(uki0 uki0Var, izs izsVar) {
        return new cor(uki0Var, izsVar, lli0.b);
    }

    public static cor p(uki0 uki0Var, izs izsVar) {
        return new cor(uki0Var, izsVar, kli0.b);
    }

    public static <T> int q(uki0<? extends T> uki0Var, T t) {
        int i = 0;
        for (T t2 : uki0Var) {
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String r(uki0 uki0Var, String str, izs izsVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "&";
        String str3 = (i & 4) != 0 ? "" : ", ";
        if ((i & 32) != 0) {
            izsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : uki0Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            bay.b(sb, obj, izsVar);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static ulp0 s(uki0 uki0Var, izs izsVar) {
        return new ulp0(uki0Var, izsVar);
    }

    public static hfr t(uki0 uki0Var, izs izsVar) {
        return m(new ulp0(uki0Var, izsVar));
    }

    public static ulp0 u(uki0 uki0Var, izs izsVar) {
        return new ulp0(uki0Var, new tz20(izsVar, 1));
    }

    public static cor v(uki0 uki0Var, Iterable iterable) {
        uki0 D = rl3.D(new uki0[]{uki0Var, new i5g(iterable)});
        ulz ulzVar = new ulz(25);
        if (!(D instanceof ulp0)) {
            return new cor(D, new k990(18), ulzVar);
        }
        ulp0 ulp0Var = (ulp0) D;
        return new cor(ulp0Var.a, ulp0Var.b, ulzVar);
    }

    public static cor w(uki0 uki0Var, Object obj) {
        uki0 D = rl3.D(new uki0[]{uki0Var, new fli0(obj)});
        ulz ulzVar = new ulz(25);
        if (!(D instanceof ulp0)) {
            return new cor(D, new k990(18), ulzVar);
        }
        ulp0 ulp0Var = (ulp0) D;
        return new cor(ulp0Var.a, ulp0Var.b, ulzVar);
    }

    public static cor x(uki0 uki0Var, uki0 uki0Var2) {
        uki0 D = rl3.D(new uki0[]{uki0Var, uki0Var2});
        ulz ulzVar = new ulz(25);
        if (!(D instanceof ulp0)) {
            return new cor(D, new k990(18), ulzVar);
        }
        ulp0 ulp0Var = (ulp0) D;
        return new cor(ulp0Var.a, ulp0Var.b, ulzVar);
    }

    public static <T> uki0<T> y(uki0<? extends T> uki0Var, int i) {
        if (i >= 0) {
            return i == 0 ? ghp.a : uki0Var instanceof mmo ? ((mmo) uki0Var).a(i) : new u2o0(uki0Var, i);
        }
        throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
    }

    public static void z(uki0 uki0Var, AbstractCollection abstractCollection) {
        Iterator it = uki0Var.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
