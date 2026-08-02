package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.tpr;

/* loaded from: classes2.dex */
public final class c1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.flags.j a;
    public final com.yandex.passport.internal.report.reporters.m b;
    public final com.yandex.passport.internal.core.accounts.n c;

    public c1(com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.m mVar, com.yandex.passport.internal.core.accounts.n nVar) {
        this.a = jVar;
        this.b = mVar;
        this.c = nVar;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 18), this, 10);
    }
}
