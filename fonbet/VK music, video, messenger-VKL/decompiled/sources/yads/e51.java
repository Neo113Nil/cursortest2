package yads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.e43;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class e51 {
    public final ou0 a;
    public final kj b;

    public /* synthetic */ e51() {
        this(new ou0(), new kj());
    }

    public final Set a(List list) {
        Object obj;
        RandomAccess randomAccess;
        Object obj2;
        Iterable iterable;
        hi0 hi0Var;
        List list2;
        Object obj3;
        this.b.getClass();
        Set R0 = j5g.R0(kj.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((oi) obj).a, "feedback")) {
                break;
            }
        }
        oi oiVar = (oi) obj;
        this.a.getClass();
        if ((oiVar != null ? oiVar.c : null) instanceof ru0) {
            List m = e43.m(((ru0) oiVar.c).a);
            jg1 jg1Var = oiVar.d;
            if (jg1Var == null || (list2 = jg1Var.a) == null) {
                obj2 = null;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (epx.f(((m0) obj3).a(), "divkit_adtune")) {
                        break;
                    }
                }
                obj2 = (m0) obj3;
            }
            sh0 sh0Var = obj2 instanceof sh0 ? (sh0) obj2 : null;
            if (sh0Var == null || (hi0Var = sh0Var.b) == null || (iterable = hi0Var.d) == null) {
                iterable = EmptyList.b;
            }
            randomAccess = j5g.u0(iterable, m);
        } else {
            randomAccess = EmptyList.b;
        }
        R0.addAll(randomAccess);
        return R0;
    }

    public e51(ou0 ou0Var, kj kjVar) {
        this.a = ou0Var;
        this.b = kjVar;
    }
}
