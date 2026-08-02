package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes10.dex */
public final class df2 {
    public static final zn1 s = new zn1(new Object());
    public final w73 a;
    public final zn1 b;
    public final long c;
    public final long d;
    public final int e;
    public final qn0 f;
    public final boolean g;
    public final m83 h;
    public final x83 i;
    public final List j;
    public final zn1 k;
    public final boolean l;
    public final int m;
    public final ff2 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public df2(w73 w73Var, zn1 zn1Var, long j, long j2, int i, qn0 qn0Var, boolean z, m83 m83Var, x83 x83Var, List list, zn1 zn1Var2, boolean z2, int i2, ff2 ff2Var, long j3, long j4, long j5, boolean z3) {
        this.a = w73Var;
        this.b = zn1Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = qn0Var;
        this.g = z;
        this.h = m83Var;
        this.i = x83Var;
        this.j = list;
        this.k = zn1Var2;
        this.l = z2;
        this.m = i2;
        this.n = ff2Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z3;
    }

    public static df2 a(x83 x83Var) {
        s73 s73Var = w73.b;
        zn1 zn1Var = s;
        return new df2(s73Var, zn1Var, C.TIME_UNSET, 0L, 1, null, false, m83.e, x83Var, tn2.f, zn1Var, false, 0, ff2.e, 0L, 0L, 0L, false);
    }

    public final df2 a(zn1 zn1Var, long j, long j2, long j3, long j4, m83 m83Var, x83 x83Var, List list) {
        return new df2(this.a, zn1Var, j2, j3, this.e, this.f, this.g, m83Var, x83Var, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.o);
    }

    public final df2 a(w73 w73Var) {
        return new df2(w73Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final df2 a(int i) {
        return new df2(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final df2 a(qn0 qn0Var) {
        return new df2(this.a, this.b, this.c, this.d, this.e, qn0Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final df2 a(zn1 zn1Var) {
        return new df2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zn1Var, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }
}
