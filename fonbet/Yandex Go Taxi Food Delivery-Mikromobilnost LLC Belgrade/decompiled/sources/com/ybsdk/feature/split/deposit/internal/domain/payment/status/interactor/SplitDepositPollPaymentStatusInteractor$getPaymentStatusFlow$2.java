package com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor;

import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import defpackage.dka0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldka0;", "", "<anonymous>", "(Ldka0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2", f = "SplitDepositPollPaymentStatusInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2 splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2 = new SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2(2, continuation);
        splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2.L$0 = obj;
        return splitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2) create((dka0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        PaymentStatus paymentStatus = ((dka0) this.L$0).a;
        return Boolean.valueOf((paymentStatus == PaymentStatus.PENDING || paymentStatus == PaymentStatus.CHALLENGE) ? false : true);
    }
}
