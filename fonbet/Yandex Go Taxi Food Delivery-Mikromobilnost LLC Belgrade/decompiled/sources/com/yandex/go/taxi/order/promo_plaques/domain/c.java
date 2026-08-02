package com.yandex.go.taxi.order.promo_plaques.domain;

import defpackage.o2y0;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c {
    public final ru.yandex.taxi.communications.b a;
    public final ru.yandex.taxi.communications.data.a b;

    public c(ru.yandex.taxi.communications.b bVar, ru.yandex.taxi.communications.data.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final b a(o2y0 o2y0Var) {
        return new b(new m0(o2y0Var.a(), com.yandex.go.coroutines.b.d(this.b.f, new AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$start$1(zy11.a, null)), new AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1()), this);
    }
}
