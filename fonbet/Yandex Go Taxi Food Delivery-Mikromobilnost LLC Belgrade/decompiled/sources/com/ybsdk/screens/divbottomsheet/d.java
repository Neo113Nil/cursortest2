package com.ybsdk.screens.divbottomsheet;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TargetType.values().length];
        try {
            iArr[TargetType.QR_CREDLIM_PAYMENT_TERM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TargetType.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
