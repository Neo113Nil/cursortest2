package com.yandex.passport.internal.common;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportSocialConfiguration;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PassportAccountType.values().length];
        try {
            iArr[PassportAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportAccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportAccountType.PDD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportAccountType.SOCIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PassportAccountType.CHILDISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PassportSocialConfiguration.values().length];
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_VKONTAKTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_FACEBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_TWITTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_MAILRU.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_GOOGLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_ESIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
