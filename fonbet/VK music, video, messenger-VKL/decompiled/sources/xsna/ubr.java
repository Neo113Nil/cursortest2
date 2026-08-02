package xsna;

import androidx.compose.foundation.layout.Direction;
import xsna.q630;

/* compiled from: Size.kt */
/* loaded from: classes11.dex */
public final class ubr extends q630.c implements noy {
    public Direction p;
    public float q;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        int k;
        int i;
        int h;
        int i2;
        if (!o6j.e(j) || this.p == Direction.Vertical) {
            k = o6j.k(j);
            i = o6j.i(j);
        } else {
            int round = Math.round(o6j.i(j) * this.q);
            int k2 = o6j.k(j);
            k = o6j.i(j);
            if (round < k2) {
                round = k2;
            }
            if (round <= k) {
                k = round;
            }
            i = k;
        }
        if (!o6j.d(j) || this.p == Direction.Horizontal) {
            int j2 = o6j.j(j);
            h = o6j.h(j);
            i2 = j2;
        } else {
            int round2 = Math.round(o6j.h(j) * this.q);
            int j3 = o6j.j(j);
            i2 = o6j.h(j);
            if (round2 < j3) {
                round2 = j3;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            h = i2;
        }
        tra0 N = zo10Var.N(s6j.a(k, i, i2, h));
        return ep10Var.Q(N.b, N.c, jgp.b, new i4e(N, 28));
    }
}
