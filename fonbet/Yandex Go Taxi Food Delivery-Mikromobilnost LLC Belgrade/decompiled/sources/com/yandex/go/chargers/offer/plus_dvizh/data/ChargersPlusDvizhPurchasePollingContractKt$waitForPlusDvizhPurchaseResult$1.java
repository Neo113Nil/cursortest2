package com.yandex.go.chargers.offer.plus_dvizh.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.plus_dvizh.data.ChargersPlusDvizhPurchasePollingContractKt", f = "ChargersPlusDvizhPurchasePollingContract.kt", l = {33}, m = "waitForPlusDvizhPurchaseResult", v = 2)
/* loaded from: classes12.dex */
final class ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = e.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
