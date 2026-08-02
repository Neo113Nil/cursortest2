package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusRequest;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import defpackage.cda0;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fmt;
import defpackage.nud;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.tpr;
import defpackage.wwg;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class e {
    public final BindUniversalPaymentMethodApi a;
    public final cda0 b;
    public final fga0 c;
    public final com.yandex.go.payments.data.c d;

    public e(BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi, cda0 cda0Var, fga0 fga0Var, com.yandex.go.payments.data.c cVar) {
        this.a = bindUniversalPaymentMethodApi;
        this.b = cda0Var;
        this.c = fga0Var;
        this.d = cVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(new b(kotlinx.coroutines.flow.e.I(this.c.z(), new PaymentsBindingStatusRepository$bindingsInProgressFlow$fromPaymentMethods$1(2, null))), new d(kotlinx.coroutines.flow.e.d(this.d.c)), new PaymentsBindingStatusRepository$bindingsInProgressFlow$1(3, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x009f, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x009f, blocks: (B:11:0x0030, B:12:0x0059, B:18:0x006b, B:20:0x0073, B:21:0x0078, B:23:0x0090, B:25:0x0096, B:26:0x009a, B:36:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[Catch: all -> 0x009f, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x009f, blocks: (B:11:0x0030, B:12:0x0059, B:18:0x006b, B:20:0x0073, B:21:0x0078, B:23:0x0090, B:25:0x0096, B:26:0x009a, B:36:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[Catch: all -> 0x009f, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x009f, blocks: (B:11:0x0030, B:12:0x0059, B:18:0x006b, B:20:0x0073, B:21:0x0078, B:23:0x0090, B:25:0x0096, B:26:0x009a, B:36:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        PaymentsBindingStatusRepository$getCompoundBindingStatus$1 paymentsBindingStatusRepository$getCompoundBindingStatus$1;
        int i;
        try {
            if (continuationImpl instanceof PaymentsBindingStatusRepository$getCompoundBindingStatus$1) {
                paymentsBindingStatusRepository$getCompoundBindingStatus$1 = (PaymentsBindingStatusRepository$getCompoundBindingStatus$1) continuationImpl;
                int i2 = paymentsBindingStatusRepository$getCompoundBindingStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentsBindingStatusRepository$getCompoundBindingStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentsBindingStatusRepository$getCompoundBindingStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentsBindingStatusRepository$getCompoundBindingStatus$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<PaymentMethodBindingStatusResponse> b = this.a.b(new PaymentMethodBindingStatusRequest(str, str2, 12));
                        paymentsBindingStatusRepository$getCompoundBindingStatus$1.L$0 = null;
                        paymentsBindingStatusRepository$getCompoundBindingStatus$1.L$1 = null;
                        paymentsBindingStatusRepository$getCompoundBindingStatus$1.L$2 = null;
                        paymentsBindingStatusRepository$getCompoundBindingStatus$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(b, null, paymentsBindingStatusRepository$getCompoundBindingStatus$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    fmt fmtVar = (fmt) obj;
                    int i3 = fmtVar.b;
                    Object obj2 = fmtVar.a;
                    boolean z = 200 > i3 && i3 < 300;
                    r1e0 n = wwg.n(fmtVar);
                    Long l = n == null ? n.b : null;
                    PaymentMethodBindingStatusResponse.BindingStatus a = ((PaymentMethodBindingStatusResponse) obj2).getA();
                    String b2 = ((PaymentMethodBindingStatusResponse) obj2).getB();
                    com.yandex.go.payments.addmethod.data.model.m0 c = ((PaymentMethodBindingStatusResponse) obj2).getC();
                    PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction asyncApplicationUserInteraction = !(c instanceof PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) ? (PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) c : null;
                    return new nud(l, a, z, b2, asyncApplicationUserInteraction != null ? asyncApplicationUserInteraction.getB() : null);
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            int i32 = fmtVar2.b;
            Object obj22 = fmtVar2.a;
            if (200 > i32) {
            }
            r1e0 n2 = wwg.n(fmtVar2);
            if (n2 == null) {
            }
            PaymentMethodBindingStatusResponse.BindingStatus a2 = ((PaymentMethodBindingStatusResponse) obj22).getA();
            String b22 = ((PaymentMethodBindingStatusResponse) obj22).getB();
            com.yandex.go.payments.addmethod.data.model.m0 c2 = ((PaymentMethodBindingStatusResponse) obj22).getC();
            if (!(c2 instanceof PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction)) {
            }
            return new nud(l, a2, z, b22, asyncApplicationUserInteraction != null ? asyncApplicationUserInteraction.getB() : null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return new nud(null, PaymentMethodBindingStatusResponse.BindingStatus.UNKNOWN, false, null, null);
        }
        paymentsBindingStatusRepository$getCompoundBindingStatus$1 = new PaymentsBindingStatusRepository$getCompoundBindingStatus$1(this, continuationImpl);
        Object obj3 = paymentsBindingStatusRepository$getCompoundBindingStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusRepository$getCompoundBindingStatus$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r6.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PaymentsBindingStatusRepository$updatePaymentMethods$1 paymentsBindingStatusRepository$updatePaymentMethods$1;
        int i;
        if (continuationImpl instanceof PaymentsBindingStatusRepository$updatePaymentMethods$1) {
            paymentsBindingStatusRepository$updatePaymentMethods$1 = (PaymentsBindingStatusRepository$updatePaymentMethods$1) continuationImpl;
            int i2 = paymentsBindingStatusRepository$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusRepository$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsBindingStatusRepository$updatePaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsBindingStatusRepository$updatePaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.data.c cVar = this.d;
                    if (evu0.J(cVar.d)) {
                        paymentsBindingStatusRepository$updatePaymentMethods$1.label = 1;
                        Object q = ((com.yandex.go.payments.paymentlist.data.c) this.b).q(paymentsBindingStatusRepository$updatePaymentMethods$1);
                        if (q != coroutineSingletons) {
                            return q;
                        }
                    } else {
                        paymentsBindingStatusRepository$updatePaymentMethods$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
        }
        paymentsBindingStatusRepository$updatePaymentMethods$1 = new PaymentsBindingStatusRepository$updatePaymentMethods$1(this, continuationImpl);
        Object obj2 = paymentsBindingStatusRepository$updatePaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusRepository$updatePaymentMethods$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
