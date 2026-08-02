package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class j7a {
    public static final long a = cl91.o(90.0f, 82.0f);

    public static final void a(w7a w7aVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1931043555);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(w7aVar) : btsVar.e(w7aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Integer num = w7aVar.e;
            wp2 wp2Var = AppColor$Palette.BgMinor;
            if (num != null) {
                wp2Var = new up2(rzo.d(num.intValue()));
            }
            btsVar.e0(-926280114);
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(w7aVar))) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new u08(27, tlsVar, w7aVar);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 d = q791.d(c530Var, false, null, null, (sls) Q, 15);
            btsVar.t(false);
            f530 k = bzk0.c(ljs0.e(ljs0.c(an91.o(c530Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 1.0f), 72.0f), wp2Var, cyk0.c(20.0f)).k(d);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            uo5 uo5Var = x4c.x;
            cj6 cj6Var = cj6.a;
            f530 c = ljs0.c(cj6Var.a(c530Var, uo5Var), 1.0f);
            long j = a;
            cib1.c(an91.o(c, 16.0f, 0.0f, c8m.b(j) + 8.0f, 0.0f, 10), w7aVar.a, w7aVar.b, w7aVar.f, btsVar, 0);
            t691.b(cj6Var.a(c530Var, x4c.w), w7aVar.d, w7aVar.c, j, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(w7aVar, tlsVar, i, 20);
        }
    }
}
