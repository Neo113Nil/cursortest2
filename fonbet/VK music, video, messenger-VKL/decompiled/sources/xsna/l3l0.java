package xsna;

import com.vk.stickers.longtap.LongtapStickerPreview;
import xsna.bbl0;

/* compiled from: StickerDetailsLongtapView.kt */
/* loaded from: classes6.dex */
public final class l3l0 implements xwb0 {
    public final /* synthetic */ q3l0 a;

    public l3l0(q3l0 q3l0Var) {
        this.a = q3l0Var;
    }

    @Override // xsna.xwb0
    public final void E() {
        LongtapStickerPreview longtapStickerPreview;
        bbl0.c cVar = this.a.o;
        if (cVar == null || (longtapStickerPreview = cVar.b) == null) {
            return;
        }
        longtapStickerPreview.setLoadingState(true);
    }

    @Override // xsna.xwb0
    public final void k() {
        LongtapStickerPreview longtapStickerPreview;
        bbl0.c cVar = this.a.o;
        if (cVar == null || (longtapStickerPreview = cVar.b) == null) {
            return;
        }
        longtapStickerPreview.setLoadingState(false);
    }
}
