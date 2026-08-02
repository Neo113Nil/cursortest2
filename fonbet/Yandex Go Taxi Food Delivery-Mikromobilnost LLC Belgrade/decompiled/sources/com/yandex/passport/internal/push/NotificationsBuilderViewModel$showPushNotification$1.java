package com.yandex.passport.internal.push;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qke;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.NotificationsBuilderViewModel$showPushNotification$1", f = "NotificationsBuilderViewModel.kt", l = {35, 37}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationsBuilderViewModel$showPushNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $bundle;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsBuilderViewModel$showPushNotification$1(o oVar, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationsBuilderViewModel$showPushNotification$1 notificationsBuilderViewModel$showPushNotification$1 = new NotificationsBuilderViewModel$showPushNotification$1(this.this$0, this.$bundle, continuation);
        notificationsBuilderViewModel$showPushNotification$1.L$0 = obj;
        return notificationsBuilderViewModel$showPushNotification$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsBuilderViewModel$showPushNotification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8.i(r1, r7) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                o oVar = this.this$0;
                Bundle bundle = this.$bundle;
                if (Build.VERSION.SDK_INT >= 33 && qke.h((Application) oVar.c.b, "android.permission.POST_NOTIFICATIONS") != 0) {
                    throw new RuntimeException("Permission POST_NOTIFICATIONS is not granted.");
                }
                h hVar = oVar.b;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
            }
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result result = new Result(failure);
        o oVar2 = this.this$0;
        Object value = result.getValue();
        kotlinx.coroutines.flow.n0 n0Var = oVar2.w;
        Result result2 = new Result(value);
        this.L$0 = result;
        this.label = 2;
        return n0Var.emit(result2, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
