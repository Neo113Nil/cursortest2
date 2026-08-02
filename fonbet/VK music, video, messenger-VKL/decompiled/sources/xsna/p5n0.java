package xsna;

import android.util.LruCache;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.kcl0;

/* compiled from: SuggestedStickersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class p5n0 implements kcl0.b {
    public final LruCache<Integer, List<StickerStockItemWithStickerId>> a = new LruCache<>(50);
    public final LruCache<Integer, String> b = new LruCache<>(50);

    @Override // xsna.kcl0.b
    public final List<StickerStockItemWithStickerId> a(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    @Override // xsna.kcl0.b
    public final io.reactivex.rxjava3.internal.operators.observable.b0 b(final int i, String str) {
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (str == null) {
            gal0 gal0Var = new gal0("store.getStickersRecommendationBlocks");
            gal0Var.C(i, "sticker_id");
            return new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.y0(gal0Var, null, null, 3), new oyr(new g2h0(5), 22)).U(new dnz(new wql0(3), 17)).E(new m330(new p4w(this, i, 3), 29), lVar, kVar, kVar).C(new io.reactivex.rxjava3.functions.a() { // from class: xsna.o5n0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    p5n0 p5n0Var = p5n0.this;
                    LruCache<Integer, List<StickerStockItemWithStickerId>> lruCache = p5n0Var.a;
                    int i2 = i;
                    if (lruCache.get(Integer.valueOf(i2)) == null) {
                        p5n0Var.a.put(Integer.valueOf(i2), EmptyList.b);
                        p5n0Var.b.remove(Integer.valueOf(i2));
                    }
                }
            });
        }
        fal0 fal0Var = new fal0("store.getStickersRecommendationBlock");
        fal0Var.K("block_id", str);
        return rsg0.y0(fal0Var, null, null, 3).E(new o330(new snb(this, i, 1), 19), lVar, kVar, kVar);
    }

    @Override // xsna.kcl0.b
    public final String c(int i) {
        return this.b.get(Integer.valueOf(i));
    }

    @Override // xsna.kcl0.b
    public final void d(int i) {
        this.a.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
    }
}
