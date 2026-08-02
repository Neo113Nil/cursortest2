package com.yandex.passport.internal.ui.social.gimap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GimapError.values().length];
        a = iArr;
        try {
            iArr[GimapError.FAILED_RESOLVE_SERVERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[GimapError.IMAP_FAILED_CONNECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[GimapError.SMTP_FAILED_CONNECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[GimapError.SMTP_BAD_EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[GimapError.IMAP_DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[GimapError.BAD_KARMA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[GimapError.ACCOUNT_BLOCKED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[GimapError.IMAP_LOGIN_ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[GimapError.SMTP_LOGIN_ERROR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[GimapError.UNKNOWN_ERROR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[GimapError.INTERNAL_SERVER_ERROR.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[GimapError.RATE_LIMIT_EXCEEDED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[GimapError.FORBIDDEN_PROVIDER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[GimapError.SMTP_INCOMPLETE_PARAMS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
