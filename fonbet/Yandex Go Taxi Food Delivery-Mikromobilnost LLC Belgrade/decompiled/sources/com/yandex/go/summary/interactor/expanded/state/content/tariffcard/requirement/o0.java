package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ p0 b;

    public o0(tpr tprVar, p0 p0Var) {
        this.a = tprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1 tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1;
        int i;
        if (continuation instanceof TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1) {
            tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1 = (TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1) continuation;
            int i2 = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = new n0(vprVar, this.b);
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.L$0 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.L$1 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.L$2 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.label = 1;
                    if (this.a.collect(n0Var, tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1 = new TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1(this, continuation);
        Object obj2 = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
