package xsna;

import xsna.tlo0;

/* compiled from: MarketItemCommentsHeaderItem.kt */
/* loaded from: classes17.dex */
public final class x010 {
    public final tlo0.d a;
    public final boolean b;

    public x010(tlo0.d dVar, boolean z) {
        this.a = dVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x010)) {
            return false;
        }
        x010 x010Var = (x010) obj;
        return this.a.equals(x010Var.a) && this.b == x010Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentsHeaderItem(commentCountText=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
