package com.yandex.go.taxi.order.details.v2.state.elements.payment;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/yandex/go/taxi/order/models/api/e;", "pendingChanges", "Lfl8;", "storedCardsSignature", "Lkotlin/Pair;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.payment.RideCardPaymentItemDataSource$stateFlow$2", f = "RideCardPaymentItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPaymentItemDataSource$stateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardPaymentItemDataSource$stateFlow$2 rideCardPaymentItemDataSource$stateFlow$2 = new RideCardPaymentItemDataSource$stateFlow$2(3, (Continuation) obj3);
        rideCardPaymentItemDataSource$stateFlow$2.L$0 = (List) obj;
        rideCardPaymentItemDataSource$stateFlow$2.L$1 = (List) obj2;
        return rideCardPaymentItemDataSource$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(list, list2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
