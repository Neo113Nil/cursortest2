package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.ab00;
import defpackage.dtm0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ dtm0 b;

    public d(tpr[] tprVarArr, dtm0 dtm0Var) {
        this.a = tprVarArr;
        this.b = dtm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1 scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1) {
            scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = (ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1) continuation;
            int i2 = scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 17);
                    ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$3 scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$3(null, this.b);
                    scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$0 = null;
                    scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$1 = null;
                    scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$2 = null;
                    scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$3, scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = new ScootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
