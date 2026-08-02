package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import defpackage.ccd;
import defpackage.mcd;
import defpackage.ocd;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class iad implements zls {
    public final /* synthetic */ int a;

    public /* synthetic */ iad(int i) {
        this.a = i;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        ucd ucdVar = ucd.a;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            mab1.a(null, null, null, null, null, null, null, btsVar, 0, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        zcd zcdVar = zcd.a;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            f530 f = gpb1.f(btsVar, an91.k(c530.a, 20.0f));
            au2 au2Var = i6b1.a;
            if (au2Var == null) {
                lgv lgvVar = new lgv("Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 e = nnm.e(15.76f, 17.18f);
                e.b(8.5f, 8.5f, true, true, 1.41f, -1.41f);
                tse0.u(e, 22.0f, 20.58f, 20.6f, 22.0f);
                e.j(17.0f, 10.5f);
                e.b(6.5f, 6.5f, true, true, -13.0f, 0.0f);
                e.b(6.5f, 6.5f, false, true, 13.0f, 0.0f);
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                au2Var = rya1.a(lgvVar.d(), true);
                i6b1.a = au2Var;
            }
            sya1.a(au2Var, f, null, null, btsVar, 0, 12);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                jad jadVar = jad.a;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                bj6 bj6Var = (bj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                kad kadVar = kad.a;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    qn91.b(0, 0, btsVar2, bj6Var.a(c530Var, x4c.x));
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                kad kadVar2 = kad.a;
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    qn91.b(0, 1, btsVar3, null);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                kad kadVar3 = kad.a;
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    qn91.b(0, 1, btsVar4, null);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                mad madVar = mad.a;
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ymb1.e(ohb1.e(btsVar5, tzh0.logistics_postcard_presentation_track_delivery_button), null, ((el51) btsVar5.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                nad nadVar = nad.a;
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    vqy0.b("Next", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, btsVar6, 6, 0, 131070);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                sad sadVar = sad.a;
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar7).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    udb1.c(ibp0Var, u2b1.a(), null, null, btsVar7, intValue7 & 14, 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                tad tadVar = tad.a;
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    udb1.c(ibp0Var2, u2b1.a(), null, null, btsVar8, intValue8 & 14, 14);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                vad vadVar = vad.a;
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar9, kyh0.common_done), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).g.b, btsVar9, 0, 0, 16382);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                xad xadVar = xad.a;
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar10, kyh0.common_ok), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar10).g.a, btsVar10, 0, 0, 16382);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                zad zadVar = zad.a;
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    au2 au2Var = qfa1.c;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Exclamation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 e = nnm.e(10.74f, 2.2f);
                        e.e(0.82f, -0.27f, 1.7f, -0.27f, 2.52f, 0.0f);
                        e.e(0.88f, 0.28f, 1.52f, 0.93f, 2.1f, 1.73f);
                        e.b(40.0f, 40.0f, false, true, 2.0f, 3.24f);
                        e.i(3.33f, 5.73f);
                        e.m(1.18f, 2.0f, 1.8f, 3.3f);
                        e.e(0.39f, 0.89f, 0.64f, 1.76f, 0.44f, 2.64f);
                        e.b(4.0f, 4.0f, false, true, -1.26f, 2.13f);
                        e.b(4.4f, 4.4f, false, true, -2.54f, 0.93f);
                        e.e(-0.98f, 0.1f, -2.23f, 0.1f, -3.8f, 0.1f);
                        e.h(8.67f, 22.0f);
                        e.e(-1.57f, 0.0f, -2.82f, 0.0f, -3.8f, -0.1f);
                        e.b(4.4f, 4.4f, false, true, -2.54f, -0.93f);
                        e.b(4.0f, 4.0f, false, true, -1.26f, -2.13f);
                        e.e(-0.2f, -0.88f, 0.05f, -1.75f, 0.45f, -2.64f);
                        e.m(0.6f, -1.3f, 1.79f, -3.3f);
                        e.i(3.33f, -5.73f);
                        e.b(40.0f, 40.0f, false, true, 2.0f, -3.24f);
                        e.b(4.4f, 4.4f, false, true, 2.1f, -1.73f);
                        e.j(11.0f, 14.0f);
                        e.i(-0.25f, -7.0f);
                        e.g(2.5f);
                        e.h(13.0f, 14.0f);
                        e.c();
                        e.j(13.75f, 18.0f);
                        e.b(1.75f, 1.75f, true, true, -3.5f, 0.0f);
                        e.b(1.75f, 1.75f, false, true, 3.5f, 0.0f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        qfa1.c = au2Var;
                    }
                    sya1.a(au2Var, null, null, AppColor$Palette.Text, btsVar11, HProv.ALG_TYPE_SECURECHANNEL, 6);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bbd bbdVar = bbd.a;
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    rab1.b(null, bbd.b, null, null, null, null, null, btsVar12, 48, HProv.PP_DELETE_KEYSET);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ebd ebdVar = ebd.a;
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    sya1.a(mta1.f(), null, ohb1.e(btsVar13, kyh0.summory_route_show_description), null, btsVar13, 0, 10);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                kbd kbdVar = kbd.a;
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    au2 au2Var2 = vfa1.c;
                    if (au2Var2 == null) {
                        lgv lgvVar2 = new lgv("ExclamationMark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                        uq90 e2 = nnm.e(12.0f, 2.0f);
                        e2.b(10.0f, 10.0f, true, false, 0.0f, 20.0f);
                        e2.b(10.0f, 10.0f, false, false, 0.0f, -20.0f);
                        e2.k(-1.0f, 12.0f);
                        e2.i(-0.5f, -8.0f);
                        e2.g(3.0f);
                        e2.i(-0.5f, 8.0f);
                        e2.c();
                        e2.j(12.0f, 19.0f);
                        e2.b(1.75f, 1.75f, true, false, 0.0f, -3.5f);
                        e2.b(1.75f, 1.75f, false, false, 0.0f, 3.5f);
                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e2.a);
                        au2Var2 = rya1.a(lgvVar2.d(), true);
                        vfa1.c = au2Var2;
                    }
                    sya1.a(au2Var2, null, null, new up2(zp2.a), btsVar14, 0, 6);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                kbd kbdVar2 = kbd.a;
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
                    long j = gq2.a;
                    e5v.a(m, new hdu(new up2(j), new up2(j)), null, null, kbd.b, btsVar15, 24582, 12);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                lbd lbdVar = lbd.a;
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    sya1.a(wkb1.i(), null, null, AppColor$Palette.TextInvert, btsVar16, HProv.ALG_TYPE_SECURECHANNEL, 6);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 16:
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                lbd lbdVar2 = lbd.a;
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    f530 m2 = an91.m(c530Var, 8.0f, 0.0f, 2);
                    long j2 = eq2.a;
                    e5v.a(m2, new hdu(new up2(j2), new up2(j2)), null, null, lbd.c, btsVar17, 24582, 12);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 17:
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                qbd qbdVar = qbd.a;
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((bts) fidVar18).k(ibp0Var3) ? 4 : 2;
                }
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    au2 au2Var3 = a0b1.a;
                    if (au2Var3 == null) {
                        lgv lgvVar3 = new lgv("ArrowRound", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var3 = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        uq90Var.j(5.5f, 2.77f);
                        uq90Var.g(-2.0f);
                        uq90Var.p(6.66f);
                        uq90Var.g(6.65f);
                        uq90Var.p(-2.0f);
                        uq90Var.h(6.9f, 7.43f);
                        uq90Var.i(0.14f, -0.15f);
                        uq90Var.a(7.0f, 7.0f, false, true, 19.0f, 12.23f);
                        uq90Var.g(2.0f);
                        uq90Var.a(9.0f, 9.0f, false, false, 5.5f, 6.01f);
                        uq90Var.c();
                        uq90Var.j(18.5f, 21.23f);
                        uq90Var.g(2.0f);
                        uq90Var.p(-6.66f);
                        uq90Var.g(-6.65f);
                        uq90Var.p(2.0f);
                        uq90Var.g(3.24f);
                        uq90Var.i(-0.14f, 0.15f);
                        uq90Var.a(7.0f, 7.0f, false, true, 5.0f, 11.77f);
                        uq90Var.h(3.0f, 11.77f);
                        uq90Var.b(9.0f, 9.0f, false, false, 15.5f, 6.22f);
                        uq90Var.c();
                        lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", uq90Var.a);
                        au2Var3 = rya1.a(lgvVar3.d(), true);
                        a0b1.a = au2Var3;
                    }
                    udb1.c(ibp0Var3, au2Var3, null, null, btsVar18, intValue18 & 14, 14);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 18:
                boolean z = false;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                vbd vbdVar = vbd.a;
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((bts) fidVar19).k(ebp0Var) ? 4 : 2;
                }
                if ((intValue19 & 19) != 18) {
                    z = true;
                }
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, z)) {
                    p9b1.c(ebp0Var, ohb1.e(btsVar19, kyh0.common_close), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar19, intValue19 & 14, 0, 8190);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 19:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                xbd xbdVar = xbd.a;
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((bts) fidVar20).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 19) != 18)) {
                    p9b1.c(ebp0Var2, ohb1.e(btsVar20, kyh0.common_close), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar20, intValue20 & 14, 0, 8190);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 20:
                tic ticVar = (tic) obj;
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ccd ccdVar = ccd.a;
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((bts) fidVar21).k(ticVar) ? 4 : 2;
                }
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 19) != 18)) {
                    vpa1.a(u3a1.d(an91.o(ticVar.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) btsVar21.m(c3z.a), wwg.S(-771186319, false, ccd.a.a, btsVar21), btsVar21, 24960, 2);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                jcd jcdVar = jcd.a;
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    mab1.a(null, null, null, null, null, null, null, btsVar22, 0, HProv.PP_VERSION_TIMESTAMP);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 22:
                tic ticVar2 = (tic) obj;
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                mcd mcdVar = mcd.a;
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((bts) fidVar23).k(ticVar2) ? 4 : 2;
                }
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue23 & 1, (intValue23 & 19) != 18)) {
                    vpa1.a(u3a1.d(an91.o(ticVar2.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) btsVar23.m(c3z.a), wwg.S(-771186319, false, mcd.a.a, btsVar23), btsVar23, 24960, 2);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 23:
                tic ticVar3 = (tic) obj;
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ocd ocdVar = ocd.a;
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((bts) fidVar24).k(ticVar3) ? 4 : 2;
                }
                bts btsVar24 = (bts) fidVar24;
                if (btsVar24.V(intValue24 & 1, (intValue24 & 19) != 18)) {
                    vpa1.a(u3a1.d(an91.o(ticVar3.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) btsVar24.m(c3z.a), wwg.S(-771186319, false, ocd.a.a, btsVar24), btsVar24, 24960, 2);
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 24:
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ocd ocdVar2 = ocd.a;
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    sya1.a(tk91.d(), ljs0.m(c530Var, IconSpotSize.M.getIconSize()), null, null, btsVar25, 0, 12);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 25:
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar26 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ocd ocdVar3 = ocd.a;
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((bts) fidVar26).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar26 = (bts) fidVar26;
                if (btsVar26.V(intValue26 & 1, (intValue26 & 19) != 18)) {
                    p9b1.c(ebp0Var3, ohb1.e(btsVar26, kyh0.scooters_data_load_failed), null, null, xya1.d(btsVar26).e.d, 0, 0, null, null, null, 0, 0, null, btsVar26, intValue26 & 14, 0, 8182);
                } else {
                    btsVar26.Y();
                }
                return zy11Var;
            case 26:
                boolean z2 = false;
                ebp0 ebp0Var4 = (ebp0) obj;
                fid fidVar27 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ocd ocdVar4 = ocd.a;
                if ((intValue27 & 6) == 0) {
                    intValue27 |= ((bts) fidVar27).k(ebp0Var4) ? 4 : 2;
                }
                if ((intValue27 & 19) != 18) {
                    z2 = true;
                }
                bts btsVar27 = (bts) fidVar27;
                if (btsVar27.V(intValue27 & 1, z2)) {
                    p9b1.c(ebp0Var4, ohb1.e(btsVar27, kyh0.scooters_try_again), null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar27, intValue27 & 14, 0, 8190);
                } else {
                    btsVar27.Y();
                }
                return zy11Var;
            case 27:
                return b(obj, obj2, obj3);
            case 28:
                return d(obj, obj2, obj3);
            default:
                ebp0 ebp0Var5 = (ebp0) obj;
                fid fidVar28 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                zcd zcdVar = zcd.a;
                if ((intValue28 & 6) == 0) {
                    intValue28 |= ((bts) fidVar28).k(ebp0Var5) ? 4 : 2;
                }
                bts btsVar28 = (bts) fidVar28;
                if (btsVar28.V(intValue28 & 1, (intValue28 & 19) != 18)) {
                    p9b1.c(ebp0Var5, ohb1.e(btsVar28, kyh0.navigator_main_where_to), null, null, xya1.e(btsVar28).f.c, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar28, intValue28 & 14, 384, 6134);
                } else {
                    btsVar28.Y();
                }
                return zy11Var;
        }
    }
}
