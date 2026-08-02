package com.yandex.passport.internal;

import com.yandex.passport.api.PassportSocialConfiguration;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class z {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportSocialConfiguration.values().length];
        try {
            iArr[PassportSocialConfiguration.SOCIAL_VKONTAKTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_FACEBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_TWITTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_GOOGLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_MAILRU.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_ESIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PassportSocialConfiguration.SOCIAL_TV_1001.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_GOOGLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_OUTLOOK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_MAILRU.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_YAHOO.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_RAMBLER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PassportSocialConfiguration.MAILISH_OTHER.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        a = iArr;
    }
}
