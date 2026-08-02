package com.yandex.go.scooters.passes.active.v3;

import defpackage.kvm0;
import defpackage.ny61;
import defpackage.qco0;
import defpackage.rco0;
import defpackage.sco0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Pair pair;
        rco0 rco0Var;
        kvm0 kvm0Var;
        if (continuation instanceof ScootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ScootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sco0 sco0Var = (sco0) obj;
                    if (sco0Var != null) {
                        qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
                            rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
                        }
                        if (rco0Var != null && (kvm0Var = rco0Var.i) != null) {
                            pair = new Pair(sco0Var, kvm0Var);
                            if (pair != null) {
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                                scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                if (this.a.emit(pair, scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    pair = null;
                    if (pair != null) {
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
        scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ScootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
