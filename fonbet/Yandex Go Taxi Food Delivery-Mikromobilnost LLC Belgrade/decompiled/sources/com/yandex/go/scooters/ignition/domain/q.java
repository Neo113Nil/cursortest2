package com.yandex.go.scooters.ignition.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class q implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;

    public q(kotlinx.coroutines.flow.n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1 scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1) {
            scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1 = (ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1) continuation;
            int i2 = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar);
                    scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.L$0 = null;
                    scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.L$1 = null;
                    scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.L$2 = null;
                    scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1 = new ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
