package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class bwt {
    public final t7f0 a;

    public bwt(t7f0 t7f0Var) {
        this.a = t7f0Var;
    }

    public static qcd0 a(long j, String str) {
        try {
            return new qcd0(new BigDecimal(j).divide(new BigDecimal(1000000)), str);
        } catch (NumberFormatException e) {
            ny61.h(qv10.k(j, "Cannot parse ", " to BigDecimal"), e);
            return null;
        }
    }

    public final List b() {
        s7f0 s7f0Var;
        t7f0 t7f0Var = this.a;
        ArrayList arrayList = t7f0Var.h;
        if (arrayList == null || (s7f0Var = (s7f0) a.R(arrayList)) == null) {
            q7f0 a = t7f0Var.a();
            return a != null ? Collections.singletonList(new pcd0(a(a.a, a.b), null, 0)) : EmptyList.a;
        }
        ArrayList arrayList2 = s7f0Var.b.b;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r7f0 r7f0Var = (r7f0) it.next();
            arrayList3.add(new pcd0(a(r7f0Var.a, r7f0Var.b), r7f0Var.c, r7f0Var.d));
        }
        return arrayList3;
    }

    public final t7f0 c() {
        return this.a;
    }
}
