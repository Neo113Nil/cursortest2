package defpackage;

import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class bz51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbWalletTopUpRuleExperiment.TopUpRule.values().length];
        try {
            iArr[YbWalletTopUpRuleExperiment.TopUpRule.FIT_TO_BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbWalletTopUpRuleExperiment.TopUpRule.UP_TO_LAST_DIGIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbWalletTopUpRuleExperiment.TopUpRule.EXACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YbWalletTopUpRuleExperiment.TopUpRule.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
