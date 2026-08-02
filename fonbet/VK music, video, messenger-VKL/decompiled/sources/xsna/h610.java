package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketItemsForReviewStateModel.kt */
/* loaded from: classes18.dex */
public final class h610 {
    public final int a;
    public final List<a610> b;

    public h610(int i, List<a610> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h610)) {
            return false;
        }
        h610 h610Var = (h610) obj;
        return this.a == h610Var.a && epx.f(this.b, h610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemsForReviewStateModel(selectedPosition=");
        sb.append(this.a);
        sb.append(", items=");
        return ms9.a(')', sb, this.b);
    }

    public h610() {
        this(0, EmptyList.b);
    }
}
