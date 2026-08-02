package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes10.dex */
public abstract class hg21 {
    public static final q46 a = new q46();

    public static final void a(qrg qrgVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1761274207);
        int i2 = i | (btsVar2.k(qrgVar) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(tlsVar2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 u = ljs0.u(ljs0.c(c530.a, 1.0f), null, 3);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            ay41.b(an91.m(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, 0.0f, 2), qrgVar.a, 0, tlsVar, 6, 0L, 0L, 0L, 0L, null, btsVar2, (i2 << 6) & 7168, 996);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            ay41.b(an91.m(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, 0.0f, 2), qrgVar.b, 0, tlsVar2, 5, 0L, 0L, 0L, 0L, null, btsVar2, (i2 << 3) & 7168, 996);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(qrgVar, tlsVar, tlsVar2, i, 19);
        }
    }

    public static final long b(androidx.compose.foundation.pager.d dVar) {
        return m810.c(dVar.l() * dVar.q()) + (dVar.k() * dVar.q());
    }

    public static void c(String str) {
        try {
            new URL(str);
        } catch (MalformedURLException unused) {
            ny61.g("Invalid url ".concat(str));
        }
    }
}
