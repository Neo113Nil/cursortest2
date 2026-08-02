package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.cvf;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.vpr;
import defpackage.y22;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class l implements vpr {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(cvf cvfVar, Continuation continuation) {
        DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1 dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1;
        int i;
        if (continuation instanceof DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1) {
            dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1 = (DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1) continuation;
            int i2 = dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                n nVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = cvfVar.a;
                    PaymentSettings paymentSettings = cvfVar.b;
                    dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.L$0 = null;
                    dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.label = 1;
                    n.W(nVar, list, paymentSettings, false);
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
                rwo rwoVar = nVar.c;
                sv90 sv90Var = qv90.a;
                DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.f0(divCardForAnalytics).d(null));
                return zy11Var;
            }
        }
        dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1 = new DKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1(this, continuation);
        Object obj2 = dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$observePaymentMethods$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        n nVar2 = this.a;
        if (i != 0) {
        }
        rwo rwoVar2 = nVar2.c;
        sv90 sv90Var2 = qv90.a;
        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.SELECT;
        sv90Var2.getClass();
        ((y22) rwoVar2).a(sv90.f0(divCardForAnalytics2).d(null));
        return zy11Var2;
    }
}
