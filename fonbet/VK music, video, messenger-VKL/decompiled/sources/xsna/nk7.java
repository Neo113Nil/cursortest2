package xsna;

import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class nk7 extends bk7 {
    public final StickerStockItemDiscounts c;

    public nk7(StickerStockItemDiscounts stickerStockItemDiscounts) {
        super(0);
        this.c = stickerStockItemDiscounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk7) && epx.f(this.c, ((nk7) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "BonusCatalogRewardsItem(discounts=" + this.c + ')';
    }
}
