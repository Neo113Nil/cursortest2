package xsna;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class vpk0<T> implements iq2<T> {
    public final iq2<T> a;
    public final long b;

    public vpk0(phr phrVar, long j) {
        this.a = phrVar;
        this.b = j;
    }

    @Override // xsna.iq2
    public final <V extends wq2> tlr0<V> a(itp0<T, V> itp0Var) {
        return new wpk0(this.a.a(itp0Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vpk0)) {
            return false;
        }
        vpk0 vpk0Var = (vpk0) obj;
        return vpk0Var.b == this.b && epx.f(vpk0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
