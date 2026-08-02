package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "it", "", "Lcom/yandex/go/taxi/order/models/api/e;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$stateFlow$1", f = "DetailsCardSourceStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardSourceStyleInteractor$stateFlow$1 detailsCardSourceStyleInteractor$stateFlow$1 = new DetailsCardSourceStyleInteractor$stateFlow$1(2, continuation);
        detailsCardSourceStyleInteractor$stateFlow$1.L$0 = obj;
        return detailsCardSourceStyleInteractor$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardSourceStyleInteractor$stateFlow$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return taxiOrder.i.e();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
