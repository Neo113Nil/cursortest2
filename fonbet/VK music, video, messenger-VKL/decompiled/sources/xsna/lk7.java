package xsna;

import com.vk.dto.stickers.bonus.StickerStockItemDiscount;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class lk7 extends bk7 {
    public final StickerStockItemDiscount c;
    public final boolean d;

    public lk7(StickerStockItemDiscount stickerStockItemDiscount, boolean z) {
        super(0);
        this.c = stickerStockItemDiscount;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk7)) {
            return false;
        }
        lk7 lk7Var = (lk7) obj;
        return epx.f(this.c, lk7Var.c) && this.d == lk7Var.d;
    }

    @Override // xsna.bk7, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(hashCode());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCatalogRewardItem(discount=");
        sb.append(this.c);
        sb.append(", isFullSize=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
