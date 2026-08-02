package com.yandex.go.chargers.offer.passes.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.passes.data.ChargersPassPurchasingPollingContractKt", f = "ChargersPassPurchasingPollingContract.kt", l = {35}, m = "waitForSuperPassPurchaseResult", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = d.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
