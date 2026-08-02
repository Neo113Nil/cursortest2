package xsna;

import java.util.List;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class t8u {
    public final List<b5u> a;
    public final int b;
    public final int c;

    public t8u(List<b5u> list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public static t8u a(t8u t8uVar, List list, int i, int i2) {
        int i3 = t8uVar.b;
        if ((i2 & 4) != 0) {
            i = t8uVar.c;
        }
        t8uVar.getClass();
        return new t8u(list, i3, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8u)) {
            return false;
        }
        t8u t8uVar = (t8u) obj;
        return epx.f(this.a, t8uVar.a) && this.b == t8uVar.b && this.c == t8uVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodsState(goods=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", pagingOffset=");
        return vu5.b(sb, this.c, ')');
    }
}
