package com.yandex.go.shortcuts.impl.factory;

import defpackage.c0z0;
import defpackage.rol0;
import defpackage.v5c0;
import defpackage.xv11;

/* loaded from: classes13.dex */
public final class e {
    public final com.yandex.go.route.interactor.b a;
    public final v5c0 b;
    public final com.yandex.go.shortcuts.impl.experiments.f c;
    public final c0z0 d;
    public final xv11 e;

    public e(com.yandex.go.route.interactor.b bVar, v5c0 v5c0Var, com.yandex.go.shortcuts.impl.experiments.f fVar, c0z0 c0z0Var, xv11 xv11Var) {
        this.a = bVar;
        this.b = v5c0Var;
        this.c = fVar;
        this.d = c0z0Var;
        this.e = xv11Var;
    }

    public final rol0 a() {
        return new rol0(new ProductsParamsChangesFactory$createChangesFlow$1(this, false, null));
    }
}
