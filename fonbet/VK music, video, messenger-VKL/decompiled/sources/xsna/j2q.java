package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ExchangeTokenInfoHelper.kt */
/* loaded from: classes15.dex */
public final class j2q {
    public static io.reactivex.rxjava3.internal.operators.observable.b0 a(ArrayList arrayList) {
        ArrayList U0 = j5g.U0(arrayList, 7, 7, true);
        ArrayList arrayList2 = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            arrayList2.add(vdx0Var.e().t(list));
        }
        io.reactivex.rxjava3.core.q<R> L = io.reactivex.rxjava3.core.q.O(arrayList2).L(io.reactivex.rxjava3.internal.functions.a.a, false);
        tf3 tf3Var = new tf3(new a60(28), 13);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p0(L, tf3Var).F(new c60(new ht(23), 26));
    }
}
