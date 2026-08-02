package defpackage;

import kotlin.a;

/* loaded from: classes2.dex */
public final class db90 {
    public static final i3y e = a.a(new aw80(20));
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public db90(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db90)) {
            return false;
        }
        db90 db90Var = (db90) obj;
        return this.a == db90Var.a && this.b == db90Var.b && this.c == db90Var.c && this.d == db90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PanelChainChildParams(rowsCount=");
        sb.append(this.a);
        sb.append(", colsCount=");
        sb.append(this.b);
        sb.append(", row=");
        sb.append(this.c);
        sb.append(", col=");
        return oyr.s(sb, this.d, ')');
    }
}
