package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.cte;
import defpackage.m6y;
import defpackage.ota;
import defpackage.qte;
import defpackage.rc0;
import defpackage.u6y;
import defpackage.zx8;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class hsb1 {
    public static final void a(qte qteVar, fid fidVar, int i) {
        boolean z;
        c530 c530Var;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1252140319);
        int i2 = i | (btsVar.k(qteVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(an91.k(c530Var2, 16.0f), 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            ovi0 ovi0Var = qteVar.a;
            if (ovi0Var == null) {
                btsVar.e0(1773593701);
                btsVar.t(false);
                c530Var = c530Var2;
                z = false;
            } else {
                btsVar.e0(1773593702);
                f530 c2 = ljs0.c(c530Var2, 1.0f);
                f6d.a.getClass();
                z = false;
                c530Var = c530Var2;
                v0b1.a(ovi0Var, c2, null, f6d.c, null, null, null, mhe.d, 0.0f, 0, btsVar, 12586032, 884);
                btsVar.t(false);
            }
            String str = qteVar.b;
            if (str == null) {
                btsVar.e0(1773993322);
                btsVar.t(z);
                z2 = z;
            } else {
                btsVar.e0(1773993323);
                z2 = z;
                jeb1.f(str, an91.m(c530Var, 0.0f, 16.0f, 1), null, uh6.E(38), 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar).d, btsVar, 3120, 0, 16372);
                btsVar = btsVar;
                btsVar.t(z2);
            }
            String str2 = qteVar.c;
            if (str2 == null) {
                btsVar.e0(1774199999);
                btsVar.t(z2);
            } else {
                btsVar.e0(1774200000);
                bts btsVar2 = btsVar;
                jeb1.f(str2, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar2, 0, 0, 16382);
                btsVar = btsVar2;
                btsVar.t(z2);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(qteVar, i, 10);
        }
    }

    public static final void b(final qte qteVar, final tls tlsVar, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1230029422);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            f530 j = an91.j(c530.a, j690Var);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new tls() { // from class: com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.ui.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        u6y u6yVar = (u6y) obj;
                        qte qteVar2 = qte.this;
                        u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(112924135, new ota(11, qteVar2), true), 3);
                        List list = qteVar2.d;
                        CorpAccountCreateNavigatorModalKt$ContentState$1$1$2 corpAccountCreateNavigatorModalKt$ContentState$1$1$2 = CorpAccountCreateNavigatorModalKt$ContentState$1$1$2.b;
                        cte cteVar = cte.a;
                        m6y m6yVar = (m6y) u6yVar;
                        m6yVar.f(list.size(), new b(list), new rc0(list, 3, cteVar), new androidx.compose.runtime.internal.a(802480018, new zx8(list, tlsVar, 4), true));
                        return zy11.a;
                    }
                };
                btsVar.o0(Q);
            }
            adb1.a(j, a, null, null, null, null, false, null, (tls) Q, btsVar, 0, 508);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(qteVar, tlsVar, j690Var, i, 19);
        }
    }

    public static final void c(ste steVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1916133548);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(steVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a S = wwg.S(1923477370, true, new sp5(25, tlsVar, steVar), btsVar);
            f6d.a.getClass();
            c.a(null, null, null, false, false, null, null, S, null, f6d.b, null, wwg.S(257992716, true, new l0(13, steVar, tlsVar), btsVar), btsVar, 817889280, 48, 1407);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(steVar, tlsVar, i, 5);
        }
    }

    public static final void d(j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1155442319);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(j690Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(an91.j(c530Var, j690Var), 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(an91.k(c530Var, 16.0f), 209.5f), 1.0f), cyk0.c(16.0f), false, null, null, null, false, btsVar, 6, 252);
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(an91.l(c530Var, 16.0f, 8.0f), 16.0f), 0.85f), null, false, null, null, null, false, btsVar, 0, 254);
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(an91.l(c530Var, 16.0f, 8.0f), 16.0f), 0.64f), null, false, null, null, null, false, btsVar, 0, 254);
            btsVar.e0(-942113207);
            c6w it = new d6w(0, 3, 1).iterator();
            while (it.c) {
                it.nextInt();
                bts btsVar2 = btsVar;
                ydb1.a(null, s8y.a, y76.a, null, null, null, null, false, btsVar2, 0, 249);
                btsVar = btsVar2;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(j690Var, i, 10);
        }
    }

    public static final void e(id01 id01Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1153865817);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(id01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = 3;
            c.a(null, null, null, false, false, null, null, wwg.S(161202841, true, new asr0(i4, tlsVar), btsVar), null, null, wwg.S(864276763, true, new ays0(i3, id01Var, tlsVar), btsVar), wwg.S(-690189241, true, new nhu0(i4, id01Var, tlsVar), btsVar), btsVar, 12582912, 54, 895);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(id01Var, tlsVar, i, 8);
        }
    }
}
