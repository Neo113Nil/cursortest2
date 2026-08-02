package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ClipsCreateComment.kt */
/* loaded from: classes4.dex */
public class jod implements ney, s2l0 {
    public Object a;

    public /* synthetic */ jod(Object obj) {
        this.a = obj;
    }

    @Override // xsna.s2l0
    public boolean a(StickerItem stickerItem) {
        return ((kcl0) this.a).W0(stickerItem.b);
    }

    @Override // xsna.s2l0
    public boolean b(StickerItem stickerItem) {
        StickerStockItem H = ((kcl0) this.a).H(stickerItem.b);
        if (H != null) {
            return H.A;
        }
        return false;
    }

    @Override // xsna.s2l0
    public boolean c(StickerItem stickerItem) {
        StickerStockItem H;
        return stickerItem.h && (H = ((kcl0) this.a).H(stickerItem.b)) != null && H.h;
    }

    @Override // xsna.ney
    public void clear() {
        ((m900) this.a).evictAll();
    }

    public Object d(gzs gzsVar) {
        return ((xgl0) this.a).c(new jl1(3, gzsVar));
    }

    @Override // xsna.ney
    public Object get(Object obj) {
        return ((m900) this.a).get(obj);
    }

    @Override // xsna.ney
    public void put(Object obj, Object obj2) {
        ((m900) this.a).put(obj, obj2);
    }

    public jod(int i) {
        this.a = new m900(i);
    }
}
