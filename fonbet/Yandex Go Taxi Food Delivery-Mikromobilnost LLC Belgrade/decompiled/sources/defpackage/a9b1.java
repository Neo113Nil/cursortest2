package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class a9b1 {
    public static final void a(boolean z, f530 f530Var, a aVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2106635720);
        int i2 = (btsVar.a(z) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(722886912);
                btsVar.t(false);
                f530Var2 = c530Var;
            } else {
                btsVar.e0(722789820);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new ar5(18);
                    btsVar.o0(Q);
                }
                f530Var2 = fnq0.b(c530Var, true, (tls) Q);
                btsVar.t(false);
            }
            f530 k = f530Var.k(f530Var2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            cj6 cj6Var = cj6.a;
            aVar.invoke(cj6Var, btsVar, 54);
            if (z) {
                btsVar.e0(-1302184448);
                btsVar.t(false);
            } else {
                btsVar.e0(-1302349740);
                f530 a = exw0.a(cj6Var.b(c530Var), zy11.a, com.yandex.go.masstransit.sdk.checkout.impl.checkout.ui.components.a.a);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new ar5(19);
                    btsVar.o0(Q2);
                }
                pi6.a(fnq0.b(a, false, (tls) Q2), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(z, f530Var, aVar, i);
        }
    }

    public static final void b(zlq0 zlq0Var, tls tlsVar, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(524039808);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(zlq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.a(z) ? 2048 : 1024;
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z2 = zlq0Var.d;
            o430 o430Var = did.a;
            c530 c530Var = c530.a;
            if (z2) {
                btsVar.e0(-535965788);
                btsVar.t(false);
                f530Var3 = c530Var;
            } else {
                btsVar.e0(-535928433);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new hlq0(i3);
                    btsVar.o0(Q);
                }
                f530 a = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q);
                btsVar.t(false);
                f530Var3 = a;
            }
            boolean z3 = zlq0Var.d;
            boolean z4 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new nao0(zlq0Var, tlsVar);
                btsVar.o0(Q2);
            }
            f530Var2 = c530Var;
            ydb1.a(q791.b(f530Var3, null, null, z3, null, new awk0(0), (sls) Q2, 8), null, wwg.S(-668819759, true, new w7o0(11, zlq0Var), btsVar), null, na01.a, null, null, false, btsVar, 384, MSException.ERROR_MORE_DATA);
            if (z) {
                btsVar.e0(-534863676);
                yrl.c(null, null, btsVar, 0, 7);
                btsVar.t(false);
            } else {
                btsVar.e0(-534834846);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(zlq0Var, tlsVar, f530Var2, z, i, 23);
        }
    }

    public static syj0 c(dsw dswVar, mo moVar) {
        return dswVar.b(moVar, new hko(0));
    }
}
