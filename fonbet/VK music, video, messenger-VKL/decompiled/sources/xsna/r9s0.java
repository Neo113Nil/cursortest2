package xsna;

import com.vk.catalog2.common.ui.mvp.configuration.reload.CatalogReloadTrigger;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import xsna.b25;

/* compiled from: VideoCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class r9s0 implements b25.a {
    public final /* synthetic */ VideoCatalogRootVh b;

    public r9s0(VideoCatalogRootVh videoCatalogRootVh) {
        this.b = videoCatalogRootVh;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        if (tbu0Var.b()) {
            VideoCatalogRootVh videoCatalogRootVh = this.b;
            if (videoCatalogRootVh.r.d(CatalogReloadTrigger.LOGIN)) {
                videoCatalogRootVh.P.d();
            }
        }
    }
}
