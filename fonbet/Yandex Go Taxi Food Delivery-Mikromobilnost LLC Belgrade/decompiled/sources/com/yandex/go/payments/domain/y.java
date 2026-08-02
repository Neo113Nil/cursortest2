package com.yandex.go.payments.domain;

import defpackage.lca0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xea0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class y {
    public final tt2 a;
    public final com.yandex.go.payments.data.f b;
    public final lca0 c;

    public y(tt2 tt2Var, com.yandex.go.payments.data.f fVar, lca0 lca0Var) {
        this.a = tt2Var;
        this.b = fVar;
        this.c = lca0Var;
    }

    public final Object a(xea0 xea0Var, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PaymentMethodNameInteractor$getPaymentMethodName$2(this, xea0Var, null), continuationImpl);
    }

    public final Object b(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PaymentMethodNameInteractor$getShowCount$2(this, null), continuation);
    }

    public final Object c(String str, xea0 xea0Var, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodNameInteractor$savePaymentMethodName$2(this, str, xea0Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object d(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodNameInteractor$updateShowCount$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
