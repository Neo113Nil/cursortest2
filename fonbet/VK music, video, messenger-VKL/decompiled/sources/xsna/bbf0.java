package xsna;

import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class bbf0 extends h3l0 {
    public final StickerPackRecommendationBlock b;
    public final StickerStockItem c;
    public final Boolean d;
    public final int e;

    public bbf0(StickerPackRecommendationBlock stickerPackRecommendationBlock, StickerStockItem stickerStockItem, Boolean bool, int i) {
        this.b = stickerPackRecommendationBlock;
        this.c = stickerStockItem;
        this.d = bool;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbf0)) {
            return false;
        }
        bbf0 bbf0Var = (bbf0) obj;
        return epx.f(this.b, bbf0Var.b) && epx.f(this.c, bbf0Var.c) && epx.f(this.d, bbf0Var.d) && this.e == bbf0Var.e;
    }

    @Override // xsna.h3l0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b.hashCode());
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Boolean bool = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsAdapterItem(block=");
        sb.append(this.b);
        sb.append(", pack=");
        sb.append(this.c);
        sb.append(", isSubscribedToAuthor=");
        sb.append(this.d);
        sb.append(", blockPosition=");
        return vu5.b(sb, this.e, ')');
    }
}
