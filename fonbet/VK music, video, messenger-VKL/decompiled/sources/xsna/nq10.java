package xsna;

import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.List;

/* compiled from: MarketProductMediaContentHolder.kt */
/* loaded from: classes18.dex */
public final class nq10 {
    public final List<MediaContentItem> a;
    public final boolean b;
    public final int c;

    public nq10(int i, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq10)) {
            return false;
        }
        nq10 nq10Var = (nq10) obj;
        return epx.f(this.a, nq10Var.a) && this.b == nq10Var.b && this.c == nq10Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaContentBlock(items=");
        sb.append(this.a);
        sb.append(", isShowAllEnabled=");
        sb.append(this.b);
        sb.append(", titleRes=");
        return vu5.b(sb, this.c, ')');
    }
}
