package com.yandex.go.scooters.passes.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1 scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1) {
            scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1 = (ScootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1) continuation;
            int i2 = scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.L$0 = null;
                    scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.L$1 = null;
                    scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.L$2 = null;
                    scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1 = new ScootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPurchasingPollingInteractorImpl$listenPackagesPolling$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
