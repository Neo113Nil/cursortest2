package defpackage;

import ru.yandex.taxi.network.api.AuthChallengeCheckResult;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class emt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthChallengeCheckResult.values().length];
        try {
            iArr[AuthChallengeCheckResult.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthChallengeCheckResult.Dismissed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthChallengeCheckResult.AlreadyDone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
