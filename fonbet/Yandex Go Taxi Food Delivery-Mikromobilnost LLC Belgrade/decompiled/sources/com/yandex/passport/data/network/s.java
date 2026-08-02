package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class s extends com.yandex.passport.data.network.core.g {
    public final o h;

    public s(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, o oVar, com.yandex.passport.data.network.core.o oVar2) {
        super(aVar, cVar, l0Var, r.Companion.serializer(), oVar2, "AuthorizeByXTokenRequest");
        this.h = oVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
