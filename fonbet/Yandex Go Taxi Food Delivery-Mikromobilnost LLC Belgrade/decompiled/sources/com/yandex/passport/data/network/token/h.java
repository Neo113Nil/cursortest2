package com.yandex.passport.data.network.token;

/* loaded from: classes8.dex */
public final class h extends com.yandex.passport.data.network.core.k {
    public final b h;

    public h(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, c cVar2, g gVar, b bVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, cVar2, gVar, oVar, "GetMasterTokenByCodeRequest");
        this.h = bVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
