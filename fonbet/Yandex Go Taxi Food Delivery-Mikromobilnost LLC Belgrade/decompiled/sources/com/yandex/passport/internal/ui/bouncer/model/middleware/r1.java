package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class r1 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.flags.j a;
    public final com.yandex.passport.internal.network.e b;
    public final com.yandex.passport.internal.account.a c;
    public final com.yandex.passport.internal.filter.i d;

    public r1(com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.network.e eVar, com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.filter.i iVar) {
        this.a = jVar;
        this.b = eVar;
        this.c = aVar;
        this.d = iVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 23), r0Var, new VerifyResultActor$act$1(this, null));
    }
}
