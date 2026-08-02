package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class hsf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SbpChallengeInfo.SbpChallengeMethod.values().length];
        try {
            iArr[SbpChallengeInfo.SbpChallengeMethod.SmsChallenge.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
