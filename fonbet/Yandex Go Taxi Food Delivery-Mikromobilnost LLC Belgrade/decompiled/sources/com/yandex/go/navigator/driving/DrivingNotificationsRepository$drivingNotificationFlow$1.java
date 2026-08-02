package com.yandex.go.navigator.driving;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/navigator/driving/DrivingModeNotification;", "drivingNotification", "destNotification"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.DrivingNotificationsRepository$drivingNotificationFlow$1", f = "DrivingNotificationsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingNotificationsRepository$drivingNotificationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrivingNotificationsRepository$drivingNotificationFlow$1 drivingNotificationsRepository$drivingNotificationFlow$1 = new DrivingNotificationsRepository$drivingNotificationFlow$1(3, (Continuation) obj3);
        drivingNotificationsRepository$drivingNotificationFlow$1.L$0 = (DrivingModeNotification) obj;
        drivingNotificationsRepository$drivingNotificationFlow$1.L$1 = (DrivingModeNotification) obj2;
        return drivingNotificationsRepository$drivingNotificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DrivingModeNotification drivingModeNotification = (DrivingModeNotification) this.L$0;
        DrivingModeNotification drivingModeNotification2 = (DrivingModeNotification) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return drivingModeNotification == null ? drivingModeNotification2 : drivingModeNotification;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
