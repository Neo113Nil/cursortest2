package xsna;

import xsna.q630;

/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
public abstract class bpx extends q630.c implements noy {
    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        long i2 = i2(zo10Var, j);
        if (j2()) {
            i2 = s6j.e(j, i2);
        }
        tra0 N = zo10Var.N(i2);
        return ep10Var.Q(N.b, N.c, jgp.b, new u6k(N, 15));
    }

    public abstract long i2(zo10 zo10Var, long j);

    public abstract boolean j2();

    @Override // xsna.noy
    public int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.Z(i);
    }

    @Override // xsna.noy
    public int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.M(i);
    }

    @Override // xsna.noy
    public int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.j0(i);
    }

    @Override // xsna.noy
    public int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.l0(i);
    }
}
