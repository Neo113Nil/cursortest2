package defpackage;

/* loaded from: classes13.dex */
public final class o6x0 {
    public final s6x0 a;
    public final int b;

    public o6x0(s6x0 s6x0Var, int i) {
        this.a = s6x0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6x0)) {
            return false;
        }
        o6x0 o6x0Var = (o6x0) obj;
        return this.a.equals(o6x0Var.a) && this.b == o6x0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + " length: " + this.b;
    }
}
