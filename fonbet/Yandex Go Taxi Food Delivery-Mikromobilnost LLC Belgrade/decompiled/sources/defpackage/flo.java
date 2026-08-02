package defpackage;

import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class flo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraCaptureMetaData$FlashState.values().length];
        a = iArr;
        try {
            iArr[CameraCaptureMetaData$FlashState.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CameraCaptureMetaData$FlashState.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CameraCaptureMetaData$FlashState.FIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
