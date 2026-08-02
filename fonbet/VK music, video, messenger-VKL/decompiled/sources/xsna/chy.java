package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class chy extends dhy {
    public final StickerItem d;
    public final int e;
    public final StickerStockItem f;
    public final String g;

    public chy(StickerItem stickerItem, int i, StickerStockItem stickerStockItem, String str) {
        super(stickerItem);
        this.d = stickerItem;
        this.e = i;
        this.f = stickerStockItem;
        this.g = str;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.e;
    }

    @Override // xsna.dhy
    public final n1l0 b() {
        return this.d;
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.d.b);
    }
}
