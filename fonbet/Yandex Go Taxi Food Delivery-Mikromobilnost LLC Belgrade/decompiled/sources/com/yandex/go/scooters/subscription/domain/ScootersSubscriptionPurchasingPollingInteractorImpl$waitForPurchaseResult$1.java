package com.yandex.go.scooters.subscription.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.subscription.domain.ScootersSubscriptionPurchasingPollingInteractorImpl", f = "ScootersSubscriptionPurchasingPollingInteractorImpl.kt", l = {44}, m = "waitForPurchaseResult-IoAF18A", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
