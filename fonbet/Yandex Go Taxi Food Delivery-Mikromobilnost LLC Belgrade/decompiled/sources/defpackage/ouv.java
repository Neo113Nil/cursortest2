package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes12.dex */
public final /* synthetic */ class ouv implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jxq0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ouv(jxq0 jxq0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = jxq0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        c530 c530Var;
        float f2;
        bts btsVar;
        bts btsVar2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = did.a;
        g43 g43Var = lr20.c;
        tls tlsVar = this.c;
        jxq0 jxq0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar;
                if (btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                    c530 c530Var2 = c530.a;
                    f530 n = an91.n(c530Var2, 16.0f, 16.0f, 16.0f, 8.0f);
                    sic a = qic.a(g43Var, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = b.d(btsVar3, n);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a);
                    qje.W(btsVar3, d.e, o);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d);
                    String str = jxq0Var.e;
                    if (str == null || evu0.J(str)) {
                        f = 8.0f;
                        btsVar3.e0(-21101690);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-21293177);
                        f = 8.0f;
                        jeb1.f(jxq0Var.e, an91.o(c530Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 432, 0, 16376);
                        btsVar3.t(false);
                    }
                    String str2 = jxq0Var.d;
                    if (str2 == null || evu0.J(str2)) {
                        btsVar3.e0(-20750522);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-21037148);
                        f530 o2 = an91.o(c530Var2, 0.0f, 0.0f, 0.0f, f, 7);
                        boolean k = btsVar3.k(tlsVar);
                        Object Q = btsVar3.Q();
                        if (k || Q == obj4) {
                            Q = new kiu(4, tlsVar);
                            btsVar3.o0(Q);
                        }
                        jeb1.f(jxq0Var.d, q791.f(o2, null, new awk0(0), null, (sls) Q, null, puv.a, 300), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 384, 0, 16376);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar2;
                boolean V = btsVar4.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var = btsVar4.a;
                if (V) {
                    c530 c530Var3 = c530.a;
                    f530 o3 = an91.o(c530Var3, 0.0f, 20.0f, 0.0f, 8.0f, 5);
                    so5 so5Var = x4c.G;
                    sic a2 = qic.a(g43Var, so5Var, btsVar4, 0);
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o4 = btsVar4.o();
                    f530 d2 = b.d(btsVar4, o3);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar4, wlsVar, a2);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar4, wlsVar2, o4);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar4, wlsVar3, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar4, tlsVar2);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar4, wlsVar4, d2);
                    jeb1.f(jxq0Var.b, an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).e.d, btsVar4, 48, 0, 16380);
                    bts btsVar5 = btsVar4;
                    f530 u = ljs0.u(ljs0.c(an91.o(c530Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), null, 3);
                    sic a3 = qic.a(g43Var, so5Var, btsVar5, 0);
                    int hashCode3 = Long.hashCode(btsVar5.T);
                    r1b0 o5 = btsVar5.o();
                    f530 d3 = b.d(btsVar5, u);
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar2);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, wlsVar, a3);
                    qje.W(btsVar5, wlsVar2, o5);
                    vfc.v(hashCode3, btsVar5, wlsVar3, btsVar5, tlsVar2);
                    qje.W(btsVar5, wlsVar4, d3);
                    btsVar5.e0(1380562987);
                    for (ixq0 ixq0Var : jxq0Var.f) {
                        String str3 = ixq0Var.a;
                        boolean k2 = btsVar5.k(ixq0Var) | btsVar5.k(tlsVar);
                        Object Q2 = btsVar5.Q();
                        if (k2 || Q2 == obj4) {
                            Q2 = new muv(ixq0Var, tlsVar, 1);
                            btsVar5.o0(Q2);
                        }
                        mua1.c(str3, null, (sls) Q2, btsVar5, 0, 2);
                    }
                    btsVar5.t(false);
                    btsVar5.t(true);
                    String str4 = jxq0Var.e;
                    if (str4 == null || evu0.J(str4)) {
                        c530Var = c530Var3;
                        f2 = 8.0f;
                        btsVar5.e0(-1084663569);
                        btsVar5.t(false);
                        btsVar = btsVar5;
                    } else {
                        btsVar5.e0(-1084929053);
                        c530Var = c530Var3;
                        f2 = 8.0f;
                        jeb1.f(jxq0Var.e, an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 8.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar5).h.a, btsVar5, 432, 0, 16376);
                        bts btsVar6 = btsVar5;
                        btsVar6.t(false);
                        btsVar = btsVar6;
                    }
                    String str5 = jxq0Var.d;
                    if (str5 == null || evu0.J(str5)) {
                        btsVar.e0(-1084334225);
                        btsVar.t(false);
                        btsVar2 = btsVar;
                    } else {
                        btsVar.e0(-1084599709);
                        bts btsVar7 = btsVar;
                        jeb1.f(jxq0Var.d, an91.o(c530Var, 16.0f, 0.0f, 16.0f, f2, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar7, 432, 0, 16376);
                        bts btsVar8 = btsVar7;
                        btsVar8.t(false);
                        btsVar2 = btsVar8;
                    }
                    btsVar2.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
