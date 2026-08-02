package com.ybsdk.feature.qr.payments.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s1a0;
import defpackage.w1a0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1a0;", "", "<anonymous>", "(Lw1a0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.QrPaymentInteractor$getPaymentInfoFlow$2", f = "QrPaymentInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentInteractor$getPaymentInfoFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentInteractor$getPaymentInfoFlow$2 qrPaymentInteractor$getPaymentInfoFlow$2 = new QrPaymentInteractor$getPaymentInfoFlow$2(2, continuation);
        qrPaymentInteractor$getPaymentInfoFlow$2.L$0 = obj;
        return qrPaymentInteractor$getPaymentInfoFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentInteractor$getPaymentInfoFlow$2) create((w1a0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!(((w1a0) this.L$0) instanceof s1a0));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
