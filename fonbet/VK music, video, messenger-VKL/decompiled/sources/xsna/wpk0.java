package xsna;

import xsna.wq2;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class wpk0<V extends wq2> implements tlr0<V> {
    public final tlr0<V> a;
    public final long b;

    public wpk0(tlr0<V> tlr0Var, long j) {
        this.a = tlr0Var;
        this.b = j;
    }

    @Override // xsna.tlr0
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        return this.a.c(v, v2, v3) + this.b;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v3 : this.a.d(j - j2, v, v2, v3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wpk0)) {
            return false;
        }
        wpk0 wpk0Var = (wpk0) obj;
        return wpk0Var.b == this.b && epx.f(wpk0Var.a, this.a);
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v : this.a.g(j - j2, v, v2, v3);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
