package com.yandex.go.taxi.order;

import defpackage.p2y0;

/* loaded from: classes14.dex */
public final class u {
    public final p2y0 a;

    public u(p2y0 p2y0Var) {
        this.a = p2y0Var;
    }

    public final kotlinx.coroutines.flow.n a() {
        return new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.domain.repositories.e0) this.a).n(), new OrderFeedbackRepository$getFeedbackFlow$$inlined$flatMapLatest$1(3, null)), new OrderFeedbackRepository$getFeedbackFlow$1(this, null));
    }
}
