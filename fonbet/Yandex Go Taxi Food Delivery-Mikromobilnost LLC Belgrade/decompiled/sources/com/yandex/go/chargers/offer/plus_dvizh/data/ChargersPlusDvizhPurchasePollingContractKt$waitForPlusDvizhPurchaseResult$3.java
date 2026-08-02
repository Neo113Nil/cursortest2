package com.yandex.go.chargers.offer.plus_dvizh.data;

import defpackage.cma;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lfma;", "it", "", "<anonymous>", "(Lkotlin/Result;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.plus_dvizh.data.ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3", f = "ChargersPlusDvizhPurchasePollingContract.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3 chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3 = new ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3(2, continuation);
        chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3.L$0 = ((Result) obj).getValue();
        return chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3) create(new Result(((Result) obj).getValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        return Boolean.valueOf(!jl40.l(obj2, cma.a));
    }
}
