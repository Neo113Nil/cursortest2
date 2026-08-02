package com.yandex.go.taxi.order.details.v2.state.elements.done;

import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Form;
import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Style;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DoneFooter;
import defpackage.bdc;
import defpackage.dgk0;
import defpackage.g9k0;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wqs0;
import defpackage.xng0;
import defpackage.xqs0;
import defpackage.xss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxss0;", "slotItemState", "Ldgk0;", "<anonymous>", "(Lxss0;)Ldgk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.done.RideCardDoneButtonItemDataSource$stateFlow$2", f = "RideCardDoneButtonItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDoneButtonItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$DoneFooter $item;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDoneButtonItemDataSource$stateFlow$2(RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$DoneFooter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDoneButtonItemDataSource$stateFlow$2 rideCardDoneButtonItemDataSource$stateFlow$2 = new RideCardDoneButtonItemDataSource$stateFlow$2(this.$item, continuation);
        rideCardDoneButtonItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardDoneButtonItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDoneButtonItemDataSource$stateFlow$2) create((xss0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xss0 xss0Var = (xss0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ibk0 a = ijk0.a(xss0Var.d);
        if (a == null) {
            a = g9k0.a;
        }
        xqs0 xqs0Var = new xqs0(xss0.a(xss0Var, null, null, null, a, SlotItemUiState$Size.L, 7), new wqs0(SlotItemButtonUiState$Properties$Form.SQUIRCLE, SlotItemButtonUiState$Properties$Style.MINOR));
        RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter = this.$item;
        return new dgk0(rideCardItemDto$DoneFooter.a, rideCardItemDto$DoneFooter.b, xqs0Var, new bdc(xng0.controlMain));
    }
}
