package com.yandex.go.taxi.order.change.driver;

import com.yandex.go.taxi.order.change.common.notification.ChangeOrderItemNotification;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import defpackage.f08;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/change/common/notification/ChangeOrderItemNotification;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/change/common/notification/ChangeOrderItemNotification;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.driver.ChangeDriverNotificationInteractor$showNotification$2", f = "ChangeDriverNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeDriverNotificationInteractor$showNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ ob9 $icon;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    final /* synthetic */ long $ttl;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDriverNotificationInteractor$showNotification$2(c cVar, String str, String str2, ob9 ob9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$title = str;
        this.$subtitle = str2;
        this.$icon = ob9Var;
        this.$ttl = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeDriverNotificationInteractor$showNotification$2(this.this$0, this.$title, this.$subtitle, this.$icon, this.$ttl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeDriverNotificationInteractor$showNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ChangeOrderItemNotification changeOrderItemNotification = new ChangeOrderItemNotification(this.this$0.a, "ReorderItemNotification", this.$title, this.$subtitle, this.$icon, ChangeOrderNotificationActionResponse.NONE);
        c cVar = this.this$0;
        long j = this.$ttl;
        ru.yandex.taxi.design.utils.c.z(new ChangeDriverNotificationInteractor$showNotification$2$1$1(0, cVar, c.class, "hideNotification", "hideNotification()V", 0), changeOrderItemNotification);
        cVar.b.e(changeOrderItemNotification);
        changeOrderItemNotification.setExpiresListener(new f08(2, cVar));
        changeOrderItemNotification.startExpiresTimer(j);
        return changeOrderItemNotification;
    }
}
