package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1", f = "RideCardAccessibilityInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1 rideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1 = new RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1(2, continuation);
        rideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1.L$0 = obj;
        return rideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        RideCardInfoResponse rideCardInfoResponse = taxiOrder.V().o0;
        if (rideCardInfoResponse != null) {
            return rideCardInfoResponse.c;
        }
        return null;
    }
}
