package com.yandex.go.chargers.payments.domain;

import defpackage.hfa0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ChargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1) {
            chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 = (ChargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = vprVar2;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = null;
                    chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    Enum a = c.a(this.b, (hfa0) obj, chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
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
                vprVar = (vpr) chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = null;
                chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 2;
            }
        }
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1 = new ChargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$4 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$5 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.L$6 = null;
        chargersCompositePaymentInteractorImpl$special$$inlined$map$1$2$1.label = 2;
    }
}
