package xsna;

import com.vk.dto.stickers.StickerSuggestion;

/* compiled from: StickerWordsItem.kt */
/* loaded from: classes6.dex */
public final class rux0 extends qmc {
    public final int c;
    public final StickerSuggestion d;

    public rux0(int i, StickerSuggestion stickerSuggestion) {
        super(1);
        this.c = i;
        this.d = stickerSuggestion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rux0)) {
            return false;
        }
        rux0 rux0Var = (rux0) obj;
        return this.c == rux0Var.c && epx.f(this.d, rux0Var.d);
    }

    @Override // xsna.qmc, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.d.b.hashCode());
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "WordItem(stickerId=" + this.c + ", suggestion=" + this.d + ')';
    }
}
