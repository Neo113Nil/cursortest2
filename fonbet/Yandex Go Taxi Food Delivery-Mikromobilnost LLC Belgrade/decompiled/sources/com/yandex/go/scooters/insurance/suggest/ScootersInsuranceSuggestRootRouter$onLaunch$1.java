package com.yandex.go.scooters.insurance.suggest;

import defpackage.cun0;
import defpackage.dun0;
import defpackage.eun0;
import defpackage.gun0;
import defpackage.m7n0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ztn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestRootRouter$onLaunch$1", f = "ScootersInsuranceSuggestRootRouter.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestRootRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ cun0 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestRootRouter$onLaunch$1(c cVar, cun0 cun0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = cun0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestRootRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestRootRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m7n0 m7n0Var = this.this$0.F;
            this.label = 1;
            obj = m7n0Var.a.b(this);
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
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion fullInsuranceSuggestion = ((ScootersClientInsuranceNewExperiment) obj).f;
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow = fullInsuranceSuggestion != null ? fullInsuranceSuggestion.c : null;
        c cVar = this.this$0;
        cun0 cun0Var = this.$payload;
        if (upsaleWindow != null) {
            cVar.A((m950) cVar.E.get(), new gun0(cun0Var.a, cun0Var.b), new eun0(cVar));
        } else {
            cVar.A((m950) cVar.D.get(), new ztn0(cun0Var.a), new dun0(cVar));
        }
        return zy11.a;
    }
}
