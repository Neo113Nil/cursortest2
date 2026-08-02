package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class my8 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my8(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [f530] */
    /* JADX WARN: Type inference failed for: r10v4, types: [f530] */
    /* JADX WARN: Type inference failed for: r10v6, types: [f530] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                cy8 cy8Var = (cy8) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 k = an91.j(c530Var, cy8Var.d).k(ljs0.c);
                    sic a = qic.a(new i43(8.0f, false, new m6(8, x4c.F)), x4c.H, btsVar, 54);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, k);
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
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b.g(cy8Var.a, cy8Var.b, cy8Var.c, null, btsVar, 0);
                    if (z) {
                        tse0.s(btsVar, 1184286256, c530Var, 24.0f, btsVar);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1184356409);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                c47 c47Var = (c47) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    jeb1.f(c47Var.b, ofb1.b(c530Var, z, null, 14), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 0, 0, 16380);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                sls slsVar2 = (sls) obj4;
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar3 = (bts) ((fid) obj2);
                btsVar3.e0(-196777734);
                long j = ((osy0) btsVar3.m(psy0.a)).a;
                boolean d2 = btsVar3.d(j) | btsVar3.k(slsVar2) | btsVar3.a(z);
                Object Q = btsVar3.Q();
                if (d2 || Q == o430Var) {
                    Q = new hc2(z, j, slsVar2);
                    btsVar3.o0(Q);
                }
                f530 h = bb1.h(f530Var, (tls) Q);
                btsVar3.t(false);
                return h;
            case 3:
                eq5 eq5Var = (eq5) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (z) {
                        str = eq5Var.e;
                        if (str == null) {
                            str = eq5Var.c;
                        }
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        str = eq5Var.c;
                    }
                    String str2 = str;
                    AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                    ety0 ety0Var = xya1.e(btsVar4).f.c;
                    String str3 = eq5Var.d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    p9b1.c(ebp0Var, str2, null, appColor$Palette, ety0Var, 0, 1, str3, appColor$Palette, xya1.e(btsVar4).h.a, 0, 1, null, btsVar4, (intValue3 & 14) | 102239232, 48, 6674);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                lt9 lt9Var = (lt9) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    z910 d3 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar5.T);
                    r1b0 o2 = btsVar5.o();
                    f530 d4 = b.d(btsVar5, c);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar3);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d3);
                    qje.W(btsVar5, d.e, o2);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d4);
                    if (z) {
                        btsVar5.e0(-1877096155);
                        efb1.b(0.0f, 0.0f, null, btsVar5, 0, 7);
                        btsVar5.t(false);
                    } else {
                        btsVar5.e0(-1877056878);
                        jeb1.f(lt9Var.g, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar5).g.b, btsVar5, 0, 0, 16382);
                        btsVar5.t(false);
                    }
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                wg6 wg6Var = (wg6) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar5;
                if (!btsVar6.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    btsVar6.Y();
                } else if (z) {
                    btsVar6.e0(-14231458);
                    btsVar6.t(false);
                } else {
                    btsVar6.e0(-14283352);
                    oab1.a(wg6Var, btsVar6, 0);
                    btsVar6.t(false);
                }
                return zy11Var;
            case 6:
                fta ftaVar = (fta) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    CharSequence charSequence = ftaVar.a;
                    c530 c530Var2 = c530Var;
                    if (z) {
                        c530Var2 = ofb1.b(c530Var, false, null, 15);
                    }
                    qgy.b(charSequence, null, c530Var2, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar7, 0, 0, 16378);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                f530 f530Var2 = (f530) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar7).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar7;
                if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    btsVar8.Y();
                } else if (f530Var2 == null || !z) {
                    btsVar8.e0(523326137);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar8, false);
                } else {
                    btsVar8.e0(523109509);
                    Object Q2 = btsVar8.Q();
                    if (Q2 == o430Var) {
                        Q2 = new bgc(12);
                        btsVar8.o0(Q2);
                    }
                    f530 d5 = q791.d(f530Var2, false, null, null, (sls) Q2, 14);
                    au2 au2Var = skb1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Menu", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        uq90Var.j(3.0f, 6.0f);
                        uq90Var.g(18.0f);
                        uq90Var.p(2.0f);
                        uq90Var.h(3.0f, 8.0f);
                        uq90Var.c();
                        uq90Var.j(3.0f, 11.0f);
                        uq90Var.g(18.0f);
                        uq90Var.p(2.0f);
                        uq90Var.h(3.0f, 13.0f);
                        uq90Var.c();
                        uq90Var.j(3.0f, 16.0f);
                        uq90Var.g(18.0f);
                        uq90Var.p(2.0f);
                        uq90Var.h(3.0f, 18.0f);
                        uq90Var.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        skb1.a = au2Var;
                    }
                    zrb1.a(ibp0Var, au2Var, d5, AppColor$Palette.Line, btsVar8, (intValue7 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 4);
                    btsVar8.t(false);
                }
                return zy11Var;
            case 8:
                u540 u540Var = (u540) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar8;
                c530 c530Var3 = c530Var;
                if (btsVar9.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    if (z) {
                        c530Var3 = ofb1.b(c530Var, false, null, 15);
                    }
                    jeb1.f(u540Var.a.c.a, c530Var3, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar9, 0, 0, 32764);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                czy0 czy0Var = (czy0) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar9;
                c530 c530Var4 = c530Var;
                if (btsVar10.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    if (z) {
                        c530Var4 = ofb1.b(c530Var, false, null, 15);
                    }
                    jeb1.f(czy0Var.a.d.a, c530Var4, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar10, 0, 0, 32764);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                s611 s611Var = (s611) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar10;
                if (!btsVar11.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    btsVar11.Y();
                } else if (z) {
                    btsVar11.e0(649779466);
                    qb91.a(ljs0.b(c530Var, 0.0f, SlotSize.XS.getSize(), 1), new zrm(6, Ellipse$Size.SMALL, qb91.b(s611Var.h)), 0.0f, Float.valueOf(1.5f), new ldc(ldc.f), btsVar11, 221248, 76);
                    btsVar11.t(false);
                } else {
                    btsVar11.e0(650038936);
                    btsVar11.t(false);
                }
                return zy11Var;
            case 11:
                v3z0 v3z0Var = (v3z0) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar11;
                if (btsVar12.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean z2 = v3z0Var.f;
                    u2z0 u2z0Var = v3z0Var.a;
                    f530 b = pfb1.b(c530Var, z2, 14);
                    sic a2 = qic.a(lr20.c, x4c.H, btsVar12, 48);
                    int hashCode3 = Long.hashCode(btsVar12.T);
                    r1b0 o3 = btsVar12.o();
                    f530 d6 = b.d(btsVar12, b);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar4);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, d.f, a2);
                    qje.W(btsVar12, d.e, o3);
                    qje.W(btsVar12, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar12, d.h);
                    qje.W(btsVar12, d.d, d6);
                    ety0 ety0Var2 = xya1.d(btsVar12).g.a;
                    jeb1.f(u2z0Var.a, null, u2z0Var.b, nwa1.i(ety0Var2.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar12, 0, 0, 16370);
                    if (v3z0Var.b.length() > 0) {
                        btsVar12.e0(287771511);
                        ety0 ety0Var3 = xya1.d(btsVar12).h.a;
                        jeb1.f(v3z0Var.b, null, new up2(ldc.b(tje.n(u2z0Var.b, btsVar12), 0.5f, 0.0f, 0.0f, 0.0f, 14)), nwa1.i(ety0Var3.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var3, btsVar12, 0, 0, 16370);
                        btsVar12.t(false);
                    } else {
                        btsVar12.e0(288119393);
                        btsVar12.t(false);
                    }
                    btsVar12.t(true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                u2z0 u2z0Var2 = ((s3z0) obj4).a;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar12;
                if (btsVar13.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ety0 ety0Var4 = xya1.d(btsVar13).g.b;
                    jeb1.f(u2z0Var2.a, null, u2z0Var2.b, nwa1.i(ety0Var4.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var4, btsVar13, 0, 0, 16370);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                u2z0 u2z0Var3 = ((t3z0) obj4).a;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ety0 ety0Var5 = xya1.d(btsVar14).g.b;
                    jeb1.f(u2z0Var3.a, null, u2z0Var3.b, nwa1.i(ety0Var5.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var5, btsVar14, 0, 0, 16370);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            default:
                x3z0 x3z0Var = (x3z0) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((bts) fidVar14).k(dj6Var) ? 4 : 2;
                }
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(intValue14 & 1, (intValue14 & 19) != 18)) {
                    uo5 uo5Var = x4c.B;
                    dj6Var.getClass();
                    fpb1.d(dj6Var.d(), 0, tje.n(x3z0Var.g, btsVar15), rzo.d(z ? 1711276032 : 1728053247), btsVar15, an91.o(cj6.a.a(c530Var, uo5Var), 48.0f, 0.0f, 48.0f, 0.0f, 10));
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ my8(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
