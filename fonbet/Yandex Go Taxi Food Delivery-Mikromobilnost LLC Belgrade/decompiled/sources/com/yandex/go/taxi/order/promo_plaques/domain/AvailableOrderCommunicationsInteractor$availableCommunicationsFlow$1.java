package com.yandex.go.taxi.order.promo_plaques.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lzy11;", "<unused var>", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;V)Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promo_plaques.domain.AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1", f = "AvailableOrderCommunicationsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    public AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1 availableOrderCommunicationsInteractor$availableCommunicationsFlow$1 = new AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$1(3, (Continuation) obj3);
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$1.L$0 = (TaxiOrder) obj;
        return availableOrderCommunicationsInteractor$availableCommunicationsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return taxiOrder;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
