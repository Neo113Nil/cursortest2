package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.provider.w;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.bu1;
import defpackage.bvf0;
import defpackage.gqu;
import defpackage.iqu;
import defpackage.jqr;
import defpackage.l1t;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class e extends ad5 {
    public final com.yandex.go.taxi.order.repositories.c A;
    public final ru.yandex.taxi.order.d B;
    public final l1t C;
    public final ru.yandex.taxi.costcenters.ride.c D;
    public final tt2 E;
    public final com.yandex.go.taxi.order.details.v1.domain.a F;
    public final pwy0 G;
    public final com.yandex.go.taxi.order.change.source.data.e H;
    public final a3y0 I;
    public iqu J;
    public final o2y0 x;
    public final bu1 y;
    public final w z;

    public e(o2y0 o2y0Var, bu1 bu1Var, w wVar, com.yandex.go.taxi.order.repositories.c cVar, ru.yandex.taxi.order.d dVar, l1t l1tVar, ru.yandex.taxi.costcenters.ride.c cVar2, tt2 tt2Var, com.yandex.go.taxi.order.details.v1.domain.a aVar, pwy0 pwy0Var, com.yandex.go.taxi.order.change.source.data.e eVar) {
        super(gqu.class);
        this.x = o2y0Var;
        this.y = bu1Var;
        this.z = wVar;
        this.A = cVar;
        this.B = dVar;
        this.C = l1tVar;
        this.D = cVar2;
        this.E = tt2Var;
        this.F = aVar;
        this.G = pwy0Var;
        this.H = eVar;
        this.I = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "HorizontalButtonsPresenter");
        this.J = new iqu();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        bvf0.j(this.F.j, null);
    }

    public final void Kg(gqu gquVar) {
        Bg(gquVar);
        com.yandex.go.taxi.order.repositories.c cVar = this.y.a;
        o2y0 o2y0Var = this.x;
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.provider.c(cVar.b(o2y0Var))), new HorizontalButtonsPresenter$attachView$1(this, null), 3);
        this.E.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        kotlinx.coroutines.flow.e.H(Jg(), new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(jqrVar, mdhVar), new HorizontalButtonsPresenter$attachView$2(this, null)));
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(new m0(this.z.b(o2y0Var), new kotlinx.coroutines.flow.n(this.H.a.a(), new HorizontalButtonsPresenter$attachView$3(2, null)), HorizontalButtonsPresenter$attachView$4.a), mdhVar), null, this), 3);
        pwy0 pwy0Var = this.G;
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$attachView$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.X(pwy0Var.a(), new HorizontalButtonsPresenter$attachView$$inlined$flatMapLatest$1(this, null)), null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$attachView$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.t(new b(this.A.b(o2y0Var))), null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$attachView$$inlined$collectIn$1(this.D.a(o2y0Var), null, gquVar), 3);
        this.J.getClass();
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$attachView$$inlined$safeCollectIn$4(kotlinx.coroutines.flow.e.X(pwy0Var.a(), new HorizontalButtonsPresenter$attachView$$inlined$flatMapLatest$2(this, null)), null, this), 3);
        com.yandex.go.taxi.order.details.v1.domain.a aVar = this.F;
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeForOrderDetailsStateUpdates$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(aVar.o), null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeForOrderDetailsStateUpdates$$inlined$collectIn$2(kotlinx.coroutines.flow.e.t(aVar.p), null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeForOrderDetailsStateUpdates$$inlined$collectIn$3(kotlinx.coroutines.flow.e.t(aVar.q), null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeForOrderDetailsStateUpdates$$inlined$collectIn$4(aVar.C, null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribePaymentUpdates$$inlined$collectIn$1(aVar.r, null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeRideSupportUpdates$$inlined$collectIn$1(aVar.z, null, this), 3);
        tje.N(Jg(), null, null, new HorizontalButtonsPresenter$subscribeInfoUpdates$$inlined$collectIn$1(aVar.s, null, this), 3);
        aVar.a();
    }
}
