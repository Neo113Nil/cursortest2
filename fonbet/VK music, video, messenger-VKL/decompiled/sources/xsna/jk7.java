package xsna;

import com.vk.dto.stickers.bonus.StickersBonusBalance;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class jk7 extends bk7 {
    public final StickersBonusBalance c;
    public final boolean d;

    public jk7(StickersBonusBalance stickersBonusBalance, boolean z) {
        super(0);
        this.c = stickersBonusBalance;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk7)) {
            return false;
        }
        jk7 jk7Var = (jk7) obj;
        return epx.f(this.c, jk7Var.c) && this.d == jk7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCatalogPointsItem(balance=");
        sb.append(this.c);
        sb.append(", addContainerBottomPadding=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
