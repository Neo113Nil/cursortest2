package com.ybsdk.feature.push.impl.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isEnabledBySdkSettings", "isEnabledByHost"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.push.impl.data.PushSubscriptionSettingsHolder$isPushEnabledFlow$1", f = "PushSubscriptionSettingsHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushSubscriptionSettingsHolder$isPushEnabledFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSubscriptionSettingsHolder$isPushEnabledFlow$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        PushSubscriptionSettingsHolder$isPushEnabledFlow$1 pushSubscriptionSettingsHolder$isPushEnabledFlow$1 = new PushSubscriptionSettingsHolder$isPushEnabledFlow$1(this.this$0, (Continuation) obj3);
        pushSubscriptionSettingsHolder$isPushEnabledFlow$1.Z$0 = booleanValue;
        pushSubscriptionSettingsHolder$isPushEnabledFlow$1.Z$1 = booleanValue2;
        return pushSubscriptionSettingsHolder$isPushEnabledFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        this.this$0.getClass();
        return Boolean.valueOf(z && z2);
    }
}
