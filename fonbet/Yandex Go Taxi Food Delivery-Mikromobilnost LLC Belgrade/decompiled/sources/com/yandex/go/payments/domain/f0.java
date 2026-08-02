package com.yandex.go.payments.domain;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class f0 implements tpr {
    public final /* synthetic */ mth a;

    public f0(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1 paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1;
        int i;
        if (continuation instanceof PaymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1) {
            paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1 = (PaymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1) continuation;
            int i2 = paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e0 e0Var = new e0(vprVar);
                    paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.L$0 = null;
                    paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.L$1 = null;
                    paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.L$2 = null;
                    paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.label = 1;
                    if (this.a.collect(e0Var, paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1) == coroutineSingletons) {
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
        paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1 = new PaymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1(this, continuation);
        Object obj2 = paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsTriggersInteractor$triggersFlow$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
