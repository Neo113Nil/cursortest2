package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.o2y0;
import defpackage.tt2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class e {
    public final b a;
    public final o2y0 b;
    public final hbp0 c;
    public final r0 d;
    public final gci0 e;

    public e(b bVar, tt2 tt2Var, o2y0 o2y0Var) {
        this.a = bVar;
        this.b = o2y0Var;
        this.c = new hbp0(new RideCardDecorationsRepository$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "RideCardDecorationsScope", null, 4);
        r0 c = bvf0.c(null);
        this.d = c;
        this.e = kotlinx.coroutines.flow.e.d(c);
    }
}
