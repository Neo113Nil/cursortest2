package com.yandex.go.scooters.passes.purchase.superpasses;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x1p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln1p0;", "<anonymous>", "(Ltse;)Ln1p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersSuperPassLegalTermsExperiment $legalTermsExperiment;
    final /* synthetic */ x1p0 $purchaseWindow;
    final /* synthetic */ String $selectedPassId;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1(h hVar, x1p0 x1p0Var, String str, ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$purchaseWindow = x1p0Var;
        this.$selectedPassId = str;
        this.$legalTermsExperiment = scootersSuperPassLegalTermsExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1(this.this$0, this.$purchaseWindow, this.$selectedPassId, this.$legalTermsExperiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        h hVar = this.this$0;
        x1p0 x1p0Var = this.$purchaseWindow;
        String str = this.$selectedPassId;
        ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment = this.$legalTermsExperiment;
        this.label = 1;
        Object a = h.a(hVar, x1p0Var, str, scootersSuperPassLegalTermsExperiment, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
