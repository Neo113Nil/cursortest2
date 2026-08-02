package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class l6l0 extends bk7 {
    public final StickerStockItem c;
    public final boolean d;

    public l6l0(StickerStockItem stickerStockItem, boolean z) {
        super(1);
        this.c = stickerStockItem;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6l0)) {
            return false;
        }
        l6l0 l6l0Var = (l6l0) obj;
        return epx.f(this.c, l6l0Var.c) && this.d == l6l0Var.d;
    }

    @Override // xsna.bk7, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSettingsPackItem(pack=");
        sb.append(this.c);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
