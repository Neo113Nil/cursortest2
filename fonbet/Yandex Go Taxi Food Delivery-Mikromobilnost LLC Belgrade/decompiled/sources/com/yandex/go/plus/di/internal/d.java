package com.yandex.go.plus.di.internal;

import defpackage.asp0;
import defpackage.c2d0;
import defpackage.eqh;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class d implements v7p {
    public final xvf0 a;
    public final xvf0 b;

    public d(eqh eqhVar, xvf0 xvf0Var) {
        this.a = eqhVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        c2d0 c2d0Var = (c2d0) this.a.get();
        ru.yandex.taxi.plus.sdk.existing_screens.c cVar = (ru.yandex.taxi.plus.sdk.existing_screens.c) this.b.get();
        c2d0Var.getClass();
        return new asp0(PlusSdkModule$Companion$plusDataDependencies$2.b, c2d0Var.r, c2d0Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, cVar);
    }
}
