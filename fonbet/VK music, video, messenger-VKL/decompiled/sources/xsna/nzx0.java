package xsna;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.q630;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class nzx0 extends q630.c implements noy {
    public Direction p;
    public boolean q;
    public wzs<? super q9x, ? super LayoutDirection, h9x> r;

    public nzx0() {
        throw null;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        Direction direction = this.p;
        Direction direction2 = Direction.Vertical;
        int k = direction != direction2 ? 0 : o6j.k(j);
        Direction direction3 = this.p;
        Direction direction4 = Direction.Horizontal;
        tra0 N = zo10Var.N(s6j.a(k, (this.p == direction2 || !this.q) ? o6j.i(j) : Integer.MAX_VALUE, direction3 == direction4 ? o6j.j(j) : 0, (this.p == direction4 || !this.q) ? o6j.h(j) : Integer.MAX_VALUE));
        int g = swe0.g(N.b, o6j.k(j), o6j.i(j));
        int g2 = swe0.g(N.c, o6j.j(j), o6j.h(j));
        return ep10Var.Q(g, g2, jgp.b, new rpg0(this, g, N, g2, ep10Var));
    }
}
