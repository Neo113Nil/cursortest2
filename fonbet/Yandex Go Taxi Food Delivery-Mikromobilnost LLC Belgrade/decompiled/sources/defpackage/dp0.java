package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class dp0 extends zij {
    public static boolean d(ap0 ap0Var, ap0 ap0Var2) {
        if ((ap0Var instanceof lrq0) && (ap0Var2 instanceof lrq0)) {
            return jl40.l(((lrq0) ap0Var).a, ((lrq0) ap0Var2).a);
        }
        if (!(ap0Var instanceof gfq0) || !(ap0Var2 instanceof gfq0)) {
            return jl40.l(ap0Var, ap0Var2);
        }
        gfq0 gfq0Var = (gfq0) ap0Var;
        xtd0 xtd0Var = gfq0Var.a;
        boolean z = gfq0Var.b;
        gfq0 gfq0Var2 = (gfq0) ap0Var2;
        xtd0 xtd0Var2 = gfq0Var2.a;
        if (z == gfq0Var2.b && gfq0Var.c == gfq0Var2.c) {
            dud0 dud0Var = xtd0Var.a;
            String str = dud0Var != null ? dud0Var.a : null;
            dud0 dud0Var2 = xtd0Var2.a;
            if (jl40.l(str, dud0Var2 != null ? dud0Var2.a : null)) {
                List list = xtd0Var.b;
                List list2 = xtd0Var2.b;
                if (list.size() == list2.size()) {
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    int i = 0;
                    while (true) {
                        boolean z2 = true;
                        if (!it.hasNext()) {
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (!((Boolean) it2.next()).booleanValue()) {
                                        break;
                                    }
                                }
                            }
                            List list4 = xtd0Var.c;
                            List list5 = xtd0Var2.c;
                            if (list4 != null || list5 != null) {
                                if (jl40.l(list4 != null ? Integer.valueOf(list4.size()) : null, list5 != null ? Integer.valueOf(list5.size()) : null) && list4 != null) {
                                    List list6 = list4;
                                    ArrayList arrayList2 = new ArrayList(tcc.n(list6, 10));
                                    int i2 = 0;
                                    for (Object obj : list6) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            scc.m();
                                            throw null;
                                        }
                                        gud0 gud0Var = (gud0) obj;
                                        gud0 gud0Var2 = list5 != null ? (gud0) a.S(i2, list5) : null;
                                        arrayList2.add(Boolean.valueOf(jl40.l(gud0Var.a, gud0Var2 != null ? gud0Var2.a : null)));
                                        i2 = i3;
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            if (!((Boolean) it3.next()).booleanValue()) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                        Object next = it.next();
                        int i4 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        aud0 aud0Var = (aud0) next;
                        aud0 aud0Var2 = (aud0) list2.get(i);
                        if (!jl40.l(aud0Var.a, aud0Var2.a) || !jl40.l(aud0Var.b, aud0Var2.b)) {
                            z2 = false;
                        }
                        arrayList.add(Boolean.valueOf(z2));
                        i = i4;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.zij
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return d((ap0) obj, (ap0) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return ((ap0) obj).getClass() == ((ap0) obj2).getClass();
    }
}
