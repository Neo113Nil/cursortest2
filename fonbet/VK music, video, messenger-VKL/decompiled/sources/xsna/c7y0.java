package xsna;

import com.vk.photo.editor.views.zoom.ZoomRootLayout;

/* compiled from: ZoomStatEventConsumer.kt */
/* loaded from: classes4.dex */
public final class c7y0 {
    public final c5p a;
    public d7y0 b;

    public c7y0(ZoomRootLayout zoomRootLayout, nrk0 nrk0Var, d7y0 d7y0Var) {
        this.a = nrk0Var;
        this.b = d7y0Var;
        zoomRootLayout.setZoomEventListener(new b7y0(this));
    }
}
