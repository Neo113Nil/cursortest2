package defpackage;

/* loaded from: classes2.dex */
public final class mya0 {
    public final cya0 a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ mya0(cya0 cya0Var, boolean z, int i) {
        this(cya0Var, false, (i & 4) != 0 ? false : z);
    }

    public final cya0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mya0)) {
            return false;
        }
        mya0 mya0Var = (mya0) obj;
        return jl40.l(this.a, mya0Var.a) && this.b == mya0Var.b && this.c == mya0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.k("[", this.a.a(), ", isGranted: ", this.c, "]");
    }

    public mya0(cya0 cya0Var, boolean z, boolean z2) {
        this.a = cya0Var;
        this.b = z;
        this.c = z2;
    }
}
