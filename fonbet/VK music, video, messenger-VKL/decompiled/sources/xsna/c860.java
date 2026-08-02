package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: StickersBroadcaster.kt */
/* loaded from: classes5.dex */
public final class c860 extends icl0 {
    public final StickerStockItem a;

    public c860(StickerStockItem stickerStockItem) {
        this.a = stickerStockItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c860) && epx.f(this.a, ((c860) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewPackPurchased(pack=" + this.a + ')';
    }
}
