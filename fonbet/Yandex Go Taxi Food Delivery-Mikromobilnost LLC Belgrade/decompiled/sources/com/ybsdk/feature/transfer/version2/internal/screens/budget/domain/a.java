package com.ybsdk.feature.transfer.version2.internal.screens.budget.domain;

import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.q8u0;
import defpackage.qp6;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BudgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1 budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof BudgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1) {
            budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1 = (BudgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.label;
                qp6 qp6Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    if (s2e0Var instanceof q2e0) {
                        qp6Var = (qp6) ((q2e0) s2e0Var).a;
                    } else if ((s2e0Var instanceof n2e0) || jl40.l(s2e0Var, r2e0.a)) {
                        qp6Var = new qp6(BudgetGetStatusEntity$Status.TIMEOUT, (q8u0) null, 6);
                    }
                    if (qp6Var != null) {
                        budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(qp6Var, budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1 = new BudgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesInteractor$getStatusChargeSearch$$inlined$mapNotNull$1$2$1.label;
        qp6 qp6Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
