package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;

/* loaded from: classes2.dex */
public final class aqv implements cqv {
    public final SbpChallengeInfo a;
    public final PaymentMethod.SbpToken b;

    public aqv(SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken) {
        this.a = sbpChallengeInfo;
        this.b = sbpToken;
    }
}
