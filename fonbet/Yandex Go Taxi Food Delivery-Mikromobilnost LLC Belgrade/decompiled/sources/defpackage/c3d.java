package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class c3d implements zls {
    public final /* synthetic */ int a;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                d3d d3dVar = d3d.a;
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                }
                break;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                e3d e3dVar = e3d.a;
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                }
                break;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                f3d f3dVar = f3d.a;
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    sya1.a(vza1.c(), null, ohb1.e(btsVar3, xxh0.common_back), null, btsVar3, 0, 10);
                    break;
                }
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                h3d h3dVar = h3d.a;
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                }
                break;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                h3d h3dVar2 = h3d.a;
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    btsVar5.Y();
                    break;
                }
                break;
            case 5:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                j3d j3dVar = j3d.a;
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    btsVar6.Y();
                    break;
                } else {
                    sya1.a(wtb1.b(), null, null, null, btsVar6, 0, 14);
                    break;
                }
            case 6:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                j3d j3dVar2 = j3d.a;
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    btsVar7.Y();
                    break;
                } else {
                    sya1.a(hlb1.b(), null, null, null, btsVar7, 0, 14);
                    break;
                }
            case 7:
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                j3d j3dVar3 = j3d.a;
                bts btsVar8 = (bts) fidVar8;
                if (!btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    btsVar8.Y();
                    break;
                } else {
                    au2 au2Var = tlb1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("ChevronUpL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        uq90Var.k(20.0f, 14.0f);
                        uq90Var.i(-1.4f, 1.4f);
                        uq90Var.h(12.0f, 8.8f);
                        uq90Var.i(-6.6f, 6.6f);
                        uq90Var.h(4.0f, 14.0f);
                        uq90Var.i(8.0f, -8.0f);
                        uq90Var.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        tlb1.a = au2Var;
                    }
                    sya1.a(au2Var, null, null, null, btsVar8, 0, 14);
                    break;
                }
            case 8:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                j3d j3dVar4 = j3d.a;
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar9).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar9 = (bts) fidVar9;
                if (!btsVar9.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    btsVar9.Y();
                    break;
                } else {
                    udb1.c(ibp0Var, u2b1.a(), null, AppColor$Palette.Text, btsVar9, (intValue9 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    break;
                }
            case 9:
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                j3d j3dVar5 = j3d.a;
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar10).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar10;
                if (!btsVar10.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                    btsVar10.Y();
                    break;
                } else {
                    udb1.c(ibp0Var2, xna1.a(), null, AppColor$Palette.Text, btsVar10, (intValue10 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    break;
                }
            case 10:
                boolean z = false;
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                j3d j3dVar6 = j3d.a;
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(ibp0Var3) ? 4 : 2;
                }
                if ((intValue11 & 19) != 18) {
                    z = true;
                }
                bts btsVar11 = (bts) fidVar11;
                if (!btsVar11.V(intValue11 & 1, z)) {
                    btsVar11.Y();
                    break;
                } else {
                    au2 au2Var2 = zib1.a;
                    if (au2Var2 == null) {
                        lgv lgvVar2 = new lgv("SurgeL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                        uq90 g = tse0.g(13.29f, 9.78f, 15.07f, 0.0f);
                        g.h(3.0f, 14.22f);
                        g.g(6.68f);
                        tse0.u(g, 7.31f, 24.0f, 20.24f, 9.78f);
                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", g.a);
                        au2Var2 = rya1.a(lgvVar2.d(), true);
                        zib1.a = au2Var2;
                    }
                    udb1.c(ibp0Var3, au2Var2, null, AppColor$Palette.Text, btsVar11, (intValue11 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    break;
                }
            case 11:
                ibp0 ibp0Var4 = (ibp0) obj;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                j3d j3dVar7 = j3d.a;
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ibp0Var4) ? 4 : 2;
                }
                bts btsVar12 = (bts) fidVar12;
                if (!btsVar12.V(intValue12 & 1, (intValue12 & 19) != 18)) {
                    btsVar12.Y();
                    break;
                } else {
                    udb1.c(ibp0Var4, wtb1.b(), null, AppColor$Palette.Error, btsVar12, (intValue12 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    break;
                }
            case 12:
                ibp0 ibp0Var5 = (ibp0) obj;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                j3d j3dVar8 = j3d.a;
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ibp0Var5) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar13;
                if (!btsVar13.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    btsVar13.Y();
                    break;
                } else {
                    sya1.a(llb1.b(), an91.o(c530.a, 0.0f, 0.0f, ibp0Var5.c() == SlotSize.XS ? 4.0f : 8.0f, 0.0f, 11), null, AppColor$Palette.Error, btsVar13, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    break;
                }
            case 13:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                k3d k3dVar = k3d.a;
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((bts) fidVar14).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar14;
                if (!btsVar14.V(intValue14 & 1, (intValue14 & 19) != 18)) {
                    btsVar14.Y();
                    break;
                } else {
                    y76.a(ebp0Var, null, BodyAlign.Start, btsVar14, (intValue14 & 14) | 384);
                    break;
                }
            case 14:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                k3d k3dVar2 = k3d.a;
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((bts) fidVar15).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar15 = (bts) fidVar15;
                if (!btsVar15.V(intValue15 & 1, (intValue15 & 19) != 18)) {
                    btsVar15.Y();
                    break;
                } else {
                    y76.a(ebp0Var2, null, BodyAlign.Center, btsVar15, (intValue15 & 14) | 384);
                    break;
                }
            case 15:
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                k3d k3dVar3 = k3d.a;
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((bts) fidVar16).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar16 = (bts) fidVar16;
                if (!btsVar16.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                    btsVar16.Y();
                    break;
                } else {
                    y76.a(ebp0Var3, null, BodyAlign.End, btsVar16, (intValue16 & 14) | 384);
                    break;
                }
            case 16:
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                o3d o3dVar = o3d.a;
                bts btsVar17 = (bts) fidVar17;
                if (!btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    btsVar17.Y();
                    break;
                } else {
                    xbb1.c(ohb1.e(btsVar17, kyh0.navigator_map_interaction_go_here_button_title), mta1.f(), AppColor$Palette.TextOnControl, btsVar17, 384);
                    break;
                }
            case 17:
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                o3d o3dVar2 = o3d.a;
                bts btsVar18 = (bts) fidVar18;
                if (!btsVar18.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    btsVar18.Y();
                    break;
                } else {
                    xbb1.c(ohb1.e(btsVar18, kyh0.navigator_map_interaction_go_via_button_title), uo91.b(), AppColor$Palette.Text, btsVar18, 384);
                    break;
                }
            case 18:
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                p3d p3dVar = p3d.a;
                bts btsVar19 = (bts) fidVar19;
                if (!btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    btsVar19.Y();
                    break;
                } else {
                    jeb1.f(ohb1.e(btsVar19, kyh0.navigator_map_interaction_wait_button_title), ofb1.b(c530Var, false, null, 15), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar19, 432, 0, 32760);
                    break;
                }
            case 19:
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                p3d p3dVar2 = p3d.a;
                bts btsVar20 = (bts) fidVar20;
                if (!btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    btsVar20.Y();
                    break;
                } else {
                    jeb1.f(ohb1.e(btsVar20, kyh0.navigator_map_interaction_wait_button_title), ofb1.b(c530Var, false, null, 15), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar20, 432, 0, 32760);
                    break;
                }
            case 20:
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                s3d s3dVar = s3d.a;
                bts btsVar21 = (bts) fidVar21;
                if (!btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    btsVar21.Y();
                    break;
                }
                break;
            case 21:
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                w3d w3dVar = w3d.a;
                bts btsVar22 = (bts) fidVar22;
                if (!btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    btsVar22.Y();
                    break;
                }
                break;
            case 22:
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                w3d w3dVar2 = w3d.a;
                bts btsVar23 = (bts) fidVar23;
                if (!btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    btsVar23.Y();
                    break;
                }
                break;
            case 23:
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                w3d w3dVar3 = w3d.a;
                bts btsVar24 = (bts) fidVar24;
                if (!btsVar24.V(intValue24 & 1, (intValue24 & 17) != 16)) {
                    btsVar24.Y();
                    break;
                } else {
                    ymb1.f(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, ((el51) btsVar24.m(gl51.a)).p(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar24, 6, 0, 65530);
                    break;
                }
            case 24:
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                w3d w3dVar4 = w3d.a;
                bts btsVar25 = (bts) fidVar25;
                if (!btsVar25.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    btsVar25.Y();
                    break;
                } else {
                    ymb1.e(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar25, 6, 0, 65534);
                    break;
                }
            case 25:
                fid fidVar26 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                w3d w3dVar5 = w3d.a;
                bts btsVar26 = (bts) fidVar26;
                if (!btsVar26.V(intValue26 & 1, (intValue26 & 17) != 16)) {
                    btsVar26.Y();
                    break;
                } else {
                    ymb1.e(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar26, 6, 0, 65534);
                    break;
                }
            case 26:
                fid fidVar27 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                w3d w3dVar6 = w3d.a;
                bts btsVar27 = (bts) fidVar27;
                if (!btsVar27.V(intValue27 & 1, (intValue27 & 17) != 16)) {
                    btsVar27.Y();
                    break;
                } else {
                    ymb1.e(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar27, 6, 0, 65534);
                    break;
                }
            case 27:
                fid fidVar28 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                w3d w3dVar7 = w3d.a;
                bts btsVar28 = (bts) fidVar28;
                if (!btsVar28.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    btsVar28.Y();
                    break;
                } else {
                    ymb1.f(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar28, 6, 0, 65534);
                    break;
                }
            case 28:
                fid fidVar29 = (fid) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                w3d w3dVar8 = w3d.a;
                bts btsVar29 = (bts) fidVar29;
                if (!btsVar29.V(intValue29 & 1, (intValue29 & 17) != 16)) {
                    btsVar29.Y();
                    break;
                } else {
                    ymb1.e(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar29, 6, 0, 65534);
                    break;
                }
            default:
                fid fidVar30 = (fid) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                w3d w3dVar9 = w3d.a;
                bts btsVar30 = (bts) fidVar30;
                if (!btsVar30.V(intValue30 & 1, (intValue30 & 17) != 16)) {
                    btsVar30.Y();
                    break;
                } else {
                    ymb1.e(PlusPayUiKitInflaterFactory.NAME_BUTTON, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar30, 6, 0, 65534);
                    break;
                }
        }
        return zy11Var;
    }
}
