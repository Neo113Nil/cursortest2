package com.ybsdk.feature.testpayment.internal.domain;

import defpackage.hhy0;
import defpackage.jhy0;
import defpackage.lhy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llhy0;", "", "<anonymous>", "(Llhy0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.domain.TestPaymentInteractor$getTestPaymentStatus$2", f = "TestPaymentInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TestPaymentInteractor$getTestPaymentStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TestPaymentInteractor$getTestPaymentStatus$2 testPaymentInteractor$getTestPaymentStatus$2 = new TestPaymentInteractor$getTestPaymentStatus$2(2, continuation);
        testPaymentInteractor$getTestPaymentStatus$2.L$0 = obj;
        return testPaymentInteractor$getTestPaymentStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TestPaymentInteractor$getTestPaymentStatus$2) create((lhy0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lhy0 lhy0Var = (lhy0) this.L$0;
        return Boolean.valueOf((lhy0Var instanceof hhy0) || (lhy0Var instanceof jhy0));
    }
}
