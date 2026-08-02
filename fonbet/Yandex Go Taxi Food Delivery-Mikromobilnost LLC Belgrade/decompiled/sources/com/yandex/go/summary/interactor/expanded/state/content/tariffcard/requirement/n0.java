package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.bnx0;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.kdd0;
import defpackage.ny61;
import defpackage.pmx0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public n0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1 tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1;
        int i;
        pmx0 pmx0Var;
        if (continuation instanceof TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1) {
            tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1 = (TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1) continuation;
            int i2 = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar = f6vVar.a;
                    bnx0 bnx0Var = (bnx0) f6vVar.b;
                    if (bnx0Var.b.isEmpty()) {
                        pmx0Var = null;
                    } else {
                        String str = bnx0Var.a;
                        kdd0 kdd0Var = this.b.a;
                        List list = bnx0Var.b;
                        kdd0Var.getClass();
                        pmx0Var = new pmx0(str, kdd0.i(list));
                    }
                    f6v f6vVar2 = new f6v(h6vVar, pmx0Var);
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.L$0 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.L$1 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.L$2 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.L$3 = null;
                    tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1 = new TariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1(this, continuation);
        Object obj22 = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffRulesUiStateInteractor$tariffRuleDataFlow$$inlined$mapIdentifiable$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
