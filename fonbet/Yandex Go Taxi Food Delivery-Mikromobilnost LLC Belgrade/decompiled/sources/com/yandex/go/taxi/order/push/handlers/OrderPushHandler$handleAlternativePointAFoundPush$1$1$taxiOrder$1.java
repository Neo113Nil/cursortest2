package com.yandex.go.taxi.order.push.handlers;

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
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "taxiOrder", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.push.handlers.OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1", f = "OrderPushHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1 orderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1 = new OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1(2, continuation);
        orderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1.L$0 = obj;
        return orderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(taxiOrder.h.getB() == DriveState.DRIVING);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
