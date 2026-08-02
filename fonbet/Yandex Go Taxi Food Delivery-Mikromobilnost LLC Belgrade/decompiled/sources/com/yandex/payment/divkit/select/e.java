package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tuf;
import defpackage.vpr;
import defpackage.y22;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class e implements vpr {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(tuf tufVar, Continuation continuation) {
        DKSelectViewModel$observePaymentMethods$1$1$emit$1 dKSelectViewModel$observePaymentMethods$1$1$emit$1;
        int i;
        if (continuation instanceof DKSelectViewModel$observePaymentMethods$1$1$emit$1) {
            dKSelectViewModel$observePaymentMethods$1$1$emit$1 = (DKSelectViewModel$observePaymentMethods$1$1$emit$1) continuation;
            int i2 = dKSelectViewModel$observePaymentMethods$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModel$observePaymentMethods$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModel$observePaymentMethods$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModel$observePaymentMethods$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                h hVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = tufVar.a;
                    PaymentSettings paymentSettings = tufVar.b;
                    dKSelectViewModel$observePaymentMethods$1$1$emit$1.L$0 = null;
                    dKSelectViewModel$observePaymentMethods$1$1$emit$1.label = 1;
                    h.W(hVar, list, paymentSettings, false);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                rwo rwoVar = hVar.c;
                sv90 sv90Var = qv90.a;
                DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.f0(divCardForAnalytics).d(null));
                return zy11Var;
            }
        }
        dKSelectViewModel$observePaymentMethods$1$1$emit$1 = new DKSelectViewModel$observePaymentMethods$1$1$emit$1(this, continuation);
        Object obj2 = dKSelectViewModel$observePaymentMethods$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModel$observePaymentMethods$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        h hVar2 = this.a;
        if (i != 0) {
        }
        rwo rwoVar2 = hVar2.c;
        sv90 sv90Var2 = qv90.a;
        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.SELECT;
        sv90Var2.getClass();
        ((y22) rwoVar2).a(sv90.f0(divCardForAnalytics2).d(null));
        return zy11Var2;
    }
}
