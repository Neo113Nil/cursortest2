package com.yandex.go.taxi.order.details.v2.state;

import defpackage.agk0;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.qnk0;
import defpackage.sfk0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.core.c b;
    public final tt2 c;
    public final agk0 d;
    public final com.yandex.go.taxi.order.details.v2.analytics.perf.a e;
    public final r0 f;
    public final gci0 g;

    public d(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.core.c cVar, tt2 tt2Var, agk0 agk0Var, com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar) {
        this.a = o2y0Var;
        this.b = cVar;
        this.c = tt2Var;
        this.d = agk0Var;
        this.e = aVar;
        r0 c = bvf0.c(new qnk0(EmptyList.a, RideCardState$ProcessingStep.EMPTY, RideCardPresentationType.NONE, DriveState.PREORDER, sfk0.a));
        this.f = c;
        this.g = e.d(c);
    }

    public final tpr a(RideCardPresentationType rideCardPresentationType) {
        jqr jqrVar = new jqr(e.t(new c(new k(new n(this.b.c(rideCardPresentationType), new RideCardStateRepository$stateFlow$1(this, rideCardPresentationType, null)), new RideCardStateRepository$stateFlow$2(this, null)))), new RideCardStateRepository$stateFlow$4(this, null), 3);
        this.c.getClass();
        return e.F(jqrVar, uyj.a);
    }
}
