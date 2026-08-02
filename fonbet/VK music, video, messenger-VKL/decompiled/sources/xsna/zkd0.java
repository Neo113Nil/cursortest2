package xsna;

import com.vk.bridges.ImageViewer;
import xsna.ejd0;
import xsna.tkd0;

/* compiled from: ProductCardGalleryEventHandler.kt */
/* loaded from: classes18.dex */
public final class zkd0 extends ImageViewer.b {
    public final /* synthetic */ tkd0.c.a a;
    public final /* synthetic */ ald0 b;

    public zkd0(tkd0.c.a aVar, ald0 ald0Var) {
        this.a = aVar;
        this.b = ald0Var;
    }

    @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
    public final void e(int i) {
        this.b.a.invoke(new ejd0.d.a(i));
    }

    @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
    public final Integer f() {
        return Integer.valueOf(this.a.a.size());
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final ImageViewer.ControlsOptions u() {
        return ImageViewer.ControlsOptions.a(super.u(), true, rl3.y0(new ImageViewer.ControlsOptions.MenuItem[]{ImageViewer.ControlsOptions.MenuItem.DOWNLOAD, ImageViewer.ControlsOptions.MenuItem.REPORT_CONTENT}), false, 244);
    }
}
