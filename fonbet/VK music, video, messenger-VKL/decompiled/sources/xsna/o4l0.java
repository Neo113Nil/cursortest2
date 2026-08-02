package xsna;

import com.vk.stickers.views.VKStickerLoader;

/* compiled from: StickerHolder.kt */
/* loaded from: classes4.dex */
public final class o4l0 implements xwb0 {
    public final /* synthetic */ n4l0 a;

    public o4l0(n4l0 n4l0Var) {
        this.a = n4l0Var;
    }

    @Override // xsna.xwb0
    public final void E() {
        VKStickerLoader vKStickerLoader = this.a.G;
        bwt0.p0(vKStickerLoader.b, false);
        bwt0.p0(vKStickerLoader.c, true);
    }

    @Override // xsna.xwb0
    public final void k() {
        VKStickerLoader vKStickerLoader = this.a.G;
        bwt0.p0(vKStickerLoader.b, true);
        bwt0.p0(vKStickerLoader.c, false);
    }
}
