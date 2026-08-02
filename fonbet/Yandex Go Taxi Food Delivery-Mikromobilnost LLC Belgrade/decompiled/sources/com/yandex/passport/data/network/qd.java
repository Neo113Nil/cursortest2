package com.yandex.passport.data.network;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class qd extends com.yandex.passport.data.network.core.a {
    public final kd f;
    public final com.yandex.passport.data.network.core.s g;

    public qd(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, kd kdVar, od odVar, pd pdVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, cVar, l0Var, odVar, pdVar);
        this.f = kdVar;
        this.g = sVar;
    }

    @Override // com.yandex.passport.data.network.core.a, com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        jd jdVar = (jd) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(jdVar, "TryAddPlusDeviceRequest", new s0(this, jdVar, 3)), continuation);
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: d */
    public final Object b(Object obj, Continuation continuation) {
        jd jdVar = (jd) obj;
        return this.g.a(new com.yandex.passport.data.network.core.r(jdVar, "TryAddPlusDeviceRequest", new s0(this, jdVar, 3)), continuation);
    }
}
