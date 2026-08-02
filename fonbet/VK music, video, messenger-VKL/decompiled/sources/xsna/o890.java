package xsna;

import xsna.q630;

/* compiled from: Padding.kt */
/* loaded from: classes11.dex */
public final class o890 extends q630.c implements noy {
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int r0 = ep10Var.r0(this.r) + ep10Var.r0(this.p);
        int r02 = ep10Var.r0(this.s) + ep10Var.r0(this.q);
        tra0 N = zo10Var.N(s6j.i(-r0, -r02, j));
        return ep10Var.Q(s6j.g(N.b + r0, j), s6j.f(N.c + r02, j), jgp.b, new az2(24, this, N));
    }
}
