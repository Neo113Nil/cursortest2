package com.yandex.go.taxi.order.map.overlay;

import defpackage.y7;
import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public final class p extends y7 {
    public final /* synthetic */ c0 a;

    public p(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // defpackage.y7, defpackage.q1t
    public final void setNextRecenterType(RecenterType recenterType) {
        c0 c0Var = this.a;
        com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$onResume$19$setNextRecenterType$1(c0Var, recenterType, null), 3);
    }
}
