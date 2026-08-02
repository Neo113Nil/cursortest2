package yads;

import xsna.sl9;

/* loaded from: classes10.dex */
public final class em3 {
    public final int a;
    public final int b;

    public em3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em3)) {
            return false;
        }
        em3 em3Var = (em3) obj;
        return this.a == em3Var.a && this.b == em3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sl9.c(this.a, this.b, "ViewSize(width=", ", height=", ")");
    }
}
