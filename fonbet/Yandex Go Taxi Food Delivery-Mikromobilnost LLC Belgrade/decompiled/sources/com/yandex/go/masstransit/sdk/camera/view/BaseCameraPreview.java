package com.yandex.go.masstransit.sdk.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.core.g;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.v;
import defpackage.iq7;
import defpackage.uy80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/go/masstransit/sdk/camera/view/BaseCameraPreview;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/camera/core/g;", "preview", "Lzy11;", "attachPreview", "(Landroidx/camera/core/g;)V", "detachPreview", "()V", "cameraXPreview", "Landroidx/camera/core/g;", "Landroidx/camera/view/PreviewView;", "previewView", "Landroidx/camera/view/PreviewView;", "Luy80;", "getPreviewViewOutputTransform", "()Luy80;", "previewViewOutputTransform", "Liq7;", "value", "getCameraController", "()Liq7;", "setCameraController", "(Liq7;)V", "cameraController", "Landroidx/lifecycle/v;", "Landroidx/camera/view/PreviewView$StreamState;", "getPreviewStreamState", "()Landroidx/lifecycle/v;", "previewStreamState", "camera"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseCameraPreview extends FrameLayout {
    private g cameraXPreview;
    private final PreviewView previewView;

    public BaseCameraPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        PreviewView previewView = new PreviewView(context);
        previewView.setImplementationMode(PreviewView.ImplementationMode.PERFORMANCE);
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        addView(previewView);
        this.previewView = previewView;
    }

    public final void attachPreview(g preview) {
        this.cameraXPreview = preview;
        if (preview != null) {
            preview.J(this.previewView.getSurfaceProvider());
        }
    }

    public final void detachPreview() {
        g gVar = this.cameraXPreview;
        if (gVar != null) {
            gVar.J(null);
        }
        this.cameraXPreview = null;
    }

    public final iq7 getCameraController() {
        return this.previewView.getController();
    }

    public final v getPreviewStreamState() {
        return this.previewView.getPreviewStreamState();
    }

    public final uy80 getPreviewViewOutputTransform() {
        return this.previewView.getOutputTransform();
    }

    public final void setCameraController(iq7 iq7Var) {
        this.previewView.setController(iq7Var);
    }

    public BaseCameraPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BaseCameraPreview(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BaseCameraPreview(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ BaseCameraPreview(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
