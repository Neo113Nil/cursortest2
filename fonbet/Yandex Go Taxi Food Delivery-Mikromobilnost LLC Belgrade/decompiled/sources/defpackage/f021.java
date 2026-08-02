package defpackage;

import com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class f021 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UniversalQrScannerTorchState.values().length];
        try {
            iArr[UniversalQrScannerTorchState.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UniversalQrScannerTorchState.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UniversalQrScannerTorchState.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
