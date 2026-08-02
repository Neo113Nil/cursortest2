package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.domain.interactors.TaxiOrderTrackingCardInteractor$trackingCardFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.a3y0;
import defpackage.b630;
import defpackage.iup0;
import defpackage.jc00;
import defpackage.lzu0;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.q180;
import defpackage.q6y0;
import defpackage.t6y0;
import defpackage.tb;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.checkin.CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1;

/* loaded from: classes14.dex */
public final class n {
    public final tse a;
    public final o2y0 b;
    public final com.yandex.go.taxi.order.titles.f c;
    public final q180 d;
    public final h e;
    public final ru.yandex.taxi.checkin.a f;
    public final com.yandex.go.taxi.order.domain.interactors.p g;
    public final iup0 h;
    public final com.yandex.go.taxi.order.domain.interactors.s i;
    public final t6y0 j;
    public final f0 k;
    public final jc00 l;
    public final com.yandex.go.taxi.order.promo_plaques.domain.c m;
    public final b630 n;
    public final a3y0 o = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiOrderModelRepository");
    public pzt0 p;
    public q6y0 q;

    public n(tse tseVar, o2y0 o2y0Var, com.yandex.go.taxi.order.titles.f fVar, q180 q180Var, h hVar, ru.yandex.taxi.checkin.a aVar, com.yandex.go.taxi.order.domain.interactors.p pVar, iup0 iup0Var, com.yandex.go.taxi.order.domain.interactors.s sVar, t6y0 t6y0Var, f0 f0Var, jc00 jc00Var, com.yandex.go.taxi.order.promo_plaques.domain.c cVar, b630 b630Var) {
        this.a = tseVar;
        this.b = o2y0Var;
        this.c = fVar;
        this.d = q180Var;
        this.e = hVar;
        this.f = aVar;
        this.g = pVar;
        this.h = iup0Var;
        this.i = sVar;
        this.j = t6y0Var;
        this.k = f0Var;
        this.l = jc00Var;
        this.m = cVar;
        this.n = b630Var;
    }

    public final o2y0 a() {
        return this.b;
    }

    public final void b(Consumer consumer) {
        c(new tb(17, this, consumer));
        com.yandex.go.taxi.order.domain.repositories.n nVar = (com.yandex.go.taxi.order.domain.repositories.n) this.h;
        o2y0 o2y0Var = this.b;
        kotlinx.coroutines.flow.n nVar2 = new kotlinx.coroutines.flow.n(new k(nVar.h(o2y0Var)), new TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$shouldShowTimerFlow$2(2, null));
        tpr t = kotlinx.coroutines.flow.e.t(new m(o2y0Var.a()));
        tpr f = kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.g(new TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1(new lzu0(25, this.c, o2y0Var), null)), 0, BufferOverflow.DROP_OLDEST, 1);
        c d = this.e.d(o2y0Var, OrderScreen.ORDER_LIST);
        tpr a = this.g.a(o2y0Var);
        ru.yandex.taxi.checkin.d dVar = this.f.a;
        dVar.getClass();
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(o2y0Var.a(), new CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1(null, dVar));
        com.yandex.go.taxi.order.promo_plaques.domain.b a2 = this.m.a(o2y0Var);
        r0 r0Var = this.k.b;
        com.yandex.go.taxi.order.domain.interactors.s sVar = this.i;
        sVar.getClass();
        tpr t2 = kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.domain.interactors.r(o2y0Var.a(), sVar));
        t6y0 t6y0Var = this.j;
        t6y0Var.getClass();
        this.p = tje.N(this.a, null, null, new TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$safeCollectIn$1(new i(new tpr[]{f, d, a, X, a2, nVar2, r0Var, t, t2, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(o2y0Var.a(), new TaxiOrderTrackingCardInteractor$trackingCardFlow$$inlined$flatMapLatest$1(null, t6y0Var))), ((com.yandex.go.yb.lack_of_order.domain.e) this.n).a(o2y0Var)}, this), null, consumer, this), 3);
    }

    public final void c(Consumer consumer) {
        pzt0 pzt0Var = this.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.p = null;
        consumer.accept(null);
    }
}
