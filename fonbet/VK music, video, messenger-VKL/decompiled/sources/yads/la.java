package yads;

import xsna.sl9;

/* loaded from: classes10.dex */
public final class la {
    public final int a;
    public final int b;

    public la(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return this.a == laVar.a && this.b == laVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sl9.c(this.a, this.b, "AdSize(width=", ", height=", ")");
    }
}
