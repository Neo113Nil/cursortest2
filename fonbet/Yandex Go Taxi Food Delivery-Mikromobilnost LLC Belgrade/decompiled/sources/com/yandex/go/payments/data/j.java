package com.yandex.go.payments.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class j implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.b a;
    public final /* synthetic */ k b;

    public j(kotlinx.coroutines.flow.b bVar, k kVar) {
        this.a = bVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SelectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1 selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SelectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1) {
            selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1 = (SelectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1) continuation;
            int i2 = selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.L$0 = null;
                    selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.L$1 = null;
                    selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.L$2 = null;
                    selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1 = new SelectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedPaymentDataSourceImpl$selectedPaymentFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
