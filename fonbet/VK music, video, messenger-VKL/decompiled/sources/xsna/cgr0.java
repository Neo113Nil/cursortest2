package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.views.VKStickerCachedImageView;

/* compiled from: VKStickerCachedImageView.java */
/* loaded from: classes6.dex */
public final class cgr0 implements b780 {
    public final /* synthetic */ int b;
    public final /* synthetic */ VKStickerCachedImageView c;

    public cgr0(VKStickerCachedImageView vKStickerCachedImageView, int i) {
        this.c = vKStickerCachedImageView;
        this.b = i;
    }

    @Override // xsna.b780
    public final void b(String str, @Nullable Throwable th) {
        int i = VKStickerCachedImageView.m;
        final int i2 = this.b;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new lil0(i2), null, null, 3);
        final VKStickerCachedImageView vKStickerCachedImageView = this.c;
        y0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.bgr0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                int i3 = VKStickerCachedImageView.m;
                if (obj instanceof StickerStockItem) {
                    StickerStockItem stickerStockItem = (StickerStockItem) obj;
                    VKStickerCachedImageView vKStickerCachedImageView2 = VKStickerCachedImageView.this;
                    vKStickerCachedImageView2.setOnLoadCallback(null);
                    StickerItem Db = stickerStockItem.Db(i2);
                    if (Db != null) {
                        t6g0 t6g0Var = t6g0.b;
                        vKStickerCachedImageView2.T0(t6g0.d().z0(Db, h9l0.b, dhr0.a.c(vKStickerCachedImageView2.getContext())));
                    }
                    t6g0 t6g0Var2 = t6g0.b;
                    t6g0.d().k(stickerStockItem);
                }
            }
        }, new iq60(2));
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
    }
}
