package defpackage;

import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class jwt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.values().length];
        try {
            iArr[QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.AZTEC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.DATA_MATRIX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.PDF_417.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
