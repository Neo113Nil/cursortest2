package defpackage;

/* loaded from: classes2.dex */
public final class ocs0 implements rcs0 {
    public final String a;
    public final boolean b;
    public final fed0 c;

    public ocs0(String str, boolean z, fed0 fed0Var) {
        this.a = str;
        this.b = z;
        this.c = fed0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocs0)) {
            return false;
        }
        ocs0 ocs0Var = (ocs0) obj;
        return jl40.l(this.a, ocs0Var.a) && this.b == ocs0Var.b && this.c.equals(ocs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Confirmation3ds(url=" + this.a + ", isReady=" + this.b + ", loadingContent=" + this.c + ')';
    }
}
