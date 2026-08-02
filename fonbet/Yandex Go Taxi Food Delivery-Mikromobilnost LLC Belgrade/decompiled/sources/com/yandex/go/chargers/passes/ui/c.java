package com.yandex.go.chargers.passes.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ d b;

    public c(tpr[] tprVarArr, d dVar) {
        this.a = tprVarArr;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersPassesUiStateInteractor$special$$inlined$combine$1$1 chargersPassesUiStateInteractor$special$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ChargersPassesUiStateInteractor$special$$inlined$combine$1$1) {
            chargersPassesUiStateInteractor$special$$inlined$combine$1$1 = (ChargersPassesUiStateInteractor$special$$inlined$combine$1$1) continuation;
            int i2 = chargersPassesUiStateInteractor$special$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateInteractor$special$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateInteractor$special$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateInteractor$special$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 12);
                    ChargersPassesUiStateInteractor$special$$inlined$combine$1$3 chargersPassesUiStateInteractor$special$$inlined$combine$1$3 = new ChargersPassesUiStateInteractor$special$$inlined$combine$1$3(this.b, null);
                    chargersPassesUiStateInteractor$special$$inlined$combine$1$1.L$0 = null;
                    chargersPassesUiStateInteractor$special$$inlined$combine$1$1.L$1 = null;
                    chargersPassesUiStateInteractor$special$$inlined$combine$1$1.L$2 = null;
                    chargersPassesUiStateInteractor$special$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, v10Var, chargersPassesUiStateInteractor$special$$inlined$combine$1$3, chargersPassesUiStateInteractor$special$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        chargersPassesUiStateInteractor$special$$inlined$combine$1$1 = new ChargersPassesUiStateInteractor$special$$inlined$combine$1$1(this, continuation);
        Object obj2 = chargersPassesUiStateInteractor$special$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateInteractor$special$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
