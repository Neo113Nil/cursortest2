package com.ybsdk.feature.push.impl.domain;

import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsSubscribeResult;
import defpackage.huy;
import defpackage.iuy;
import defpackage.m2g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qc20;
import defpackage.rt1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljuy;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Ljuy;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.push.impl.domain.PushNotificationsSubscriptionInteractor$subscribe$2", f = "PushNotificationsSubscriptionInteractor.kt", l = {26, 39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushNotificationsSubscriptionInteractor$subscribe$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $platform;
    final /* synthetic */ String $token;
    final /* synthetic */ String $uuid;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsSubscriptionInteractor$subscribe$2(b bVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$token = str;
        this.$deviceId = str2;
        this.$uuid = str3;
        this.$platform = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushNotificationsSubscriptionInteractor$subscribe$2(this.this$0, this.$token, this.$deviceId, this.$uuid, this.$platform, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushNotificationsSubscriptionInteractor$subscribe$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r12 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PushNotificationsSubscriptionInteractor$subscribe$2 pushNotificationsSubscriptionInteractor$subscribe$2;
        Object b;
        m2g0 m2g0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.push.impl.data.a aVar = this.this$0.a;
            String str = this.$token;
            String str2 = this.$deviceId;
            String str3 = this.$uuid;
            String str4 = this.$platform;
            this.label = 1;
            pushNotificationsSubscriptionInteractor$subscribe$2 = this;
            b = aVar.b(str, str2, str3, str4, pushNotificationsSubscriptionInteractor$subscribe$2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m2g0Var = (m2g0) this.L$0;
                kotlin.b.b(obj);
                pushNotificationsSubscriptionInteractor$subscribe$2 = this;
                m2g0Var.a((Long) obj);
                pushNotificationsSubscriptionInteractor$subscribe$2.this$0.b.a.edit().putString("currentSubscribedDeviceId", pushNotificationsSubscriptionInteractor$subscribe$2.$deviceId).apply();
                return new iuy();
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
            pushNotificationsSubscriptionInteractor$subscribe$2 = this;
        }
        boolean z = b instanceof Result.Failure;
        b bVar = pushNotificationsSubscriptionInteractor$subscribe$2.this$0;
        if (z) {
            rt1 rt1Var = bVar.d.X;
            PushNotificationsEvents$PushNotificationsSubscribeResult pushNotificationsEvents$PushNotificationsSubscribeResult = PushNotificationsEvents$PushNotificationsSubscribeResult.ERROR;
            Throwable a = Result.a(b);
            rt1Var.t(pushNotificationsEvents$PushNotificationsSubscribeResult, a != null ? a.getMessage() : null, pushNotificationsSubscriptionInteractor$subscribe$2.$deviceId);
            return new huy();
        }
        bVar.d.X.t(PushNotificationsEvents$PushNotificationsSubscribeResult.OK, null, pushNotificationsSubscriptionInteractor$subscribe$2.$deviceId);
        b bVar2 = pushNotificationsSubscriptionInteractor$subscribe$2.this$0;
        m2g0 m2g0Var2 = bVar2.b;
        qc20 qc20Var = bVar2.c;
        pushNotificationsSubscriptionInteractor$subscribe$2.L$0 = m2g0Var2;
        pushNotificationsSubscriptionInteractor$subscribe$2.label = 2;
        Object a2 = ((f) qc20Var.a).a(pushNotificationsSubscriptionInteractor$subscribe$2);
        if (a2 != coroutineSingletons) {
            m2g0Var = m2g0Var2;
            obj = a2;
            m2g0Var.a((Long) obj);
            pushNotificationsSubscriptionInteractor$subscribe$2.this$0.b.a.edit().putString("currentSubscribedDeviceId", pushNotificationsSubscriptionInteractor$subscribe$2.$deviceId).apply();
            return new iuy();
        }
        return coroutineSingletons;
    }
}
