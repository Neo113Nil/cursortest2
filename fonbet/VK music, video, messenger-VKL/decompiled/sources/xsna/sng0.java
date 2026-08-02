package xsna;

import com.vk.dto.stickers.StickerStockItem;
import xsna.d3k0;
import xsna.rng0;

/* compiled from: RouletteViewPresenter.kt */
/* loaded from: classes6.dex */
public final class sng0 implements d3k0.a {
    public final /* synthetic */ rng0 a;

    public sng0(rng0 rng0Var) {
        this.a = rng0Var;
    }

    @Override // xsna.d3k0.a
    public final int a() {
        rng0 rng0Var = this.a;
        StickerStockItem stickerStockItem = rng0Var.m;
        if (stickerStockItem != null) {
            rng0Var.d = new rng0.a.d(stickerStockItem);
        }
        return rng0Var.b.d(0.7f, rng0Var.n);
    }
}
