package defpackage;

import androidx.compose.animation.k;
import androidx.compose.ui.platform.j;

/* loaded from: classes14.dex */
public abstract class huz0 {
    public static final void a(ebp0 ebp0Var, euz0 euz0Var, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1236476648);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(euz0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            p9b1.c(ebp0Var2, euz0Var.a, c530Var, euz0Var.b, bza1.c(xya1.e(btsVar2).h.a, fwiVar), 0, 0, null, null, null, 0, 0, null, btsVar, i3 & 910, 0, 8176);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(ebp0Var, euz0Var, f530Var2, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(nvz0 nvz0Var, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        tls tlsVar2;
        f530 f530Var2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2125447723);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(nvz0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i4 |= btsVar.e(tlsVar2) ? 256 : 128;
            if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
                btsVar.Y();
                f530Var2 = f530Var;
            } else {
                o430 o430Var = did.a;
                if (i5 != 0) {
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new f0z0(20);
                        btsVar.o0(Q);
                    }
                    tlsVar2 = (tls) Q;
                }
                c530 c530Var = c530.a;
                f530 m = ymb1.m(c530Var);
                quz0 quz0Var = (quz0) nvz0Var.c.getValue();
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new ur70(29);
                    btsVar.o0(Q2);
                }
                w2o a = k.q(1, (tls) Q2, null).a(k.e(null, 3));
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = new ur70(29);
                    btsVar.o0(Q3);
                }
                ttb1.a(quz0Var, m, a, k.v(1, (tls) Q3, null).a(k.f(null, 3)), "TooltipContent", wwg.S(185248453, true, new nhu0(tlsVar2, nvz0Var), btsVar), btsVar, 224640, 0);
                f530Var2 = c530Var;
            }
            tls tlsVar3 = tlsVar2;
            v = btsVar.v();
            if (v == null) {
                v.d = new v4(nvz0Var, f530Var2, tlsVar3, i, i2, 29);
                return;
            }
            return;
        }
        tlsVar2 = tlsVar;
        if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
        }
        tls tlsVar32 = tlsVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(ibp0 ibp0Var, tvz0 tvz0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(499511296);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(tvz0Var) : btsVar.e(tvz0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (tvz0Var != null) {
                btsVar.e0(-1120466047);
                sya1.a(rlb1.c(), an91.o(c530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), null, tvz0Var.a, btsVar, 0, 4);
                btsVar.t(false);
            } else {
                if (tvz0Var != null) {
                    throw unr0.y(-1005977680, btsVar, false);
                }
                btsVar.e0(-1005969748);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(ibp0Var, tvz0Var, f530Var2, i, 1);
        }
    }
}
