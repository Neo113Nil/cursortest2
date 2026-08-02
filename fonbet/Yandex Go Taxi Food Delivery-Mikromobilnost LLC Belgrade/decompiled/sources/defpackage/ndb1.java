package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class ndb1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-255441030);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i3 = 1;
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new ve6(f530Var, slsVar, i, i3);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) != 0 && !btsVar.C()) {
            btsVar.Y();
            btsVar.u();
            throw null;
        }
        btsVar.e0(-897180073);
        rs31 b = jjo.b(btsVar);
        hs31 a = jjo.a(btsVar);
        btsVar.e0(544794079);
        boolean e = btsVar.e(a);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new w4(a, 5);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        ooc.G(qoi0.a(wk7.class), b, null, vfc.h(wk7.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
        btsVar.t(false);
        ny61.u();
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(463543849);
        if (btsVar.V(i & 1, i != 0)) {
            f530 m = an91.m(c530.a, 8.0f, 0.0f, 2);
            odd.a.getClass();
            web1.c(m, 0.0f, false, 0.0f, null, null, odd.f, null, null, null, null, null, false, btsVar, 1572870, 0, 8126);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, 27);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1451544389);
        if (btsVar.V(i & 1, i != 0)) {
            mdb1.d(271.0f, 6, btsVar, null);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, 29);
        }
    }

    public static final void d(vls0 vls0Var, fid fidVar, int i) {
        int i2;
        f530 f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-575836164);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vls0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            y7m y7mVar = vls0Var.c;
            c530 c530Var = c530.a;
            if (y7mVar == null || (f530Var = ljs0.e(c530Var, y7mVar.a)) == null) {
                f530Var = c530Var;
            }
            f530 k = ljs0.c(c530Var, 1.0f).k(f530Var);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ukr0(23);
                btsVar.o0(Q);
            }
            b2q0.b(k, 6.0f, 0L, false, false, null, (tls) Q, btsVar, 1572912, 60);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(vls0Var, i, 7);
        }
    }

    public static final int e(s6y s6yVar) {
        List list = s6yVar.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((t6y) ((n6y) list.get(i2))).p;
        }
        return (i / list.size()) + s6yVar.q;
    }
}
