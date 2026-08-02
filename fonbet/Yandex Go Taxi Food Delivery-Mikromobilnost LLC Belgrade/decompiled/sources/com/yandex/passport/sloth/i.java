package com.yandex.passport.sloth;

import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class i implements v7p {
    public final com.yandex.passport.sloth.dependencies.c a;
    public final yvf0 b;

    public i(com.yandex.passport.sloth.dependencies.c cVar, yvf0 yvf0Var) {
        this.a = cVar;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new h((com.yandex.passport.common.coroutine.a) this.a.get(), (z0) this.b.get());
    }
}
