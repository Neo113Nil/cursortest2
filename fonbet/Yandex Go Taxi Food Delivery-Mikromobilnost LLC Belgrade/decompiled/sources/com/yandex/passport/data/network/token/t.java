package com.yandex.passport.data.network.token;

/* loaded from: classes8.dex */
public final class t extends com.yandex.passport.data.network.core.k {
    public final n h;

    public t(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, o oVar, s sVar, n nVar, com.yandex.passport.data.network.core.o oVar2) {
        super(aVar, cVar, l0Var, oVar, sVar, oVar2, "GetMasterTokenByCookieRequest");
        this.h = nVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
