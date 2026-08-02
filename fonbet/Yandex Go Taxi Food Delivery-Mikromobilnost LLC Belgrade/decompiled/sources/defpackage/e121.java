package defpackage;

import com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class e121 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UniversalQrScannerTorchState.values().length];
        try {
            iArr[UniversalQrScannerTorchState.NOT_AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UniversalQrScannerTorchState.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UniversalQrScannerTorchState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
