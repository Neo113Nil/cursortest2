package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public abstract class g2z0 {
    public static final void a(f530 f530Var, wp2 wp2Var, iqx iqxVar, fid fidVar, int i) {
        f530 f530Var2;
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-808707434);
        if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i2 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(iqxVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar = btsVar2;
            jeb1.f(a.X(iqxVar.d, Extension.FIX_SPACE, null, null, new f0z0(4), 30), f530Var2, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).k, btsVar, (i2 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, 0, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(f530Var, (Object) wp2Var, (Object) iqxVar, i, 29);
        }
    }

    public static final void b(f530 f530Var, iqx iqxVar, wp2 wp2Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1214175127);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(iqxVar) ? 32 : 16) | (btsVar.k(wp2Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            a(an91.k(new x2y(1.0f, true), 12.0f), wp2Var, iqxVar, btsVar, ((i2 << 3) & 896) | ((i2 >> 3) & 112));
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar);
            }
            c530 c530Var = c530.a;
            f530 d2 = u3a1.d(an91.k(q791.b(c530Var, (zx40) Q, null, false, null, null, slsVar, 28), 8.0f), "closeLabelInfo");
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            o4b1.b(mt71.m(dzg0.ic_cross_close_white, 0, btsVar), null, ljs0.m(c530Var, 24.0f), null, null, 0.0f, new c36(tje.n(wp2Var, btsVar), 5), btsVar, 440, 56);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(f530Var, iqxVar, wp2Var, slsVar, i, 21);
        }
    }
}
