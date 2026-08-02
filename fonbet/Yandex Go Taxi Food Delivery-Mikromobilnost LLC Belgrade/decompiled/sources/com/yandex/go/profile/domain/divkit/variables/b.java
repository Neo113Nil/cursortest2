package com.yandex.go.profile.domain.divkit.variables;

import defpackage.evu0;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z131;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1 paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1;
        int i;
        String str;
        String str2;
        if (continuation instanceof PaymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1) {
            paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1 = (PaymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.label;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m1a0 m1a0Var = (m1a0) ((Pair) obj).getSecond();
                    cVar.getClass();
                    String obj3 = evu0.k0(m1a0Var.a() + " " + m1a0Var.b).toString();
                    paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.L$3 = obj3;
                    paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.label = 1;
                    Object d = c.d(cVar, m1a0Var, paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = d;
                    str = obj3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                str2 = (String) obj2;
                z131 z131Var = new z131("superapp.profile.payment", str);
                if (str2 == null) {
                    str2 = "";
                }
                cVar.b(z131Var, new z131("superapp.profile.payment_icon_preview", str2));
                return zy11.a;
            }
        }
        paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1 = new PaymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVariableHandler$subscribeToPaymentUpdates$$inlined$safeCollectIn$1$2$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        str2 = (String) obj22;
        z131 z131Var2 = new z131("superapp.profile.payment", str);
        if (str2 == null) {
        }
        cVar2.b(z131Var2, new z131("superapp.profile.payment_icon_preview", str2));
        return zy11.a;
    }
}
