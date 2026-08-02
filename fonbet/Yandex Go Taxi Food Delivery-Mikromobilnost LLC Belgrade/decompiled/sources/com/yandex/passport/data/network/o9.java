package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class o9 extends com.yandex.passport.data.network.core.n {
    public final i9 h;

    public o9(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, j9 j9Var, n9 n9Var, i9 i9Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, j9Var, n9Var, oVar, "GetTrackPayloadRequest");
        this.h = i9Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
