package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.brn0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ ScootersIgnitionControllingEnabledNotification a;

    public a(ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification) {
        this.a = scootersIgnitionControllingEnabledNotification;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (defpackage.bvf0.n(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1 scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1;
        int i;
        brn0 brn0Var;
        if (continuation instanceof ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1) {
            scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1 = (ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1) continuation;
            int i2 = scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
                ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification = this.a;
                if (i != 0) {
                    b.b(obj2);
                    brn0Var = scootersIgnitionControllingEnabledNotification.scootersIgnitiionExperimentRepository;
                    scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$0 = null;
                    scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$1 = null;
                    scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$2 = null;
                    scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label = 1;
                    obj2 = brn0Var.a.b(scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj2);
                        return zy11.a;
                    }
                    b.b(obj2);
                }
                ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj2;
                ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 scootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 = new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1(scootersIgnitionControllingEnabledNotification, scootersIgnitionExperiment.r.c, scootersIgnitionExperiment, null);
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$0 = null;
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$1 = null;
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$2 = null;
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$3 = null;
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$4 = null;
                scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label = 2;
            }
        }
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1 = new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
        ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification2 = this.a;
        if (i != 0) {
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment2 = (ScootersIgnitionExperiment) obj22;
        ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 scootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$12 = new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1(scootersIgnitionControllingEnabledNotification2, scootersIgnitionExperiment2.r.c, scootersIgnitionExperiment2, null);
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$0 = null;
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$1 = null;
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$2 = null;
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$3 = null;
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.L$4 = null;
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1.label = 2;
    }
}
