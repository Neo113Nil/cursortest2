package com.yandex.go.chargers.order.domain;

import defpackage.hbp0;
import defpackage.iy11;
import defpackage.lxf;
import defpackage.ney;
import defpackage.tt2;
import defpackage.u2a;

/* loaded from: classes12.dex */
public final class f implements u2a {
    public final ney a;
    public final com.yandex.go.chargers.data.g b;
    public final com.yandex.go.chargers.domain.a c;
    public final a d;
    public final iy11 e;
    public final com.yandex.go.chargers.data.e f;
    public final lxf g;
    public final hbp0 h;
    public final e i = new e(this);

    public f(tt2 tt2Var, ney neyVar, com.yandex.go.chargers.data.g gVar, com.yandex.go.chargers.domain.a aVar, a aVar2, iy11 iy11Var, com.yandex.go.chargers.data.e eVar, lxf lxfVar) {
        this.a = neyVar;
        this.b = gVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = iy11Var;
        this.f = eVar;
        this.g = lxfVar;
        this.h = new hbp0(new ChargersActiveOrdersSessionPollingInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    @Override // defpackage.u2a
    public final void a() {
        ney neyVar = this.a;
        e eVar = this.i;
        neyVar.b(eVar, eVar);
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        this.a.d(this.i);
    }
}
