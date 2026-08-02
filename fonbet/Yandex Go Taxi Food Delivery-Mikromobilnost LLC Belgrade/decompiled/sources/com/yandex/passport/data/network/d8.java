package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class d8 extends com.yandex.passport.data.network.core.g {
    public final z7 h;

    public d8(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, z7 z7Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, c8.Companion.serializer(), oVar, "GetPush2faCodeRequest");
        this.h = z7Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
