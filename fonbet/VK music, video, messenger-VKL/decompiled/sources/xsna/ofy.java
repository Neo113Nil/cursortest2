package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class ofy extends rf6 {
    public final StickerStockItem b;
    public final boolean c;

    public ofy(StickerStockItem stickerStockItem, boolean z) {
        this.b = stickerStockItem;
        this.c = z;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofy)) {
            return false;
        }
        ofy ofyVar = (ofy) obj;
        return epx.f(this.b, ofyVar.b) && this.c == ofyVar.c;
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardHeaderBuyItem(pack=");
        sb.append(this.b);
        sb.append(", isSingleHeader=");
        return n23.b(sb, this.c, ", ref=null)");
    }
}
