package xsna;

import xsna.q630;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class uxj0 extends q630.c implements noy {
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int k;
        int i;
        int j2;
        int h;
        long a;
        long i2 = i2(ep10Var);
        if (this.t) {
            a = s6j.e(j, i2);
        } else {
            if (Float.isNaN(this.p)) {
                k = o6j.k(j);
                int i3 = o6j.i(i2);
                if (k > i3) {
                    k = i3;
                }
            } else {
                k = o6j.k(i2);
            }
            if (Float.isNaN(this.r)) {
                i = o6j.i(j);
                int k2 = o6j.k(i2);
                if (i < k2) {
                    i = k2;
                }
            } else {
                i = o6j.i(i2);
            }
            if (Float.isNaN(this.q)) {
                j2 = o6j.j(j);
                int h2 = o6j.h(i2);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = o6j.j(i2);
            }
            if (Float.isNaN(this.s)) {
                h = o6j.h(j);
                int j3 = o6j.j(i2);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = o6j.h(i2);
            }
            a = s6j.a(k, i, j2, h);
        }
        tra0 N = zo10Var.N(a);
        return ep10Var.Q(N.b, N.c, jgp.b, new hsc0(N, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i2(ep10 ep10Var) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.r)) {
            i = Integer.MAX_VALUE;
        } else {
            i = ep10Var.r0(this.r);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.s)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = ep10Var.r0(this.s);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.p)) {
            i3 = ep10Var.r0(this.p);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.q)) {
            int r0 = ep10Var.r0(this.q);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 > i2) {
                r0 = i2;
            }
            if (r0 != Integer.MAX_VALUE) {
                i4 = r0;
            }
        }
        return s6j.a(i3, i, i4, i2);
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        long i2 = i2(fVar);
        if (o6j.f(i2)) {
            return o6j.h(i2);
        }
        if (!this.t) {
            i = s6j.g(i, i2);
        }
        return s6j.f(zoxVar.Z(i), i2);
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        long i2 = i2(fVar);
        if (o6j.g(i2)) {
            return o6j.i(i2);
        }
        if (!this.t) {
            i = s6j.f(i, i2);
        }
        return s6j.g(zoxVar.M(i), i2);
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        long i2 = i2(fVar);
        if (o6j.f(i2)) {
            return o6j.h(i2);
        }
        if (!this.t) {
            i = s6j.g(i, i2);
        }
        return s6j.f(zoxVar.j0(i), i2);
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        long i2 = i2(fVar);
        if (o6j.g(i2)) {
            return o6j.i(i2);
        }
        if (!this.t) {
            i = s6j.f(i, i2);
        }
        return s6j.g(zoxVar.l0(i), i2);
    }
}
