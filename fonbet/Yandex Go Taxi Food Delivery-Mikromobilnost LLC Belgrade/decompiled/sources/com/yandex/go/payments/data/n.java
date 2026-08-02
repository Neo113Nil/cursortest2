package com.yandex.go.payments.data;

import defpackage.lv90;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public n(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectedPaymentRepositoryImpl$special$$inlined$map$2$2$1 selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SelectedPaymentRepositoryImpl$special$$inlined$map$2$2$1) {
            selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1 = (SelectedPaymentRepositoryImpl$special$$inlined$map$2$2$1) continuation;
            int i2 = selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lv90 a = this.b.b.a();
                    selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.L$0 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.L$1 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.L$2 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.L$3 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(a, selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1 = new SelectedPaymentRepositoryImpl$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedPaymentRepositoryImpl$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
