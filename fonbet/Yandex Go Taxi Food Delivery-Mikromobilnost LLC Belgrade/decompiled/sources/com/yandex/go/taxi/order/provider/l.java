package com.yandex.go.taxi.order.provider;

import defpackage.a080;
import defpackage.ha2;
import defpackage.mth;
import defpackage.o2y0;
import defpackage.o380;
import defpackage.tpr;

/* loaded from: classes14.dex */
public final class l {
    public final ru.yandex.taxi.order.d a;
    public final o380 b;
    public final a080 c;

    public l(ru.yandex.taxi.order.d dVar, o380 o380Var, a080 a080Var) {
        this.a = dVar;
        this.b = o380Var;
        this.c = a080Var;
    }

    public final ha2 a(o2y0 o2y0Var) {
        tpr d = com.yandex.go.coroutines.b.d(o2y0Var.a(), new MapObjectsRepository$mapObjectsFlow$$inlined$start$1(o2y0Var.b(), null));
        mth mthVar = new mth(this.a.k, 6);
        o380 o380Var = this.b;
        return kotlinx.coroutines.flow.e.n(d, mthVar, new k(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.pin.b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(new com.yandex.go.taxi.order.pin.d(o380Var.a, o380Var), 50L))))), new MapObjectsRepository$mapObjectsFlow$2(this, null));
    }
}
