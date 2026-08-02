package com.yandex.go.taxi.order.promotions.notification;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/navigation/screen/api/Screen;", "it"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.promotions.notification.OrderTopNotificationsRouter$onLaunch$3", f = "OrderTopNotificationsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTopNotificationsRouter$onLaunch$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderTopNotificationsRouter$onLaunch$3 orderTopNotificationsRouter$onLaunch$3 = new OrderTopNotificationsRouter$onLaunch$3(2, continuation);
        orderTopNotificationsRouter$onLaunch$3.L$0 = obj;
        return orderTopNotificationsRouter$onLaunch$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderTopNotificationsRouter$onLaunch$3) create((Screen) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Screen screen = (Screen) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return screen;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
