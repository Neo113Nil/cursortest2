package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MoveInfo.kt */
/* loaded from: classes4.dex */
public final class oc30 {
    public final RecyclerView.e0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public oc30(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        this.a = e0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc30)) {
            return false;
        }
        oc30 oc30Var = (oc30) obj;
        return epx.f(this.a, oc30Var.a) && this.b == oc30Var.b && this.c == oc30Var.c && this.d == oc30Var.d && this.e == oc30Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveInfo(holder=");
        sb.append(this.a);
        sb.append(", fromX=");
        sb.append(this.b);
        sb.append(", fromY=");
        sb.append(this.c);
        sb.append(", toX=");
        sb.append(this.d);
        sb.append(", toY=");
        return vu5.b(sb, this.e, ')');
    }
}
