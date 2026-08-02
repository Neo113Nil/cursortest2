package defpackage;

/* loaded from: classes6.dex */
public final class nrs0 implements prs0 {
    public final float a;
    public final boolean b;
    public final boolean c;

    public nrs0(float f, boolean z, boolean z2) {
        this.a = f;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrs0)) {
            return false;
        }
        nrs0 nrs0Var = (nrs0) obj;
        return Float.compare(this.a, nrs0Var.a) == 0 && this.b == nrs0Var.b && this.c == nrs0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
