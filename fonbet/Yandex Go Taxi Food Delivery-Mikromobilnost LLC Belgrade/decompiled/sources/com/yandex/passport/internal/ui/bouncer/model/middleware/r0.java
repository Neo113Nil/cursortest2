package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class r0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.account.a a;

    public r0(com.yandex.passport.internal.account.a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 14), r0Var, new RouteActor$act$1(this, null));
    }
}
