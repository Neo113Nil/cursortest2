package xsna;

import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bph0;
import xsna.nph0;
import xsna.pph0;

/* compiled from: SearchDatabaseFeature.kt */
/* loaded from: classes5.dex */
public final class eph0<Item> extends wk50<com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item>, SearchDatabaseState<Item>, bph0, nph0<? extends Item>> implements lph0<Item> {
    public final pph0<Item> f;
    public final fph0<Item> g;
    public final f4z h;

    public eph0(sph0<Item> sph0Var, pph0<Item> pph0Var, fph0<Item> fph0Var) {
        super(bph0.b.b, sph0Var);
        this.f = pph0Var;
        this.g = fph0Var;
        this.h = new f4z();
        List I = rl3.I(new fuq[]{pph0Var, fph0Var});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        Iterator it = I.iterator();
        while (it.hasNext()) {
            arrayList.add(((fuq) it.next()).d());
        }
        io.reactivex.rxjava3.internal.operators.observable.u0 O = io.reactivex.rxjava3.core.q.O(arrayList);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        this.e.b(O.L(qVar, false).subscribe(new m1r(new yo20(1, this, eph0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 7), 24)));
        ArrayList arrayList2 = new ArrayList(c5g.u(I, 10));
        Iterator it2 = I.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((fuq) it2.next()).e());
        }
        this.e.b(io.reactivex.rxjava3.core.q.O(arrayList2).L(qVar, false).subscribe(new b0y(new dph0(1, this, eph0.class, "dispatchSideEffect", "dispatchSideEffect([Lcom/vk/search/params/impl/presentation/modal/database/mvi/model/SearchDatabaseSideEffect;)V", 0), 20)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(km50 km50Var, bph0 bph0Var) {
        SearchDatabaseState.a.d dVar;
        List<Item> list;
        Object b0;
        SearchDatabaseState searchDatabaseState = (SearchDatabaseState) km50Var;
        bph0 bph0Var2 = bph0Var;
        String str = searchDatabaseState.b;
        SearchDatabaseState.a<Item> aVar = searchDatabaseState.e;
        boolean equals = bph0Var2.equals(bph0.b.b);
        pph0<Item> pph0Var = this.f;
        if (equals) {
            if (epx.f(aVar, SearchDatabaseState.a.c.b)) {
                String obj = drm0.p0(str).toString();
                pph0Var.b.onNext(new pph0.a(obj, 0, 0L));
                T(new nph0.b(obj));
                return;
            }
            return;
        }
        boolean z = bph0Var2 instanceof bph0.c;
        fph0<Item> fph0Var = this.g;
        if (z) {
            bph0.c cVar = (bph0.c) bph0Var2;
            dVar = aVar instanceof SearchDatabaseState.a.d ? (SearchDatabaseState.a.d) aVar : null;
            if (dVar == null || (list = dVar.c) == null || (b0 = j5g.b0(cVar.b, list)) == null) {
                return;
            }
            T(new nph0.f(new a.b(b0)));
            fph0Var.a(b0);
            return;
        }
        if (bph0Var2 instanceof bph0.f) {
            String str2 = ((bph0.f) bph0Var2).b;
            if (epx.f(str2, str)) {
                return;
            }
            T(new nph0.e(str2));
            String obj2 = drm0.p0(str2).toString();
            if (epx.f(obj2, drm0.p0(str).toString())) {
                return;
            }
            T(new nph0.b(obj2));
            long j = epx.f(aVar, SearchDatabaseState.a.b.b) ? 0L : 300L;
            pph0Var.c.onNext(s3q0.a);
            pph0Var.b.onNext(new pph0.a(obj2, 0, j));
            return;
        }
        if (bph0Var2 instanceof bph0.a) {
            cph0 cph0Var = (cph0) j5g.b0(((bph0.a) bph0Var2).b, searchDatabaseState.f);
            if (cph0Var == null) {
                return;
            }
            T(new nph0.f(new a.C1764a(0)));
            fph0Var.c(cph0Var);
            return;
        }
        if (bph0Var2.equals(bph0.e.b)) {
            T(new nph0.f(a.c.a));
            fph0Var.b();
            return;
        }
        if (!bph0Var2.equals(bph0.d.b)) {
            if (!bph0Var2.equals(bph0.g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (epx.f(aVar, SearchDatabaseState.a.b.b)) {
                pph0Var.c.onNext(s3q0.a);
                String obj3 = drm0.p0(str).toString();
                pph0Var.b.onNext(new pph0.a(obj3, 0, 0L));
                T(new nph0.b(obj3));
                return;
            }
            return;
        }
        SearchDatabaseState.a.d dVar2 = aVar instanceof SearchDatabaseState.a.d ? (SearchDatabaseState.a.d) aVar : null;
        if (dVar2 != null) {
            dVar = dVar2.d == SearchDatabaseState.ListEnd.LOAD_NEXT_TRIGGER ? dVar2 : null;
            if (dVar != null) {
                String obj4 = drm0.p0(str).toString();
                pph0Var.c.onNext(s3q0.a);
                pph0Var.b.onNext(new pph0.a(obj4, dVar.c.size(), 0L));
                T(new nph0.b(obj4));
            }
        }
    }

    @Override // xsna.lph0
    public final wj50<uph0<Item>> x() {
        return this.h;
    }
}
