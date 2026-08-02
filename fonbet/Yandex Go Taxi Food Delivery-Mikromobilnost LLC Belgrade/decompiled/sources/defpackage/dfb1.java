package defpackage;

import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public abstract class dfb1 {
    public static final void a(m68 m68Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-232298357);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(m68Var) : btsVar2.e(m68Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 0, 0, 8191);
            bts btsVar3 = btsVar2;
            lg6 c = qab1.c(a, new up2(zp2.d), null, btsVar3, 384, 0);
            boolean z = ((dtr0) a.g.getValue()).a == -1;
            boolean z2 = !z;
            if (z) {
                btsVar3.e0(-1207411593);
                btsVar3.t(false);
            } else {
                btsVar3.e0(-1207680673);
                r901 r901Var = m68Var.a;
                e68 e68Var = m68Var.c;
                Object Q = btsVar3.Q();
                if (Q == did.a) {
                    Q = new wk6(25);
                    btsVar3.o0(Q);
                }
                pqb1.b(r901Var, e68Var, (tls) Q, m68Var.d, btsVar3, 392);
                btsVar3 = btsVar3;
                btsVar3.t(false);
            }
            bts btsVar4 = btsVar3;
            c.a(null, a, c, false, false, null, null, null, wwg.S(-1898896258, true, new rs6(z2, tlsVar, 1), btsVar3), null, null, wwg.S(-924332757, true, new l0(4, m68Var, tlsVar), btsVar3), btsVar4, 100663296, 48, 1785);
            btsVar = btsVar4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(m68Var, tlsVar, i, 16);
        }
    }

    public static final void b(f530 f530Var, lpt0 lpt0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(908012398);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(lpt0Var) : btsVar.e(lpt0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            float f = btsVar.m(j.n) == LayoutDirection.Rtl ? 28.0f : -28.0f;
            boolean b = btsVar.b(f);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new yo1(f, 8);
                btsVar.o0(Q);
            }
            f530 a = d.a(f530Var, (tls) Q);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            bfb1.b(lpt0Var.a, btsVar, 0);
            boolean b2 = btsVar.b(f);
            Object Q2 = btsVar.Q();
            if (b2 || Q2 == o430Var) {
                Q2 = new yo1(f, 9);
                btsVar.o0(Q2);
            }
            f1a1.c(lpt0Var.b, lpt0Var.c, d.a(c530.a, (tls) Q2), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(f530Var, lpt0Var, i, 24);
        }
    }

    public static final noh c(euy euyVar) {
        Object obj;
        Throwable b;
        if ((euyVar instanceof x7) && (b = ((x7) euyVar).b()) != null) {
            fyc b2 = gwk0.b();
            b2.j0(b);
            return b2;
        }
        int i = 0;
        if (!euyVar.isDone()) {
            fyc b3 = gwk0.b();
            euyVar.c(new tqs(i, euyVar, new reu(21, b3)), com.google.common.util.concurrent.b.a());
            b3.w(new ptw(19, euyVar));
            return new fuy(b3);
        }
        while (true) {
            try {
                try {
                    obj = euyVar.get();
                    break;
                } catch (CancellationException e) {
                    fyc b4 = gwk0.b();
                    b4.u(e);
                    return b4;
                } catch (ExecutionException e2) {
                    fyc b5 = gwk0.b();
                    b5.j0(e2.getCause());
                    return b5;
                }
            } catch (InterruptedException unused) {
                i = 1;
            } catch (Throwable th) {
                if (i != 0) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (i != 0) {
            Thread.currentThread().interrupt();
        }
        return gwk0.a(obj);
    }
}
