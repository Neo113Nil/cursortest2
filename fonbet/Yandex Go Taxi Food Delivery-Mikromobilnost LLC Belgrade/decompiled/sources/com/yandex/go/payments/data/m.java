package com.yandex.go.payments.data;

import defpackage.fga0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class m implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ fga0 b;

    public m(n0 n0Var, fga0 fga0Var) {
        this.a = n0Var;
        this.b = fga0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SelectedPaymentRepositoryImpl$special$$inlined$map$1$1 selectedPaymentRepositoryImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof SelectedPaymentRepositoryImpl$special$$inlined$map$1$1) {
            selectedPaymentRepositoryImpl$special$$inlined$map$1$1 = (SelectedPaymentRepositoryImpl$special$$inlined$map$1$1) continuation;
            int i2 = selectedPaymentRepositoryImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedPaymentRepositoryImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedPaymentRepositoryImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedPaymentRepositoryImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    selectedPaymentRepositoryImpl$special$$inlined$map$1$1.L$0 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$1$1.L$1 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$1$1.L$2 = null;
                    selectedPaymentRepositoryImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, selectedPaymentRepositoryImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        selectedPaymentRepositoryImpl$special$$inlined$map$1$1 = new SelectedPaymentRepositoryImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = selectedPaymentRepositoryImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedPaymentRepositoryImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
