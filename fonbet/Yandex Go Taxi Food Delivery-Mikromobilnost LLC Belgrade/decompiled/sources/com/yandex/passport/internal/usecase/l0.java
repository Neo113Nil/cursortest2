package com.yandex.passport.internal.usecase;

import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class l0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;

    public /* synthetic */ l0(yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new k0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.d) this.c.get());
            case 1:
                return new com.yandex.passport.internal.usecase.ui.e0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.network.r) this.c.get());
            default:
                return new com.yandex.passport.legacy.analytics.a((com.yandex.passport.internal.core.accounts.j) this.b.get(), (com.yandex.passport.internal.analytics.c0) this.c.get());
        }
    }
}
