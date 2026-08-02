package xsna;

import xsna.mno0;

/* compiled from: TopshelfCardTextState.kt */
/* loaded from: classes2.dex */
public final class rbp0 {
    public final mno0.i a;
    public final int b;

    public rbp0(mno0.i iVar, int i) {
        this.a = iVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbp0)) {
            return false;
        }
        rbp0 rbp0Var = (rbp0) obj;
        return this.a.equals(rbp0Var.a) && this.b == rbp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardTextState(text=");
        sb.append(this.a);
        sb.append(", maxLines=");
        return vu5.b(sb, this.b, ')');
    }
}
