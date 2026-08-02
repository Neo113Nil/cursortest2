package com.yandex.go.universal_qr_scanner.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.yandex.go.design.widget.qr.QrTargetView;
import defpackage.cvg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.camera.CameraPreview;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/universal_qr_scanner/ui/UniversalQrScannerCameraPreview;", "Lru/yandex/taxi/camera/CameraPreview;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Rect;", "rect", "Lzy11;", "setDefaultQrTargetSize", "(Landroid/graphics/Rect;)V", "Lcom/yandex/go/design/widget/qr/QrTargetView;", "qrTargetView", "Lcom/yandex/go/design/widget/qr/QrTargetView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UniversalQrScannerCameraPreview extends CameraPreview {
    public static final int $stable = 8;
    private final QrTargetView qrTargetView;

    public UniversalQrScannerCameraPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        QrTargetView qrTargetView = new QrTargetView(context, null, 0, 0, 14, null);
        addView(qrTargetView, -1, -1);
        qrTargetView.setBackgroundColor(qje.t(xng0.fog, qrTargetView.getContext()));
        qrTargetView.setStrokeCap(Paint.Cap.SQUARE);
        qrTargetView.setTargetRectStrokeWidth(tje.r(cvg0.universal_qr_scanner_target_frame_stroke_width, qrTargetView.getContext()));
        qrTargetView.setCornerSizeToRectRatio(0.08f);
        qrTargetView.setActive(true);
        this.qrTargetView = qrTargetView;
    }

    public final void setDefaultQrTargetSize(Rect rect) {
        this.qrTargetView.setDefaultQrTargetSize(rect);
    }

    public UniversalQrScannerCameraPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UniversalQrScannerCameraPreview(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public UniversalQrScannerCameraPreview(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ UniversalQrScannerCameraPreview(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
