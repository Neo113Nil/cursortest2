package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.ny61;
import defpackage.qco0;
import defpackage.rco0;
import defpackage.sco0;
import defpackage.vpr;
import defpackage.x1p0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        rco0 rco0Var;
        if (continuation instanceof ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sco0 sco0Var = (sco0) obj;
                    qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                    if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
                        rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
                    }
                    x1p0 x1p0Var = rco0Var != null ? rco0Var.h : null;
                    if (x1p0Var != null) {
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(x1p0Var, scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
