package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.e;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class bke {
    public static final yje a;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        qwd qwdVar = e.a;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = ldc.f;
        long j2 = ldc.b;
        a = new yje(j, j2, j2, ldc.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14), ldc.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final void a(yje yjeVar, f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-527864079);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yjeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            to5 to5Var = ake.a;
            f530 u = pw91.u(an91.m(fj91.d(m4m0.b(ibb1.c(f530Var, 3.0f, cyk0.c(4.0f), 0L, 0L, 28), yjeVar.a, qke.q), IntrinsicSize.Max), 0.0f, ake.d, 1), pw91.o(btsVar), 14);
            int i3 = (i2 << 3) & 7168;
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            aVar.invoke(uic.a, btsVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(yjeVar, f530Var, aVar, i, 18);
        }
    }

    public static final void b(f530 f530Var, yje yjeVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (btsVar.k(yjeVar) ? 32 : 16);
        }
        int i7 = i4 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                f530Var = c530.a;
            }
            if (i6 != 0) {
                yjeVar = a;
            }
            a(yjeVar, f530Var, wwg.S(-250345048, true, new sp5(24, tlsVar, yjeVar), btsVar), btsVar, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        yje yjeVar2 = yjeVar;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(f530Var2, yjeVar2, tlsVar, i, i2);
        }
    }

    public static final void c(String str, boolean z, yje yjeVar, f530 f530Var, zls zlsVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2001167027);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(yjeVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(zlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(slsVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            to5 to5Var = ake.a;
            float f = ake.c;
            i43 i43Var = new i43(f, true, new quz(11));
            boolean z2 = ((i3 & 112) == 32) | ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new ei0(1, slsVar, z);
                btsVar2.o0(Q);
            }
            f530 m = an91.m(ljs0.o(ljs0.c(q791.d(f530Var, z, str, null, (sls) Q, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            lhl0 a2 = khl0.a(i43Var, to5Var, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            if (zlsVar == null) {
                btsVar2.e0(-1597947094);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1597947093);
                float f2 = ake.e;
                f530 k = ljs0.k(c530.a, f2, 0.0f, f2, f2, 2);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d3 = b.d(btsVar2, k);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, d2);
                qje.W(btsVar2, wlsVar2, o2);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
                qje.W(btsVar2, wlsVar4, d3);
                zlsVar.invoke(new ldc(z ? yjeVar.c : yjeVar.e), btsVar2, 0);
                btsVar2.t(true);
                btsVar2.t(false);
            }
            long j = z ? yjeVar.b : yjeVar.d;
            m5b1.b(str, new x2y(1.0f, true), new ety0(j, ake.h, ake.i, null, null, null, ake.k, ake.b, ake.j, null, null, 16613240), null, 0, false, 1, 0, null, null, btsVar2, (i3 & 14) | 1572864, 952);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(str, z, yjeVar, f530Var, zlsVar, slsVar, i, 2);
        }
    }
}
