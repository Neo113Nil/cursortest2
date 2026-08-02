package com.yandex.go.payments.paymentlist.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import defpackage.z151;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/YbWalletTopUpRuleExperiment;", "Lw96;", "Companion", "TopUpRule", "com/yandex/go/payments/paymentlist/experiments/x", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbWalletTopUpRuleExperiment extends w96 {
    public static final x Companion = new x();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(20))};
    public static final YbWalletTopUpRuleExperiment e = new YbWalletTopUpRuleExperiment(0);
    public final boolean b;
    public final TopUpRule c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/YbWalletTopUpRuleExperiment$TopUpRule;", "", "Companion", "com/yandex/go/payments/paymentlist/experiments/y", "UP_TO_LAST_DIGIT", "EXACT", "FIT_TO_BALANCE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TopUpRule {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TopUpRule[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final y Companion;
        public static final TopUpRule EXACT;
        public static final TopUpRule FIT_TO_BALANCE;
        public static final TopUpRule UNKNOWN;
        public static final TopUpRule UP_TO_LAST_DIGIT;

        static {
            TopUpRule topUpRule = new TopUpRule("UP_TO_LAST_DIGIT", 0);
            UP_TO_LAST_DIGIT = topUpRule;
            TopUpRule topUpRule2 = new TopUpRule("EXACT", 1);
            EXACT = topUpRule2;
            TopUpRule topUpRule3 = new TopUpRule("FIT_TO_BALANCE", 2);
            FIT_TO_BALANCE = topUpRule3;
            TopUpRule topUpRule4 = new TopUpRule("UNKNOWN", 3);
            UNKNOWN = topUpRule4;
            TopUpRule[] topUpRuleArr = {topUpRule, topUpRule2, topUpRule3, topUpRule4};
            $VALUES = topUpRuleArr;
            $ENTRIES = kotlin.enums.a.a(topUpRuleArr);
            Companion = new y();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(21));
        }

        public static TopUpRule valueOf(String str) {
            return (TopUpRule) Enum.valueOf(TopUpRule.class, str);
        }

        public static TopUpRule[] values() {
            return (TopUpRule[]) $VALUES.clone();
        }
    }

    public /* synthetic */ YbWalletTopUpRuleExperiment(int i, boolean z, TopUpRule topUpRule) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = TopUpRule.UNKNOWN;
        } else {
            this.c = topUpRule;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public YbWalletTopUpRuleExperiment() {
        this(0);
    }

    public YbWalletTopUpRuleExperiment(int i) {
        TopUpRule topUpRule = TopUpRule.UNKNOWN;
        this.b = false;
        this.c = topUpRule;
    }
}
