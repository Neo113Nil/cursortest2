package xsna;

import com.vk.photo.editor.views.zoom.ZoomRootLayout;

/* compiled from: ZoomManipulatorImpl.kt */
/* loaded from: classes4.dex */
public final class t6y0 implements s6y0 {
    public final ZoomRootLayout a;
    public boolean b;

    public t6y0(ZoomRootLayout zoomRootLayout, boolean z) {
        this.a = zoomRootLayout;
        this.b = z;
    }

    @Override // xsna.s6y0
    public final void a(float f) {
        if (this.b) {
            ZoomRootLayout zoomRootLayout = this.a;
            zoomRootLayout.g.postScale(f, f, zoomRootLayout.getWidth() / 2.0f, zoomRootLayout.getHeight() / 2.0f);
            zoomRootLayout.e();
            zoomRootLayout.invalidate();
        }
    }
}
