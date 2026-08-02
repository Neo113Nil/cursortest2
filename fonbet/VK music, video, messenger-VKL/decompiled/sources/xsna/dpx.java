package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;

/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
public final class dpx extends bpx {
    public IntrinsicSize p;
    public boolean q;

    @Override // xsna.bpx
    public final long i2(zo10 zo10Var, long j) {
        int M = this.p == IntrinsicSize.Min ? zo10Var.M(o6j.h(j)) : zo10Var.l0(o6j.h(j));
        if (M < 0) {
            M = 0;
        }
        if (M < 0) {
            wzw.a("width must be >= 0");
        }
        return s6j.h(M, M, 0, Integer.MAX_VALUE);
    }

    @Override // xsna.bpx
    public final boolean j2() {
        return this.q;
    }

    @Override // xsna.bpx, xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.p == IntrinsicSize.Min ? zoxVar.M(i) : zoxVar.l0(i);
    }

    @Override // xsna.bpx, xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.p == IntrinsicSize.Min ? zoxVar.M(i) : zoxVar.l0(i);
    }
}
