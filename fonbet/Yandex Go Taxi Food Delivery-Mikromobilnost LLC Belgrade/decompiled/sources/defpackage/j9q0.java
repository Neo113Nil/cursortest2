package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class j9q0 implements z910 {
    public static final j9q0 a = new j9q0();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        if (list.isEmpty()) {
            return kVar.w(0, 0, b.f(), new p0u(5));
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((x910) it.next()).e0(n8e.h(j))));
        }
        int z0 = a.z0(arrayList);
        if (z0 < 1) {
            z0 = 1;
        }
        int i = n8e.i(j);
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf((int) ((((Number) it2.next()).intValue() / z0) * i)));
        }
        int z02 = i - a.z0(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (z02 > 0 && !arrayList3.isEmpty()) {
            int f = scc.f(arrayList3);
            arrayList3.set(f, Integer.valueOf(((Number) arrayList3.get(f)).intValue() + z02));
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
        Iterator it3 = list2.iterator();
        int i2 = 0;
        while (true) {
            Integer num = null;
            if (!it3.hasNext()) {
                Iterator it4 = arrayList4.iterator();
                if (it4.hasNext()) {
                    Integer valueOf = Integer.valueOf(((o) it4.next()).b);
                    loop3: while (true) {
                        num = valueOf;
                        while (it4.hasNext()) {
                            valueOf = Integer.valueOf(((o) it4.next()).b);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                int intValue = num != null ? num.intValue() : 0;
                return kVar.w(i, intValue, b.f(), new g12(intValue, 3, arrayList4));
            }
            Object next = it3.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList4.add(((x910) next).l0(p8e.a(((Number) arrayList3.get(i2)).intValue(), ((Number) arrayList3.get(i2)).intValue(), 0, n8e.h(j))));
            i2 = i3;
        }
    }
}
