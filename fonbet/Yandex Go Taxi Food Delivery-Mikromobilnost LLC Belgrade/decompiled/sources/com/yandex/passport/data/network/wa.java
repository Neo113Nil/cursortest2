package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class wa extends com.yandex.passport.data.network.core.g {
    public final va h;

    public wa(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, va vaVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, com.yandex.passport.data.models.o.Companion.serializer(), oVar, "PushSubscribeRequest");
        this.h = vaVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
