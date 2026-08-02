package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.data.model.PaymentsBindingInProgress;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1 paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1;
        int i;
        String a;
        if (continuation instanceof PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1) {
            paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1 = (PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1) continuation;
            int i2 = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((PaymentMethods) obj).v;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        PaymentsBindingInProgress paymentsBindingInProgress = (PaymentsBindingInProgress) obj3;
                        if (paymentsBindingInProgress.getB() != null && (!evu0.J(r6)) && (a = paymentsBindingInProgress.getA()) != null && (!evu0.J(a))) {
                            arrayList.add(obj3);
                        }
                    }
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.L$0 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.L$1 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.L$2 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.L$3 = null;
                    paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1 = new PaymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusRepository$bindingsInProgressFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
