package xsna;

import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import xsna.bcw0;

/* compiled from: StickerCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class r2l0 extends bcw0 {
    public final /* synthetic */ StickerCatalogRootVh a;

    public r2l0(StickerCatalogRootVh stickerCatalogRootVh) {
        this.a = stickerCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str = aVar.a;
        StickerCatalogRootVh stickerCatalogRootVh = this.a;
        if (epx.f(stickerCatalogRootVh.F.r, vyh0.a)) {
            if (str != null) {
                wda.e0(stickerCatalogRootVh, str, null, null, 12);
            } else {
                stickerCatalogRootVh.i8(alj.a);
            }
        }
    }

    @Override // xsna.bcw0
    public final void b() {
        StickerCatalogRootVh stickerCatalogRootVh = this.a;
        stickerCatalogRootVh.A.clear();
        stickerCatalogRootVh.i8(vyh0.a);
    }
}
