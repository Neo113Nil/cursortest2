package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.superapp.web.view.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class fi0 implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fi0(boolean z, tls tlsVar, qh0 qh0Var, boolean z2, a aVar) {
        this.b = z;
        this.c = tlsVar;
        this.x = qh0Var;
        this.w = z2;
        this.y = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 zy11Var;
        au2 au2Var;
        int i = this.a;
        zy11 zy11Var2 = zy11.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        Object obj4 = this.y;
        tls tlsVar = this.c;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                qh0 qh0Var = (qh0) obj5;
                a aVar = (a) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    so5 so5Var = x4c.G;
                    g43 g43Var = lr20.c;
                    sic a = qic.a(g43Var, so5Var, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c);
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
                    qje.W(btsVar, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar, tlsVar2);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d);
                    crb1.b(null, wwg.S(522117339, true, new bi0(this.b, tlsVar, 0), btsVar), null, wwg.S(1385887453, true, new tn1(4, qh0Var), btsVar), null, wwg.S(-2045309729, true, new q0v(3, qh0Var, tlsVar), btsVar), null, btsVar, 199728, 85);
                    f530 k = ljs0.v(c530Var, null, 3).k(new x2y(1.0f, true));
                    sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d2 = b.d(btsVar, k);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, a2);
                    qje.W(btsVar, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                    qje.W(btsVar, wlsVar4, d2);
                    if (this.w) {
                        btsVar.e0(-361756953);
                        f530 m = an91.m(aab1.a(1.0f, rzo.f(4291611852L), an91.k(c530Var, 8.0f), cyk0.c(8.0f)), 16.0f, 0.0f, 2);
                        z910 d3 = pi6.d(x4c.y, false);
                        int hashCode3 = Long.hashCode(btsVar.T);
                        r1b0 o3 = btsVar.o();
                        f530 d4 = b.d(btsVar, m);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, d3);
                        qje.W(btsVar, wlsVar2, o3);
                        vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
                        qje.W(btsVar, wlsVar4, d4);
                        jeb1.f(g8e.o("WebView: ", qh0Var.a), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16382);
                        btsVar.t(true);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-361327417);
                        boolean e = btsVar.e(aVar);
                        Object Q = btsVar.Q();
                        if (e || Q == o430Var) {
                            Q = new y4(14, aVar);
                            btsVar.o0(Q);
                        }
                        tls tlsVar3 = (tls) Q;
                        boolean k2 = btsVar.k(qh0Var);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new y4(15, qh0Var);
                            btsVar.o0(Q2);
                        }
                        androidx.compose.ui.viewinterop.b.a(tlsVar3, null, (tls) Q2, btsVar, 0, 2);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    dta1.a(ljs0.v(c530Var, null, 3), false, null, false, false, wwg.S(1406108971, true, new u5(16, qh0Var, tlsVar), btsVar), btsVar, 221190, 14);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            default:
                PlaceType placeType = (PlaceType) obj5;
                n3c0 n3c0Var = (n3c0) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    return zy11Var2;
                }
                float d5 = dj6Var.d() / 3.0f;
                lhl0 a3 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar2, 6);
                int hashCode4 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d6 = b.d(btsVar2, c530Var);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, a3);
                qje.W(btsVar2, d.e, o4);
                qje.W(btsVar2, d.g, Integer.valueOf(hashCode4));
                qje.M(btsVar2, d.h);
                qje.W(btsVar2, d.d, d6);
                f530 q = ljs0.q(c530Var, d5);
                au2 au2Var2 = juf0.b;
                if (au2Var2 == null) {
                    lgv lgvVar = new lgv("POIHome", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var = new a6t0(iq2.g);
                    uq90 g = tse0.g(21.92f, 9.83f, 12.0f, 1.5f);
                    g.h(2.08f, 9.83f);
                    g.i(0.42f, 1.67f);
                    g.g(1.0f);
                    g.p(7.0f);
                    g.b(3.0f, 3.0f, false, false, 3.0f, 3.0f);
                    g.g(11.0f);
                    g.b(3.0f, 3.0f, false, false, 3.0f, -3.0f);
                    g.p(-7.0f);
                    g.g(1.0f);
                    g.c();
                    g.j(14.0f, 7.5f);
                    g.b(2.0f, 2.0f, true, true, -4.0f, 0.0f);
                    g.b(2.0f, 2.0f, false, true, 4.0f, 0.0f);
                    g.k(-5.0f, 5.0f);
                    g.b(1.0f, 1.0f, false, true, 1.0f, -1.0f);
                    g.g(4.0f);
                    g.b(1.0f, 1.0f, false, true, 1.0f, 1.0f);
                    g.p(7.0f);
                    g.f(9.0f);
                    g.c();
                    lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", g.a);
                    au2Var2 = rya1.a(lgvVar.d(), true);
                    juf0.b = au2Var2;
                }
                au2 au2Var3 = au2Var2;
                String e2 = ohb1.e(btsVar2, kyh0.favorite_home);
                boolean z = placeType == PlaceType.HOME;
                boolean k3 = btsVar2.k(tlsVar);
                Object Q3 = btsVar2.Q();
                if (k3 || Q3 == o430Var) {
                    Q3 = new ukb0(2, tlsVar);
                    btsVar2.o0(Q3);
                }
                m3c0.a(this.b, q, au2Var3, e2, z, (sls) Q3, btsVar2, 0, 0);
                f530 q2 = ljs0.q(c530Var, d5);
                au2 au2Var4 = bzk0.a;
                if (au2Var4 != null) {
                    zy11Var = zy11Var2;
                    au2Var = au2Var4;
                } else {
                    lgv lgvVar2 = new lgv("POIWork", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    long j = iq2.g;
                    a6t0 a6t0Var2 = new a6t0(j);
                    uq90 uq90Var = new uq90();
                    uq90Var.j(2.0f, 5.0f);
                    uq90Var.g(6.0f);
                    uq90Var.b(4.0f, 4.0f, true, true, 8.0f, 0.0f);
                    uq90Var.g(6.0f);
                    uq90Var.p(3.98f);
                    zy11Var = zy11Var2;
                    uq90Var.m(-0.01f, 0.06f, -0.08f, 0.23f);
                    uq90Var.e(-0.1f, 0.21f, -0.33f, 0.58f, -0.88f, 0.98f);
                    uq90Var.d(19.9f, 11.01f, 17.4f, 12.0f, 12.0f, 12.0f);
                    uq90Var.n(-7.9f, -0.99f, -9.04f, -1.8f);
                    uq90Var.b(2.6f, 2.6f, false, true, -0.88f, -1.0f);
                    uq90Var.h(2.0f, 8.97f);
                    uq90Var.c();
                    uq90Var.j(12.0f, 3.0f);
                    uq90Var.b(2.0f, 2.0f, false, false, -2.0f, 2.0f);
                    uq90Var.g(4.0f);
                    uq90Var.b(2.0f, 2.0f, false, false, -2.0f, -2.0f);
                    lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                    a6t0 a6t0Var3 = new a6t0(j);
                    uq90 uq90Var2 = new uq90();
                    uq90Var2.j(2.0f, 11.96f);
                    uq90Var2.o(18.0f);
                    uq90Var2.b(3.0f, 3.0f, false, false, 3.0f, 3.0f);
                    uq90Var2.g(14.0f);
                    uq90Var2.b(3.0f, 3.0f, false, false, 3.0f, -3.0f);
                    uq90Var2.p(-6.04f);
                    uq90Var2.e(-1.45f, 0.97f, -3.88f, 1.8f, -8.0f, 2.0f);
                    uq90Var2.o(16.0f);
                    uq90Var2.g(-4.0f);
                    uq90Var2.p(-2.05f);
                    uq90Var2.e(-4.12f, -0.2f, -6.55f, -1.02f, -8.0f, -2.0f);
                    lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var3, null, "", uq90Var2.a);
                    au2 a4 = rya1.a(lgvVar2.d(), true);
                    bzk0.a = a4;
                    au2Var = a4;
                }
                String e3 = ohb1.e(btsVar2, kyh0.favorite_work);
                boolean z2 = placeType == PlaceType.WORK;
                boolean k4 = btsVar2.k(tlsVar);
                Object Q4 = btsVar2.Q();
                if (k4 || Q4 == o430Var) {
                    Q4 = new ukb0(3, tlsVar);
                    btsVar2.o0(Q4);
                }
                m3c0.a(this.w, q2, au2Var, e3, z2, (sls) Q4, btsVar2, 0, 0);
                f530 q3 = ljs0.q(c530Var, d5);
                au2 d7 = yri0.d();
                String str = n3c0Var.d;
                boolean z3 = placeType == PlaceType.OTHER;
                boolean k5 = btsVar2.k(tlsVar);
                Object Q5 = btsVar2.Q();
                if (k5 || Q5 == o430Var) {
                    Q5 = new ukb0(4, tlsVar);
                    btsVar2.o0(Q5);
                }
                m3c0.a(false, q3, d7, str, z3, (sls) Q5, btsVar2, 0, 1);
                btsVar2.t(true);
                return zy11Var;
        }
    }

    public /* synthetic */ fi0(boolean z, PlaceType placeType, tls tlsVar, boolean z2, n3c0 n3c0Var) {
        this.b = z;
        this.x = placeType;
        this.c = tlsVar;
        this.w = z2;
        this.y = n3c0Var;
    }
}
