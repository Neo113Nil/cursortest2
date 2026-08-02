package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.internal.usecase.v0;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class u implements v7p {
    public final yvf0 a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;

    public u(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7) {
        this.a = yvf0Var;
        this.b = yvf0Var2;
        this.c = yvf0Var3;
        this.d = yvf0Var4;
        this.e = yvf0Var5;
        this.f = yvf0Var6;
        this.g = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new t((com.yandex.passport.internal.ui.challenge.k) this.a.get(), (g0) this.b.get(), (com.yandex.passport.internal.ui.challenge.n) this.c.get(), (v0) this.d.get(), (LogoutBehaviour) this.e.get(), (com.yandex.passport.internal.usecase.q) this.f.get(), (com.yandex.passport.internal.usecase.ui.r) this.g.get());
    }
}
