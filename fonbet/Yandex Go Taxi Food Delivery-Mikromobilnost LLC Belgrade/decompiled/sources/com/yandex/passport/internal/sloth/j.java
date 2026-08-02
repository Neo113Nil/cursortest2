package com.yandex.passport.internal.sloth;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlothEulaSupport$TextKey.values().length];
        try {
            iArr[SlothEulaSupport$TextKey.RegFormat.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlothEulaSupport$TextKey.UserAgreementText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlothEulaSupport$TextKey.PrivacyPolicyText.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlothEulaSupport$TextKey.TaxiAgreementText.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
