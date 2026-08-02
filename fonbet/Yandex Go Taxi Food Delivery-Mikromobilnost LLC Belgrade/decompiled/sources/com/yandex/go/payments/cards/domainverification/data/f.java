package com.yandex.go.payments.cards.domainverification.data;

import com.yandex.go.payments.cards.domain.exception.InvalidResponseException;
import defpackage.bvu0;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.k8a0;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.on2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final i3y a;

    public f(on2 on2Var) {
        this.a = kotlin.a.a(new lr40(on2Var, 6));
    }

    public static k8a0 d(fmt fmtVar) {
        Object obj = fmtVar.a;
        oeu oeuVar = fmtVar.e;
        PaymentMethodVerificationResponse paymentMethodVerificationResponse = (PaymentMethodVerificationResponse) obj;
        String str = paymentMethodVerificationResponse.b;
        PaymentMethodVerificationResult paymentMethodVerificationResult = paymentMethodVerificationResponse.a;
        if (evu0.J(str)) {
            throw new InvalidResponseException("Verification response does not contain a payment method id");
        }
        if (evu0.J(paymentMethodVerificationResult.a)) {
            throw new InvalidResponseException("Verification response does not contain a verification id");
        }
        if (evu0.J(paymentMethodVerificationResult.b)) {
            throw new InvalidResponseException("Verification response does not contain a method");
        }
        PaymentMethodVerificationResponse paymentMethodVerificationResponse2 = (PaymentMethodVerificationResponse) fmtVar.a;
        String a = oeuVar.a("X-Yataxi-Polling-Interval-Ms");
        Long l = null;
        Long m = a != null ? bvu0.m(10, a) : null;
        if (m == null || m.longValue() <= 0) {
            m = null;
        }
        String a2 = oeuVar.a("X-Yataxi-Polling-Deadline-Ms");
        Long m2 = a2 != null ? bvu0.m(10, a2) : null;
        if (m2 != null && m2.longValue() > 0) {
            l = m2;
        }
        return new k8a0(paymentMethodVerificationResponse2, m, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PaymentMethodVerificationRepository$createIntent$1 paymentMethodVerificationRepository$createIntent$1;
        int i;
        PaymentMethodVerificationIntentResponse paymentMethodVerificationIntentResponse;
        if (continuationImpl instanceof PaymentMethodVerificationRepository$createIntent$1) {
            paymentMethodVerificationRepository$createIntent$1 = (PaymentMethodVerificationRepository$createIntent$1) continuationImpl;
            int i2 = paymentMethodVerificationRepository$createIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVerificationRepository$createIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodVerificationRepository$createIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVerificationRepository$createIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<PaymentMethodVerificationIntentResponse> b = ((PaymentMethodVerificationApi) this.a.getValue()).b(new PaymentMethodVerificationIntentRequest(str, str2, str3));
                    paymentMethodVerificationRepository$createIntent$1.L$0 = null;
                    paymentMethodVerificationRepository$createIntent$1.L$1 = null;
                    paymentMethodVerificationRepository$createIntent$1.L$2 = null;
                    paymentMethodVerificationRepository$createIntent$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.d(b, paymentMethodVerificationRepository$createIntent$1);
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
                paymentMethodVerificationIntentResponse = (PaymentMethodVerificationIntentResponse) obj;
                if (evu0.J(paymentMethodVerificationIntentResponse.a)) {
                    return paymentMethodVerificationIntentResponse.a;
                }
                throw new InvalidResponseException("Verification intent response does not contain an id");
            }
        }
        paymentMethodVerificationRepository$createIntent$1 = new PaymentMethodVerificationRepository$createIntent$1(this, continuationImpl);
        Object obj2 = paymentMethodVerificationRepository$createIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVerificationRepository$createIntent$1.label;
        if (i != 0) {
        }
        paymentMethodVerificationIntentResponse = (PaymentMethodVerificationIntentResponse) obj2;
        if (evu0.J(paymentMethodVerificationIntentResponse.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        PaymentMethodVerificationRepository$startBoundVerification$1 paymentMethodVerificationRepository$startBoundVerification$1;
        int i;
        PaymentMethodVerificationAntifraudPayload paymentMethodVerificationAntifraudPayload;
        if (continuationImpl instanceof PaymentMethodVerificationRepository$startBoundVerification$1) {
            paymentMethodVerificationRepository$startBoundVerification$1 = (PaymentMethodVerificationRepository$startBoundVerification$1) continuationImpl;
            int i2 = paymentMethodVerificationRepository$startBoundVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVerificationRepository$startBoundVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodVerificationRepository$startBoundVerification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVerificationRepository$startBoundVerification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentMethodVerificationApi paymentMethodVerificationApi = (PaymentMethodVerificationApi) this.a.getValue();
                    BoundPaymentMethodRequest boundPaymentMethodRequest = new BoundPaymentMethodRequest(str2, 1);
                    if (str5 != null) {
                        String str7 = !evu0.J(str5) ? str5 : null;
                        if (str7 != null) {
                            paymentMethodVerificationAntifraudPayload = new PaymentMethodVerificationAntifraudPayload(str7);
                            cmt<PaymentMethodVerificationResponse> c = paymentMethodVerificationApi.c(str6, new StartPaymentMethodVerificationRequest(str, boundPaymentMethodRequest, str3, str4, paymentMethodVerificationAntifraudPayload));
                            paymentMethodVerificationRepository$startBoundVerification$1.L$0 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.L$1 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.L$2 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.L$3 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.L$4 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.L$5 = null;
                            paymentMethodVerificationRepository$startBoundVerification$1.label = 1;
                            obj = ru.yandex.taxi.network.api.a.b(c, null, paymentMethodVerificationRepository$startBoundVerification$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    paymentMethodVerificationAntifraudPayload = null;
                    cmt<PaymentMethodVerificationResponse> c2 = paymentMethodVerificationApi.c(str6, new StartPaymentMethodVerificationRequest(str, boundPaymentMethodRequest, str3, str4, paymentMethodVerificationAntifraudPayload));
                    paymentMethodVerificationRepository$startBoundVerification$1.L$0 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.L$1 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.L$2 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.L$3 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.L$4 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.L$5 = null;
                    paymentMethodVerificationRepository$startBoundVerification$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(c2, null, paymentMethodVerificationRepository$startBoundVerification$1);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return d((fmt) obj);
            }
        }
        paymentMethodVerificationRepository$startBoundVerification$1 = new PaymentMethodVerificationRepository$startBoundVerification$1(this, continuationImpl);
        Object obj2 = paymentMethodVerificationRepository$startBoundVerification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVerificationRepository$startBoundVerification$1.label;
        if (i != 0) {
        }
        return d((fmt) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PaymentMethodVerificationRepository$status$1 paymentMethodVerificationRepository$status$1;
        int i;
        if (continuationImpl instanceof PaymentMethodVerificationRepository$status$1) {
            paymentMethodVerificationRepository$status$1 = (PaymentMethodVerificationRepository$status$1) continuationImpl;
            int i2 = paymentMethodVerificationRepository$status$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVerificationRepository$status$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodVerificationRepository$status$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVerificationRepository$status$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<PaymentMethodVerificationResponse> a = ((PaymentMethodVerificationApi) this.a.getValue()).a(new PaymentMethodVerificationStatusRequest(str));
                    paymentMethodVerificationRepository$status$1.L$0 = null;
                    paymentMethodVerificationRepository$status$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, null, paymentMethodVerificationRepository$status$1);
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
                return d((fmt) obj);
            }
        }
        paymentMethodVerificationRepository$status$1 = new PaymentMethodVerificationRepository$status$1(this, continuationImpl);
        Object obj2 = paymentMethodVerificationRepository$status$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVerificationRepository$status$1.label;
        if (i != 0) {
        }
        return d((fmt) obj2);
    }
}
