package com.ybsdk.feature.pin.internal.screens.biometry;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BiometricViewModel$PinSkipableResult.values().length];
        try {
            iArr[BiometricViewModel$PinSkipableResult.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BiometricViewModel$PinSkipableResult.SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BiometricViewModel$PinSkipableResult.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
