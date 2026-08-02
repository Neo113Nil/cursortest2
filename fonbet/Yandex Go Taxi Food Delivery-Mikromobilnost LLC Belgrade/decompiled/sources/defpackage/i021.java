package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.universal_qr_scanner.ui.UniversalQrScannerCameraPreview;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class i021 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final UniversalQrScannerCameraPreview c;
    public final GoFrameLayout d;
    public final GoFrameLayout e;
    public final RobotoTextView f;
    public final GoImageView g;
    public final y1y h;

    public i021(GoFrameLayout goFrameLayout, GoImageView goImageView, UniversalQrScannerCameraPreview universalQrScannerCameraPreview, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, RobotoTextView robotoTextView, GoImageView goImageView2, y1y y1yVar) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = universalQrScannerCameraPreview;
        this.d = goFrameLayout2;
        this.e = goFrameLayout3;
        this.f = robotoTextView;
        this.g = goImageView2;
        this.h = y1yVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
