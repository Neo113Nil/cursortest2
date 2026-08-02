package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.rol0;

/* loaded from: classes2.dex */
public final class g1 implements com.yandex.passport.common.mvi.a {
    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 20), r0Var, new SocialActionResultActor$act$1(3, null));
    }
}
