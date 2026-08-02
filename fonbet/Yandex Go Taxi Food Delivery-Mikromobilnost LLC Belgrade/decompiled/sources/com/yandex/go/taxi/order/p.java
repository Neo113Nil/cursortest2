package com.yandex.go.taxi.order;

import android.content.Context;
import defpackage.ad5;
import defpackage.ba80;
import defpackage.eci0;
import defpackage.iup0;
import defpackage.jgv;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.p370;
import defpackage.p4j;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ud80;
import defpackage.uyj;
import defpackage.v2y0;
import defpackage.wsr0;
import defpackage.xb6;
import defpackage.xsr0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class p extends ad5 {
    public final v2y0 A;
    public final ba80 B;
    public final pav C;
    public final iup0 D;
    public final ud80 E;
    public final p4j F;
    public final p370 G;
    public final jgv H;
    public final int I;
    public final o2y0 x;
    public final tt2 y;
    public final com.yandex.go.taxi.order.repositories.c z;

    public p(Context context, o2y0 o2y0Var, tt2 tt2Var, com.yandex.go.taxi.order.repositories.c cVar, v2y0 v2y0Var, ba80 ba80Var, pav pavVar, iup0 iup0Var, ud80 ud80Var, p4j p4jVar, p370 p370Var, jgv jgvVar) {
        super(xb6.class);
        this.x = o2y0Var;
        this.y = tt2Var;
        this.z = cVar;
        this.A = v2y0Var;
        this.B = ba80Var;
        this.C = pavVar;
        this.D = iup0Var;
        this.E = ud80Var;
        this.F = p4jVar;
        this.G = p370Var;
        this.H = jgvVar;
        this.I = (int) tje.w(60, context);
    }

    public final void Kg(ru.yandex.taxi.order.a aVar) {
        Bg(aVar);
        com.yandex.go.taxi.order.repositories.c cVar = this.z;
        o2y0 o2y0Var = this.x;
        tje.N(Jg(), null, null, new BottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m0(new m(new k(cVar.a(o2y0Var))), this.B.a(o2y0Var), new BottomCircleButtonsViewPresenter$observeShareButtonData$1(3, null))), null, this), 3);
        eci0 O = kotlinx.coroutines.flow.e.O(((com.yandex.go.taxi.order.domain.repositories.n) this.D).h(o2y0Var), Jg(), wsr0.a(xsr0.a, 3), 1);
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new e(kotlinx.coroutines.flow.e.s(new c(O), new BottomCircleButtonsViewPresenter$observeCandidateButtonData$2(2, this, p.class, "compareDrivers", "compareDrivers(Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;)Z", 0)), this)), new BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$flatMapLatest$1(null, this));
        this.y.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(Jg(), null, null, new BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(X, mdhVar), null, this), 3);
        tje.N(Jg(), null, null, new BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(new g(O)), mdhVar), null, this), 3);
        tje.N(Jg(), null, null, new BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new i(cVar.b(o2y0Var), this)), new BottomCircleButtonsViewPresenter$observeDriverButtonData$$inlined$flatMapLatest$1(null, this)), mdhVar), null, this), 3);
        tje.N(Jg(), null, null, new BottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(new o(cVar.b(o2y0Var), this), mdhVar), null, this), 3);
    }
}
