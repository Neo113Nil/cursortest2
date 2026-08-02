package defpackage;

/* loaded from: classes2.dex */
public final class le21 implements oe21 {
    public final be21 a;

    public le21(be21 be21Var) {
        this.a = be21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le21) && jl40.l(this.a, ((le21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(content=" + this.a + ')';
    }
}
