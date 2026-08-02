package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;

/* loaded from: classes5.dex */
public abstract class ik11 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wls wlsVar, wls wlsVar2, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-376001669);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(wlsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
                btsVar.Y();
            } else {
                c530 c530Var = c530.a;
                if (i4 != 0) {
                    f530Var2 = c530Var;
                }
                fwi fwiVar = (fwi) btsVar.m(j.h);
                btsVar.e0(-560344589);
                int w0 = (int) fwiVar.w0(((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
                btsVar.t(false);
                boolean c = btsVar.c(w0);
                Object Q = btsVar.Q();
                if (c || Q == did.a) {
                    Q = new hk11(w0);
                    btsVar.o0(Q);
                }
                z910 z910Var = (z910) Q;
                int i5 = i3 >> 3;
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, f530Var2);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, z910Var);
                qje.W(btsVar, d.e, o);
                wls wlsVar3 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar3);
                }
                qje.W(btsVar, d.d, d);
                if (wlsVar != null) {
                    btsVar.e0(1102261239);
                    xvz.u(i3 & 14, wlsVar, btsVar, false);
                } else {
                    btsVar.e0(1102306437);
                    pi6.a(ljs0.q(c530Var, 0.0f), btsVar, 6);
                    btsVar.t(false);
                }
                if (wlsVar2 != null) {
                    btsVar.e0(1102394167);
                    xvz.u(i5 & 14, wlsVar2, btsVar, false);
                } else {
                    btsVar.e0(1102439365);
                    pi6.a(ljs0.q(c530Var, 0.0f), btsVar, 6);
                    btsVar.t(false);
                }
                btsVar.t(true);
            }
            f530 f530Var3 = f530Var2;
            v = btsVar.v();
            if (v == null) {
                v.d = new gk11(wlsVar, wlsVar2, f530Var3, i, i2, 0);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
        }
        f530 f530Var32 = f530Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
