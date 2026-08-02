package com.yandex.passport.data.network.token;

/* loaded from: classes8.dex */
public final class f1 extends com.yandex.passport.data.network.core.k {
    public final a1 h;

    public f1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, e1 e1Var, a1 a1Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(d1.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), e1Var, oVar, "GetMasterTokenByTrackIdRequest");
        this.h = a1Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
