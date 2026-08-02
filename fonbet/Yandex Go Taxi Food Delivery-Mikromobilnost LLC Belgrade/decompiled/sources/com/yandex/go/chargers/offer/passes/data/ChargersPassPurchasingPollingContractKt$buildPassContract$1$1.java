package com.yandex.go.chargers.offer.passes.data;

import defpackage.hia;
import defpackage.kia;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "operationId", "Lkia;", "<anonymous>", "(Ljava/lang/String;)Lkia;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.passes.data.ChargersPassPurchasingPollingContractKt$buildPassContract$1$1", f = "ChargersPassPurchasingPollingContract.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassPurchasingPollingContractKt$buildPassContract$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ g $chargersPassesRepository;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassPurchasingPollingContractKt$buildPassContract$1$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersPassesRepository = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPassPurchasingPollingContractKt$buildPassContract$1$1 chargersPassPurchasingPollingContractKt$buildPassContract$1$1 = new ChargersPassPurchasingPollingContractKt$buildPassContract$1$1(this.$chargersPassesRepository, continuation);
        chargersPassPurchasingPollingContractKt$buildPassContract$1$1.L$0 = obj;
        return chargersPassPurchasingPollingContractKt$buildPassContract$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassPurchasingPollingContractKt$buildPassContract$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.$chargersPassesRepository;
            this.L$0 = null;
            this.label = 1;
            obj = gVar.b(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        kia kiaVar = (kia) obj;
        return kiaVar == null ? hia.a : kiaVar;
    }
}
