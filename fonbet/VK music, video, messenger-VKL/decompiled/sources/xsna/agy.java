package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class agy extends rf6 {
    public final String b;
    public final int c;
    public final StickerStockItem d;
    public final int e;
    public final VmojiConstructorOpenParamsModel f;
    public final so40 g;

    public agy() {
        throw null;
    }

    public agy(String str, int i, StickerStockItem stickerStockItem, int i2, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel, so40 so40Var) {
        this.b = str;
        this.c = i;
        this.d = stickerStockItem;
        this.e = i2;
        this.f = vmojiConstructorOpenParamsModel;
        this.g = so40Var;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agy)) {
            return false;
        }
        agy agyVar = (agy) obj;
        return epx.f(this.b, agyVar.b) && this.c == agyVar.c && epx.f(this.d, agyVar.d) && this.e == agyVar.e && epx.f(this.f, agyVar.f) && epx.f(this.g, agyVar.g);
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.c);
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 961);
        StickerStockItem stickerStockItem = this.d;
        int a2 = shy.a(this.e, (a + (stickerStockItem == null ? 0 : stickerStockItem.hashCode())) * 31, 31);
        VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = this.f;
        return this.g.hashCode() + ((a2 + (vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "KeyboardHeaderVmojiItem(title=" + this.b + ", stickerId=" + this.c + ", sticker=null, pack=" + this.d + ", promoCount=" + this.e + ", promoParams=" + this.f + ", ref=null, contextUserProvider=" + this.g + ')';
    }
}
