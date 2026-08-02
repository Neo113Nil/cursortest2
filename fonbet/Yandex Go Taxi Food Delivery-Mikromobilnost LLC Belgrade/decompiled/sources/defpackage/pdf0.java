package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class pdf0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pdf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        g8o0 g8o0Var = (g8o0) this.b;
        ebp0 ebp0Var = (ebp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            m9b1.b(ebp0Var, g8o0Var.a, null, null, xya1.e(btsVar).g.b, 0, 0, g8o0Var.b, null, null, 0, 0, null, btsVar, intValue & 14, 0, 32630);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [f530] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        long q;
        float f;
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                a37 a37Var = (a37) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    ymb1.f(a37Var.a, an91.o(c530.a, 14.0f, 0.0f, 14.0f, 0.0f, 10), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 48, 0, 65532);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                n351 n351Var = (n351) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    hqf0 hqf0Var = (hqf0) n351Var;
                    wsy0 wsy0Var = hqf0Var.c;
                    wsy0 wsy0Var2 = hqf0Var.d;
                    ldc ldcVar = hqf0Var.e;
                    if (ldcVar == null) {
                        btsVar2.e0(-984976142);
                        j = ((el51) btsVar2.m(gl51.a)).n();
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-984977351);
                        btsVar2.t(false);
                        j = ldcVar.a;
                    }
                    long j3 = j;
                    ldc ldcVar2 = hqf0Var.f;
                    if (ldcVar2 == null) {
                        btsVar2.e0(-984973325);
                        j2 = ((el51) btsVar2.m(gl51.a)).o();
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-984974627);
                        btsVar2.t(false);
                        j2 = ldcVar2.a;
                    }
                    a.f(null, wsy0Var, j3, wsy0Var2, j2, hqf0Var.g, hqf0Var.h, hqf0Var.j, hqf0Var.l, hqf0Var.m, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                vlf0 vlf0Var = (vlf0) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    qgy.b(vlf0Var.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), vlf0Var.b, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 384, 0, 12274);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                dof0 dof0Var = (dof0) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    xnf0.d(ibp0Var, dof0Var, null, btsVar4, intValue4 & 14);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                ulf0 ulf0Var = (ulf0) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    xnf0.b(ebp0Var, ulf0Var, null, btsVar5, intValue5 & 14);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                rqf0 rqf0Var = (rqf0) obj4;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    xnf0.f(ibp0Var2, rqf0Var, null, btsVar6, intValue6 & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                mhj0 mhj0Var = (mhj0) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    String str = mhj0Var.e;
                    AppColor$Palette appColor$Palette = (str == null || evu0.J(str)) ? AppColor$Palette.TextMinor : AppColor$Palette.Text;
                    f530 c = ljs0.c(an91.k(c530Var, 16.0f), 1.0f);
                    String str2 = mhj0Var.e;
                    if (str2 == null) {
                        str2 = mhj0Var.c;
                    }
                    jeb1.f(str2, c, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar7, 48, 0, 32760);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                nhj0 nhj0Var = (nhj0) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    jeb1.f(nhj0Var.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar8).g.b, btsVar8, 0, 0, 16382);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                qkj0 qkj0Var = (qkj0) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    sya1.a(((lkj0) qkj0Var).a, null, null, null, btsVar9, 0, 14);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                jkj0 jkj0Var = (jkj0) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    qgy.b(jkj0Var.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar10).h.b, null, btsVar10, 384, 0, 12282);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                uij0 uij0Var = (uij0) obj4;
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(ibp0Var3) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    zla1.d(ibp0Var3, uij0Var, null, btsVar11, intValue11 & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                jdj0 jdj0Var = (jdj0) obj4;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 19) != 18)) {
                    zla1.b(ebp0Var2, jdj0Var, null, btsVar12, intValue12 & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                ikj0 ikj0Var = (ikj0) obj4;
                ibp0 ibp0Var4 = (ibp0) obj;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ibp0Var4) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    zla1.e(ibp0Var4, ikj0Var, null, btsVar13, intValue13 & 14);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                r7k0 r7k0Var = (r7k0) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    c530 c530Var2 = c530Var;
                    if (r7k0Var instanceof q7k0) {
                        c530Var2 = ofb1.b(c530Var, true, null, 6);
                    }
                    jeb1.f(r7k0Var.getText(), c530Var2, r7k0Var instanceof o7k0 ? AppColor$Palette.TextOnControlMinor : tp2.a, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar14).g.b, btsVar14, 0, 0, 16376);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                ctk0 ctk0Var = (ctk0) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    sya1.a(((atk0) ctk0Var).a, null, null, null, btsVar15, 0, 14);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                w2l0 w2l0Var = (w2l0) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    f2z0 f2z0Var = w2l0Var.c;
                    jeb1.f("", null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar16).g.b, btsVar16, 0, 0, 16382);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 16:
                dcl0 dcl0Var = (dcl0) obj4;
                int intValue17 = ((Integer) obj).intValue();
                fid fidVar17 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= fidVar17.c(intValue17) ? 4 : 2;
                }
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    t5l0.e(intValue17, dcl0Var, btsVar17, intValue18 & 14);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 17:
                nae naeVar = (nae) obj4;
                fid fidVar18 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    ymb1.f(((ybe) naeVar.e).a, an91.l(c530Var, 14.0f, 9.0f), ((el51) btsVar18.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar18, 24624, 0, 65512);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 18:
                n4m n4mVar = (n4m) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    jeb1.f(n4mVar.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar19, 0, 0, 32766);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 19:
                tgl0 tgl0Var = (tgl0) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String str3 = tgl0Var.c;
                    if (tgl0Var.d) {
                        btsVar20.e0(1714386363);
                        q = ((el51) btsVar20.m(gl51.a)).p();
                        btsVar20.t(false);
                    } else {
                        btsVar20.e0(1714459802);
                        q = ((el51) btsVar20.m(gl51.a)).q();
                        btsVar20.t(false);
                    }
                    ymb1.e(str3, null, q, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar20, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 20:
                bwl0 bwl0Var = (bwl0) obj4;
                fid fidVar21 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    jeb1.f(bwl0Var.c, ofb1.b(c530Var, bwl0Var.a, null, 14), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar21).g.b, btsVar21, 0, 0, 16380);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 21:
                cyl0 cyl0Var = (cyl0) obj4;
                fid fidVar22 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    jeb1.f(((zxl0) cyl0Var).b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar22).g.b, btsVar22, 0, 0, 16382);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 22:
                f47 f47Var = (f47) obj4;
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar23 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((bts) fidVar23).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue24 & 1, (intValue24 & 19) != 18)) {
                    p9b1.c(ebp0Var3, f47Var.c ? f47Var.b : f47Var.a, null, null, xya1.e(btsVar23).g.b, 0, 0, null, null, null, 0, 0, null, btsVar23, intValue24 & 14, 0, 8182);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 23:
                spm0 spm0Var = (spm0) obj4;
                ebp0 ebp0Var4 = (ebp0) obj;
                fid fidVar24 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((bts) fidVar24).k(ebp0Var4) ? 4 : 2;
                }
                bts btsVar24 = (bts) fidVar24;
                if (btsVar24.V(intValue25 & 1, (intValue25 & 19) != 18)) {
                    p9b1.c(ebp0Var4, spm0Var.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar24, intValue25 & 14, 0, 8190);
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 24:
                gsm0 gsm0Var = (gsm0) obj4;
                ebp0 ebp0Var5 = (ebp0) obj;
                fid fidVar25 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((bts) fidVar25).k(ebp0Var5) ? 4 : 2;
                }
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue26 & 1, (intValue26 & 19) != 18)) {
                    m9b1.b(ebp0Var5, gsm0Var.a, null, null, xya1.d(btsVar25).e.d, 0, 0, gsm0Var.b, null, null, 0, 0, null, btsVar25, intValue26 & 14, 0, 32630);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 25:
                utm0 utm0Var = (utm0) obj4;
                fid fidVar26 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                bts btsVar26 = (bts) fidVar26;
                if (btsVar26.V(intValue27 & 1, (intValue27 & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.H, btsVar26, 48);
                    int hashCode = Long.hashCode(btsVar26.T);
                    r1b0 o = btsVar26.o();
                    f530 d = b.d(btsVar26, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar26.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar26.i0();
                    if (btsVar26.S) {
                        btsVar26.n(slsVar);
                    } else {
                        btsVar26.r0();
                    }
                    qje.W(btsVar26, d.f, a);
                    qje.W(btsVar26, d.e, o);
                    qje.W(btsVar26, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar26, d.h);
                    qje.W(btsVar26, d.d, d);
                    CharSequence charSequence = utm0Var.a;
                    CharSequence charSequence2 = utm0Var.b;
                    qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar26, 0, 0, 16382);
                    if (charSequence2.length() > 0) {
                        btsVar26.e0(61315689);
                        qgy.b(charSequence2, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar26, 0, 0, 16382);
                        btsVar26.t(false);
                    } else {
                        btsVar26.e0(61367583);
                        btsVar26.t(false);
                    }
                    btsVar26.t(true);
                } else {
                    btsVar26.Y();
                }
                return zy11Var;
            case 26:
                bum0 bum0Var = (bum0) obj4;
                fid fidVar27 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                bts btsVar27 = (bts) fidVar27;
                if (btsVar27.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar27, 48);
                    int hashCode2 = Long.hashCode(btsVar27.T);
                    r1b0 o2 = btsVar27.o();
                    f530 d2 = b.d(btsVar27, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar27.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar27.i0();
                    if (btsVar27.S) {
                        btsVar27.n(slsVar2);
                    } else {
                        btsVar27.r0();
                    }
                    qje.W(btsVar27, d.f, a2);
                    qje.W(btsVar27, d.e, o2);
                    qje.W(btsVar27, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar27, d.h);
                    qje.W(btsVar27, d.d, d2);
                    if (bum0Var.d.length() > 0) {
                        btsVar27.e0(-113016874);
                        ovi0 a3 = mja1.a(bum0Var.d, null, 6);
                        sbd.a.getClass();
                        v0b1.a(a3, null, null, sbd.b, null, null, null, null, 0.0f, 0, btsVar27, HProv.ALG_TYPE_SECURECHANNEL, 1014);
                        f = 2.0f;
                    } else {
                        btsVar27.e0(-112761434);
                        long n = tje.n(bum0Var.c, btsVar27);
                        f530 m = ljs0.m(c530Var, 7.0f);
                        boolean d3 = btsVar27.d(n);
                        Object Q = btsVar27.Q();
                        if (d3 || Q == did.a) {
                            Q = new vh10(n, 28);
                            btsVar27.o0(Q);
                        }
                        qeb1.a(6, btsVar27, (tls) Q, m);
                        f = 8.0f;
                    }
                    nnm.s(c530Var, f, btsVar27, false);
                    qgy.b(bum0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar27).h.b, null, btsVar27, 0, 0, 12286);
                    btsVar27.t(true);
                } else {
                    btsVar27.Y();
                }
                return zy11Var;
            case 27:
                xrn0 xrn0Var = (xrn0) obj4;
                fid fidVar28 = (fid) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                bts btsVar28 = (bts) fidVar28;
                if (btsVar28.V(intValue29 & 1, (intValue29 & 17) != 16)) {
                    jeb1.f(xrn0Var.e, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar28, 0, 0, 32766);
                } else {
                    btsVar28.Y();
                }
                return zy11Var;
            case 28:
                return b(obj, obj2, obj3);
            default:
                o8o0 o8o0Var = (o8o0) obj4;
                ebp0 ebp0Var6 = (ebp0) obj;
                fid fidVar29 = (fid) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                if ((intValue30 & 6) == 0) {
                    intValue30 |= ((bts) fidVar29).k(ebp0Var6) ? 4 : 2;
                }
                bts btsVar29 = (bts) fidVar29;
                if (btsVar29.V(intValue30 & 1, (intValue30 & 19) != 18)) {
                    m9b1.b(ebp0Var6, o8o0Var.a, null, null, xya1.e(btsVar29).g.b, 0, 0, o8o0Var.b, null, null, 0, 0, null, btsVar29, intValue30 & 14, 0, 32630);
                } else {
                    btsVar29.Y();
                }
                return zy11Var;
        }
    }
}
