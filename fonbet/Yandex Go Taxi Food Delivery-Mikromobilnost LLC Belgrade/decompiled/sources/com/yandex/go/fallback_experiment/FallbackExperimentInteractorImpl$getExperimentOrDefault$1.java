package com.yandex.go.fallback_experiment;

import defpackage.mvg;
import defpackage.qn11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.fallback_experiment.FallbackExperimentInteractorImpl", f = "FallbackExperimentInteractorImpl.kt", l = {33}, m = "getExperimentOrDefault", v = 2)
/* loaded from: classes12.dex */
final class FallbackExperimentInteractorImpl$getExperimentOrDefault$1<T extends qn11> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackExperimentInteractorImpl$getExperimentOrDefault$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
