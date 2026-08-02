package com.yandex.go.scooters.passes.data.polling;

import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import defpackage.afo0;
import defpackage.joo0;
import defpackage.moo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ufo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "operationId", "Lmoo0;", "<anonymous>", "(Ljava/lang/String;)Lmoo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.data.polling.ScootersPassPurchasingPollingContractKt$buildPassContract$1$1", f = "ScootersPassPurchasingPollingContract.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassPurchasingPollingContractKt$buildPassContract$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPassesPendingPurchaseStatus$PackageType $packageType;
    final /* synthetic */ com.yandex.go.scooters.passes.data.a $scootersPassesPurchaseRepository;
    final /* synthetic */ ufo0 $scootersPassesPurchasingStateRepository;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassPurchasingPollingContractKt$buildPassContract$1$1(ufo0 ufo0Var, ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType, com.yandex.go.scooters.passes.data.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersPassesPurchasingStateRepository = ufo0Var;
        this.$packageType = scootersPassesPendingPurchaseStatus$PackageType;
        this.$scootersPassesPurchaseRepository = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassPurchasingPollingContractKt$buildPassContract$1$1 scootersPassPurchasingPollingContractKt$buildPassContract$1$1 = new ScootersPassPurchasingPollingContractKt$buildPassContract$1$1(this.$scootersPassesPurchasingStateRepository, this.$packageType, this.$scootersPassesPurchaseRepository, continuation);
        scootersPassPurchasingPollingContractKt$buildPassContract$1$1.L$0 = obj;
        return scootersPassPurchasingPollingContractKt$buildPassContract$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassPurchasingPollingContractKt$buildPassContract$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ufo0 ufo0Var = this.$scootersPassesPurchasingStateRepository;
            ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType = this.$packageType;
            r0 r0Var = ((com.yandex.go.scooters.passes.data.b) ufo0Var).b;
            afo0 afo0Var = new afo0(str, scootersPassesPendingPurchaseStatus$PackageType);
            r0Var.getClass();
            r0Var.m(null, afo0Var);
            com.yandex.go.scooters.passes.data.a aVar = this.$scootersPassesPurchaseRepository;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.c(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        moo0 moo0Var = (moo0) obj;
        return moo0Var == null ? joo0.a : moo0Var;
    }
}
