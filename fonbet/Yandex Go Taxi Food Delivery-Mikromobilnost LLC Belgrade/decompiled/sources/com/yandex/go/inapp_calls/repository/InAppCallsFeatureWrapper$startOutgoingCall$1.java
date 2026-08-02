package com.yandex.go.inapp_calls.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper", f = "InAppCallsFeatureWrapper.kt", l = {216, 221, 189}, m = "startOutgoingCall-gIAlu-s", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeatureWrapper$startOutgoingCall$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeatureWrapper$startOutgoingCall$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object k = this.this$0.k(null, this);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : new Result(k);
    }
}
