package com.ybsdk.feature.testpayment.internal.domain;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentInitStatus;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.testpayment.api.TestPaymentFlow;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentPayload;
import com.ybsdk.utils.poller.c;
import defpackage.czd0;
import defpackage.d6v;
import defpackage.hhy0;
import defpackage.izd0;
import defpackage.l7;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.x4c;
import defpackage.z94;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.testpayment.internal.data.b a;
    public final com.ybsdk.feature.testpayment.internal.data.a b;
    public final com.ybsdk.utils.poller.b c;
    public final AppAnalyticsReporter d;

    public b(com.ybsdk.feature.testpayment.internal.data.b bVar, com.ybsdk.feature.testpayment.internal.data.a aVar, com.ybsdk.utils.poller.b bVar2, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = bVar;
        this.b = aVar;
        this.c = bVar2;
        this.d = appAnalyticsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, TestPaymentPayload testPaymentPayload, String str, int i, ContinuationImpl continuationImpl) {
        TestPaymentInteractor$getTestPaymentStatus$5 testPaymentInteractor$getTestPaymentStatus$5;
        int i2;
        bVar.getClass();
        if (continuationImpl instanceof TestPaymentInteractor$getTestPaymentStatus$5) {
            testPaymentInteractor$getTestPaymentStatus$5 = (TestPaymentInteractor$getTestPaymentStatus$5) continuationImpl;
            int i3 = testPaymentInteractor$getTestPaymentStatus$5.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                testPaymentInteractor$getTestPaymentStatus$5.label = i3 - Integer.MIN_VALUE;
                Object obj = testPaymentInteractor$getTestPaymentStatus$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = testPaymentInteractor$getTestPaymentStatus$5.label;
                if (i2 == 0) {
                    if (i2 == 1 || i2 == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (testPaymentPayload instanceof TestPaymentPayload.AutoTopup) {
                    com.ybsdk.feature.testpayment.internal.data.b bVar2 = bVar.a;
                    testPaymentInteractor$getTestPaymentStatus$5.label = 1;
                    Object a = bVar2.a(i, str, testPaymentInteractor$getTestPaymentStatus$5);
                    if (a != coroutineSingletons) {
                        return a;
                    }
                } else {
                    if (!(testPaymentPayload instanceof TestPaymentPayload.AutoPayment)) {
                        w511.b();
                        return null;
                    }
                    com.ybsdk.feature.testpayment.internal.data.a aVar = bVar.b;
                    TestPaymentFlow paymentFlow = ((TestPaymentPayload.AutoPayment) testPaymentPayload).getPaymentFlow();
                    testPaymentInteractor$getTestPaymentStatus$5.label = 2;
                    Object a2 = aVar.a(str, paymentFlow, i, testPaymentInteractor$getTestPaymentStatus$5);
                    if (a2 != coroutineSingletons) {
                        return a2;
                    }
                }
                return coroutineSingletons;
            }
        }
        testPaymentInteractor$getTestPaymentStatus$5 = new TestPaymentInteractor$getTestPaymentStatus$5(bVar, continuationImpl);
        Object obj2 = testPaymentInteractor$getTestPaymentStatus$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = testPaymentInteractor$getTestPaymentStatus$5.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, TestPaymentPayload testPaymentPayload, String str, ContinuationImpl continuationImpl) {
        TestPaymentInteractor$initiateTestPayment$5 testPaymentInteractor$initiateTestPayment$5;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof TestPaymentInteractor$initiateTestPayment$5) {
            testPaymentInteractor$initiateTestPayment$5 = (TestPaymentInteractor$initiateTestPayment$5) continuationImpl;
            int i2 = testPaymentInteractor$initiateTestPayment$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                testPaymentInteractor$initiateTestPayment$5.label = i2 - Integer.MIN_VALUE;
                TestPaymentInteractor$initiateTestPayment$5 testPaymentInteractor$initiateTestPayment$52 = testPaymentInteractor$initiateTestPayment$5;
                Object obj = testPaymentInteractor$initiateTestPayment$52.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = testPaymentInteractor$initiateTestPayment$52.label;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (testPaymentPayload instanceof TestPaymentPayload.AutoTopup) {
                    com.ybsdk.feature.testpayment.internal.data.b bVar2 = bVar.a;
                    String agreementId = ((TestPaymentPayload.AutoTopup) testPaymentPayload).getAgreementId();
                    testPaymentInteractor$initiateTestPayment$52.label = 1;
                    Object b = bVar2.b(str, agreementId, testPaymentInteractor$initiateTestPayment$52);
                    if (b != coroutineSingletons) {
                        return b;
                    }
                } else {
                    if (!(testPaymentPayload instanceof TestPaymentPayload.AutoPayment)) {
                        w511.b();
                        return null;
                    }
                    com.ybsdk.feature.testpayment.internal.data.a aVar = bVar.b;
                    TestPaymentPayload.AutoPayment autoPayment = (TestPaymentPayload.AutoPayment) testPaymentPayload;
                    String agreementId2 = autoPayment.getAgreementId();
                    String memberId = autoPayment.getMemberId();
                    TestPaymentFlow paymentFlow = autoPayment.getPaymentFlow();
                    testPaymentInteractor$initiateTestPayment$52.label = 2;
                    Object b2 = aVar.b(str, agreementId2, memberId, paymentFlow, testPaymentInteractor$initiateTestPayment$52);
                    if (b2 != coroutineSingletons) {
                        return b2;
                    }
                }
                return coroutineSingletons;
            }
        }
        testPaymentInteractor$initiateTestPayment$5 = new TestPaymentInteractor$initiateTestPayment$5(bVar, continuationImpl);
        TestPaymentInteractor$initiateTestPayment$5 testPaymentInteractor$initiateTestPayment$522 = testPaymentInteractor$initiateTestPayment$5;
        Object obj2 = testPaymentInteractor$initiateTestPayment$522.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = testPaymentInteractor$initiateTestPayment$522.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TestPaymentPayload testPaymentPayload, String str, hhy0 hhy0Var, ContinuationImpl continuationImpl) {
        TestPaymentInteractor$getTestPaymentStatus$1 testPaymentInteractor$getTestPaymentStatus$1;
        int i;
        q1e0 q1e0Var;
        if (continuationImpl instanceof TestPaymentInteractor$getTestPaymentStatus$1) {
            testPaymentInteractor$getTestPaymentStatus$1 = (TestPaymentInteractor$getTestPaymentStatus$1) continuationImpl;
            int i2 = testPaymentInteractor$getTestPaymentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                testPaymentInteractor$getTestPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = testPaymentInteractor$getTestPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = testPaymentInteractor$getTestPaymentStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (testPaymentPayload instanceof TestPaymentPayload.AutoTopup) {
                        q1e0Var = izd0.b;
                    } else {
                        if (!(testPaymentPayload instanceof TestPaymentPayload.AutoPayment)) {
                            w511.b();
                            return null;
                        }
                        q1e0Var = czd0.b;
                    }
                    c c = this.c.c(q1e0Var, new TestPaymentInteractor$getTestPaymentStatus$2(2, null), new TestPaymentInteractor$getTestPaymentStatus$3(this, testPaymentPayload, str, null));
                    testPaymentInteractor$getTestPaymentStatus$1.L$0 = hhy0Var;
                    testPaymentInteractor$getTestPaymentStatus$1.label = 1;
                    obj = c.d(null, testPaymentInteractor$getTestPaymentStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hhy0Var = (hhy0) testPaymentInteractor$getTestPaymentStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                return new l7(22, (tpr) obj, this, hhy0Var);
            }
        }
        testPaymentInteractor$getTestPaymentStatus$1 = new TestPaymentInteractor$getTestPaymentStatus$1(this, continuationImpl);
        Object obj2 = testPaymentInteractor$getTestPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = testPaymentInteractor$getTestPaymentStatus$1.label;
        if (i != 0) {
        }
        return new l7(22, (tpr) obj2, this, hhy0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TestPaymentPayload testPaymentPayload, d6v d6vVar, ContinuationImpl continuationImpl) {
        TestPaymentInteractor$initiateTestPayment$1 testPaymentInteractor$initiateTestPayment$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof TestPaymentInteractor$initiateTestPayment$1) {
            testPaymentInteractor$initiateTestPayment$1 = (TestPaymentInteractor$initiateTestPayment$1) continuationImpl;
            int i2 = testPaymentInteractor$initiateTestPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                testPaymentInteractor$initiateTestPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = testPaymentInteractor$initiateTestPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = testPaymentInteractor$initiateTestPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TestPaymentInteractor$initiateTestPayment$2 testPaymentInteractor$initiateTestPayment$2 = new TestPaymentInteractor$initiateTestPayment$2(this, testPaymentPayload, null);
                    testPaymentInteractor$initiateTestPayment$1.label = 1;
                    a = d.a(d6vVar, testPaymentInteractor$initiateTestPayment$2, testPaymentInteractor$initiateTestPayment$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    e(AutotopupEvents$AutoTopupTestPaymentPaymentInitStatus.SUCCESS, null);
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    e(AutotopupEvents$AutoTopupTestPaymentPaymentInitStatus.FAILURE, a2.getMessage());
                    x4c.g("Failed to initiate auto topup test payment", a2, null, Collections.singletonList(lrp0.b), 4);
                }
                return a;
            }
        }
        testPaymentInteractor$initiateTestPayment$1 = new TestPaymentInteractor$initiateTestPayment$1(this, continuationImpl);
        Object obj2 = testPaymentInteractor$initiateTestPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = testPaymentInteractor$initiateTestPayment$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return a;
    }

    public final void e(AutotopupEvents$AutoTopupTestPaymentPaymentInitStatus autotopupEvents$AutoTopupTestPaymentPaymentInitStatus, String str) {
        z94 z94Var = this.d.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(ACSPConstants.STATUS, autotopupEvents$AutoTopupTestPaymentPaymentInitStatus.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        z94Var.a.a("auto_topup.test_payment.payment_init", linkedHashMap);
    }

    public final void f(AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus autotopupEvents$AutoTopupTestPaymentPaymentResultStatus, String str) {
        z94 z94Var = this.d.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(ACSPConstants.STATUS, autotopupEvents$AutoTopupTestPaymentPaymentResultStatus.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        z94Var.a.a("auto_topup.test_payment.payment_result", linkedHashMap);
    }
}
