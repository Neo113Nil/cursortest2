package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.requirements.comment.summary.ui.v3.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class j2d implements zls {
    public final /* synthetic */ int a;

    public /* synthetic */ j2d(int i) {
        this.a = i;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        c36 c36Var = null;
        int i2 = 6;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                k2d k2dVar = k2d.a;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    o4b1.b(vfc.k(dzg0.chevron_next, 0, -1411607277, btsVar, false), null, an91.o(ljs0.c, 4.0f, 1.0f, 0.0f, 1.0f, 4), null, null, 0.0f, null, btsVar, 392, 56);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                p5d p5dVar = p5d.a;
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 k = bzk0.c(c530Var, AppColor$Palette.Background, qke.q).k(ljs0.c);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, k);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    ffb1.c(SpinnerSize.LARGE, null, null, null, btsVar2, 6, 14);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                n9d n9dVar = n9d.a;
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    com.yandex.go.design.compose.loading.b.a(ljs0.c, cyk0.c(8.0f), false, null, null, null, false, btsVar3, 6, 252);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar4 = (bts) ((fid) obj2);
                btsVar4.e0(-1164201912);
                long n = tje.n(AppColor$Palette.BgMinor, btsVar4);
                xw91 xw91Var = ((nx2) btsVar4.m(uy2.c)).b;
                boolean b = btsVar4.b(16.0f) | btsVar4.d(n);
                Object Q = btsVar4.Q();
                if (b || Q == o430Var) {
                    Q = new cs0(n, r13 ? 1 : 0);
                    btsVar4.o0(Q);
                }
                f530 i3 = bb1.i(f530Var, (tls) Q);
                btsVar4.t(false);
                return i3;
            case 4:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    ljs0.c(c530Var, 1.0f);
                    throw null;
                }
                btsVar5.Y();
                return zy11Var;
            case 5:
                f530 f530Var2 = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar6 = (bts) ((fid) obj2);
                btsVar6.e0(1635138269);
                btsVar6.e0(-590152092);
                dur durVar = (dur) btsVar6.m(j.i);
                btsVar6.t(false);
                boolean e = btsVar6.e(durVar);
                Object Q2 = btsVar6.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new j1(i2, durVar);
                    btsVar6.o0(Q2);
                }
                f530 e2 = v0a1.e(f530Var2, (tls) Q2);
                btsVar6.t(false);
                return e2;
            case 6:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                u1d u1dVar = u1d.a;
                bts btsVar7 = (bts) fidVar5;
                if (btsVar7.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    a.d(138.0f, btsVar7, 6);
                    a.d(168.0f, btsVar7, 6);
                    a.d(200.0f, btsVar7, 6);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                w1d w1dVar = w1d.a;
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar6;
                if (btsVar8.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    p9b1.c(ebp0Var, ohb1.e(btsVar8, kyh0.about_another_apps), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar8, intValue6 & 14, 0, 8190);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                w1d w1dVar2 = w1d.a;
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar7).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar9 = (bts) fidVar7;
                if (btsVar9.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    p9b1.c(ebp0Var2, ohb1.e(btsVar9, kyh0.about_license), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar9, intValue7 & 14, 0, 8190);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                w1d w1dVar3 = w1d.a;
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar8;
                if (btsVar10.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    p9b1.c(ebp0Var3, ohb1.e(btsVar10, kyh0.terms_and_conditions_title), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar10, intValue8 & 14, 0, 8190);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                ebp0 ebp0Var4 = (ebp0) obj;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                w1d w1dVar4 = w1d.a;
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar9).k(ebp0Var4) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar9;
                if (btsVar11.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    p9b1.c(ebp0Var4, ohb1.e(btsVar11, kyh0.about_privacy_policy), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar11, intValue9 & 14, 0, 8190);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                c2d c2dVar = c2d.a;
                bts btsVar12 = (bts) fidVar10;
                if (btsVar12.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar12, kyh0.common_close), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar12).g.a, btsVar12, 0, 0, 16382);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                c2d c2dVar2 = c2d.a;
                bts btsVar13 = (bts) fidVar11;
                if (btsVar13.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar13, kyh0.no_connection_try_again), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar13).g.b, btsVar13, 0, 0, 16382);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                ebp0 ebp0Var5 = (ebp0) obj;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                g2d g2dVar = g2d.a;
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ebp0Var5) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar12;
                if (btsVar14.V(intValue12 & 1, (intValue12 & 19) != 18)) {
                    p9b1.c(ebp0Var5, ohb1.e(btsVar14, kyh0.route_selector_map_hint), null, null, xya1.e(btsVar14).g.b, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar14, intValue12 & 14, 384, 6134);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                k2d k2dVar2 = k2d.a;
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar15 = (bts) fidVar13;
                if (btsVar15.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    udb1.c(ibp0Var, u2b1.a(), null, null, btsVar15, intValue13 & 14, 14);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                n2d n2dVar = n2d.a;
                bts btsVar16 = (bts) fidVar14;
                if (btsVar16.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    com.yandex.go.ai_widget.ui.a.c(n2d.b, btsVar16, 6);
                    oeb1.c(btsVar16, ljs0.e(c530Var, 80.0f));
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 16:
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                n2d n2dVar2 = n2d.a;
                bts btsVar17 = (bts) fidVar15;
                if (btsVar17.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    com.yandex.go.ai_widget.ui.a.c(n2d.d, btsVar17, 6);
                    oeb1.c(btsVar17, ljs0.e(c530Var, 80.0f));
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 17:
                do1 do1Var = (do1) obj;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                n2d n2dVar3 = n2d.a;
                if ((intValue16 & 6) == 0) {
                    intValue16 |= (intValue16 & 8) == 0 ? ((bts) fidVar16).k(do1Var) : fidVar16.e(do1Var) ? 4 : 2;
                }
                bts btsVar18 = (bts) fidVar16;
                if (btsVar18.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                    pkf.d(null, do1Var, btsVar18, (intValue16 << 3) & 112);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 18:
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                q2d q2dVar = q2d.a;
                bts btsVar19 = (bts) fidVar17;
                if (btsVar19.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    msa1.m(btsVar19, 0);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 19:
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                q2d q2dVar2 = q2d.a;
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((bts) fidVar18).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar20 = (bts) fidVar18;
                if (btsVar20.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    float size = ibp0Var2.c().getSize();
                    c530 c530Var2 = c530.a;
                    f530 m = ljs0.m(c530Var2, size);
                    z910 d3 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar20.T);
                    r1b0 o2 = btsVar20.o();
                    f530 d4 = b.d(btsVar20, m);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar20.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar20.i0();
                    if (btsVar20.S) {
                        btsVar20.n(slsVar2);
                    } else {
                        btsVar20.r0();
                    }
                    qje.W(btsVar20, d.f, d3);
                    qje.W(btsVar20, d.e, o2);
                    qje.W(btsVar20, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar20, d.h);
                    qje.W(btsVar20, d.d, d4);
                    int i4 = f1h0.ic_flasher_fill_24;
                    AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                    pa90 a = wya1.a(i4, 0, btsVar20);
                    if (appColor$Palette == null) {
                        btsVar20.e0(-1411607277);
                        btsVar20.t(false);
                    } else {
                        btsVar20.e0(-1411607276);
                        c36Var = tse0.e(tje.n(appColor$Palette, btsVar20), 5, btsVar20, false);
                    }
                    o4b1.b(a, null, c530Var2, null, null, 0.0f, c36Var, btsVar20, 8, 56);
                    btsVar20.t(true);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 20:
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                t2d t2dVar = t2d.a;
                if ((intValue19 & 17) == 16) {
                    bts btsVar21 = (bts) fidVar19;
                    if (btsVar21.E()) {
                        btsVar21.Y();
                        return zy11Var;
                    }
                }
                wqy0.b("Reset", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fidVar19, 6, 0, 131070);
                return zy11Var;
            case 21:
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                t2d t2dVar2 = t2d.a;
                if ((intValue20 & 17) == 16) {
                    bts btsVar22 = (bts) fidVar20;
                    if (btsVar22.E()) {
                        btsVar22.Y();
                        return zy11Var;
                    }
                }
                wqy0.b("Rotate", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fidVar20, 6, 0, 131070);
                return zy11Var;
            case 22:
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                v2d v2dVar = v2d.a;
                bts btsVar23 = (bts) fidVar21;
                if (btsVar23.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ymb1.e(ohb1.e(btsVar23, rzh0.common_close), null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar23, 0, 0, 65534);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 23:
                wls wlsVar = (wls) obj;
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                x2d x2dVar = x2d.a;
                if ((intValue22 & 6) == 0) {
                    intValue22 |= fidVar22.e(wlsVar) ? 4 : 2;
                }
                bts btsVar24 = (bts) fidVar22;
                if (btsVar24.V(intValue22 & 1, (intValue22 & 19) != 18)) {
                    wlsVar.invoke(btsVar24, Integer.valueOf(intValue22 & 14));
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 24:
                wls wlsVar2 = (wls) obj;
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                x2d x2dVar2 = x2d.a;
                if ((intValue23 & 6) == 0) {
                    intValue23 |= fidVar23.e(wlsVar2) ? 4 : 2;
                }
                bts btsVar25 = (bts) fidVar23;
                if (btsVar25.V(intValue23 & 1, (intValue23 & 19) != 18)) {
                    wlsVar2.invoke(btsVar25, Integer.valueOf(intValue23 & 14));
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 25:
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                y2d y2dVar = y2d.a;
                bts btsVar26 = (bts) fidVar24;
                if (!btsVar26.V(intValue24 & 1, (intValue24 & 17) != 16)) {
                    btsVar26.Y();
                }
                return zy11Var;
            case 26:
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                a3d a3dVar = a3d.a;
                bts btsVar27 = (bts) fidVar25;
                if (!btsVar27.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    btsVar27.Y();
                }
                return zy11Var;
            case 27:
                fid fidVar26 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                b3d b3dVar = b3d.a;
                bts btsVar28 = (bts) fidVar26;
                if (!btsVar28.V(intValue26 & 1, (intValue26 & 17) != 16)) {
                    btsVar28.Y();
                }
                return zy11Var;
            case 28:
                fid fidVar27 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                d3d d3dVar = d3d.a;
                bts btsVar29 = (bts) fidVar27;
                if (!btsVar29.V(intValue27 & 1, (intValue27 & 17) != 16)) {
                    btsVar29.Y();
                }
                return zy11Var;
            default:
                fid fidVar28 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                d3d d3dVar2 = d3d.a;
                bts btsVar30 = (bts) fidVar28;
                if (!btsVar30.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    btsVar30.Y();
                }
                return zy11Var;
        }
    }
}
