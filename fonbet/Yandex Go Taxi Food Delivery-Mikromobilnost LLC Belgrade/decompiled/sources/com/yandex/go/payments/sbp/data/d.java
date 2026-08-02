package com.yandex.go.payments.sbp.data;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements tpr {
    public final /* synthetic */ gci0 a;

    public d(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1 paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1) {
            paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1 = (PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1) continuation;
            int i2 = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.L$0 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.L$1 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.L$2 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.label = 1;
                    if (this.a.a.collect(cVar, paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1 = new PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
