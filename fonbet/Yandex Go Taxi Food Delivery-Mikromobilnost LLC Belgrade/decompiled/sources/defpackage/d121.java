package defpackage;

import com.yandex.go.universal_qr_scanner.domain.camera.permission.UniversalQrScannerCameraPermissionState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d121 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UniversalQrScannerCameraPermissionState.values().length];
        try {
            iArr[UniversalQrScannerCameraPermissionState.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UniversalQrScannerCameraPermissionState.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UniversalQrScannerCameraPermissionState.FORBIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
