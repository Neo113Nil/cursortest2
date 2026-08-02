package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector;

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

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "it", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector.RideCardRatingReasonsItemDataSource$stateFlow$1", f = "RideCardRatingReasonsItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardRatingReasonsItemDataSource$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardRatingReasonsItemDataSource$stateFlow$1 rideCardRatingReasonsItemDataSource$stateFlow$1 = new RideCardRatingReasonsItemDataSource$stateFlow$1(2, continuation);
        rideCardRatingReasonsItemDataSource$stateFlow$1.L$0 = obj;
        return rideCardRatingReasonsItemDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardRatingReasonsItemDataSource$stateFlow$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Pair(new Integer(taxiOrder.s()), kotlin.collections.a.H0(taxiOrder.l.getW().getB()));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
