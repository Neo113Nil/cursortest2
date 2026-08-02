package com.yandex.passport.api;

import com.yandex.passport.internal.entities.AccountType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
            iArr[AccountType.SOCIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountType.PDD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AccountType.PHONISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AccountType.MAILISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AccountType.MUSIC_PHONISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AccountType.CHILDISH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AccountType.UNDEFINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[PassportAccountType.values().length];
        try {
            iArr2[PassportAccountType.PORTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PassportAccountType.LITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PassportAccountType.SOCIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PassportAccountType.PDD.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PassportAccountType.PHONISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PassportAccountType.MAILISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[PassportAccountType.MUSIC_PHONISH.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[PassportAccountType.CHILDISH.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[PassportAccountType.UNDEFINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        b = iArr2;
    }
}
