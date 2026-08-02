package com.yandex.go.scooters.offers.v2;

import defpackage.ajo0;
import defpackage.ny61;
import defpackage.t2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1 scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1) {
            scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1 = (ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ((t2e0) obj).a;
                    if (obj3 instanceof Result.Failure) {
                        obj3 = null;
                    }
                    ajo0 ajo0Var = (ajo0) obj3;
                    if (ajo0Var == null || !ajo0Var.e()) {
                        ajo0Var = null;
                    }
                    if (ajo0Var != null) {
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(ajo0Var, scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1 = new ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
