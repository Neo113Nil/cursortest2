package com.yandex.go.scooters.ignition.domain;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1 scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1) {
            scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1 = (ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1) continuation;
            int i2 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((ScootersIgnitionExperiment) obj).b);
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.L$0 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.L$1 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.L$2 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.L$3 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1 = new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
