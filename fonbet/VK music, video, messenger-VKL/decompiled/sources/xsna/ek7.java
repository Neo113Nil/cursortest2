package xsna;

import com.vk.dto.stickers.bonus.StickersBonusBalance;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class ek7 extends bk7 {
    public final StickersBonusBalance c;

    public ek7(StickersBonusBalance stickersBonusBalance) {
        super(0);
        this.c = stickersBonusBalance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek7) && epx.f(this.c, ((ek7) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "BonusCatalogJoinItem(balance=" + this.c + ')';
    }
}
