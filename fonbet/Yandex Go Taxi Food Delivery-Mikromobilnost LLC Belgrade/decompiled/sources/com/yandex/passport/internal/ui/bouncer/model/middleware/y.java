package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class y implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.upgrader.k a;
    public final com.yandex.passport.internal.report.reporters.f b;

    public y(com.yandex.passport.internal.upgrader.k kVar, com.yandex.passport.internal.report.reporters.f fVar) {
        this.a = kVar;
        this.b = fVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 7), r0Var, new FinishRegistrationActor$act$1(this, null));
    }
}
