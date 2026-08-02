package com.yandex.go.yb.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qq51;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1", f = "YbCardStatusNotificationController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ qq51 $notification;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1(q qVar, qq51 qq51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$notification = qq51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1(this.this$0, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.yb.data.i iVar = this.this$0.f;
        String str = this.$notification.a;
        boolean z = true;
        if (iVar.c.l("NOTIFICATION", null) == null ? true : !r4.equals(str)) {
            this.this$0.f.c.r("NOTIFICATION", this.$notification.a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
