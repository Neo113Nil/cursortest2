package com.yandex.go.scooters.passes.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.domain.ScootersPassPurchasingPollingInteractorImpl", f = "ScootersPassPurchasingPollingInteractorImpl.kt", l = {39}, m = "waitForSuperPassPurchaseResult-IoAF18A", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
