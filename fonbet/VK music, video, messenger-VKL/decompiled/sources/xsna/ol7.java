package xsna;

import com.vk.dto.stickers.bonus.StickerStockItemDiscount;

/* compiled from: BonusRewardItem.kt */
/* loaded from: classes5.dex */
public final class ol7 implements hfz {
    public final StickerStockItemDiscount b;
    public final boolean c;

    public ol7(StickerStockItemDiscount stickerStockItemDiscount, boolean z) {
        this.b = stickerStockItemDiscount;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol7)) {
            return false;
        }
        ol7 ol7Var = (ol7) obj;
        return epx.f(this.b, ol7Var.b) && this.c == ol7Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusRewardItem(discount=");
        sb.append(this.b);
        sb.append(", inactive=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
