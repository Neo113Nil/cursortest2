package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;

/* loaded from: classes2.dex */
public abstract class ox21 {
    public static final iho a(PaymentMethod paymentMethod, boolean z) {
        if (paymentMethod instanceof PaymentMethod.Card) {
            sv90 sv90Var = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.EXISTING_CARD;
            sv90Var.getClass();
            return sv90.t0(paymentOptionNameForAnalytics, z);
        }
        if (paymentMethod instanceof PaymentMethod.SbpToken) {
            sv90 sv90Var2 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics2 = PaymentOptionNameForAnalytics.SBP_TOKEN;
            sv90Var2.getClass();
            return sv90.t0(paymentOptionNameForAnalytics2, z);
        }
        if (paymentMethod instanceof PaymentMethod.YBMethod) {
            sv90 sv90Var3 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics3 = PaymentOptionNameForAnalytics.YB;
            sv90Var3.getClass();
            return sv90.t0(paymentOptionNameForAnalytics3, z);
        }
        if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
            sv90 sv90Var4 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics4 = PaymentOptionNameForAnalytics.CASH;
            sv90Var4.getClass();
            return sv90.t0(paymentOptionNameForAnalytics4, z);
        }
        if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            sv90 sv90Var5 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics5 = PaymentOptionNameForAnalytics.GOOGLE_PAY;
            sv90Var5.getClass();
            return sv90.t0(paymentOptionNameForAnalytics5, z);
        }
        if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            sv90 sv90Var6 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics6 = PaymentOptionNameForAnalytics.NEW_CARD;
            sv90Var6.getClass();
            return sv90.t0(paymentOptionNameForAnalytics6, z);
        }
        if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE)) {
            sv90 sv90Var7 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics7 = PaymentOptionNameForAnalytics.SBP;
            sv90Var7.getClass();
            return sv90.t0(paymentOptionNameForAnalytics7, z);
        }
        if (paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
            sv90 sv90Var8 = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics8 = PaymentOptionNameForAnalytics.NEW_SBP_TOKEN;
            sv90Var8.getClass();
            return sv90.t0(paymentOptionNameForAnalytics8, z);
        }
        if (paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE)) {
            ny61.r("TinkoffCredit not supported");
            return null;
        }
        if (paymentMethod.equals(PaymentMethod.Split.INSTANCE)) {
            ny61.r("split not supported");
            return null;
        }
        if (paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
            ny61.r("ChallengePollingMethod not supported");
            return null;
        }
        w511.b();
        return null;
    }

    public static final asw b(vv90 vv90Var) {
        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
        if (aswVar != null) {
            return aswVar;
        }
        kbs.g("Incorrect PaymentApi provided");
        return null;
    }
}
