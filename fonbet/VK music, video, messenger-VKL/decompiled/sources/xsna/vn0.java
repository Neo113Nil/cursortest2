package xsna;

import com.vk.dto.stickers.StickerSuggestion;
import java.util.List;

/* compiled from: StickerWordsItem.kt */
/* loaded from: classes6.dex */
public final class vn0 extends qmc {
    public final int c;
    public final List<StickerSuggestion> d;

    public vn0(int i, List<StickerSuggestion> list) {
        super(1);
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn0)) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        return this.c == vn0Var.c && epx.f(this.d, vn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddSuggestButtonItem(stickerId=");
        sb.append(this.c);
        sb.append(", words=");
        return ms9.a(')', sb, this.d);
    }
}
