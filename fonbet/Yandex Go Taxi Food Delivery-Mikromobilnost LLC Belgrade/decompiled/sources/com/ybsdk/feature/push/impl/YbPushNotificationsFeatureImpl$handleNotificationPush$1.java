package com.ybsdk.feature.push.impl;

import android.net.Uri;
import defpackage.k2g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.push.impl.YbPushNotificationsFeatureImpl$handleNotificationPush$1", f = "YbPushNotificationsFeatureImpl.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class YbPushNotificationsFeatureImpl$handleNotificationPush$1 extends SuspendLambda implements wls {
    final /* synthetic */ k2g0 $pushInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbPushNotificationsFeatureImpl$handleNotificationPush$1(a aVar, k2g0 k2g0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pushInfo = k2g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbPushNotificationsFeatureImpl$handleNotificationPush$1(this.this$0, this.$pushInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbPushNotificationsFeatureImpl$handleNotificationPush$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            k2g0 k2g0Var = this.$pushInfo;
            this.label = 1;
            if (a.a(aVar, k2g0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Uri b = this.this$0.b(this.$pushInfo.c());
        zy11 zy11Var = zy11.a;
        if (b == null) {
            return zy11Var;
        }
        this.this$0.f(b, this.$pushInfo);
        return zy11Var;
    }
}
