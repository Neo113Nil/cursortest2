package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.experiment.UsePressedNoTipOptionExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderTipsState;", "", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishSelectorItemDataSource$getElementsFlow$1", f = "RideCardTipsWishSelectorItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishSelectorItemDataSource$getElementsFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsWishSelectorItemDataSource$getElementsFlow$1 rideCardTipsWishSelectorItemDataSource$getElementsFlow$1 = new RideCardTipsWishSelectorItemDataSource$getElementsFlow$1(2, continuation);
        rideCardTipsWishSelectorItemDataSource$getElementsFlow$1.L$0 = obj;
        return rideCardTipsWishSelectorItemDataSource$getElementsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsWishSelectorItemDataSource$getElementsFlow$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Pair(taxiOrder.y(), Boolean.valueOf(taxiOrder.V().c(UsePressedNoTipOptionExperiment.class) != null));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
