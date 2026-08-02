package com.yandex.go.payments.domain;

import defpackage.kjz;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class n0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kjz b;

    public n0(vpr vprVar, kjz kjzVar) {
        this.a = vprVar;
        this.b = kjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1 preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1) {
            preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1 = (PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1) continuation;
            int i2 = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    lv90 lv90Var = ((Boolean) obj).booleanValue() ? ((ru.yandex.taxi.preorder.repositories.g) this.b.b).a.a.w : null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.L$0 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.L$1 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.L$2 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.L$3 = null;
                    preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(lv90Var, preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1 = new PreorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderSelectedPaymentInteractor$selectedPaymentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
