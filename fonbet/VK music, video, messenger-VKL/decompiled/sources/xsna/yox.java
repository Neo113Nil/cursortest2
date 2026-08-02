package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;

/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
public final class yox extends bpx {
    public IntrinsicSize p;
    public boolean q;

    @Override // xsna.bpx
    public final long i2(zo10 zo10Var, long j) {
        int j0 = this.p == IntrinsicSize.Min ? zo10Var.j0(o6j.i(j)) : zo10Var.Z(o6j.i(j));
        if (j0 < 0) {
            j0 = 0;
        }
        if (j0 < 0) {
            wzw.a("height must be >= 0");
        }
        return s6j.h(0, Integer.MAX_VALUE, j0, j0);
    }

    @Override // xsna.bpx
    public final boolean j2() {
        return this.q;
    }

    @Override // xsna.bpx, xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.p == IntrinsicSize.Min ? zoxVar.j0(i) : zoxVar.Z(i);
    }

    @Override // xsna.bpx, xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.p == IntrinsicSize.Min ? zoxVar.j0(i) : zoxVar.Z(i);
    }
}
