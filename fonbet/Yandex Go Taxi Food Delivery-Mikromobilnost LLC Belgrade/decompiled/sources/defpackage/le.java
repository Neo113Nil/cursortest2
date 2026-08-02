package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class le implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ le(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wwy wwyVar = wwy.a;
        String str = this.b;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    jeb1.f(this.b, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 48, 0, 16380);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 0, 0, 16382);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 0, 0, 16382);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.a, btsVar4, 0, 0, 16382);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar5).g.a, btsVar5, 0, 0, 16382);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    jeb1.f(this.b, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.d(btsVar6).h.a, btsVar6, 48, 48, 14332);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    jeb1.f(this.b, null, AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar7).g.b, btsVar7, 384, 0, 16378);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    p9b1.c(ebp0Var, this.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar8, intValue8 & 14, 0, 8190);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    f530 m = an91.m(c530Var, 12.0f, 0.0f, 2);
                    Object Q = btsVar9.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar9.o0(Q);
                    }
                    jeb1.f(this.b, fnq0.a(m, (tls) Q), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).h.b, btsVar9, 384, 0, 16376);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar10, 0, 0, 32766);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ymb1.e(this.b, an91.k(c530Var, 8.0f), ((el51) btsVar11.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar11, 48, 0, 64504);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ymb1.e(this.b, an91.k(c530Var, 8.0f), ((el51) btsVar12.m(gl51.a)).p(), tq7.a, lzr.E, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar12, 27696, 0, 64480);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ymb1.e(this.b, an91.k(c530Var, 8.0f), ldc.f, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar13, 432, 0, 65528);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ymb1.e(this.b, an91.k(c530Var, 8.0f), ldc.f, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar14, 432, 0, 65528);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ymb1.e(this.b, an91.m(c530Var, 14.0f, 0.0f, 2), ((el51) btsVar15.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar15, 24624, 0, 65512);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    f530 o = an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 12.0f, 5);
                    Object Q2 = btsVar16.Q();
                    if (Q2 == did.a) {
                        Q2 = new wk6(21);
                        btsVar16.o0(Q2);
                    }
                    jeb1.f(this.b, fnq0.b(o, false, (tls) Q2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar16).e.d, btsVar16, 0, 0, 16380);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 16:
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (!btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    btsVar17.Y();
                } else if (str != null) {
                    btsVar17.e0(-1687568428);
                    ovi0 a = mja1.a(str, null, 6);
                    f530 m2 = ljs0.m(c530Var, 56.0f);
                    d5d.a.getClass();
                    v0b1.a(a, m2, null, d5d.c, d5d.d, null, null, mhe.e, 0.0f, 0, btsVar17, 12610608, 868);
                    btsVar17.t(false);
                } else {
                    btsVar17.e0(-1687268875);
                    oeb1.c(btsVar17, ljs0.q(c530Var, 16.0f));
                    btsVar17.t(false);
                }
                return zy11Var;
            case 17:
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    ymb1.e(this.b, null, ((el51) btsVar18.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar18, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 18:
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    ymb1.e(this.b, null, ((el51) btsVar19.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar19, 0, 0, 65530);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 19:
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    ymb1.e(this.b, null, ((el51) btsVar20.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar20, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 20:
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar21).g.a, btsVar21, 0, 0, 16382);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    jeb1.f(this.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar22).g.a, btsVar22, 0, 0, 16382);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 22:
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    ywy ywyVar = (ywy) ffb1.f(mja1.a(str, null, 6), btsVar23, 0).getValue();
                    if (jl40.l(ywyVar, wwyVar)) {
                        btsVar23.e0(-576192361);
                        btsVar23.t(false);
                    } else if (ywyVar instanceof xwy) {
                        btsVar23.e0(-576123541);
                        j4b1.c(((xwy) ywyVar).a, null, null, null, null, null, 0.0f, 0, btsVar23, (0 & 14) | 384, 250);
                        btsVar23.t(false);
                    } else {
                        if (!jl40.l(ywyVar, vwy.a)) {
                            throw unr0.y(1505431128, btsVar23, false);
                        }
                        btsVar23.e0(-576049575);
                        btsVar23.t(false);
                    }
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 23:
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                bts btsVar24 = (bts) fidVar24;
                if (btsVar24.V(intValue24 & 1, (intValue24 & 17) != 16)) {
                    ywy ywyVar2 = (ywy) ffb1.f(mja1.b(str, null, 6), btsVar24, 0).getValue();
                    if (jl40.l(ywyVar2, wwyVar)) {
                        btsVar24.e0(-576192361);
                        btsVar24.t(false);
                    } else if (ywyVar2 instanceof xwy) {
                        btsVar24.e0(-576123541);
                        j4b1.c(((xwy) ywyVar2).a, null, null, null, null, null, 0.0f, 0, btsVar24, (0 & 14) | 384, 250);
                        btsVar24.t(false);
                    } else {
                        if (!jl40.l(ywyVar2, vwy.a)) {
                            throw unr0.y(1505431128, btsVar24, false);
                        }
                        btsVar24.e0(-576049575);
                        btsVar24.t(false);
                    }
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 24:
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    ymb1.f(this.b, an91.m(c530Var, 12.0f, 0.0f, 2), ((el51) btsVar25.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar25, 48, 0, 65528);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 25:
                fid fidVar26 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                bts btsVar26 = (bts) fidVar26;
                if (btsVar26.V(intValue26 & 1, (intValue26 & 17) != 16)) {
                    web1.e(null, null, x4c.H, this.b, null, ((el51) btsVar26.m(gl51.a)).p(), lzr.E, null, null, 0, false, 0, null, null, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar26, 12583296, 0, 0, 268435251);
                } else {
                    btsVar26.Y();
                }
                return zy11Var;
            case 26:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar27 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                if ((intValue27 & 6) == 0) {
                    intValue27 |= ((bts) fidVar27).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar27 = (bts) fidVar27;
                if (btsVar27.V(intValue27 & 1, (intValue27 & 19) != 18)) {
                    p9b1.c(ebp0Var2, this.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar27, intValue27 & 14, 0, 8190);
                } else {
                    btsVar27.Y();
                }
                return zy11Var;
            case 27:
                fid fidVar28 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                bts btsVar28 = (bts) fidVar28;
                if (!btsVar28.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    btsVar28.Y();
                } else if (str.length() > 0) {
                    btsVar28.e0(-2074831276);
                    f530 m3 = ljs0.m(c530Var, 48.0f);
                    ovi0 a2 = mja1.a(str, null, 6);
                    h8d.a.getClass();
                    v0b1.a(a2, m3, null, h8d.b, h8d.c, null, null, null, 0.0f, 0, btsVar28, 27696, 996);
                    btsVar28.t(false);
                } else {
                    btsVar28.e0(-2074633062);
                    btsVar28.t(false);
                }
                return zy11Var;
            default:
                fid fidVar29 = (fid) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                bts btsVar29 = (bts) fidVar29;
                if (btsVar29.V(intValue29 & 1, (intValue29 & 17) != 16)) {
                    ymb1.e(this.b, null, ((el51) btsVar29.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar29, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                } else {
                    btsVar29.Y();
                }
                return zy11Var;
        }
    }
}
