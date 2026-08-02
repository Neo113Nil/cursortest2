package defpackage;

/* loaded from: classes14.dex */
public final class bhv0 extends khv0 {
    public final jhv0 a;

    public bhv0(jhv0 jhv0Var) {
        this.a = jhv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhv0) && jl40.l(this.a, ((bhv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public bhv0() {
        this(0);
    }

    public bhv0(int i) {
        this(jhv0.c);
    }
}
