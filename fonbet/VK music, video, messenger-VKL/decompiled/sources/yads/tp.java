package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes10.dex */
public abstract class tp {
    public final np a;
    public final sp b;
    public pp c;
    public final int d;

    public tp(qp qpVar, sp spVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = spVar;
        this.d = i;
        this.a = new np(qpVar, j, j2, j3, j4, j5);
    }

    public final int a(ld0 ld0Var, hh2 hh2Var) {
        long j;
        long j2;
        while (true) {
            pp ppVar = this.c;
            if (ppVar == null) {
                throw new IllegalStateException();
            }
            long j3 = ppVar.f;
            long j4 = ppVar.g;
            j = ppVar.h;
            if (j4 - j3 <= this.d) {
                this.c = null;
                this.b.a();
                if (j3 == ld0Var.d) {
                    return 0;
                }
                hh2Var.a = j3;
                return 1;
            }
            j2 = ld0Var.d;
            long j5 = j - j2;
            if (j5 < 0 || j5 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                break;
            }
            ld0Var.a((int) j5);
            ld0Var.f = 0;
            rp a = this.b.a(ld0Var, ppVar.b);
            int i = a.a;
            if (i == -3) {
                this.c = null;
                this.b.a();
                if (j == ld0Var.d) {
                    return 0;
                }
                hh2Var.a = j;
                return 1;
            }
            if (i == -2) {
                long j6 = a.b;
                long j7 = a.c;
                ppVar.d = j6;
                ppVar.f = j7;
                ppVar.h = pp.a(ppVar.b, j6, ppVar.e, j7, ppVar.g, ppVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j8 = a.c - ld0Var.d;
                    if (j8 >= 0 && j8 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        ld0Var.a((int) j8);
                    }
                    this.c = null;
                    this.b.a();
                    long j9 = a.c;
                    if (j9 == ld0Var.d) {
                        return 0;
                    }
                    hh2Var.a = j9;
                    return 1;
                }
                long j10 = a.b;
                long j11 = a.c;
                ppVar.e = j10;
                ppVar.g = j11;
                ppVar.h = pp.a(ppVar.b, ppVar.d, j10, ppVar.f, j11, ppVar.c);
            }
        }
        if (j == j2) {
            return 0;
        }
        hh2Var.a = j;
        return 1;
    }

    public final void a(long j) {
        pp ppVar = this.c;
        if (ppVar == null || ppVar.a != j) {
            long a = this.a.a.a(j);
            np npVar = this.a;
            this.c = new pp(j, a, npVar.c, npVar.d, npVar.e, npVar.f, npVar.g);
        }
    }
}
