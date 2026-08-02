package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class u690 extends h3l0 {
    public final StickerStockItem b;

    public u690(StickerStockItem stickerStockItem) {
        this.b = stickerStockItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u690) && epx.f(this.b, ((u690) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PackShareAdapterItem(pack=" + this.b + ')';
    }
}
