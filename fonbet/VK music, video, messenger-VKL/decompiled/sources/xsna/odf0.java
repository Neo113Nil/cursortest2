package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;

/* compiled from: RecommendedPackBigItem.kt */
/* loaded from: classes6.dex */
public final class odf0 implements hfz {
    public final StickerStockItem b;
    public final ContextUser c;
    public final GiftData d;
    public final String e;

    public odf0(StickerStockItem stickerStockItem, ContextUser contextUser, GiftData giftData, String str) {
        this.b = stickerStockItem;
        this.c = contextUser;
        this.d = giftData;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!odf0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        odf0 odf0Var = (odf0) obj;
        if (!epx.f(this.c, odf0Var.c) || !epx.f(this.d, odf0Var.d) || !epx.f(this.e, odf0Var.e)) {
            return false;
        }
        StickerStockItem stickerStockItem = odf0Var.b;
        StickerStockItem stickerStockItem2 = this.b;
        if (epx.f(stickerStockItem2, stickerStockItem)) {
            boolean z = stickerStockItem2.h;
            StickerStockItem stickerStockItem3 = odf0Var.b;
            if (z == stickerStockItem3.h && epx.f(stickerStockItem2.E, stickerStockItem3.E)) {
                boolean z2 = stickerStockItem2.j;
                StickerStockItem stickerStockItem4 = odf0Var.b;
                if (z2 == stickerStockItem4.j && epx.f(stickerStockItem2.n, stickerStockItem4.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedPackBigItem(pack=");
        sb.append(this.b);
        sb.append(", contextUser=");
        sb.append(this.c);
        sb.append(", giftData=");
        sb.append(this.d);
        sb.append(", ref=");
        return ho8.a(sb, this.e, ')');
    }
}
