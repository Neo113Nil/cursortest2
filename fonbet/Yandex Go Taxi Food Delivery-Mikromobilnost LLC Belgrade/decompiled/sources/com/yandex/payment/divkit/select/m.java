package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.dtf;
import defpackage.lq60;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.vpr;
import defpackage.y22;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class m implements vpr {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        if (r3 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (com.yandex.payment.divkit.select.n.X(r10, (org.json.JSONObject) r12, r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(lq60 lq60Var, Continuation continuation) {
        DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1 dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1;
        int i;
        if (continuation instanceof DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1) {
            dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1 = (DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1) continuation;
            int i2 = dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                n nVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lq60Var.getClass();
                    com.yandex.payment.divkit.usecases.l lVar = nVar.G;
                    dtf dtfVar = lq60Var.a;
                    PaymentSettings paymentSettings = lq60Var.b;
                    dtf a = dtf.a(dtfVar, null, paymentSettings != null ? paymentSettings.getPayload() : null, HProv.PP_VERSION_TIMESTAMP);
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0 = lq60Var;
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label = 1;
                    obj = lVar.b(a, dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1);
                } else if (i == 1) {
                    lq60Var = (lq60) dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        rwo rwoVar = nVar.c;
                        sv90 sv90Var = qv90.a;
                        DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                        sv90Var.getClass();
                        ((y22) rwoVar).a(sv90.f0(divCardForAnalytics).d(null));
                        return zy11Var;
                    }
                    lq60Var = (lq60) dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    ArrayList arrayList = lq60Var.c;
                    PaymentSettings paymentSettings2 = lq60Var.b;
                    boolean z = lq60Var.d;
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0 = null;
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$1 = null;
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$2 = null;
                    dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label = 3;
                    n.W(nVar, arrayList, paymentSettings2, z);
                }
                dtf dtfVar2 = lq60Var.a;
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0 = lq60Var;
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$1 = obj;
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$2 = null;
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.I$0 = 0;
                dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label = 2;
            }
        }
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1 = new DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1(this, continuation);
        Object obj2 = dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        n nVar2 = this.a;
        if (i != 0) {
        }
        dtf dtfVar22 = lq60Var.a;
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$0 = lq60Var;
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$1 = obj2;
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.L$2 = null;
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.I$0 = 0;
        dKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1.label = 2;
    }
}
