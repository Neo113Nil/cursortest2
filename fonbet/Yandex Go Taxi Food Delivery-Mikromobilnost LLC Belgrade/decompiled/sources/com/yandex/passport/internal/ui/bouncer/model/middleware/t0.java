package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class t0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.core.accounts.t b;

    public t0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.t tVar) {
        this.a = dVar;
        this.b = tVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 15), r0Var, new SelectAccountByUidActor$act$1(this, null));
    }
}
