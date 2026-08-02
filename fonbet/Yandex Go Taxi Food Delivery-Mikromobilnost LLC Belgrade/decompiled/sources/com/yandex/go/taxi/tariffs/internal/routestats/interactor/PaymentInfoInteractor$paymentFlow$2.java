package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.cia0;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lrfa0;", "paymentParam", "", "changedLoyaltyProgramTimestamp", "lastUserYbDismissTimestamp", "lastOverridePaymentChangeTimestamp", "lastUserAcceptSelectorOfferTimestamp", "Lcia0;", "<anonymous>", "(Lrfa0;JJJJ)Lcia0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.interactor.PaymentInfoInteractor$paymentFlow$2", f = "PaymentInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentInfoInteractor$paymentFlow$2 extends SuspendLambda implements ems {
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    /* synthetic */ long J$2;
    /* synthetic */ long J$3;
    /* synthetic */ Object L$0;
    int label;

    public PaymentInfoInteractor$paymentFlow$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long longValue = ((Number) obj2).longValue();
        long longValue2 = ((Number) obj3).longValue();
        long longValue3 = ((Number) obj4).longValue();
        long longValue4 = ((Number) obj5).longValue();
        PaymentInfoInteractor$paymentFlow$2 paymentInfoInteractor$paymentFlow$2 = new PaymentInfoInteractor$paymentFlow$2((Continuation) obj6);
        paymentInfoInteractor$paymentFlow$2.L$0 = (rfa0) obj;
        paymentInfoInteractor$paymentFlow$2.J$0 = longValue;
        paymentInfoInteractor$paymentFlow$2.J$1 = longValue2;
        paymentInfoInteractor$paymentFlow$2.J$2 = longValue3;
        paymentInfoInteractor$paymentFlow$2.J$3 = longValue4;
        return paymentInfoInteractor$paymentFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rfa0 rfa0Var = (rfa0) this.L$0;
        long j = this.J$0;
        long j2 = this.J$1;
        long j3 = this.J$2;
        long j4 = this.J$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new cia0(rfa0Var, j2, j, j3, j4);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
