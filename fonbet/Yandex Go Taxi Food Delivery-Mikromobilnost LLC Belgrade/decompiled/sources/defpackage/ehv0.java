package defpackage;

/* loaded from: classes14.dex */
public final class ehv0 extends khv0 {
    public final jhv0 a;

    public ehv0(jhv0 jhv0Var) {
        this.a = jhv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehv0) && jl40.l(this.a, ((ehv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ehv0() {
        this(0);
    }

    public ehv0(int i) {
        this(jhv0.c);
    }
}
