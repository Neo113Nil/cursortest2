package com.yandex.go.inapp_calls.repository;

import android.content.Context;
import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$resumeCall$2$1", f = "InAppCallsFeatureWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeatureWrapper$resumeCall$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ InAppCallsDynamicApi $this_withInitInAppCallFeatureIfReady;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeatureWrapper$resumeCall$2$1(InAppCallsDynamicApi inAppCallsDynamicApi, Context context, Continuation continuation) {
        super(2, continuation);
        this.$this_withInitInAppCallFeatureIfReady = inAppCallsDynamicApi;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsFeatureWrapper$resumeCall$2$1(this.$this_withInitInAppCallFeatureIfReady, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsFeatureWrapper$resumeCall$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Result(this.$this_withInitInAppCallFeatureIfReady.k(this.$context));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
