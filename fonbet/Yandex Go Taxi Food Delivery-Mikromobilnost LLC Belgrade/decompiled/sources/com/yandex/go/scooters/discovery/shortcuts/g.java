package com.yandex.go.scooters.discovery.shortcuts;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public final class g implements tpr {
    public final /* synthetic */ n a;

    public g(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1 scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1) {
            scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1 = (ScootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1) continuation;
            int i2 = scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.L$0 = null;
                    scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.L$1 = null;
                    scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.L$2 = null;
                    scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1 = new ScootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShortcutsRequestTriggerRepository$listenInsurance$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
