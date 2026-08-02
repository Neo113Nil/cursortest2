package com.yandex.go.payments.domain;

import defpackage.m1a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm1a0;", "paymentInfo", "", "<unused var>", "<anonymous>", "(Lm1a0;Z)Lm1a0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PreorderPaymentInfoInteractorImpl$infoFlow$1", f = "PreorderPaymentInfoInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderPaymentInfoInteractorImpl$infoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        PreorderPaymentInfoInteractorImpl$infoFlow$1 preorderPaymentInfoInteractorImpl$infoFlow$1 = new PreorderPaymentInfoInteractorImpl$infoFlow$1(3, (Continuation) obj3);
        preorderPaymentInfoInteractorImpl$infoFlow$1.L$0 = (m1a0) obj;
        return preorderPaymentInfoInteractorImpl$infoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m1a0 m1a0Var = (m1a0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return m1a0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
