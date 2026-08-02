package xsna;

import xsna.q630;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class z5q0 extends q630.c implements noy {
    public float p;
    public float q;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int k;
        int j2;
        if (Float.isNaN(this.p) || o6j.k(j) != 0) {
            k = o6j.k(j);
        } else {
            int r0 = ep10Var.r0(this.p);
            k = o6j.i(j);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 <= k) {
                k = r0;
            }
        }
        int i = o6j.i(j);
        if (Float.isNaN(this.q) || o6j.j(j) != 0) {
            j2 = o6j.j(j);
        } else {
            int r02 = ep10Var.r0(this.q);
            j2 = o6j.h(j);
            int i2 = r02 >= 0 ? r02 : 0;
            if (i2 <= j2) {
                j2 = i2;
            }
        }
        tra0 N = zo10Var.N(s6j.a(k, i, j2, o6j.h(j)));
        return ep10Var.Q(N.b, N.c, jgp.b, new fuc0(N, 17));
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        int Z = zoxVar.Z(i);
        int r0 = !Float.isNaN(this.q) ? fVar.r0(this.q) : 0;
        return Z < r0 ? r0 : Z;
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        int M = zoxVar.M(i);
        int r0 = !Float.isNaN(this.p) ? fVar.r0(this.p) : 0;
        return M < r0 ? r0 : M;
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        int j0 = zoxVar.j0(i);
        int r0 = !Float.isNaN(this.q) ? fVar.r0(this.q) : 0;
        return j0 < r0 ? r0 : j0;
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        int l0 = zoxVar.l0(i);
        int r0 = !Float.isNaN(this.p) ? fVar.r0(this.p) : 0;
        return l0 < r0 ? r0 : l0;
    }
}
