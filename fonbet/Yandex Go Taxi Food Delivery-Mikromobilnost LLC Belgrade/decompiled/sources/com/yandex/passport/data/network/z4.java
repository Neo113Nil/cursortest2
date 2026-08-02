package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class z4 extends com.yandex.passport.data.network.core.g {
    public final v4 h;

    public z4(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, v4 v4Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, y4.Companion.serializer(), oVar, "GetCodeByMasterTokenRequest");
        this.h = v4Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
