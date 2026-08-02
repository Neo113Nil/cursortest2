package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class zl2 extends h3l0 {
    public final StickerStockItem b;
    public final StickerItem c;

    public zl2(StickerItem stickerItem, StickerStockItem stickerStockItem) {
        this.b = stickerStockItem;
        this.c = stickerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return epx.f(this.b, zl2Var.b) && epx.f(this.c, zl2Var.c);
    }

    @Override // xsna.h3l0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(hashCode());
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedStickerAdapterItem(pack=" + this.b + ", sticker=" + this.c + ')';
    }
}
