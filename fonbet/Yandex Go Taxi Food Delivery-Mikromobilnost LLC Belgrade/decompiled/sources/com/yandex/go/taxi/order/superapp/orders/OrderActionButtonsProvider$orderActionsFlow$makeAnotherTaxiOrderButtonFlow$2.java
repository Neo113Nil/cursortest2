package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.experiments.TaxiOrderButtonPositionExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", ACSPConstants.STATUS, "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "isMultiOrderAvailable", "experiment", "Lcom/yandex/go/taxi/order/experiments/TaxiOrderButtonPositionExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2", f = "OrderActionButtonsProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2 extends SuspendLambda implements bms {
    final /* synthetic */ OrderScreen $screen;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2(OrderScreen orderScreen, Continuation continuation) {
        super(4, continuation);
        this.$screen = orderScreen;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2 orderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2 = new OrderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2(this.$screen, (Continuation) obj4);
        orderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2.L$0 = (TaxiOrder) obj;
        orderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2.Z$0 = booleanValue;
        orderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2.L$1 = (TaxiOrderButtonPositionExperiment) obj3;
        return orderActionButtonsProvider$orderActionsFlow$makeAnotherTaxiOrderButtonFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        boolean z = this.Z$0;
        TaxiOrderButtonPositionExperiment taxiOrderButtonPositionExperiment = (TaxiOrderButtonPositionExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && taxiOrderButtonPositionExperiment.a(taxiOrder.h.getB(), this.$screen));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
