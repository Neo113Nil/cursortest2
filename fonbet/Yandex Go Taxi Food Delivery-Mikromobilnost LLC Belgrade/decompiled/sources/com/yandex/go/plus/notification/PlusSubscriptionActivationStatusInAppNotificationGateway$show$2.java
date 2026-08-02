package com.yandex.go.plus.notification;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj60;
import defpackage.tse;
import defpackage.wls;
import defpackage.wz1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.NotificationStackComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.plus.notification.PlusSubscriptionActivationStatusInAppNotificationGateway$show$2", f = "PlusSubscriptionActivationStatusInAppNotificationGateway.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlusSubscriptionActivationStatusInAppNotificationGateway$show$2 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ Bitmap $leadImage;
    final /* synthetic */ tj60 $notificationStackHolder;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSubscriptionActivationStatusInAppNotificationGateway$show$2(tj60 tj60Var, Context context, String str, String str2, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.$notificationStackHolder = tj60Var;
        this.$context = context;
        this.$title = str;
        this.$subtitle = str2;
        this.$leadImage = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSubscriptionActivationStatusInAppNotificationGateway$show$2(this.$notificationStackHolder, this.$context, this.$title, this.$subtitle, this.$leadImage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusSubscriptionActivationStatusInAppNotificationGateway$show$2 plusSubscriptionActivationStatusInAppNotificationGateway$show$2 = (PlusSubscriptionActivationStatusInAppNotificationGateway$show$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$notificationStackHolder.c("plus_subscription_activation_status");
        PlusSubscriptionActivationStatusNotification plusSubscriptionActivationStatusNotification = new PlusSubscriptionActivationStatusNotification(this.$context, "plus_subscription_activation_status", this.$title, this.$subtitle, this.$leadImage);
        plusSubscriptionActivationStatusNotification.setExpiresListener(new wz1(10, this.$notificationStackHolder));
        NotificationStackComponent notificationStackComponent = this.$notificationStackHolder.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.showNotification(plusSubscriptionActivationStatusNotification);
        }
        plusSubscriptionActivationStatusNotification.startExpiresTimer(5000L);
        return zy11.a;
    }
}
