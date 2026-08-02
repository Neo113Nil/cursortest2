package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.entities.AccountType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class u {
    public static final /* synthetic */ int[] a;

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
    }
}
