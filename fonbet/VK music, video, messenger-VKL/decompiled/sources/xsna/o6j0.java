package xsna;

/* compiled from: Shapes.kt */
/* loaded from: classes11.dex */
public final class o6j0 {
    public final uog0 a;
    public final uog0 b;
    public final uog0 c;

    public o6j0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6j0)) {
            return false;
        }
        o6j0 o6j0Var = (o6j0) obj;
        return epx.f(this.a, o6j0Var.a) && epx.f(this.b, o6j0Var.b) && epx.f(this.c, o6j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public o6j0(int i) {
        uog0 b = vog0.b(4);
        uog0 b2 = vog0.b(4);
        uog0 b3 = vog0.b(0);
        this.a = b;
        this.b = b2;
        this.c = b3;
    }
}
