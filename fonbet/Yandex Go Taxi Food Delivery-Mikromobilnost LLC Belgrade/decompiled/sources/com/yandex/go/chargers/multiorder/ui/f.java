package com.yandex.go.chargers.multiorder.ui;

import defpackage.pwy0;
import defpackage.rda;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes12.dex */
public final class f {
    public final tt2 a;
    public final pwy0 b;
    public final g c;
    public final com.yandex.go.chargers.data.e d;
    public final rda e;
    public final e f;

    public f(tt2 tt2Var, pwy0 pwy0Var, g gVar, com.yandex.go.chargers.data.e eVar, rda rdaVar) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = gVar;
        this.d = eVar;
        this.e = rdaVar;
        this.f = new e(kotlinx.coroutines.flow.e.t(new com.yandex.go.chargers.data.d(kotlinx.coroutines.flow.e.d(eVar.d), eVar)));
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(this.b.a(), kotlinx.coroutines.flow.e.d(this.d.d), kotlinx.coroutines.flow.e.d(this.e.a), new ChargersMultiOrderUiStateInteractor$uiStateFlow$1(this, null)));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
