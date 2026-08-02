package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import defpackage.c0z0;
import defpackage.q9j0;
import defpackage.rol0;
import defpackage.xaw0;

/* loaded from: classes.dex */
public final class q {
    public final com.yandex.go.route.interactor.b a;
    public final q9j0 b;
    public final xaw0 c;
    public final com.yandex.go.shortcuts.impl.experiments.f d;
    public final c0z0 e;

    public q(com.yandex.go.route.interactor.b bVar, q9j0 q9j0Var, xaw0 xaw0Var, com.yandex.go.shortcuts.impl.experiments.f fVar, c0z0 c0z0Var) {
        this.a = bVar;
        this.b = q9j0Var;
        this.c = xaw0Var;
        this.d = fVar;
        this.e = c0z0Var;
    }

    public final rol0 a(boolean z) {
        return new rol0(new SuperappGeoParamsChangesFactory$createChangesFlow$1(this, z, null));
    }
}
