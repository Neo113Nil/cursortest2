package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import defpackage.bvf0;
import defpackage.dms;
import defpackage.gum0;
import defpackage.kvm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sco0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Pair;", "Lsco0;", "Lkvm0;", "<destruct>", "Lcom/yandex/go/scooters/passes/data/model/ScootersSuperPassLegalTermsExperiment;", "legalExperiment", "", "unfreezeInProgress", "Lfum0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lkotlin/Pair;Lcom/yandex/go/scooters/passes/data/model/ScootersSuperPassLegalTermsExperiment;Z)Lfum0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.ScootersActivePassesV3UiStateInteractor$uiStateFlow$2", f = "ScootersActivePassesV3UiStateInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3UiStateInteractor$uiStateFlow$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ gum0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3UiStateInteractor$uiStateFlow$2(gum0 gum0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = gum0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        ScootersActivePassesV3UiStateInteractor$uiStateFlow$2 scootersActivePassesV3UiStateInteractor$uiStateFlow$2 = new ScootersActivePassesV3UiStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj5);
        scootersActivePassesV3UiStateInteractor$uiStateFlow$2.L$0 = (Pair) obj2;
        scootersActivePassesV3UiStateInteractor$uiStateFlow$2.L$1 = (ScootersSuperPassLegalTermsExperiment) obj3;
        scootersActivePassesV3UiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        return scootersActivePassesV3UiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment = (ScootersSuperPassLegalTermsExperiment) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        sco0 sco0Var = (sco0) pair.getFirst();
        kvm0 kvm0Var = (kvm0) pair.getSecond();
        g gVar = this.this$0.d;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.Z$0 = z;
        this.label = 1;
        gVar.getClass();
        Object n = bvf0.n(new ScootersActivePassesV3UiStateMapper$mapToUiState$2(kvm0Var, z, gVar, sco0Var, scootersSuperPassLegalTermsExperiment, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
