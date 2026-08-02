package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.cancel.by_driver.domain.OrderNotProcessedInteractor$cancelledOrdersStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.cancel.similar.interactor.i;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.hq70;
import defpackage.hs50;
import defpackage.ike;
import defpackage.iqz;
import defpackage.jqz;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.pzt0;
import defpackage.qz1;
import defpackage.sb2;
import defpackage.t180;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x980;
import defpackage.xw70;
import defpackage.y3y0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.g;

/* loaded from: classes14.dex */
public final class f {
    public xw70 A;
    public o2y0 B;
    public boolean C;
    public final n0 D;
    public final eci0 E;
    public final kotlinx.coroutines.channels.a F;
    public final tt2 a;
    public final com.yandex.go.taxi.order.promotions.router.a b;
    public final com.yandex.go.taxi.order.altpin.a c;
    public final qz1 d;
    public final iqz e;
    public final com.yandex.go.taxi.order.change.common.domain.d f;
    public final com.yandex.go.taxi.order.change.common.domain.c g;
    public final com.yandex.go.preorder.address.b h;
    public final com.yandex.go.taxi.order.notifications.a i;
    public final i j;
    public final hq70 k;
    public final h3y l;
    public final ru.yandex.taxi.order.d m;
    public final com.yandex.go.taxi.order.feedback.a n;
    public final x980 o;
    public final t180 p;
    public final com.yandex.go.multimodal_route.store.a q;
    public final p2y0 r;
    public final com.yandex.go.taxi.order.perf.session.a s;
    public final y3y0 t;
    public final com.yandex.go.taxi.order.perf.a u;
    public final h3y v;
    public final com.yandex.go.taxi.order.communications.analytics.realtime.a w;
    public final hs50 x;
    public pzt0 y;
    public pzt0 z;

    public f(tt2 tt2Var, com.yandex.go.taxi.order.promotions.router.a aVar, com.yandex.go.taxi.order.altpin.a aVar2, qz1 qz1Var, iqz iqzVar, com.yandex.go.taxi.order.change.common.domain.d dVar, com.yandex.go.taxi.order.change.common.domain.c cVar, com.yandex.go.preorder.address.b bVar, com.yandex.go.taxi.order.notifications.a aVar3, i iVar, hq70 hq70Var, h3y h3yVar, ru.yandex.taxi.order.d dVar2, com.yandex.go.taxi.order.feedback.a aVar4, x980 x980Var, t180 t180Var, com.yandex.go.multimodal_route.store.a aVar5, p2y0 p2y0Var, com.yandex.go.taxi.order.perf.session.a aVar6, y3y0 y3y0Var, com.yandex.go.taxi.order.perf.a aVar7, h3y h3yVar2, com.yandex.go.taxi.order.communications.analytics.realtime.a aVar8, hs50 hs50Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = qz1Var;
        this.e = iqzVar;
        this.f = dVar;
        this.g = cVar;
        this.h = bVar;
        this.i = aVar3;
        this.j = iVar;
        this.k = hq70Var;
        this.l = h3yVar;
        this.m = dVar2;
        this.n = aVar4;
        this.o = x980Var;
        this.p = t180Var;
        this.q = aVar5;
        this.r = p2y0Var;
        this.s = aVar6;
        this.t = y3y0Var;
        this.u = aVar7;
        this.v = h3yVar2;
        this.w = aVar8;
        this.x = hs50Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_LATEST);
        this.D = b;
        this.E = kotlinx.coroutines.flow.e.c(b);
        this.F = sb2.a(-1, null, null, 6);
    }

    public final void a(ike ikeVar, g gVar, xw70 xw70Var) {
        tje.N(ikeVar, null, null, new OrderFragmentPresenterDelegate$attach$1(this, gVar, null), 3);
        tje.N(ikeVar, null, null, new OrderFragmentPresenterDelegate$attach$2(this, xw70Var, null), 3);
        this.w.a();
        ((ru.yandex.taxi.altpins.order.i) this.d).a();
        ((jqz) this.e).a.c();
        this.f.a();
        this.g.a(ikeVar);
        if (!this.x.a().b) {
            this.h.a();
        }
        tje.N(ikeVar, null, null, new OrderFragmentPresenterDelegate$attach$3(this, null), 3);
        t180 t180Var = this.p;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(((e0) t180Var.b).n(), new OrderNotProcessedInteractor$cancelledOrdersStateFlow$$inlined$flatMapLatest$1(null, t180Var)));
        t180Var.c.getClass();
        tje.N(ikeVar, null, null, new OrderFragmentPresenterDelegate$attach$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), this, null), 3);
    }

    public final void b(tse tseVar, tpr tprVar) {
        this.s.a(tseVar);
        this.m.g();
        tje.N(tseVar, null, null, new OrderFragmentPresenterDelegate$resume$1(this, null), 3);
        tje.N(tseVar, null, null, new OrderFragmentPresenterDelegate$resume$2(this, null), 3);
        tje.N(tseVar, null, null, new OrderFragmentPresenterDelegate$resume$3(tprVar, this, null), 3);
        tje.N(tseVar, null, null, new OrderFragmentPresenterDelegate$resume$4(this, null), 3);
    }

    public final void c(ike ikeVar, o2y0 o2y0Var) {
        tje.N(ikeVar, null, null, new OrderFragmentPresenterDelegate$scheduleOverlayInvalidation$1(this, o2y0Var, null), 3);
    }
}
