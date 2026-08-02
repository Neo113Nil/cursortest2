package com.yandex.passport.internal.flags;

import com.yandex.passport.api.PassportSocialProviderCode;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportSocialProviderCode.values().length];
        try {
            iArr[PassportSocialProviderCode.VKONTAKTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportSocialProviderCode.FACEBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportSocialProviderCode.GOOGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
