package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class v6 extends com.yandex.passport.data.network.core.n {
    public final r6 h;

    public v6(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, r6 r6Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(u6.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), new com.yandex.passport.data.network.core.j(), oVar, "GetCookieByTokenRequest");
        this.h = r6Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
