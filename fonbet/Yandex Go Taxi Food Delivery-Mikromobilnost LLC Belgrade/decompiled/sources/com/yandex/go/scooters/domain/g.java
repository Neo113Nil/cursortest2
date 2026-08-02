package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.api.domain.ScootersCompositePaymentInteractor$ScootersCompositePaymentState;
import defpackage.hfa0;
import defpackage.ny61;
import defpackage.s66;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        hfa0 hfa0Var;
        if (continuation instanceof ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1) {
            scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 = (ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hfa0 hfa0Var2 = (hfa0) obj;
                    s66 s66Var = this.b.c;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = vprVar2;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = hfa0Var2;
                    scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    obj2 = s66Var.b.b(scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        hfa0Var = hfa0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                hfa0Var = (hfa0) scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6;
                vprVar = (vpr) scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                ScootersCompositePaymentInteractor$ScootersCompositePaymentState scootersCompositePaymentInteractor$ScootersCompositePaymentState = ((Boolean) obj2).booleanValue() ? ScootersCompositePaymentInteractor$ScootersCompositePaymentState.DISABLED : !vez0.G(hfa0Var) ? ScootersCompositePaymentInteractor$ScootersCompositePaymentState.DISABLED : hfa0Var.c() != null ? ScootersCompositePaymentInteractor$ScootersCompositePaymentState.ENABLED_CHECKED : hfa0Var.c() != null ? ScootersCompositePaymentInteractor$ScootersCompositePaymentState.DISABLED : ScootersCompositePaymentInteractor$ScootersCompositePaymentState.ENABLED_UNCHECKED;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = null;
                scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 2;
            }
        }
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 = new ScootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj22).booleanValue()) {
        }
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = null;
        scootersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 2;
    }
}
