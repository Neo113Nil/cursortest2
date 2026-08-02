package com.yandex.go.scooters.ignition.domain;

import defpackage.arn0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ arn0 a;

    public d(arn0 arn0Var) {
        this.a = arn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r6.c(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1 scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1) {
            scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1 = (ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1) continuation;
            int i2 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label;
                arn0 arn0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    arn0Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1 scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1 = new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1(arn0Var, (List) obj, null);
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$0 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$1 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$2 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label = 1;
                    obj2 = tje.k0(mdhVar, scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1, scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                booleanValue = ((Boolean) obj2).booleanValue();
                if (booleanValue) {
                    k kVar = (k) arn0Var.c.get();
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$0 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$1 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.L$2 = null;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.Z$0 = booleanValue;
                    scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label = 2;
                }
                return zy11.a;
            }
        }
        scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1 = new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1(this, continuation);
        Object obj22 = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2$1$1.label;
        arn0 arn0Var2 = this.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj22).booleanValue();
        if (booleanValue) {
        }
        return zy11.a;
    }
}
