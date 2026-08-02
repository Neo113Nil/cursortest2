package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;

/* loaded from: classes2.dex */
public final class coq0 {
    public final rwo a;

    public coq0(rwo rwoVar) {
        this.a = rwoVar;
    }

    public final void a(PaymentMethod paymentMethod, boolean z) {
        iho t0;
        boolean z2 = paymentMethod instanceof PaymentMethod.Card;
        rwo rwoVar = this.a;
        if (z2) {
            sv90 sv90Var = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.EXISTING_CARD;
            sv90Var.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics, z);
        } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
            sv90 sv90Var2 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics2 = PaymentOptionNameForAnalytics.SBP_TOKEN;
            sv90Var2.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics2, z);
        } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
            sv90 sv90Var3 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics3 = PaymentOptionNameForAnalytics.YB;
            sv90Var3.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics3, z);
        } else if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
            sv90 sv90Var4 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics4 = PaymentOptionNameForAnalytics.CASH;
            sv90Var4.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics4, z);
        } else if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            sv90 sv90Var5 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics5 = PaymentOptionNameForAnalytics.GOOGLE_PAY;
            sv90Var5.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics5, z);
        } else if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            sv90 sv90Var6 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics6 = PaymentOptionNameForAnalytics.NEW_CARD;
            sv90Var6.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics6, z);
        } else if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE)) {
            sv90 sv90Var7 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics7 = PaymentOptionNameForAnalytics.SBP;
            sv90Var7.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics7, z);
        } else {
            if (!paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
                if (paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE)) {
                    ny61.r("TinkoffCredit not supported");
                    return;
                }
                if (paymentMethod.equals(PaymentMethod.Split.INSTANCE)) {
                    qv90.a.getClass();
                    ((y22) rwoVar).a(sv90.s0("Split not supported", null, null, null, null));
                    ny61.r("Split not supported");
                    return;
                }
                if (paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                    ny61.r("ChallengePollingMethod not supported");
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            sv90 sv90Var8 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics8 = PaymentOptionNameForAnalytics.NEW_SBP_TOKEN;
            sv90Var8.getClass();
            t0 = sv90.t0(paymentOptionNameForAnalytics8, z);
        }
        ((y22) rwoVar).a(t0);
    }
}
