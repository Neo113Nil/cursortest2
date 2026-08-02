package defpackage;

/* loaded from: classes10.dex */
public abstract class c92 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(mv60 mv60Var, f530 f530Var, long j, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1776202187);
        int i3 = (btsVar.k(mv60Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16) | 128;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                btsVar.Y();
                i2 = i3 & (-897);
            }
            btsVar.u();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new eo1(6, mv60Var);
                btsVar.o0(Q);
            }
            pva1.a(mv60Var, x4c.c, wwg.S(-1653527038, true, new z82(j, fnq0.b(f530Var, false, (tls) Q)), btsVar), btsVar, i4 | 432);
        } else {
            btsVar.Y();
        }
        long j2 = j;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a92(mv60Var, f530Var, j2, i);
        }
    }

    public static final void b(int i, int i2, fid fidVar, f530 f530Var) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            oeb1.c(btsVar, bb1.h(ljs0.n(f530Var, a, 25.0f), new cs0(((osy0) btsVar.m(psy0.a)).a, 5)));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, i2, 1);
        }
    }
}
