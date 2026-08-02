package defpackage;

/* loaded from: classes10.dex */
public final class a6t0 extends ml6 {
    public final long a;

    public a6t0(long j) {
        this.a = j;
    }

    @Override // defpackage.ml6
    public final void a(float f, long j, ka90 ka90Var) {
        eb2 eb2Var = (eb2) ka90Var;
        eb2Var.c(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = ldc.b(j2, ldc.d(j2) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        eb2Var.f(j2);
        if (eb2Var.c != null) {
            eb2Var.j(null);
        }
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a6t0) {
            return ldc.c(this.a, ((a6t0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) ldc.i(this.a)) + ')';
    }
}
