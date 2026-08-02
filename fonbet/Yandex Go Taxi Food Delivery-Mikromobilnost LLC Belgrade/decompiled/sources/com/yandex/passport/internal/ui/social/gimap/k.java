package com.yandex.passport.internal.ui.social.gimap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GimapError.values().length];
        a = iArr;
        try {
            iArr[GimapError.IMAP_DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[GimapError.BAD_KARMA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[GimapError.ACCOUNT_BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[GimapError.UNKNOWN_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[GimapError.INTERNAL_SERVER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[GimapError.RATE_LIMIT_EXCEEDED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[GimapError.SMTP_BAD_EMAIL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
