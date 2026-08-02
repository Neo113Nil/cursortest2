package xsna;

import xsna.dt1;

/* compiled from: BoxWithConstraints.kt */
/* loaded from: classes11.dex */
public final class xa8 implements va8, qa8 {
    public final azl a;
    public final long b;

    public xa8(ztm0 ztm0Var, long j) {
        this.a = ztm0Var;
        this.b = j;
    }

    @Override // xsna.qa8
    public final q630 a(q630 q630Var) {
        dt1.a.getClass();
        return new ha8(dt1.a.f, true, a5x.a);
    }

    @Override // xsna.qa8
    public final q630 b(q630 q630Var, dt1 dt1Var) {
        return q630Var.g(new ha8(dt1Var, false, a5x.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa8)) {
            return false;
        }
        xa8 xa8Var = (xa8) obj;
        return epx.f(this.a, xa8Var.a) && o6j.c(this.b, xa8Var.b);
    }

    @Override // xsna.va8
    public final long f() {
        return this.b;
    }

    @Override // xsna.va8
    public final float g() {
        long j = this.b;
        if (!o6j.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.j1(o6j.h(j));
    }

    @Override // xsna.va8
    public final float h() {
        return this.a.j1(o6j.k(this.b));
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.va8
    public final float i() {
        return this.a.j1(o6j.j(this.b));
    }

    @Override // xsna.va8
    public final float j() {
        long j = this.b;
        if (!o6j.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.j1(o6j.i(j));
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) o6j.l(this.b)) + ')';
    }
}
