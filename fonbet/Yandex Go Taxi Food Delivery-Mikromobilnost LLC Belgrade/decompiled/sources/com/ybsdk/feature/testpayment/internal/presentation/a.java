package com.ybsdk.feature.testpayment.internal.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentCloseStatus;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.testpayment.internal.domain.b;
import defpackage.ahy0;
import defpackage.bax0;
import defpackage.ds31;
import defpackage.ehy0;
import defpackage.ghy0;
import defpackage.hhy0;
import defpackage.ihy0;
import defpackage.jhy0;
import defpackage.kao;
import defpackage.khy0;
import defpackage.lhy0;
import defpackage.ny61;
import defpackage.orp0;
import defpackage.phy0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.srp0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uc5;
import defpackage.ugy0;
import defpackage.vgy0;
import defpackage.vhy0;
import defpackage.w511;
import defpackage.wgy0;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.xgy0;
import defpackage.y6y0;
import defpackage.ygy0;
import defpackage.z94;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final TestPaymentArguments B;
    public final b C;
    public final ehy0 D;
    public final tfl0 E;
    public final AppAnalyticsReporter F;
    public pzt0 G;
    public pzt0 H;

    public a(TestPaymentArguments testPaymentArguments, b bVar, ehy0 ehy0Var, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, vhy0 vhy0Var) {
        super(new y6y0(18), vhy0Var);
        this.B = testPaymentArguments;
        this.C = bVar;
        this.D = ehy0Var;
        this.E = tfl0Var;
        this.F = appAnalyticsReporter;
        appAnalyticsReporter.e.a.a("auto_topup.test_payment.shown", null);
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, String str, ContinuationImpl continuationImpl) {
        TestPaymentViewModel$getTestPaymentStatus$1 testPaymentViewModel$getTestPaymentStatus$1;
        int i;
        a aVar2;
        aVar.getClass();
        if (continuationImpl instanceof TestPaymentViewModel$getTestPaymentStatus$1) {
            testPaymentViewModel$getTestPaymentStatus$1 = (TestPaymentViewModel$getTestPaymentStatus$1) continuationImpl;
            int i2 = testPaymentViewModel$getTestPaymentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                testPaymentViewModel$getTestPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = testPaymentViewModel$getTestPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = testPaymentViewModel$getTestPaymentStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = aVar.H;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    b bVar = aVar.C;
                    TestPaymentPayload payload = aVar.B.getPayload();
                    hhy0 hhy0Var = ((ghy0) aVar.X()).c;
                    testPaymentViewModel$getTestPaymentStatus$1.L$0 = aVar;
                    testPaymentViewModel$getTestPaymentStatus$1.label = 1;
                    obj = bVar.c(payload, str, hhy0Var, testPaymentViewModel$getTestPaymentStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) testPaymentViewModel$getTestPaymentStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar2.H = c.a((tpr) obj, ds31.a(aVar), new bax0(17, aVar));
                return zy11.a;
            }
        }
        testPaymentViewModel$getTestPaymentStatus$1 = new TestPaymentViewModel$getTestPaymentStatus$1(aVar, continuationImpl);
        Object obj2 = testPaymentViewModel$getTestPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = testPaymentViewModel$getTestPaymentStatus$1.label;
        if (i != 0) {
        }
        aVar2.H = c.a((tpr) obj2, ds31.a(aVar), new bax0(17, aVar));
        return zy11.a;
    }

    public final void c0(ygy0 ygy0Var) {
        if (ygy0Var == null) {
            return;
        }
        xgy0 xgy0Var = ygy0Var.b;
        if (xgy0Var instanceof ugy0) {
            ((ahy0) this.D).a.c(((ugy0) xgy0Var).a);
        } else if (xgy0Var.equals(vgy0.a)) {
            this.E.e();
        } else if (xgy0Var.equals(wgy0.a)) {
            d0();
        } else {
            w511.b();
        }
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new ghy0(null, null, null)));
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new TestPaymentViewModel$initiateTestPayment$2(this, null), 3);
    }

    public final void e0() {
        AutotopupEvents$AutoTopupTestPaymentCloseStatus autotopupEvents$AutoTopupTestPaymentCloseStatus;
        lhy0 lhy0Var = ((ghy0) X()).b;
        if (lhy0Var == null) {
            if (((ghy0) X()).a == null) {
                x4c.h("Wrong status state.paymentStatusEntity for reportOnClickCloseButton", new srp0[]{orp0.d}, null, 12);
                this.E.e();
            }
            autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.FAILURE;
        } else if (lhy0Var instanceof ihy0) {
            autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.IN_PROGRESS;
        } else if (lhy0Var instanceof jhy0) {
            autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.SUCCESS;
        } else if (lhy0Var instanceof khy0) {
            autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.FAILURE;
        } else {
            if (!(lhy0Var instanceof hhy0)) {
                w511.b();
                return;
            }
            int i = phy0.a[((hhy0) lhy0Var).f.ordinal()];
            if (i == 1) {
                autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.FAILURE;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                autotopupEvents$AutoTopupTestPaymentCloseStatus = AutotopupEvents$AutoTopupTestPaymentCloseStatus.TIMEOUT;
            }
        }
        z94 z94Var = this.F.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ACSPConstants.STATUS, autotopupEvents$AutoTopupTestPaymentCloseStatus.getOriginalValue());
        z94Var.a.a("auto_topup.test_payment.close", linkedHashMap);
        this.E.e();
    }

    public final void f0() {
        j0(AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.PRIMARY);
        lhy0 lhy0Var = ((ghy0) X()).b;
        c0(lhy0Var != null ? lhy0Var.b() : null);
    }

    public final void g0() {
        j0(AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.SECONDARY);
        lhy0 lhy0Var = ((ghy0) X()).b;
        c0(lhy0Var != null ? lhy0Var.a() : null);
    }

    public final void h0() {
        d0();
    }

    public final void i0() {
        String supportUrl;
        kao kaoVar = ((ghy0) X()).a;
        Throwable th = kaoVar != null ? kaoVar.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ahy0 ahy0Var = (ahy0) this.D;
        if (ahy0Var.a.c(supportUrl).a instanceof x0h) {
            ahy0Var.b.h(com.ybsdk.feature.webview.api.a.b(ahy0Var.c, supportUrl, null, null, 6));
        }
    }

    public final void j0(AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType) {
        AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus;
        ygy0 b;
        AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType;
        orp0 orp0Var = orp0.d;
        lhy0 lhy0Var = ((ghy0) X()).b;
        if (lhy0Var == null) {
            x4c.h("Wrong state state.paymentStatusEntity for reportTestPaymentPollingResultButtonClick", new srp0[]{orp0Var}, null, 12);
            return;
        }
        if (lhy0Var instanceof jhy0) {
            autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus.SUCCESS;
        } else if (lhy0Var instanceof hhy0) {
            int i = phy0.a[((hhy0) lhy0Var).f.ordinal()];
            if (i == 1) {
                autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus.FAILURE;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus.TIMEOUT;
            }
        } else {
            if (!(lhy0Var instanceof khy0) && !(lhy0Var instanceof ihy0)) {
                w511.b();
                return;
            }
            autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus = null;
        }
        int i2 = phy0.b[autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.ordinal()];
        if (i2 == 1) {
            b = lhy0Var.b();
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            b = lhy0Var.a();
        }
        if (b != null) {
            xgy0 xgy0Var = b.b;
            if (autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus != null) {
                if (xgy0Var.equals(vgy0.a)) {
                    autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType.CLOSE;
                } else if (xgy0Var.equals(wgy0.a)) {
                    autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType.RETRY;
                } else {
                    if (!(xgy0Var instanceof ugy0)) {
                        w511.b();
                        return;
                    }
                    autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType = AutotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType.CUSTOM_ACTION;
                }
                z94 z94Var = this.F.e;
                ugy0 ugy0Var = xgy0Var instanceof ugy0 ? (ugy0) xgy0Var : null;
                String str = ugy0Var != null ? ugy0Var.a : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                linkedHashMap.put(ACSPConstants.STATUS, autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickStatus.getOriginalValue());
                if (str != null) {
                    linkedHashMap.put("action", str);
                }
                linkedHashMap.put("action_type", autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickActionType.getOriginalValue());
                linkedHashMap.put("button_type", autotopupEvents$AutoTopupTestPaymentPaymentResultButtonClickButtonType.getOriginalValue());
                z94Var.a.a("auto_topup.test_payment.payment_result.button.click", linkedHashMap);
                return;
            }
        }
        x4c.h("Status without buttons (wrong type for reportTestPaymentPollingResultButtonClick)", new srp0[]{orp0Var}, null, 12);
    }
}
