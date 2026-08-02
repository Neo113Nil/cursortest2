package com.yandex.go.overdraft.ui;

import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtFlowHeader;
import defpackage.ny61;
import defpackage.pl21;
import defpackage.vpr;
import defpackage.vz80;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public d(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1 overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1) {
            overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1 = (OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1) continuation;
            int i2 = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vz80 vz80Var = g.E;
                    this.b.getClass();
                    DebtFlow debtFlow = ((pl21) obj).b.e;
                    DebtFlowHeader debtFlowHeader = debtFlow != null ? debtFlow.a : null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.L$0 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.L$1 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.L$2 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.L$3 = null;
                    overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(debtFlowHeader, overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1 = new OverdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftStateBarControllerImpl$getDebtStatusesPaneChangedFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
