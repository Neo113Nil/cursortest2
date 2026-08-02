package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.mapkit.geometry.Point;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gib1 {
    public static final void a(b8a b8aVar, v7a v7aVar, fid fidVar, int i) {
        int i2;
        float f;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1660841635);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(b8aVar) : btsVar.e(b8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(v7aVar) : btsVar.e(v7aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar, c530Var2);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            zhb1.a(b8aVar.a, b8aVar.b, b8aVar.d, an91.m(n.e(c530Var2, 16.0f, btsVar, c530Var2, 1.0f), 16.0f, 0.0f, 2), btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            if (((v7aVar == null || (v7aVar.a == null && v7aVar.b == null)) ? null : v7aVar) == null) {
                btsVar.e0(764199516);
                btsVar.t(false);
                c530Var = c530Var2;
                f = 1.0f;
            } else {
                btsVar.e0(764199517);
                f = 1.0f;
                c530Var = c530Var2;
                ydb1.a(an91.m(c530Var2, 20.0f, 0.0f, 2), wwg.S(-1180313944, true, new bj0(27, v7aVar), btsVar), null, null, null, null, null, false, btsVar, 54, 252);
                btsVar = btsVar;
                btsVar.t(false);
            }
            uj91.b(ljs0.c(c530Var, f), null, btsVar, 6, 2);
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(b8aVar, v7aVar, i, 22);
        }
    }

    public static final Point b(x920 x920Var, String str) {
        Map map;
        Number number;
        if (!x920Var.c(str) || (map = (Map) x920Var.a(str)) == null || (number = (Number) map.get("lat")) == null) {
            return null;
        }
        double doubleValue = number.doubleValue();
        Number number2 = (Number) map.get("lon");
        if (number2 != null) {
            return new Point(doubleValue, number2.doubleValue());
        }
        return null;
    }

    public static u0v0 c() {
        return u0v0.j;
    }
}
