package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public abstract class o3b1 {
    public static final void a(sls slsVar, f530 f530Var, boolean z, wls wlsVar, fid fidVar, int i) {
        wls wlsVar2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1316660641);
        int i2 = i | (btsVar.e(slsVar) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | 3456;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            a7u0 a7u0Var = j8w.a;
            f530 b = q791.b(f530Var.k(ni20.a), null, gsk0.a(24.0f, 4), true, null, new awk0(0), slsVar, 8);
            z910 d = pi6.d(x4c.y, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar3);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.e0(-1874697310);
            qwd qwdVar = vee.a;
            float floatValue = ((Number) btsVar.m(qwdVar)).floatValue();
            btsVar.t(false);
            wlsVar2 = wlsVar;
            sb2.b(qwdVar.a(Float.valueOf(floatValue)), wlsVar2, btsVar, 56);
            btsVar.t(true);
            z2 = true;
        } else {
            wlsVar2 = wlsVar;
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(slsVar, f530Var, z2, wlsVar2, i, 8);
        }
    }

    public static final void b(Bitmap bitmap, f530 f530Var, Bitmap bitmap2, fid fidVar, int i) {
        c530 c530Var;
        boolean z;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1296153957);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.e(bitmap) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        int i3 = i2 | (btsVar.e(bitmap2) ? 2048 : 1024) | 221184;
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            btsVar.e0(63445931);
            f530 n = ljs0.n(f530Var, 56.0f, 56.0f);
            btsVar.e0(1027529147);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(n, true, (tls) Q);
            btsVar.t(false);
            btsVar.t(false);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var2 = c530.a;
            f530 n2 = ljs0.n(c530Var2, 56.0f, 40.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, n2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            xw91 xw91Var = mhe.e;
            if (bitmap2 != null) {
                btsVar.e0(1352928070);
                f = 40.0f;
                c530Var = c530Var2;
                z = false;
                o4b1.c(new u92(bitmap2), null, ira1.i(ljs0.m(c530Var2, 40.0f), -20.0f), null, xw91Var, 0.0f, null, 0, btsVar, 24624, 232);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                z = false;
                f = 40.0f;
                btsVar.e0(1353169281);
                btsVar.t(false);
            }
            o4b1.c(new u92(bitmap), null, ljs0.m(c530Var, f), null, xw91Var, 0.0f, null, 0, btsVar, 25008, 232);
            btsVar.e0(1353667265);
            btsVar.t(z);
            btsVar.t(true);
            btsVar.e0(814135079);
            btsVar.t(z);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) bitmap, f530Var, (Object) bitmap2, i, 0);
        }
    }

    public static final fxy0 c(String str) {
        String g0 = evu0.g0(evu0.d0(str, "l:", "<error>"), ":d:", "<error>");
        String d0 = evu0.d0(str, ":d:", "<error>");
        if (g0.equals("<error>") || d0.equals("<error>")) {
            return null;
        }
        return new fxy0(d0, g0);
    }
}
