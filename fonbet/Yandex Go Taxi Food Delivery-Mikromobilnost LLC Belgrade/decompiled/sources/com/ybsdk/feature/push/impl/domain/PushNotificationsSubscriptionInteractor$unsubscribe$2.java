package com.ybsdk.feature.push.impl.domain;

import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsUnsubscribeResult;
import defpackage.huy;
import defpackage.iuy;
import defpackage.mvg;
import defpackage.ny61;
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
@mvg(c = "com.ybsdk.feature.push.impl.domain.PushNotificationsSubscriptionInteractor$unsubscribe$2", f = "PushNotificationsSubscriptionInteractor.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PushNotificationsSubscriptionInteractor$unsubscribe$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsSubscriptionInteractor$unsubscribe$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uuid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushNotificationsSubscriptionInteractor$unsubscribe$2(this.this$0, this.$uuid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushNotificationsSubscriptionInteractor$unsubscribe$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.push.impl.data.a aVar = this.this$0.a;
            String str = this.$uuid;
            this.label = 1;
            c = aVar.c(str, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        boolean z = c instanceof Result.Failure;
        b bVar = this.this$0;
        if (!z) {
            bVar.d.X.u(PushNotificationsEvents$PushNotificationsUnsubscribeResult.OK, null);
            this.this$0.b.a(null);
            return new iuy();
        }
        rt1 rt1Var = bVar.d.X;
        PushNotificationsEvents$PushNotificationsUnsubscribeResult pushNotificationsEvents$PushNotificationsUnsubscribeResult = PushNotificationsEvents$PushNotificationsUnsubscribeResult.ERROR;
        Throwable a = Result.a(c);
        rt1Var.u(pushNotificationsEvents$PushNotificationsUnsubscribeResult, a != null ? a.getMessage() : null);
        return new huy();
    }
}
