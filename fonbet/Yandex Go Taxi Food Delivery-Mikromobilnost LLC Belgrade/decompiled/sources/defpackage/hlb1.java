package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.testpayment.internal.domain.entities.TestPaymentStatusEntity$Failed$ErrorType;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentButton;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentResponseData;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusFailedData;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusInProgressData;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusResponseData;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusSuccessData;
import com.yx360.design.BrandTheme;

/* loaded from: classes3.dex */
public abstract class hlb1 {
    public static au2 a;

    public static final void a(wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1015950324);
        if ((i & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            boolean d = elb1.d(btsVar);
            btsVar.e0(-359853986);
            boolean z = ((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getBoolean(mog0.messagingIsTelemessenger);
            btsVar.t(false);
            elb1.a(d, z ? BrandTheme.Telemost : BrandTheme.Messenger, wlsVar, btsVar, 384);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cp1(i, 6, wlsVar);
        }
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronDownL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(4.0f, 9.0f);
        uq90Var.i(1.4f, -1.4f);
        uq90Var.i(6.6f, 6.6f);
        uq90Var.i(6.6f, -6.6f);
        uq90Var.h(20.0f, 9.0f);
        uq90Var.i(-8.0f, 8.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final dxv c(TestPaymentResponseData testPaymentResponseData) {
        ThemedImageUrlEntity c = qxy0.c(testPaymentResponseData.getMemberImage(), null);
        String title = testPaymentResponseData.getTitle();
        String subtitle = testPaymentResponseData.getSubtitle();
        String requestId = testPaymentResponseData.getRequestId();
        ThemedImageUrlEntity c2 = qxy0.c(testPaymentResponseData.getTimeoutData().getMemberImage(), null);
        String title2 = testPaymentResponseData.getTimeoutData().getTitle();
        String subtitle2 = testPaymentResponseData.getTimeoutData().getSubtitle();
        ygy0 d = d(testPaymentResponseData.getTimeoutData().getPrimaryButton());
        TestPaymentButton secondaryButton = testPaymentResponseData.getTimeoutData().getSecondaryButton();
        return new dxv(c, title, subtitle, requestId, new nhy0(c2, title2, subtitle2, d, secondaryButton != null ? d(secondaryButton) : null));
    }

    public static final ygy0 d(TestPaymentButton testPaymentButton) {
        xgy0 xgy0Var;
        int i = chy0.b[testPaymentButton.getType().ordinal()];
        if (i == 1) {
            xgy0Var = vgy0.a;
        } else if (i == 2) {
            xgy0Var = wgy0.a;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            String action = testPaymentButton.getAction();
            xgy0Var = action != null ? new ugy0(action) : null;
        }
        if (xgy0Var != null) {
            return new ygy0(testPaymentButton.getTitle(), xgy0Var);
        }
        w511.f(g8e.o("Failed to parse button model for test payment api: type == ", testPaymentButton.getType().name()));
        return null;
    }

    public static final lhy0 e(TestPaymentStatusResponseData testPaymentStatusResponseData) {
        lhy0 jhy0Var;
        lhy0 lhy0Var;
        int i = chy0.a[testPaymentStatusResponseData.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                TestPaymentStatusInProgressData inProgressData = testPaymentStatusResponseData.getInProgressData();
                if (inProgressData != null) {
                    jhy0Var = new ihy0(inProgressData.getTitle(), inProgressData.getSubtitle(), qxy0.c(inProgressData.getMemberImage(), null));
                    lhy0Var = jhy0Var;
                }
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                TestPaymentStatusFailedData failedData = testPaymentStatusResponseData.getFailedData();
                if (failedData != null) {
                    ThemedImageUrlEntity c = qxy0.c(failedData.getMemberImage(), null);
                    String title = failedData.getTitle();
                    String subtitle = failedData.getSubtitle();
                    ygy0 d = d(failedData.getPrimaryButton());
                    TestPaymentButton secondaryButton = failedData.getSecondaryButton();
                    lhy0Var = new hhy0(c, title, subtitle, d, secondaryButton != null ? d(secondaryButton) : null, TestPaymentStatusEntity$Failed$ErrorType.FAIL_DATA);
                }
            }
            lhy0Var = null;
        } else {
            TestPaymentStatusSuccessData successData = testPaymentStatusResponseData.getSuccessData();
            if (successData != null) {
                jhy0Var = new jhy0(qxy0.c(successData.getMemberImage(), null), successData.getTitle(), successData.getSubtitle(), d(successData.getPrimaryButton()));
                lhy0Var = jhy0Var;
            }
            lhy0Var = null;
        }
        if (lhy0Var != null) {
            return lhy0Var;
        }
        w511.f(g8e.o("Failed to parse response model for test payment api: status == ", testPaymentStatusResponseData.getStatus().name()));
        return null;
    }
}
