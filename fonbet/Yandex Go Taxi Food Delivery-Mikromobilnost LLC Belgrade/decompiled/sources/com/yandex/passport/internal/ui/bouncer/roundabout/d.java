package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.entities.AccountType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[AccountType.values().length];
        try {
            iArr[AccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountType.PDD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountType.CHILDISH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PassportSocialConfiguration.values().length];
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_VKONTAKTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_FACEBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_TWITTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_MAILRU.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_GOOGLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_ESIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PassportSocialConfiguration.SOCIAL_TV_1001.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
        int[] iArr3 = new int[PassportAccountType.values().length];
        try {
            iArr3[PassportAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[PassportAccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[PassportAccountType.PDD.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[PassportAccountType.SOCIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[PassportAccountType.CHILDISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
    }
}
