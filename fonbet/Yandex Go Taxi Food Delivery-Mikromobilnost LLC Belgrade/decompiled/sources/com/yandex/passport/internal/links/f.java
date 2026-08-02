package com.yandex.passport.internal.links;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkMode.values().length];
        try {
            iArr[LinkMode.AUTH_QR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkMode.AUTH_QR_WITHOUT_QR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkMode.PAY_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
