package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class q07 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q07(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 zy11Var;
        int i = this.a;
        o430 o430Var = did.a;
        long j = this.b;
        c530 c530Var = c530.a;
        zy11 zy11Var2 = zy11.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                c37 c37Var = (c37) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530Var);
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    String str = c37Var.a;
                    lzr lzrVar = lzr.E;
                    long j2 = this.b;
                    ymb1.e(str, null, j2, null, lzrVar, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57322);
                    if (c37Var.b != null) {
                        btsVar.e0(-2039861773);
                        ymb1.f(c37Var.b, null, j2, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65530);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-2039687832);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                d37 d37Var = (d37) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str2 = d37Var.a;
                    String str3 = d37Var.b;
                    long j3 = this.b;
                    web1.e(null, null, x4c.H, str2, null, j3, null, null, null, 0, false, 0, null, str3, null, null, null, null, false, ldc.b(j3, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0, false, 0, false, null, false, btsVar2, 384, 0, 0, 266305459);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                ((Integer) obj3).getClass();
                eqb1.c(0.0f, this.b, (v4v) obj4, (fid) obj2, 0);
                return zy11Var2;
            case 3:
                fu30 fu30Var = (fu30) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    f530 b = m4m0.b(ljs0.m(an91.m(c530Var, 8.0f, 0.0f, 2), a.b), j, cyk0.c(a.d));
                    z910 d2 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d3 = b.d(btsVar3, b);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, d2);
                    qje.W(btsVar3, d.e, o2);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d3);
                    ovi0 ovi0Var = fu30Var.f;
                    if (ovi0Var == null) {
                        btsVar3.e0(-87728);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-87727);
                        f530 m = ljs0.m(c530Var, a.c);
                        jfv jfvVar = new jfv(AppColor$Palette.EverFront);
                        e9d.a.getClass();
                        v0b1.a(ovi0Var, m, null, e9d.b, null, jfvVar, null, null, 0.0f, 0, btsVar3, 3120, 980);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 4:
                r740 r740Var = (r740) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                boolean V = btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16);
                dmw0 dmw0Var = btsVar4.a;
                if (!V) {
                    btsVar4.Y();
                    return zy11Var2;
                }
                uo5 uo5Var = x4c.y;
                z910 d4 = pi6.d(uo5Var, false);
                int hashCode3 = Long.hashCode(btsVar4.T);
                r1b0 o3 = btsVar4.o();
                f530 d5 = b.d(btsVar4, c530Var);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar3);
                } else {
                    btsVar4.r0();
                }
                wls wlsVar2 = d.f;
                qje.W(btsVar4, wlsVar2, d4);
                wls wlsVar3 = d.e;
                qje.W(btsVar4, wlsVar3, o3);
                Integer valueOf = Integer.valueOf(hashCode3);
                wls wlsVar4 = d.g;
                qje.W(btsVar4, wlsVar4, valueOf);
                tls tlsVar = d.h;
                qje.M(btsVar4, tlsVar);
                wls wlsVar5 = d.d;
                qje.W(btsVar4, wlsVar5, d5);
                f530 m2 = ljs0.m(c530Var, 210.0f);
                Object Q = btsVar4.Q();
                if (Q == o430Var) {
                    zy11Var = zy11Var2;
                    Q = new pi30(28);
                    btsVar4.o0(Q);
                } else {
                    zy11Var = zy11Var2;
                }
                f530 a2 = androidx.compose.ui.graphics.d.a(m2, (tls) Q);
                boolean d6 = btsVar4.d(j);
                Object Q2 = btsVar4.Q();
                if (d6 || Q2 == o430Var) {
                    Q2 = new vh10(j, 14);
                    btsVar4.o0(Q2);
                }
                f530 k = a2.k(bb1.i(c530Var, (tls) Q2));
                z910 d7 = pi6.d(uo5Var, false);
                int hashCode4 = Long.hashCode(btsVar4.T);
                r1b0 o4 = btsVar4.o();
                f530 d8 = b.d(btsVar4, k);
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar3);
                } else {
                    btsVar4.r0();
                }
                qje.W(btsVar4, wlsVar2, d7);
                qje.W(btsVar4, wlsVar3, o4);
                vfc.v(hashCode4, btsVar4, wlsVar4, btsVar4, tlsVar);
                qje.W(btsVar4, wlsVar5, d8);
                btsVar4.e0(1778507599);
                btsVar4.t(false);
                btsVar4.t(true);
                fpb1.c(r740Var, btsVar4, 8);
                btsVar4.t(true);
                return zy11Var;
            default:
                wp2 wp2Var = (wp2) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean d9 = btsVar5.d(j);
                    Object Q3 = btsVar5.Q();
                    if (d9 || Q3 == o430Var) {
                        Q3 = new vh10(j, 15);
                        btsVar5.o0(Q3);
                    }
                    f530 g = bb1.g(c530Var, (tls) Q3);
                    au2 au2Var = h791.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Parking", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 e = nnm.e(2.65f, 5.28f);
                        e.d(2.0f, 6.56f, 2.0f, 8.24f, 2.0f, 11.6f);
                        e.p(0.8f);
                        e.e(0.0f, 3.36f, 0.0f, 5.04f, 0.65f, 6.32f);
                        e.b(6.0f, 6.0f, false, false, 2.63f, 2.63f);
                        e.e(1.28f, 0.65f, 2.96f, 0.65f, 6.32f, 0.65f);
                        e.g(0.8f);
                        e.e(3.36f, 0.0f, 5.04f, 0.0f, 6.32f, -0.65f);
                        e.b(6.0f, 6.0f, false, false, 2.63f, -2.63f);
                        e.e(0.65f, -1.28f, 0.65f, -2.96f, 0.65f, -6.32f);
                        e.p(-0.8f);
                        e.e(0.0f, -3.36f, 0.0f, -5.04f, -0.65f, -6.32f);
                        e.b(6.0f, 6.0f, false, false, -2.63f, -2.63f);
                        e.d(17.44f, 2.0f, 15.76f, 2.0f, 12.4f, 2.0f);
                        e.g(-0.8f);
                        e.e(-3.36f, 0.0f, -5.04f, 0.0f, -6.32f, 0.65f);
                        e.b(6.0f, 6.0f, false, false, -2.63f, 2.63f);
                        e.k(5.9f, 1.5f);
                        e.e(-0.05f, 0.1f, -0.05f, 0.24f, -0.05f, 0.52f);
                        e.p(9.9f);
                        e.e(0.0f, 0.28f, 0.0f, 0.42f, 0.05f, 0.53f);
                        e.m(0.08f, 0.15f, 0.22f, 0.22f);
                        e.e(0.11f, 0.05f, 0.25f, 0.05f, 0.53f, 0.05f);
                        e.g(0.34f);
                        e.e(0.28f, 0.0f, 0.42f, 0.0f, 0.53f, -0.05f);
                        e.b(0.5f, 0.5f, false, false, 0.22f, -0.22f);
                        e.e(0.05f, -0.11f, 0.05f, -0.25f, 0.05f, -0.53f);
                        e.p(-2.62f);
                        e.e(0.0f, -0.28f, 0.0f, -0.42f, 0.06f, -0.53f);
                        e.b(0.5f, 0.5f, false, true, 0.21f, -0.21f);
                        e.e(0.11f, -0.06f, 0.25f, -0.06f, 0.53f, -0.06f);
                        e.g(0.93f);
                        e.b(7.0f, 7.0f, false, false, 1.83f, -0.2f);
                        e.b(4.0f, 4.0f, false, false, 1.41f, -0.7f);
                        e.m(0.6f, -0.46f, 0.92f, -1.18f);
                        e.b(4.0f, 4.0f, false, false, 0.32f, -1.72f);
                        e.m(0.0f, -1.8f, -1.16f, -2.65f);
                        e.b(5.5f, 5.5f, false, false, -3.24f, -0.83f);
                        e.f(9.3f);
                        e.e(-0.28f, 0.0f, -0.42f, 0.0f, -0.53f, 0.05f);
                        e.b(0.5f, 0.5f, false, false, -0.22f, 0.22f);
                        e.k(2.16f, 1.46f);
                        e.e(0.11f, -0.06f, 0.25f, -0.06f, 0.53f, -0.06f);
                        e.g(1.01f);
                        e.m(1.2f, 0.0f, 1.82f, 0.45f);
                        e.m(0.62f, 0.44f, 0.62f, 1.41f);
                        e.m(0.0f, 1.15f, -0.67f, 1.6f);
                        e.b(3.2f, 3.2f, false, true, -1.85f, 0.47f);
                        e.g(-0.93f);
                        e.e(-0.28f, 0.0f, -0.42f, 0.0f, -0.53f, -0.05f);
                        e.b(0.5f, 0.5f, false, true, -0.21f, -0.22f);
                        e.m(-0.07f, -0.13f, -0.06f, -0.53f);
                        e.o(8.98f);
                        e.e(0.0f, -0.28f, 0.0f, -0.42f, 0.06f, -0.52f);
                        e.b(0.5f, 0.5f, false, true, 0.21f, -0.22f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        h791.a = au2Var;
                    }
                    sya1.a(au2Var, g, null, wp2Var, btsVar5, 0, 4);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ q07(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
