package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnonymousFeatureMangerUpdateSource.kt */
/* loaded from: classes11.dex */
public final class ru2 implements b.InterfaceC1925b {
    @Override // com.vk.toggle.b.InterfaceC1925b
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(b.c cVar, UserId userId) {
        List<b.d> list = cVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b.d) it.next()).b.toString());
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.core.q<R> w = vdx0Var.a().f(arrayList).w();
        final pu2 pu2Var = new pu2(0);
        return w.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.qu2
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (b.c) pu2.this.invoke(obj);
            }
        });
    }

    @Override // com.vk.toggle.b.InterfaceC1925b
    public final io.reactivex.rxjava3.internal.operators.completable.w b(b.a aVar) {
        io.reactivex.rxjava3.internal.operators.completable.i iVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
        lf1 lf1Var = new lf1(new z90(2), 1);
        iVar.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(iVar, lf1Var, lVar, kVar, kVar, kVar, kVar);
    }
}
