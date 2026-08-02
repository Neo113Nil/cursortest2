package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes14.dex */
public final class p2l0 implements z910 {
    public final /* synthetic */ boolean a;

    public p2l0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Iterable iterable;
        int f0 = kVar.f0(6.0f);
        boolean z = this.a;
        List K = z ? a.K(list) : list;
        x910 x910Var = z ? (x910) a.b0(list) : null;
        List list2 = K;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x910) it.next()).l0(n8e.b(0, j, 0, 0, 0, 14)));
        }
        o l0 = x910Var != null ? x910Var.l0(n8e.b(0, j, 0, 0, 0, 14)) : null;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i = l0 != null ? l0.a : 0;
        int i2 = z ? i + f0 : 0;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = ((o) arrayList.get(i3)).a;
            if (x4e.D(i4, i3 > 0 ? f0 : 0, i5, i2) > n8e.i(j)) {
                break;
            }
            int i6 = i3 + 1;
            ref$IntRef.element = i6;
            i4 += (i3 > 0 ? f0 : 0) + i5;
            i3 = i6;
        }
        if (z && ref$IntRef.element == 0 && l0 != null && i <= n8e.i(j)) {
            ref$IntRef.element = 0;
        }
        List A0 = a.A0(arrayList, ref$IntRef.element);
        ArrayList arrayList2 = new ArrayList(tcc.n(A0, 10));
        Iterator it2 = A0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((o) it2.next()).b));
        }
        if (z) {
            iterable = Collections.singletonList(Integer.valueOf(l0 != null ? l0.b : 0));
        } else {
            iterable = EmptyList.a;
        }
        Integer num = (Integer) a.c0(a.m0(iterable, arrayList2));
        return kVar.w(n8e.i(j), num != null ? num.intValue() : 0, b.f(), new b930(ref$IntRef, arrayList, f0, this.a, l0));
    }
}
