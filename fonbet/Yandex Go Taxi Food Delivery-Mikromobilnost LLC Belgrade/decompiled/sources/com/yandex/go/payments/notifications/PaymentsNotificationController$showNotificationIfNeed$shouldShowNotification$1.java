package com.yandex.go.payments.notifications;

import com.yandex.go.payments.data.model.response.PaymentsNotification;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.notifications.PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1", f = "PaymentsNotificationController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentsNotification $notification;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1(a aVar, PaymentsNotification paymentsNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$notification = paymentsNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1(this.this$0, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0.e;
        if (dVar.a().contains(this.$notification.a)) {
            z = false;
        } else {
            d dVar2 = this.this$0.e;
            String str = this.$notification.a;
            Set M0 = kotlin.collections.a.M0(dVar2.a());
            M0.add(str);
            dVar2.a.r("NOTIFICATION", kotlin.collections.a.X(M0, ",", null, null, null, 62));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
