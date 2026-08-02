package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class lb extends com.yandex.passport.data.network.core.n {
    public final ib h;

    public lb(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, jb jbVar, kb kbVar, ib ibVar, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, jbVar, kbVar, oVar, "RevokeMasterTokenRequest");
        this.h = ibVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.h;
    }
}
