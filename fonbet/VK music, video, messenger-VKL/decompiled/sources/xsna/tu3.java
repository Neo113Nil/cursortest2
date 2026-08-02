package xsna;

import xsna.q630;

/* compiled from: AspectRatio.kt */
/* loaded from: classes11.dex */
public final class tu3 extends q630.c implements noy {
    public float p;
    public boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (xsna.q9x.b(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (xsna.q9x.b(r5, 0) == false) goto L53;
     */
    @Override // xsna.noy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        long i2;
        if (this.q) {
            i2 = i2(j, true);
            if (q9x.b(i2, 0L)) {
                i2 = j2(j, true);
                if (q9x.b(i2, 0L)) {
                    i2 = k2(j, true);
                    if (q9x.b(i2, 0L)) {
                        i2 = l2(j, true);
                        if (q9x.b(i2, 0L)) {
                            i2 = i2(j, false);
                            if (q9x.b(i2, 0L)) {
                                i2 = j2(j, false);
                                if (q9x.b(i2, 0L)) {
                                    i2 = k2(j, false);
                                    if (q9x.b(i2, 0L)) {
                                        i2 = l2(j, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            i2 = j2(j, true);
            if (q9x.b(i2, 0L)) {
                i2 = i2(j, true);
                if (q9x.b(i2, 0L)) {
                    i2 = l2(j, true);
                    if (q9x.b(i2, 0L)) {
                        i2 = k2(j, true);
                        if (q9x.b(i2, 0L)) {
                            i2 = j2(j, false);
                            if (q9x.b(i2, 0L)) {
                                i2 = i2(j, false);
                                if (q9x.b(i2, 0L)) {
                                    i2 = l2(j, false);
                                    if (q9x.b(i2, 0L)) {
                                        i2 = k2(j, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!q9x.b(i2, 0L)) {
            int i = (int) (i2 >> 32);
            int i3 = (int) (4294967295L & i2);
            if (!((i >= 0) & (i3 >= 0))) {
                wzw.a("width and height must be >= 0");
            }
            j = s6j.h(i, i, i3, i3);
        }
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new t6(N, 7));
    }

    public final long i2(long j, boolean z) {
        int round;
        int h = o6j.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h * this.p)) <= 0) {
            return 0L;
        }
        if (!z || sua.o(round, h, j)) {
            return (round << 32) | (h & 4294967295L);
        }
        return 0L;
    }

    public final long j2(long j, boolean z) {
        int round;
        int i = o6j.i(j);
        if (i == Integer.MAX_VALUE || (round = Math.round(i / this.p)) <= 0) {
            return 0L;
        }
        if (!z || sua.o(i, round, j)) {
            return (i << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.p) : zoxVar.Z(i);
    }

    public final long k2(long j, boolean z) {
        int j2 = o6j.j(j);
        int round = Math.round(j2 * this.p);
        if (round <= 0) {
            return 0L;
        }
        if (!z || sua.o(round, j2, j)) {
            return (round << 32) | (j2 & 4294967295L);
        }
        return 0L;
    }

    public final long l2(long j, boolean z) {
        int k = o6j.k(j);
        int round = Math.round(k / this.p);
        if (round <= 0) {
            return 0L;
        }
        if (!z || sua.o(k, round, j)) {
            return (k << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.p) : zoxVar.M(i);
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.p) : zoxVar.j0(i);
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.p) : zoxVar.l0(i);
    }
}
