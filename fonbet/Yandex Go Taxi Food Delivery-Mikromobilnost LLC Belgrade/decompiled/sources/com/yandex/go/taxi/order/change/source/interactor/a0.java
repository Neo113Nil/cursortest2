package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.ha2;
import defpackage.i380;
import defpackage.noe;
import defpackage.o2y0;
import defpackage.o380;
import defpackage.pwy0;
import defpackage.s0c0;
import defpackage.toe;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a0 {
    public final ru.yandex.taxi.styling.c a;
    public final o2y0 b;
    public final o380 c;
    public final s0c0 d;
    public final pwy0 e;
    public final i380 f;
    public final noe g;
    public final toe h;

    public a0(ru.yandex.taxi.styling.c cVar, o2y0 o2y0Var, o380 o380Var, s0c0 s0c0Var, pwy0 pwy0Var, i380 i380Var, noe noeVar, toe toeVar) {
        this.a = cVar;
        this.b = o2y0Var;
        this.c = o380Var;
        this.d = s0c0Var;
        this.e = pwy0Var;
        this.f = i380Var;
        this.g = noeVar;
        this.h = toeVar;
    }

    public final ha2 a() {
        o380 o380Var = this.c;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(new com.yandex.go.taxi.order.pin.d(o380Var.a, o380Var), 50L));
        o2y0 o2y0Var = this.b;
        return kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(new m0(t, kotlinx.coroutines.flow.e.p(new z(o2y0Var.a()), 50L), new OrderSourcePinWithStyleInteractor$pinStateFlow$2(this, null))), this.a.e(o2y0Var), this.e.a(), new OrderSourcePinWithStyleInteractor$pinV2StateWithStyleFlow$1(this, null));
    }
}
