package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.dtf;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.vpr;
import defpackage.y22;
import defpackage.zuf;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class f implements vpr {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        if (r3 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (com.yandex.payment.divkit.select.h.X(r10, (org.json.JSONObject) r12, r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(zuf zufVar, Continuation continuation) {
        DKSelectViewModel$observePaymentMethodsInner$1$3$emit$1 dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1;
        int i;
        if (continuation instanceof DKSelectViewModel$observePaymentMethodsInner$1$3$emit$1) {
            dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1 = (DKSelectViewModel$observePaymentMethodsInner$1$3$emit$1) continuation;
            int i2 = dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label;
                zy11 zy11Var = zy11.a;
                h hVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.payment.divkit.usecases.l lVar = hVar.b;
                    dtf dtfVar = zufVar.a;
                    PaymentSettings paymentSettings = zufVar.b;
                    dtf a = dtf.a(dtfVar, null, paymentSettings != null ? paymentSettings.getPayload() : null, HProv.PP_VERSION_TIMESTAMP);
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0 = zufVar;
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label = 1;
                    obj = lVar.b(a, dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1);
                } else if (i == 1) {
                    zufVar = (zuf) dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        rwo rwoVar = hVar.c;
                        sv90 sv90Var = qv90.a;
                        DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
                        sv90Var.getClass();
                        ((y22) rwoVar).a(sv90.f0(divCardForAnalytics).d(null));
                        return zy11Var;
                    }
                    zufVar = (zuf) dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0;
                    kotlin.b.b(obj);
                    List list = zufVar.c;
                    PaymentSettings paymentSettings2 = zufVar.b;
                    boolean z = zufVar.d;
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$1 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$2 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label = 3;
                    h.W(hVar, list, paymentSettings2, z);
                }
                hVar.getClass();
                dtf dtfVar2 = zufVar.a;
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0 = zufVar;
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$1 = obj;
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$2 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.I$0 = 0;
                dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label = 2;
            }
        }
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1 = new DKSelectViewModel$observePaymentMethodsInner$1$3$emit$1(this, continuation);
        Object obj2 = dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        h hVar2 = this.a;
        if (i != 0) {
        }
        hVar2.getClass();
        dtf dtfVar22 = zufVar.a;
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$0 = zufVar;
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$1 = obj2;
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.L$2 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.I$0 = 0;
        dKSelectViewModel$observePaymentMethodsInner$1$3$emit$1.label = 2;
    }
}
