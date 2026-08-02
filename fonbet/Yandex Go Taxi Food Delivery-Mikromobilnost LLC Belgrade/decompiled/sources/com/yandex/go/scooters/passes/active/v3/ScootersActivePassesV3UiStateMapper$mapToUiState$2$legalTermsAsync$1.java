package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vtm0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvtm0;", "<anonymous>", "(Ltse;)Lvtm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.ScootersActivePassesV3UiStateMapper$mapToUiState$2$legalTermsAsync$1", f = "ScootersActivePassesV3UiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3UiStateMapper$mapToUiState$2$legalTermsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersSuperPassLegalTermsExperiment $legalTermsExperiment;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3UiStateMapper$mapToUiState$2$legalTermsAsync$1(g gVar, ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$legalTermsExperiment = scootersSuperPassLegalTermsExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3UiStateMapper$mapToUiState$2$legalTermsAsync$1(this.this$0, this.$legalTermsExperiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3UiStateMapper$mapToUiState$2$legalTermsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment = this.$legalTermsExperiment;
        gVar.getClass();
        if (scootersSuperPassLegalTermsExperiment != null) {
            String str = scootersSuperPassLegalTermsExperiment.e;
            if (scootersSuperPassLegalTermsExperiment.b) {
                String Y = d6z.Y(scootersSuperPassLegalTermsExperiment, scootersSuperPassLegalTermsExperiment.d);
                if (Y.length() != 0 && str.length() != 0) {
                    return new vtm0(Y, str);
                }
            }
        }
        return null;
    }
}
