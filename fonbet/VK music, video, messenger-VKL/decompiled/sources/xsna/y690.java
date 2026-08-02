package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class y690 extends h3l0 {
    public final StickerStockItem b;
    public final boolean c;
    public final Boolean d;

    public y690(StickerStockItem stickerStockItem, boolean z, Boolean bool) {
        this.b = stickerStockItem;
        this.c = z;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y690)) {
            return false;
        }
        y690 y690Var = (y690) obj;
        return epx.f(this.b, y690Var.b) && this.c == y690Var.c && epx.f(this.d, y690Var.d);
    }

    @Override // xsna.h3l0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(hashCode());
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Boolean bool = this.d;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackStyleTitleAdapterItem(pack=");
        sb.append(this.b);
        sb.append(", isDeletable=");
        sb.append(this.c);
        sb.append(", isPackInWishList=");
        return tn.a(sb, this.d, ')');
    }

    public /* synthetic */ y690(StickerStockItem stickerStockItem) {
        this(stickerStockItem, false, null);
    }
}
