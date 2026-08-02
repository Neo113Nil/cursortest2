package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ChangeInfo.kt */
/* loaded from: classes4.dex */
public final class bsa {
    public RecyclerView.e0 a;
    public RecyclerView.e0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public bsa(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        this.a = e0Var;
        this.b = e0Var2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsa)) {
            return false;
        }
        bsa bsaVar = (bsa) obj;
        return epx.f(this.a, bsaVar.a) && epx.f(this.b, bsaVar.b) && this.c == bsaVar.c && this.d == bsaVar.d && this.e == bsaVar.e && this.f == bsaVar.f;
    }

    public final int hashCode() {
        RecyclerView.e0 e0Var = this.a;
        int hashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        RecyclerView.e0 e0Var2 = this.b;
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, (hashCode + (e0Var2 != null ? e0Var2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo(oldHolder=");
        sb.append(this.a);
        sb.append(", newHolder=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        return vu5.b(sb, this.f, ')');
    }
}
