package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.t1p0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ t1p0 b;

    public e(tpr[] tprVarArr, t1p0 t1p0Var) {
        this.a = tprVarArr;
        this.b = t1p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1) {
            scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = (ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1) continuation;
            int i2 = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 19);
                    ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3(null, this.b);
                    scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$0 = null;
                    scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$1 = null;
                    scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$2 = null;
                    scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3, scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = new ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
