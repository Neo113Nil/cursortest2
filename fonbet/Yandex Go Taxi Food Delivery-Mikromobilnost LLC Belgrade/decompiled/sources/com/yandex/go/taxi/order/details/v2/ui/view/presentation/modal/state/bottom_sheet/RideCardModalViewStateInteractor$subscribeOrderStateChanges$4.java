package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet;

import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardChangeStateEventRepository;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardModalViewStateInteractor$subscribeOrderStateChanges$4", f = "RideCardModalViewStateInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardModalViewStateInteractor$subscribeOrderStateChanges$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardModalViewStateInteractor$subscribeOrderStateChanges$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardModalViewStateInteractor$subscribeOrderStateChanges$4 rideCardModalViewStateInteractor$subscribeOrderStateChanges$4 = new RideCardModalViewStateInteractor$subscribeOrderStateChanges$4(this.this$0, continuation);
        rideCardModalViewStateInteractor$subscribeOrderStateChanges$4.L$0 = obj;
        return rideCardModalViewStateInteractor$subscribeOrderStateChanges$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardModalViewStateInteractor$subscribeOrderStateChanges$4) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            RideCardChangeStateEventRepository rideCardChangeStateEventRepository = this.this$0.i;
            RideCardChangeStateEventRepository.ChangeStateEvent changeStateEvent = rideCardChangeStateEventRepository.b;
            rideCardChangeStateEventRepository.b = null;
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (a.a(aVar, taxiOrder, changeStateEvent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
