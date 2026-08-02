package com.yandex.passport.internal.flags.presentation;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a7u0;
import defpackage.adb1;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.l690;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes15.dex */
public final class r implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tls b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public r(androidx.compose.foundation.lazy.b bVar, List list, tls tlsVar, yx40 yx40Var) {
        this.c = bVar;
        this.w = list;
        this.b = tlsVar;
        this.x = yx40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0155, code lost:
    
        if (defpackage.jl40.l(r1.Q(), java.lang.Integer.valueOf(r13)) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @Override // defpackage.zls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 zy11Var;
        oz40 oz40Var;
        ?? r5;
        boolean z;
        boolean z2;
        int i = this.a;
        zy11 zy11Var2 = zy11.a;
        Object obj4 = did.a;
        Object obj5 = this.x;
        Object obj6 = this.c;
        c530 c530Var = c530.a;
        Object obj7 = this.w;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var2;
                    }
                }
                f530 m = an91.m(pw91.u(ljs0.c(c530Var, 1.0f), pw91.o(fidVar), 14), 16.0f, 0.0f, 2);
                u uVar = (u) obj6;
                sls slsVar = (sls) obj7;
                sls slsVar2 = (sls) obj5;
                sic a = qic.a(lr20.e, x4c.G, fidVar, 6);
                int S = cma1.S(fidVar);
                bts btsVar2 = (bts) fidVar;
                dmw0 dmw0Var = btsVar2.a;
                r1b0 o = btsVar2.o();
                f530 d = androidx.compose.ui.b.d(fidVar, m);
                ohd.G1.getClass();
                sls slsVar3 = androidx.compose.ui.node.d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar3);
                } else {
                    btsVar2.r0();
                }
                wls wlsVar = androidx.compose.ui.node.d.f;
                qje.W(fidVar, wlsVar, a);
                wls wlsVar2 = androidx.compose.ui.node.d.e;
                qje.W(fidVar, wlsVar2, o);
                wls wlsVar3 = androidx.compose.ui.node.d.g;
                if (!btsVar2.S) {
                    zy11Var = zy11Var2;
                    break;
                } else {
                    zy11Var = zy11Var2;
                }
                b64.z(S, btsVar2, S, wlsVar3);
                wls wlsVar4 = androidx.compose.ui.node.d.d;
                qje.W(fidVar, wlsVar4, d);
                oeb1.c(fidVar, ljs0.m(c530Var, 16.0f));
                vqy0.c("Experiment details", null, cma1.R(fidVar).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(fidVar).e, fidVar, 6, 0, 131066);
                oeb1.c(fidVar, ljs0.m(c530Var, 16.0f));
                vqy0.c(uVar.a.a, null, cma1.R(fidVar).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(fidVar).k, fidVar, 0, 0, 131066);
                oeb1.c(fidVar, ljs0.m(c530Var, 16.0f));
                vqy0.c("Actual value is calculated using (in order): Session value, Default value. Session value is calculated once at the app startup using (in order): Override, Network value. You can edit override value or clear it. Restart the app to apply changes.", null, cma1.R(fidVar).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(fidVar).l, fidVar, 6, 0, 131066);
                oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
                c1.l(6, fidVar, null, "Actual value", uVar.b);
                oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
                c1.l(6, fidVar, null, "Default value", uVar.f);
                oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
                c1.l(6, fidVar, null, "Session value", uVar.c);
                oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
                c1.l(6, fidVar, null, "Network cache value", uVar.e);
                oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
                vqy0.c("Override value", null, cma1.R(fidVar).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, cma1.X(fidVar).h, fidVar, 6, 0, 131066);
                btsVar2.e0(-608274205);
                Object Q = btsVar2.Q();
                if (Q == obj4) {
                    Q = androidx.compose.runtime.f.j(uVar.d);
                    btsVar2.o0(Q);
                }
                oz40 oz40Var2 = (oz40) Q;
                btsVar2.t(false);
                com.yandex.passport.internal.flags.g gVar = uVar.a;
                if (gVar instanceof com.yandex.passport.internal.flags.a) {
                    btsVar2.e0(-1676461630);
                    String str = (String) oz40Var2.getValue();
                    btsVar2.e0(-608266403);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == obj4) {
                        z2 = false;
                        Q2 = new p(0, oz40Var2);
                        btsVar2.o0(Q2);
                    } else {
                        z2 = false;
                    }
                    btsVar2.t(z2);
                    c1.b(48, fidVar, (tls) Q2, null, str);
                    btsVar2.t(z2);
                    oz40Var = oz40Var2;
                    r5 = 1;
                } else if (gVar instanceof com.yandex.passport.internal.flags.b) {
                    btsVar2.e0(-1676296865);
                    com.yandex.passport.internal.flags.b bVar = (com.yandex.passport.internal.flags.b) gVar;
                    String str2 = (String) oz40Var2.getValue();
                    btsVar2.e0(-608260995);
                    Object Q3 = btsVar2.Q();
                    if (Q3 == obj4) {
                        Q3 = new p(1, oz40Var2);
                        btsVar2.o0(Q3);
                    }
                    tls tlsVar2 = (tls) Q3;
                    btsVar2.t(false);
                    oz40Var = oz40Var2;
                    r5 = 1;
                    c1.c(bVar, str2, tlsVar2, null, fidVar, 384);
                    btsVar2.t(false);
                } else {
                    oz40Var = oz40Var2;
                    r5 = 1;
                    btsVar2.e0(-1676139168);
                    String str3 = (String) oz40Var.getValue();
                    btsVar2.e0(-608255939);
                    Object Q4 = btsVar2.Q();
                    if (Q4 == obj4) {
                        Q4 = new p(2, oz40Var);
                        btsVar2.o0(Q4);
                    }
                    btsVar2.t(false);
                    c1.m(48, fidVar, (tls) Q4, null, str3);
                    btsVar2.t(false);
                }
                f530 c = ljs0.c(c530Var, 1.0f);
                lhl0 a2 = khl0.a(lr20.b, x4c.D, fidVar, 6);
                int S2 = cma1.S(fidVar);
                r1b0 o2 = btsVar2.o();
                f530 d2 = androidx.compose.ui.b.d(fidVar, c);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar3);
                } else {
                    btsVar2.r0();
                }
                qje.W(fidVar, wlsVar, a2);
                qje.W(fidVar, wlsVar2, o2);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar2, S2, wlsVar3);
                }
                qje.W(fidVar, wlsVar4, d2);
                btsVar2.e0(1914103543);
                boolean k = btsVar2.k(slsVar);
                Object Q5 = btsVar2.Q();
                if (k || Q5 == obj4) {
                    Q5 = new k(r5, slsVar);
                    btsVar2.o0(Q5);
                }
                btsVar2.t(false);
                f530 k2 = an91.k(c530Var, 8.0f);
                b.a.getClass();
                androidx.compose.material3.a.f((sls) Q5, k2, false, null, null, null, b.b, fidVar, 805306416, 508);
                btsVar2.e0(1914117902);
                boolean k3 = btsVar2.k(slsVar2);
                Object Q6 = btsVar2.Q();
                if (k3 || Q6 == obj4) {
                    Q6 = new k(2, slsVar2);
                    btsVar2.o0(Q6);
                }
                btsVar2.t(false);
                androidx.compose.material3.a.f((sls) Q6, an91.k(c530Var, 8.0f), false, null, null, null, b.c, fidVar, 805306416, 508);
                btsVar2.e0(1914131975);
                boolean k4 = btsVar2.k(tlsVar);
                Object Q7 = btsVar2.Q();
                if (k4 || Q7 == obj4) {
                    z = false;
                    Q7 = new q(tlsVar, oz40Var, 0);
                    btsVar2.o0(Q7);
                } else {
                    z = false;
                }
                btsVar2.t(z);
                androidx.compose.material3.a.f((sls) Q7, an91.k(c530Var, 8.0f), false, null, null, null, b.d, fidVar, 805306416, 508);
                btsVar2.t(r5);
                btsVar2.t(r5);
                return zy11Var;
            default:
                j690 j690Var = (j690) obj;
                fid fidVar2 = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                List list = (List) obj7;
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar2).k(j690Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        return zy11Var2;
                    }
                }
                bts btsVar4 = (bts) fidVar2;
                btsVar4.e0(-1139221944);
                a7u0 a7u0Var = androidx.compose.ui.platform.j.n;
                l690 l690Var = new l690(an91.f(j690Var, (LayoutDirection) btsVar4.m(a7u0Var)), j690Var.d(), an91.e(j690Var, (LayoutDirection) btsVar4.m(a7u0Var)), 0.0f);
                btsVar4.t(false);
                f530 j = an91.j(c530Var, l690Var);
                l690 d3 = an91.d(0.0f, 0.0f, 0.0f, j690Var.a(), 7);
                androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) obj6;
                btsVar4.e0(489048133);
                boolean e = btsVar4.e(list) | btsVar4.k(tlsVar);
                yx40 yx40Var = (yx40) obj5;
                Object Q8 = btsVar4.Q();
                if (e || Q8 == obj4) {
                    Q8 = new v0(0, list, tlsVar, yx40Var);
                    btsVar4.o0(Q8);
                }
                btsVar4.t(false);
                adb1.a(j, bVar2, d3, null, null, null, false, null, (tls) Q8, btsVar4, 0, 504);
                return zy11Var2;
        }
    }

    public r(u uVar, sls slsVar, sls slsVar2, tls tlsVar) {
        this.c = uVar;
        this.w = slsVar;
        this.x = slsVar2;
        this.b = tlsVar;
    }
}
