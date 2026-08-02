package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pfm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SbpChallengeInfo.SbpChallengeMethod.values().length];
        try {
            iArr[SbpChallengeInfo.SbpChallengeMethod.SmsChallenge.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SbpChallengeInfo.SbpChallengeMethod.RandomAmount.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
