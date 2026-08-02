package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.q8o0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ q8o0 b;

    public h(tpr[] tprVarArr, q8o0 q8o0Var) {
        this.a = tprVarArr;
        this.b = q8o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1) {
            scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = (ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1) continuation;
            int i2 = scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 18);
                    ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3(null, this.b);
                    scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$0 = null;
                    scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$1 = null;
                    scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$2 = null;
                    scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3, scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = new ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
