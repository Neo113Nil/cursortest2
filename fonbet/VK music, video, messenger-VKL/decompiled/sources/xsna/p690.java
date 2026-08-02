package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class p690 extends h3l0 {
    public final StickerStockItem b;
    public final Boolean c;
    public final Boolean d;

    public p690(StickerStockItem stickerStockItem, Boolean bool, Boolean bool2) {
        this.b = stickerStockItem;
        this.c = bool;
        this.d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p690)) {
            return false;
        }
        p690 p690Var = (p690) obj;
        return epx.f(this.b, p690Var.b) && epx.f(this.c, p690Var.c) && epx.f(this.d, p690Var.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackInfoAdapterItem(pack=");
        sb.append(this.b);
        sb.append(", isPackInWishList=");
        sb.append(this.c);
        sb.append(", isSubscribedToAuthor=");
        return tn.a(sb, this.d, ')');
    }
}
