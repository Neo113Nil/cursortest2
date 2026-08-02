package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.taxi.order.experiments.TaxiOrderButtonPositionExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.n4h0;
import defpackage.n4j;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t4j;
import defpackage.vng;
import defpackage.wd00;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwd00;", ClidProvider.STATE, "Lcom/yandex/go/taxi/order/experiments/TaxiOrderButtonPositionExperiment;", "exp", "Lt4j;", "<anonymous>", "(Lwd00;Lcom/yandex/go/taxi/order/experiments/TaxiOrderButtonPositionExperiment;)Lt4j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.buttons.DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1", f = "DetailsCardBottomButtonsStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1 extends SuspendLambda implements zls {
    final /* synthetic */ TaxiOrder $order;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1(h hVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
        this.$order = taxiOrder;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1 detailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1 = new DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1(this.this$0, this.$order, (Continuation) obj3);
        detailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1.L$0 = (wd00) obj;
        detailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1.L$1 = (TaxiOrderButtonPositionExperiment) obj2;
        return detailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wd00 wd00Var = (wd00) this.L$0;
        TaxiOrderButtonPositionExperiment taxiOrderButtonPositionExperiment = (TaxiOrderButtonPositionExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (wd00Var.a) {
            com.yandex.go.taxi.order.state.h hVar = this.this$0.a;
            TaxiOrder taxiOrder = this.$order;
            hVar.getClass();
            if (taxiOrder.h.b == DriveState.SEARCH || !taxiOrderButtonPositionExperiment.a(taxiOrder.h.b, OrderScreen.ORDER_DETAILS)) {
                return new t4j(vng.t(n4h0.ic_add_order, ((avj0) this.this$0.i).a), ((avj0) this.this$0.i).h(kyh0.make_another_order_card_button_text), qje.t(xng0.textOnControlMinor, ((avj0) this.this$0.i).a), qje.t(xng0.controlMinor, ((avj0) this.this$0.i).a), ((avj0) this.this$0.i).h(kyh0.make_another_order_card_button_text), "AddTaxi", new n4j(this.this$0, 2), 144);
            }
        }
        return null;
    }
}
