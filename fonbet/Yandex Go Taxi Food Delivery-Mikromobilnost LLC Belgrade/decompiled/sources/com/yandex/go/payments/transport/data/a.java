package com.yandex.go.payments.transport.data;

import defpackage.lv90;
import defpackage.lz30;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lz30 b;

    public a(vpr vprVar, lz30 lz30Var) {
        this.a = vprVar;
        this.b = lz30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1 mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1) {
            mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1 = (MtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lv90 lv90Var = (lv90) obj;
                    m6a0 a = lv90Var != null ? this.b.b.a(lv90Var) : null;
                    mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1 = new MtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtSelectedPaymentMethodRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
