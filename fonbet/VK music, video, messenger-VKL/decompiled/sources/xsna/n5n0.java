package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stickers.ContextUser;

/* compiled from: SuggestedStickerItem.kt */
/* loaded from: classes6.dex */
public final class n5n0 implements hfz {
    public final StickerStockItemWithStickerId b;
    public final ContextUser c;

    public n5n0(StickerStockItemWithStickerId stickerStockItemWithStickerId, ContextUser contextUser) {
        this.b = stickerStockItemWithStickerId;
        this.c = contextUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n5n0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n5n0 n5n0Var = (n5n0) obj;
        StickerStockItemWithStickerId stickerStockItemWithStickerId = this.b;
        if (stickerStockItemWithStickerId.c == n5n0Var.b.c && epx.f(this.c, n5n0Var.c) && epx.f(stickerStockItemWithStickerId.b, n5n0Var.b.b)) {
            StickerStockItem stickerStockItem = stickerStockItemWithStickerId.b;
            boolean z = stickerStockItem.h;
            StickerStockItem stickerStockItem2 = n5n0Var.b.b;
            if (z == stickerStockItem2.h && epx.f(stickerStockItem.E, stickerStockItem2.E)) {
                StickerStockItem stickerStockItem3 = stickerStockItemWithStickerId.b;
                boolean z2 = stickerStockItem3.j;
                StickerStockItem stickerStockItem4 = n5n0Var.b.b;
                if (z2 == stickerStockItem4.j && epx.f(stickerStockItem3.n, stickerStockItem4.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.c);
    }

    public final int hashCode() {
        return this.b.c;
    }

    public final String toString() {
        return "SuggestedStickerItem(sticker=" + this.b + ", contextUser=" + this.c + ')';
    }
}
