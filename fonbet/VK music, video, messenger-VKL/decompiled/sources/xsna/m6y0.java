package xsna;

import com.vk.photo.editor.views.zoom.ZoomContentLayout;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;
import xsna.z6y0;

/* compiled from: ZoomBurger.kt */
/* loaded from: classes4.dex */
public final class m6y0 {
    public final ZoomRootLayout a;

    public m6y0(ZoomRootLayout zoomRootLayout, ZoomContentLayout zoomContentLayout) {
        this.a = zoomRootLayout;
        zoomContentLayout.setZoomMatrixProvider$api_release(zoomRootLayout);
    }

    public final void a(z6y0 z6y0Var) {
        boolean a = z6y0Var.a();
        ZoomRootLayout zoomRootLayout = this.a;
        zoomRootLayout.setZoomEnabled(a);
        if (z6y0Var instanceof z6y0.b) {
            z6y0.b bVar = (z6y0.b) z6y0Var;
            zoomRootLayout.setMinPointerCount(bVar.a);
            zoomRootLayout.setAllowToDragWhileScaling(bVar.b);
        }
    }
}
