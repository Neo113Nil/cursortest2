package xsna;

/* compiled from: InternalPullToRefresh.kt */
/* loaded from: classes17.dex */
final class bge0 extends d730<gge0> {
    public final boolean a;
    public final gzs<s3q0> b;
    public final boolean c;
    public final kge0 d;
    public final float e;

    public bge0() {
        throw null;
    }

    public bge0(boolean z, gzs gzsVar, kge0 kge0Var, float f) {
        this.a = z;
        this.b = gzsVar;
        this.c = true;
        this.d = kge0Var;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bge0)) {
            return false;
        }
        bge0 bge0Var = (bge0) obj;
        return this.a == bge0Var.a && epx.f(this.b, bge0Var.b) && this.c == bge0Var.c && epx.f(this.d, bge0Var.d) && pco.b(this.e, bge0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + qoy.b(sf3.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    @Override // xsna.d730
    public final gge0 r() {
        return new gge0(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // xsna.d730
    public final void s(gge0 gge0Var) {
        gge0 gge0Var2 = gge0Var;
        gge0Var2.s = this.b;
        gge0Var2.t = this.c;
        gge0Var2.u = this.d;
        gge0Var2.v = this.e;
        boolean z = gge0Var2.r;
        boolean z2 = this.a;
        if (z != z2) {
            gge0Var2.r = z2;
            myc0.h(gge0Var2.W1(), null, null, new ige0(gge0Var2, null), 3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullToRefreshElement(isRefreshing=");
        sb.append(this.a);
        sb.append(", onRefresh=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", threshold=");
        return ir.f(')', this.e, sb);
    }
}
