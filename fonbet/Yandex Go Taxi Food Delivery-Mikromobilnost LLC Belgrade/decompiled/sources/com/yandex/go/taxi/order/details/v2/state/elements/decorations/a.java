package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.pwy0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class a {
    public final e a;
    public final pwy0 b;

    public a(e eVar, pwy0 pwy0Var) {
        this.a = eVar;
        this.b = pwy0Var;
    }

    public final k a(RideCardPresentationType rideCardPresentationType) {
        return new k(new n(kotlinx.coroutines.flow.e.X(this.b.a(), new RideCardDecorationsInteractor$uiStateFlow$$inlined$flatMapLatest$1(this, null)), new RideCardDecorationsInteractor$uiStateFlow$2(this, rideCardPresentationType, null)), new RideCardDecorationsInteractor$uiStateFlow$3(this, null));
    }
}
