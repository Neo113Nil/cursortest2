package com.yandex.go.scooters.passes.active.domain;

import defpackage.ny61;
import defpackage.qco0;
import defpackage.sco0;
import defpackage.vpr;
import defpackage.w20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1 scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ScootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1) {
            scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = (ScootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sco0 sco0Var = (sco0) obj;
                    qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                    w20 w20Var = qco0Var != null ? qco0Var.g : null;
                    if (w20Var != null) {
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(w20Var, scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = new ScootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
