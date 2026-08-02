package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.n;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class ldb1 {
    public static au2 a;

    public static final void a(Object obj, int i, z5y z5yVar, a aVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.e(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(z5yVar) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean k = btsVar.k(obj) | btsVar.k(z5yVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new y5y(obj, z5yVar);
                btsVar.o0(Q);
            }
            y5y y5yVar = (y5y) Q;
            y5yVar.c = i;
            oz40 oz40Var = y5yVar.g;
            qwd qwdVar = n.a;
            y5y y5yVar2 = (y5y) btsVar.m(qwdVar);
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                if (y5yVar2 != ((y5y) oz40Var.getValue())) {
                    oz40Var.setValue(y5yVar2);
                    if (y5yVar.d > 0) {
                        y5y y5yVar3 = y5yVar.e;
                        if (y5yVar3 != null) {
                            y5yVar3.b();
                        }
                        if (y5yVar2 != null) {
                            y5yVar2.a();
                        } else {
                            y5yVar2 = null;
                        }
                        y5yVar.e = y5yVar2;
                    }
                }
                tje.W(D, O, e);
                boolean k2 = btsVar.k(y5yVar);
                Object Q2 = btsVar.Q();
                int i4 = 8;
                if (k2 || Q2 == o430Var) {
                    Q2 = new ptw(i4, y5yVar);
                    btsVar.o0(Q2);
                }
                zpn.a(y5yVar, (tls) Q2, btsVar);
                sb2.b(qwdVar.a(y5yVar), aVar, btsVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                tje.W(D, O, e);
                throw th;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(obj, i, z5yVar, aVar, i2, 18);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(392459926);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.e(ljs0.c(c530Var, 1.0f), 72.0f), 16.0f);
            lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 k2 = ljs0.u(c530Var, null, 3).k(new x2y(1.0f, true));
            sic a3 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 16.0f);
            a7u0 a7u0Var = qm51.a;
            ocb1.c(e, 0.0f, 0L, 0L, ((YandexShapes) btsVar.m(a7u0Var)).b(), 0, null, btsVar, 6, 110);
            ocb1.c(ljs0.e(ljs0.c(c530Var, 0.5f), 16.0f), 0.0f, 0L, 0L, ((YandexShapes) btsVar.m(a7u0Var)).b(), 0, null, btsVar, 6, 110);
            btsVar.t(true);
            ocb1.c(ljs0.m(c530Var, 20.0f), 0.0f, 0L, 0L, ((YandexShapes) btsVar.m(a7u0Var)).b(), 0, null, btsVar, 6, 110);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, 22);
        }
    }
}
