package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.usecase.n1;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class o implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;

    public /* synthetic */ o(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new n((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.d) this.c.get(), (com.yandex.passport.internal.network.client.c) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.e.get(), (com.yandex.passport.internal.common.j) this.f.get(), (com.yandex.passport.internal.usecase.y) this.g.get());
            default:
                return new i0((r0) this.b.get(), (com.yandex.passport.internal.e) this.c.get(), (com.yandex.passport.internal.ui.g) this.d.get(), (n1) this.e.get(), (q) this.f.get(), (com.yandex.passport.common.coroutine.a) this.g.get());
        }
    }
}
