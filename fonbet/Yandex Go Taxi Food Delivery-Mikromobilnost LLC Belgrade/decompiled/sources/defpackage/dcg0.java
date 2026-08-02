package defpackage;

import com.ybsdk.feature.qr.api.QrCameraType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class dcg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrCameraType.values().length];
        try {
            iArr[QrCameraType.ZXING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrCameraType.NOT_IMPLEMENTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrCameraType.GMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QrCameraType.HMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
