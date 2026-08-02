package com.yandex.go.chargers.offer.plus_dvizh.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "purchaseId", "Lfma;", "<anonymous>", "(Ljava/lang/String;)Lfma;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.plus_dvizh.data.ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1", f = "ChargersPlusDvizhPurchasePollingContract.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ f $repository;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.$repository = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1 chargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1 = new ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1(this.$repository, continuation);
        chargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1.L$0 = obj;
        return chargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPlusDvizhPurchasePollingContractKt$plusDvizhPurchasingPollingContract$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.$repository;
        this.L$0 = null;
        this.label = 1;
        Object a = fVar.a(str, "chargers", this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
