package com.yandex.go.scooters.domain;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class t implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ u b;

    public t(ha2 ha2Var, u uVar) {
        this.a = ha2Var;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1 scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ScootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1) {
            scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1 = (ScootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1) continuation;
            int i2 = scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s(vprVar, this.b);
                    scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.L$0 = null;
                    scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.L$1 = null;
                    scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.L$2 = null;
                    scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(sVar, scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1 = new ScootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMmPaymentSyncLifecycleInteractor$onLaunch$lambda$0$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
