package com.yandex.go.inapp_calls.repository;

import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qjv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$startOutgoingCall$2$1", f = "InAppCallsFeatureWrapper.kt", l = {190}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeatureWrapper$startOutgoingCall$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ qjv $payload;
    final /* synthetic */ InAppCallsDynamicApi $this_withInitInAppCallFeatureIfReady;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeatureWrapper$startOutgoingCall$2$1(InAppCallsDynamicApi inAppCallsDynamicApi, qjv qjvVar, Continuation continuation) {
        super(2, continuation);
        this.$this_withInitInAppCallFeatureIfReady = inAppCallsDynamicApi;
        this.$payload = qjvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsFeatureWrapper$startOutgoingCall$2$1(this.$this_withInitInAppCallFeatureIfReady, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsFeatureWrapper$startOutgoingCall$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            InAppCallsDynamicApi inAppCallsDynamicApi = this.$this_withInitInAppCallFeatureIfReady;
            qjv qjvVar = this.$payload;
            this.label = 1;
            a = inAppCallsDynamicApi.a(qjvVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
