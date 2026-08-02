package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: RecommendedPackItem.kt */
/* loaded from: classes6.dex */
public final class qdf0 implements hfz {
    public final StickerStockItem b;
    public final int c;

    public qdf0(StickerStockItem stickerStockItem, int i) {
        this.b = stickerStockItem;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qdf0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qdf0 qdf0Var = (qdf0) obj;
        StickerStockItem stickerStockItem = qdf0Var.b;
        StickerStockItem stickerStockItem2 = this.b;
        if (epx.f(stickerStockItem2, stickerStockItem)) {
            boolean z = stickerStockItem2.h;
            StickerStockItem stickerStockItem3 = qdf0Var.b;
            if (z == stickerStockItem3.h && epx.f(stickerStockItem2.E, stickerStockItem3.E)) {
                boolean z2 = stickerStockItem2.j;
                StickerStockItem stickerStockItem4 = qdf0Var.b;
                if (z2 == stickerStockItem4.j && epx.f(stickerStockItem2.n, stickerStockItem4.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedPackItem(pack=");
        sb.append(this.b);
        sb.append(", blockPosition=");
        return vu5.b(sb, this.c, ')');
    }
}
