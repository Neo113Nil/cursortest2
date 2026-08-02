package com.yandex.go.scooters.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ i b;

    public h(tpr tprVar, i iVar) {
        this.a = tprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$1 scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$1) {
            scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1 = (ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$1) continuation;
            int i2 = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.L$0 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.L$1 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.L$2 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1 = new ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
