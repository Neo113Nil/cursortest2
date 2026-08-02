package com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners;

import defpackage.ar10;
import defpackage.hk3;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class b {
    public final hk3 a;
    public final com.yandex.fintechsdk.data.personalization.impl.internal.a b;
    public final ar10 c;

    public b(hk3 hk3Var, com.yandex.fintechsdk.data.personalization.impl.internal.a aVar, ar10 ar10Var) {
        this.a = hk3Var;
        this.b = aVar;
        this.c = ar10Var;
    }

    public final Object a(Continuation continuation) {
        Object collect = new m0(this.a.c, this.c.b, new AuthRepositoryListener$startListening$2(3, null)).collect(new a(this), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
