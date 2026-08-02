package xsna;

import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.stickers.bonus.StickersBonusReward;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class qk7 extends bk7 {
    public final StickersBonusReward c;
    public final StickersBonusBalance d;
    public final boolean e;
    public final boolean f;

    public qk7(StickersBonusReward stickersBonusReward, StickersBonusBalance stickersBonusBalance, boolean z, boolean z2) {
        super(0);
        this.c = stickersBonusReward;
        this.d = stickersBonusBalance;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk7)) {
            return false;
        }
        qk7 qk7Var = (qk7) obj;
        return epx.f(this.c, qk7Var.c) && epx.f(this.d, qk7Var.d) && this.e == qk7Var.e && this.f == qk7Var.f;
    }

    @Override // xsna.bk7, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.b.hashCode());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCatalogShopItem(reward=");
        sb.append(this.c);
        sb.append(", balance=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        sb.append(this.e);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
