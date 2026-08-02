package com.yandex.go.taxi.order.domain.interactors;

import defpackage.a080;
import defpackage.o2y0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class h {
    public final com.yandex.go.taxi.order.provider.l a;
    public final a080 b;

    public h(com.yandex.go.taxi.order.provider.l lVar, a080 a080Var) {
        this.a = lVar;
        this.b = a080Var;
    }

    public final m0 a(o2y0 o2y0Var) {
        return new m0(this.a.a(o2y0Var), new g(com.yandex.go.coroutines.b.d(o2y0Var.a(), new OrderMapObjectsInteractor$mapObjectsOverrideFlow$$inlined$start$1(o2y0Var.b(), null)), this), new OrderMapObjectsInteractor$mapObjectsFlow$1(this, null));
    }
}
