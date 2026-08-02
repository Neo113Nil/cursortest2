package com.yandex.go.taxi.order.notifications;

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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5", f = "OrderTrackingNotificationsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5 orderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5 = new OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5(this.this$0, continuation);
        orderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5.L$0 = obj;
        return orderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5 orderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5 = (OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.c.a((TaxiOrder) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
        return zy11.a;
    }
}
