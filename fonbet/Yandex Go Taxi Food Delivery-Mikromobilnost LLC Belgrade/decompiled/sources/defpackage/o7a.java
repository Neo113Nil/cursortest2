package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class o7a implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ paa b;
    public final /* synthetic */ z0a0 c;
    public final /* synthetic */ String w;
    public final /* synthetic */ tls x;

    public /* synthetic */ o7a(paa paaVar, tls tlsVar, z0a0 z0a0Var, String str) {
        this.b = paaVar;
        this.x = tlsVar;
        this.c = z0a0Var;
        this.w = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v7, types: [f530] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        tls tlsVar;
        wls wlsVar;
        x7a x7aVar;
        float f;
        bts btsVar;
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        tls tlsVar2 = this.x;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                so5 so5Var = x4c.G;
                bts btsVar2 = (bts) fidVar;
                boolean V = btsVar2.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = btsVar2.a;
                if (!V) {
                    btsVar2.Y();
                    return zy11Var;
                }
                paa paaVar = this.b;
                if (paaVar instanceof laa) {
                    btsVar2.e0(-1489395200);
                    btsVar2.t(false);
                } else {
                    boolean l = jl40.l(paaVar, maa.a);
                    g43 g43Var = lr20.c;
                    if (!l) {
                        if (!(paaVar instanceof oaa)) {
                            throw unr0.y(506146222, btsVar2, false);
                        }
                        btsVar2.e0(-1488937671);
                        oaa oaaVar = (oaa) paaVar;
                        boolean z2 = oaaVar.g;
                        c8a c8aVar = oaaVar.d;
                        uo9 uo9Var = (uo9) a.R(c8aVar.h);
                        hfa0 hfa0Var = oaaVar.b;
                        CharSequence charSequence = oaaVar.c;
                        a8a a8aVar = c8aVar.k;
                        x7a x7aVar2 = c8aVar.m;
                        String str2 = oaaVar.a;
                        c530 b = z2 ? ofb1.b(c530Var, false, null, 15) : c530Var;
                        f530 d = i9a1.d(ljs0.c(c530Var, 1.0f));
                        sic a = qic.a(g43Var, so5Var, btsVar2, 0);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, d);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        wls wlsVar2 = d.f;
                        qje.W(btsVar2, wlsVar2, a);
                        wls wlsVar3 = d.e;
                        qje.W(btsVar2, wlsVar3, o);
                        Integer valueOf = Integer.valueOf(hashCode);
                        wls wlsVar4 = d.g;
                        qje.W(btsVar2, wlsVar4, valueOf);
                        tls tlsVar3 = d.h;
                        qje.M(btsVar2, tlsVar3);
                        c530 c530Var2 = b;
                        wls wlsVar5 = d.d;
                        qje.W(btsVar2, wlsVar5, d2);
                        if (a8aVar == null) {
                            btsVar2.e0(-1598377732);
                            btsVar2.t(false);
                            tlsVar = tlsVar3;
                            wlsVar = wlsVar4;
                            x7aVar = x7aVar2;
                            f = 8.0f;
                            btsVar = btsVar2;
                            str = str2;
                        } else {
                            btsVar2.e0(-1598377731);
                            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
                            boolean k = btsVar2.k(tlsVar2) | btsVar2.e(a8aVar);
                            Object Q = btsVar2.Q();
                            if (k || Q == o430Var) {
                                Q = new u08(28, tlsVar2, a8aVar);
                                btsVar2.o0(Q);
                            }
                            sls slsVar2 = (sls) Q;
                            boolean k2 = btsVar2.k(tlsVar2) | btsVar2.e(paaVar);
                            Object Q2 = btsVar2.Q();
                            if (k2 || Q2 == o430Var) {
                                Q2 = new ky7(tlsVar2, 29, paaVar);
                                btsVar2.o0(Q2);
                            }
                            wls wlsVar6 = (wls) Q2;
                            str = str2;
                            tlsVar = tlsVar3;
                            wlsVar = wlsVar4;
                            x7aVar = x7aVar2;
                            f = 8.0f;
                            o9a1.c(m, a8aVar, slsVar2, wlsVar6, btsVar2, 70);
                            btsVar = btsVar2;
                            btsVar.t(false);
                        }
                        String str3 = str;
                        f530 m2 = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, f, 1);
                        lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d3 = b.d(btsVar, m2);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar2, a2);
                        qje.W(btsVar, wlsVar3, o2);
                        vfc.v(hashCode2, btsVar, wlsVar, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar5, d3);
                        boolean k3 = btsVar.k(tlsVar2);
                        Object Q3 = btsVar.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new fv9(1, tlsVar2);
                            btsVar.o0(Q3);
                        }
                        bts btsVar3 = btsVar;
                        re91.d(null, hfa0Var, this.c, this.w, (sls) Q3, btsVar3, 0);
                        bts btsVar4 = btsVar3;
                        if (uo9Var == null) {
                            btsVar4.e0(-617858258);
                            btsVar4.t(false);
                        } else {
                            btsVar4.e0(-617858257);
                            boolean z3 = uo9Var.h || z2;
                            f530 k4 = (z3 ? ofb1.b(c530Var, false, null, 15) : c530Var).k(new x2y(1.0f, true));
                            boolean z4 = !z3;
                            boolean k5 = btsVar4.k(tlsVar2);
                            Object Q4 = btsVar4.Q();
                            if (k5 || Q4 == o430Var) {
                                Q4 = new dv9(3, tlsVar2);
                                btsVar4.o0(Q4);
                            }
                            jub1.c(uo9Var, k4, z4, (tls) Q4, btsVar4, 0);
                            btsVar4 = btsVar4;
                            btsVar4.t(false);
                        }
                        if (x7aVar != null) {
                            btsVar4.e0(-617330451);
                            boolean k6 = btsVar4.k(tlsVar2) | btsVar4.k(str3);
                            Object Q5 = btsVar4.Q();
                            if (k6 || Q5 == o430Var) {
                                Q5 = new a91(tlsVar2, str3, 5);
                                btsVar4.o0(Q5);
                            }
                            th91.c(null, x7aVar, (sls) Q5, btsVar4, 64);
                            z = false;
                            btsVar4.t(false);
                        } else {
                            z = false;
                            btsVar4.e0(-617093022);
                            oeb1.c(btsVar4, ljs0.q(c530Var, 8.0f));
                            btsVar4.t(false);
                        }
                        btsVar4.t(true);
                        CharSequence charSequence2 = charSequence == null ? null : charSequence;
                        if (charSequence2 == null) {
                            btsVar4.e0(-1596351696);
                            btsVar4.t(z);
                        } else {
                            btsVar4.e0(-1596351695);
                            if (charSequence2.length() > 0) {
                                tse0.s(btsVar4, 4788033, c530Var, 8.0f, btsVar4);
                                f530 m3 = an91.m(ljs0.c(c530Var, 1.0f).k(c530Var2), 8.0f, 0.0f, 2);
                                boolean k7 = btsVar4.k(tlsVar2);
                                Object Q6 = btsVar4.Q();
                                if (k7 || Q6 == o430Var) {
                                    Q6 = new dv9(4, tlsVar2);
                                    btsVar4.o0(Q6);
                                }
                                z = false;
                                beb1.c(m3, charSequence2, (tls) Q6, btsVar4, 0);
                                btsVar4.t(false);
                            } else {
                                z = false;
                                btsVar4.e0(5208951);
                                btsVar4.t(false);
                            }
                            btsVar4.t(z);
                        }
                        btsVar4.t(true);
                        btsVar4.t(z);
                        return zy11Var;
                    }
                    btsVar2.e0(-1489346003);
                    f530 n = an91.n(i9a1.d(ljs0.c(c530Var, 1.0f)), 8.0f, 8.0f, 8.0f, 22.0f);
                    sic a3 = qic.a(g43Var, so5Var, btsVar2, 0);
                    int hashCode3 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d4 = b.d(btsVar2, n);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
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
                    qje.W(btsVar2, d.f, a3);
                    qje.W(btsVar2, d.e, o3);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d4);
                    dib1.b(ljs0.c(c530Var, 1.0f), btsVar2, 6);
                    btsVar2.t(true);
                    btsVar2.t(false);
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar2;
                if (btsVar5.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean k8 = btsVar5.k(tlsVar2);
                    Object Q7 = btsVar5.Q();
                    if (k8 || Q7 == o430Var) {
                        Q7 = new dv9(5, tlsVar2);
                        btsVar5.o0(Q7);
                    }
                    dib1.a(c, this.b, this.c, this.w, (tls) Q7, btsVar5, 6);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ o7a(paa paaVar, z0a0 z0a0Var, String str, tls tlsVar) {
        this.b = paaVar;
        this.c = z0a0Var;
        this.w = str;
        this.x = tlsVar;
    }
}
