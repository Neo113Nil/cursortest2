package com.yandex.go.payments.domain;

import defpackage.kjz;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class o0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kjz b;

    public o0(tpr tprVar, kjz kjzVar) {
        this.a = tprVar;
        this.b = kjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1 preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1) {
            preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1 = (PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1) continuation;
            int i2 = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = new n0(vprVar, this.b);
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.L$0 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.L$1 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.L$2 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(n0Var, preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1 = new PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
