package com.yandex.passport.data.network;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class da extends com.yandex.passport.data.network.core.a {
    public final w9 f;
    public final com.yandex.passport.data.network.core.s g;

    public da(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, z9 z9Var, ca caVar, w9 w9Var, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, cVar, l0Var, z9Var, caVar);
        this.f = w9Var;
        this.g = sVar;
    }

    @Override // com.yandex.passport.data.network.core.a, com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        v9 v9Var = (v9) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(v9Var, "GetUserInfoRequest", new s0(this, v9Var, 1)), continuation);
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: d */
    public final Object b(Object obj, Continuation continuation) {
        v9 v9Var = (v9) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(v9Var, "GetUserInfoRequest", new s0(this, v9Var, 1)), continuation);
    }
}
