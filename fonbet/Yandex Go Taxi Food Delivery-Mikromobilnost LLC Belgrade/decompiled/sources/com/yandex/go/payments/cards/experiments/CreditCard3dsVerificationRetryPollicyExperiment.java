package com.yandex.go.payments.cards.experiments;

import defpackage.cue;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/cards/experiments/CreditCard3dsVerificationRetryPollicyExperiment;", "Lw96;", "Companion", "SuccessVerificationPolicy", "com/yandex/go/payments/cards/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreditCard3dsVerificationRetryPollicyExperiment extends w96 {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(4))};
    public static final CreditCard3dsVerificationRetryPollicyExperiment e = new CreditCard3dsVerificationRetryPollicyExperiment(0);
    public final boolean b;
    public final SuccessVerificationPolicy c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/cards/experiments/CreditCard3dsVerificationRetryPollicyExperiment$SuccessVerificationPolicy;", "", "Companion", "com/yandex/go/payments/cards/experiments/c", "SUCCESS_REDIRECT_URL", "POLLING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuccessVerificationPolicy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SuccessVerificationPolicy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final SuccessVerificationPolicy POLLING;
        public static final SuccessVerificationPolicy SUCCESS_REDIRECT_URL;

        static {
            SuccessVerificationPolicy successVerificationPolicy = new SuccessVerificationPolicy("SUCCESS_REDIRECT_URL", 0);
            SUCCESS_REDIRECT_URL = successVerificationPolicy;
            SuccessVerificationPolicy successVerificationPolicy2 = new SuccessVerificationPolicy("POLLING", 1);
            POLLING = successVerificationPolicy2;
            SuccessVerificationPolicy[] successVerificationPolicyArr = {successVerificationPolicy, successVerificationPolicy2};
            $VALUES = successVerificationPolicyArr;
            $ENTRIES = kotlin.enums.a.a(successVerificationPolicyArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(5));
        }

        public static SuccessVerificationPolicy valueOf(String str) {
            return (SuccessVerificationPolicy) Enum.valueOf(SuccessVerificationPolicy.class, str);
        }

        public static SuccessVerificationPolicy[] values() {
            return (SuccessVerificationPolicy[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CreditCard3dsVerificationRetryPollicyExperiment(int i, boolean z, SuccessVerificationPolicy successVerificationPolicy) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = SuccessVerificationPolicy.SUCCESS_REDIRECT_URL;
        } else {
            this.c = successVerificationPolicy;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public CreditCard3dsVerificationRetryPollicyExperiment() {
        this(0);
    }

    public CreditCard3dsVerificationRetryPollicyExperiment(int i) {
        SuccessVerificationPolicy successVerificationPolicy = SuccessVerificationPolicy.SUCCESS_REDIRECT_URL;
        this.b = false;
        this.c = successVerificationPolicy;
    }
}
