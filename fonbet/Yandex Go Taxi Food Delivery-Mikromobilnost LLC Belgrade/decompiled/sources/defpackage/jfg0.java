package defpackage;

import com.ybsdk.core.qr.scanner.ui.InteractorQrScannerView;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;

/* loaded from: classes3.dex */
public final /* synthetic */ class jfg0 implements olm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrScannerPreviewDependencies b;

    public /* synthetic */ jfg0(QrScannerPreviewDependencies qrScannerPreviewDependencies, int i) {
        this.a = i;
        this.b = qrScannerPreviewDependencies;
    }

    @Override // defpackage.olm0
    public final nlm0 c(InteractorQrScannerView interactorQrScannerView) {
        int i = this.a;
        QrScannerPreviewDependencies qrScannerPreviewDependencies = this.b;
        switch (i) {
            case 0:
                return new kwt(interactorQrScannerView, qrScannerPreviewDependencies);
            default:
                return kfg0.c(interactorQrScannerView, qrScannerPreviewDependencies);
        }
    }
}
