package xsna;

import com.vk.dto.stickers.StickerStockItemWithStickerId;

/* compiled from: StickerWordsItem.kt */
/* loaded from: classes6.dex */
public final class u4l0 extends qmc {
    public final StickerStockItemWithStickerId c;

    public u4l0(StickerStockItemWithStickerId stickerStockItemWithStickerId) {
        super(1);
        this.c = stickerStockItemWithStickerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4l0) && epx.f(this.c, ((u4l0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "StickerInfoItem(sticker=" + this.c + ')';
    }
}
