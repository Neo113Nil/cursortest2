package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class y1l0 extends h3l0 {
    public final StickerStockItem b;
    public final StickerItem c;

    public y1l0(StickerItem stickerItem, StickerStockItem stickerStockItem) {
        this.b = stickerStockItem;
        this.c = stickerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1l0)) {
            return false;
        }
        y1l0 y1l0Var = (y1l0) obj;
        return epx.f(this.b, y1l0Var.b) && epx.f(this.c, y1l0Var.c);
    }

    @Override // xsna.h3l0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(hashCode());
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "StickerAdapterItem(pack=" + this.b + ", sticker=" + this.c + ')';
    }
}
