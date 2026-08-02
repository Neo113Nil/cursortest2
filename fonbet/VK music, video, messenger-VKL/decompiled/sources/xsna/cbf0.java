package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.List;

/* compiled from: RecommendationsBlock.kt */
/* loaded from: classes6.dex */
public final class cbf0 {
    public final String a;
    public final String b;
    public final List<StickerStockItem> c;

    public cbf0(String str, String str2, List<StickerStockItem> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbf0)) {
            return false;
        }
        cbf0 cbf0Var = (cbf0) obj;
        return epx.f(this.a, cbf0Var.a) && epx.f(this.b, cbf0Var.b) && epx.f(this.c, cbf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsBlock(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", packs=");
        return ms9.a(')', sb, this.c);
    }
}
