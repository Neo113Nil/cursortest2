package com.yandex.go.superapp.order.multi.old;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.view.l;
import defpackage.am00;
import defpackage.gci0;
import defpackage.gu11;
import defpackage.hc80;
import defpackage.jqr;
import defpackage.jt00;
import defpackage.l601;
import defpackage.nc80;
import defpackage.qc5;
import defpackage.ra80;
import defpackage.tje;
import defpackage.ub60;
import defpackage.wr00;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class h extends qc5 {
    public final hc80 A;
    public final com.yandex.go.superapp.tracking.data.e B;
    public final l C;
    public final wr00 D;
    public final f0 E;
    public OrderScreen F;
    public List G;
    public final am00 H;
    public final boolean I;

    public h(Lifecycle lifecycle, gu11 gu11Var, l lVar, jt00 jt00Var, hc80 hc80Var, com.yandex.go.superapp.tracking.data.e eVar, l lVar2, wr00 wr00Var, f0 f0Var) {
        super(nc80.class, lifecycle);
        this.A = hc80Var;
        this.B = eVar;
        this.C = lVar2;
        this.D = wr00Var;
        this.E = f0Var;
        this.G = EmptyList.a;
        this.H = jt00Var.a("multiorder", l601.a, new ub60(15, this));
        gu11Var.getClass();
        this.I = ((ra80) lVar.j.getValue()).a == OrderScreen.ORDER_TRACKING;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.B.c();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        hc80 hc80Var = this.A;
        hc80Var.d.b = kotlin.collections.b.f();
        hc80Var.j = null;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        gci0 gci0Var = this.B.v;
        r0 r0Var = this.C.j;
        f0 f0Var = this.E;
        tje.N(Kg(), null, null, new OrdersListViewPresenter$onResume$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(new jqr(new e(new c(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(gci0Var, r0Var, f0Var.q, new OrdersListViewPresenter$onResume$1(4, null))), this), this), new OrdersListViewPresenter$onResume$4(2, this.A, hc80.class, "onListChanged", "onListChanged(Ljava/util/List;)V", 4), 3), new OrdersListViewPresenter$onResume$$inlined$flatMapLatest$1(null, this)), null, this), 3);
        tje.N(Kg(), null, null, new OrdersListViewPresenter$onResume$$inlined$safeCollectIn$2(f0Var.d, null, this), 3);
        tje.N(Kg(), null, null, new OrdersListViewPresenter$onResume$$inlined$safeCollectIn$3(f0Var.j, null, this), 3);
    }
}
