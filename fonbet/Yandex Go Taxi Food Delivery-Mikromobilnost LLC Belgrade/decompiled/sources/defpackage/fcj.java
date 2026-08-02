package defpackage;

/* loaded from: classes10.dex */
public final class fcj {
    public final xx40 a;
    public final xx40 b;

    public fcj(xx40 xx40Var, xx40 xx40Var2) {
        this.a = xx40Var;
        this.b = xx40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcj)) {
            return false;
        }
        fcj fcjVar = (fcj) obj;
        return jl40.l(this.a, fcjVar.a) && jl40.l(this.b, fcjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Devices(keyboards=" + this.a + ", mice=" + this.b + ')';
    }
}
