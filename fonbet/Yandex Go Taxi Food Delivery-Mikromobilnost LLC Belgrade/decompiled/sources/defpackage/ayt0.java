package defpackage;

import io.flutter.plugins.webviewflutter.SslErrorType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ayt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SslErrorType.values().length];
        a = iArr;
        try {
            iArr[SslErrorType.DATE_INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SslErrorType.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SslErrorType.ID_MISMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[SslErrorType.INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[SslErrorType.NOT_YET_VALID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[SslErrorType.UNTRUSTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[SslErrorType.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
