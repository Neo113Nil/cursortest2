package com.yandex.go.navigator.address;

import defpackage.pwy0;
import defpackage.pyv;
import defpackage.re50;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class e {
    public final pyv a;
    public final re50 b;
    public final pwy0 c;

    public e(pyv pyvVar, re50 re50Var, pwy0 pwy0Var) {
        this.a = pyvVar;
        this.b = re50Var;
        this.c = pwy0Var;
    }

    public final m0 a() {
        return new m0(this.b.c, new d(this.c.a(), this), new SourceAddressInteractor$navigatorRouteFlow$1(3, null));
    }
}
