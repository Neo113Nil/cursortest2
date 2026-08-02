package com.yandex.go.masstransit.sdk.camera.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/masstransit/sdk/camera/view/MtQRCameraPreview;", "Lcom/yandex/go/masstransit/sdk/camera/view/BaseCameraPreview;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Rect;", "rect", "Lzy11;", "grabQrRect", "(Landroid/graphics/Rect;)V", "leaveQrRect", "()V", "Lcom/yandex/go/masstransit/sdk/camera/view/QrTargetView;", "qrTargetView", "Lcom/yandex/go/masstransit/sdk/camera/view/QrTargetView;", "", "value", "isActive", "()Z", "setActive", "(Z)V", "getDefaultQrTargetRect", "()Landroid/graphics/Rect;", "defaultQrTargetRect", "isQrRectGrabbed", "camera"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtQRCameraPreview extends BaseCameraPreview {
    private final QrTargetView qrTargetView;

    public MtQRCameraPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        QrTargetView qrTargetView = new QrTargetView(context, null, 0, 0, 14, null);
        addView(qrTargetView, -1, -1);
        this.qrTargetView = qrTargetView;
    }

    public final Rect getDefaultQrTargetRect() {
        return this.qrTargetView.getDefaultQrTargetRect();
    }

    public final void grabQrRect(Rect rect) {
        this.qrTargetView.setCurrentGrabbedQrRect(rect);
    }

    public final boolean isActive() {
        return this.qrTargetView.getIsActive();
    }

    public final boolean isQrRectGrabbed() {
        return this.qrTargetView.getIsQrRectGrabbed();
    }

    public final void leaveQrRect() {
        this.qrTargetView.resetCurrentGrabbedQrRect();
    }

    public final void setActive(boolean z) {
        this.qrTargetView.setActive(z);
    }

    public MtQRCameraPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public MtQRCameraPreview(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public MtQRCameraPreview(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ MtQRCameraPreview(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
