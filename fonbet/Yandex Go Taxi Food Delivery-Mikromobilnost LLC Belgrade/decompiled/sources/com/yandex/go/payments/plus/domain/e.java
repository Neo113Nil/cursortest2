package com.yandex.go.payments.plus.domain;

import defpackage.ajd0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ ajd0 b;

    public e(m0 m0Var, ajd0 ajd0Var) {
        this.a = m0Var;
        this.b = ajd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1 plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1) {
            plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1 = (PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1 = new PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
