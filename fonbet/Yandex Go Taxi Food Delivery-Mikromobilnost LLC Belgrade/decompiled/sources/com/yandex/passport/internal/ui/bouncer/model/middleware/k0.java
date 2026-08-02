package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class k0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.flags.j b;

    public k0(com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = dVar;
        this.b = jVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 12), r0Var, new ReloginActor$act$1(this, null));
    }
}
