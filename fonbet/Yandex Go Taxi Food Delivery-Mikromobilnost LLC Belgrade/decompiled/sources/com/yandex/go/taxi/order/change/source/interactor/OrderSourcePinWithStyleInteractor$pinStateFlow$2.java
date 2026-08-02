package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.promotions.analytics.OrderPickupPointAnalytics$OrderStatus;
import defpackage.g380;
import defpackage.l380;
import defpackage.m380;
import defpackage.mvg;
import defpackage.n380;
import defpackage.ny61;
import defpackage.s380;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls380;", "<destruct>", "Lru/yandex/taxi/object/DriveState;", "driveState", "Ln380;", "<anonymous>", "(Ls380;Lru/yandex/taxi/object/DriveState;)Ln380;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderSourcePinWithStyleInteractor$pinStateFlow$2", f = "OrderSourcePinWithStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSourcePinWithStyleInteractor$pinStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSourcePinWithStyleInteractor$pinStateFlow$2(a0 a0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = a0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderSourcePinWithStyleInteractor$pinStateFlow$2 orderSourcePinWithStyleInteractor$pinStateFlow$2 = new OrderSourcePinWithStyleInteractor$pinStateFlow$2(this.this$0, (Continuation) obj3);
        orderSourcePinWithStyleInteractor$pinStateFlow$2.L$0 = (s380) obj;
        orderSourcePinWithStyleInteractor$pinStateFlow$2.L$1 = (DriveState) obj2;
        return orderSourcePinWithStyleInteractor$pinStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s380 s380Var = (s380) this.L$0;
        DriveState driveState = (DriveState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n380 n380Var = s380Var.a;
        m380 m380Var = s380Var.b;
        a0 a0Var = this.this$0;
        a0Var.getClass();
        OrderPickupPointAnalytics$OrderStatus.Companion.getClass();
        int i = g380.a[driveState.ordinal()];
        if (i == 1) {
            orderPickupPointAnalytics$OrderStatus = OrderPickupPointAnalytics$OrderStatus.SEARCH;
        } else if (i == 2) {
            orderPickupPointAnalytics$OrderStatus = OrderPickupPointAnalytics$OrderStatus.DRIVING;
        } else if (i == 3) {
            orderPickupPointAnalytics$OrderStatus = OrderPickupPointAnalytics$OrderStatus.WAITING;
        }
        if ((m380Var instanceof l380) && orderPickupPointAnalytics$OrderStatus != null && orderPickupPointAnalytics$OrderStatus != OrderPickupPointAnalytics$OrderStatus.SEARCH) {
            a0Var.f.a(((l380) m380Var).a, orderPickupPointAnalytics$OrderStatus);
        }
        return n380Var;
    }
}
