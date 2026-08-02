package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.cmm;
import defpackage.iup0;
import defpackage.ixx0;
import defpackage.mth;
import defpackage.n20;
import defpackage.o2y0;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class x {
    public final com.yandex.go.taxi.order.change.source.pin.b a;
    public final iup0 b;
    public final ixx0 c;
    public final com.yandex.go.navigation.screen.c d;
    public final n20 e;
    public final cmm f;

    public x(com.yandex.go.taxi.order.change.source.pin.b bVar, iup0 iup0Var, ixx0 ixx0Var, com.yandex.go.navigation.screen.c cVar, n20 n20Var, cmm cmmVar) {
        this.a = bVar;
        this.b = iup0Var;
        this.c = ixx0Var;
        this.d = cVar;
        this.e = n20Var;
        this.f = cmmVar;
    }

    public final tpr a(o2y0 o2y0Var) {
        return kotlinx.coroutines.flow.e.t(new m(new mth(new m0(this.c.a(o2y0Var), kotlinx.coroutines.flow.e.t(new m0(this.d.c(), ((com.yandex.go.taxi.order.provider.a) this.e).a(), new OrderSourcePinStateInteractor$pickupPointVisibilityFlow$1(3, null))), new OrderSourcePinStateInteractor$pickupPointPinState$1(3, null)), 6), this));
    }

    public final tpr b(o2y0 o2y0Var) {
        return kotlinx.coroutines.flow.e.t(new w(this.a.b(new m0(new s(((com.yandex.go.taxi.order.domain.repositories.n) this.b).e()), new u(o2y0Var.a(), this), new OrderSourcePinStateInteractor$sourceSearchPinState$visibilityFlow$3(3, null)), DriveState.SEARCH), this));
    }
}
