package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class ez0 {
    public final q80 a;

    public ez0(q80 q80Var) {
        this.a = q80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, spj spjVar) {
        dz0 dz0Var;
        int i;
        ez0 ez0Var;
        String str2;
        Iterator it;
        Object obj;
        e40 e40Var;
        r40 r40Var;
        Object obj2;
        Object obj3;
        String str3;
        if (spjVar instanceof dz0) {
            dz0Var = (dz0) spjVar;
            int i2 = dz0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dz0Var.f = i2 - Integer.MIN_VALUE;
                Object obj4 = dz0Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dz0Var.f;
                String str4 = null;
                if (i != 0) {
                    kotlin.a.a(obj4);
                    q80 q80Var = this.a;
                    dz0Var.b = this;
                    dz0Var.c = str;
                    dz0Var.f = 1;
                    obj4 = myc0.k(q80Var.d, new p80(q80Var, z, null), dz0Var);
                    if (obj4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ez0Var = this;
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = dz0Var.c;
                    ez0Var = dz0Var.b;
                    kotlin.a.a(obj4);
                }
                u50 u50Var = (u50) obj4;
                it = u50Var.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((e40) obj).c, str2)) {
                        break;
                    }
                }
                e40Var = (e40) obj;
                if (e40Var != null) {
                    return null;
                }
                List list = u50Var.d.a;
                m40 m40Var = e40Var.d;
                ez0Var.getClass();
                if (m40Var == null) {
                    r40Var = new r40(EmptyList.b);
                } else {
                    List<h40> list2 = m40Var.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (h40 h40Var : list2) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (epx.f(((b50) obj3).a, h40Var.b)) {
                                break;
                            }
                        }
                        b50 b50Var = (b50) obj3;
                        String str5 = (b50Var == null || (str3 = b50Var.b) == null) ? "" : str3;
                        List<p50> list3 = h40Var.c;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                        for (p50 p50Var : list3) {
                            arrayList2.add(new d80(p50Var.a, p50Var.b));
                        }
                        arrayList.add(new q40(str5, h40Var.b, arrayList2, h40Var.d, h40Var.e, n40.a));
                    }
                    List<u40> list4 = m40Var.a;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    for (u40 u40Var : list4) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = str4;
                                break;
                            }
                            obj2 = it3.next();
                            if (epx.f(((b50) obj2).a, u40Var.b)) {
                                break;
                            }
                        }
                        b50 b50Var2 = (b50) obj2;
                        String str6 = b50Var2 != null ? b50Var2.b : str4;
                        String str7 = str6 == null ? "" : str6;
                        List<na0> list5 = u40Var.c;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                        for (na0 na0Var : list5) {
                            arrayList4.add(new d80(na0Var.a, na0Var.b));
                            str4 = str4;
                        }
                        arrayList3.add(new q40(str7, u40Var.b, arrayList4, null, u40Var.d, new o40(u40Var.e, u40Var.f)));
                        str4 = str4;
                    }
                    r40Var = new r40(j5g.u0(arrayList3, arrayList));
                }
                return new j40(e40Var.a, e40Var.b, str2, r40Var);
            }
        }
        dz0Var = new dz0(this, spjVar);
        Object obj42 = dz0Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dz0Var.f;
        String str42 = null;
        if (i != 0) {
        }
        u50 u50Var2 = (u50) obj42;
        it = u50Var2.g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        e40Var = (e40) obj;
        if (e40Var != null) {
        }
    }
}
