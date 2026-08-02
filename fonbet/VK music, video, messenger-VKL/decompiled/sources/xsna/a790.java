package xsna;

import com.vk.stickers.details.holders.PackStylesListHolder;
import java.util.ArrayList;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class a790 extends h3l0 {
    public final PackStylesListHolder.State b;
    public final ArrayList c;
    public final int d;
    public final int e;

    public a790(PackStylesListHolder.State state, ArrayList arrayList, int i, int i2) {
        this.b = state;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a790)) {
            return false;
        }
        a790 a790Var = (a790) obj;
        return this.b == a790Var.b && epx.f(this.c, a790Var.c) && this.d == a790Var.d && this.e == a790Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, qr.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackStylesAdapterItem(state=");
        sb.append(this.b);
        sb.append(", styles=");
        sb.append(this.c);
        sb.append(", dividerPos=");
        sb.append(this.d);
        sb.append(", scrollToPos=");
        return vu5.b(sb, this.e, ')');
    }
}
