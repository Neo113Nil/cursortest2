package com.yandex.go.inapp_calls.push_handler;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.push_handler.IncomingCallPushHandler$handle$featureState$1", f = "IncomingCallPushHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IncomingCallPushHandler$handle$featureState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IncomingCallPushHandler$handle$featureState$1 incomingCallPushHandler$handle$featureState$1 = new IncomingCallPushHandler$handle$featureState$1(2, continuation);
        incomingCallPushHandler$handle$featureState$1.L$0 = obj;
        return incomingCallPushHandler$handle$featureState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IncomingCallPushHandler$handle$featureState$1) create((InAppCallsFeatureWrapper$State) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(inAppCallsFeatureWrapper$State != InAppCallsFeatureWrapper$State.LOADING);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
