package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.ticket.ui.a;
import ru.yandex.taxi.orderforanother.v2.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes11.dex */
public final /* synthetic */ class eed implements bms {
    public final /* synthetic */ int a;

    public /* synthetic */ eed(int i) {
        this.a = i;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        l690 b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        int i11 = 3;
        zy11 zy11Var = zy11.a;
        int i12 = 1;
        switch (i10) {
            case 0:
                xfd xfdVar = (xfd) obj;
                uyx0 uyx0Var = (uyx0) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                fed fedVar = fed.a;
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((bts) fidVar).k(uyx0Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    xkb1.c(uyx0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                xfd xfdVar2 = (xfd) obj;
                x3z0 x3z0Var = (x3z0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                hed hedVar = hed.a;
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar2) : fidVar2.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((bts) fidVar2).k(x3z0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    a.b(x3z0Var, ((bgd) xfdVar2).a, btsVar2, (i2 >> 3) & 14);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                String str = (String) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                med medVar = med.a;
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(str) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    Object Q = btsVar3.Q();
                    if (Q == o430Var) {
                        Q = new mm4(AppColor$Palette.Control, AppColor$Palette.TextOnControl, bm4.a);
                        btsVar3.o0(Q);
                    }
                    mm4 mm4Var = (mm4) Q;
                    BadgeSize badgeSize = BadgeSize.S;
                    int i13 = led.a[badgeSize.ordinal()];
                    if (i13 == 1) {
                        b = an91.b(4.0f, 0.0f, 2);
                    } else if (i13 == 2) {
                        b = an91.b(6.0f, 0.0f, 2);
                    } else {
                        if (i13 != 3) {
                            w511.b();
                            return null;
                        }
                        b = an91.b(6.0f, 0.0f, 2);
                    }
                    wk4.a(badgeSize, mm4Var, b, c530.a, wwg.S(-1790062893, true, new hya(badgeSize, str, i12), btsVar3), btsVar3, 196662);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                xfd xfdVar3 = (xfd) obj;
                id01 id01Var = (id01) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                red redVar = red.a;
                if ((intValue4 & 6) == 0) {
                    i3 = intValue4 | ((intValue4 & 8) == 0 ? ((bts) fidVar4).k(xfdVar3) : fidVar4.e(xfdVar3) ? 4 : 2);
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i3 |= ((bts) fidVar4).k(id01Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i3 & 1, (i3 & 147) != 146)) {
                    hsb1.e(id01Var, ((bgd) xfdVar3).a, btsVar4, (i3 >> 3) & 14);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                String str2 = (String) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ued uedVar = ued.a;
                if ((intValue5 & 48) == 0) {
                    intValue5 |= ((bts) fidVar5).k(str2) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 145) != 144)) {
                    Object Q2 = btsVar5.Q();
                    if (Q2 == o430Var) {
                        Q2 = new foc(6);
                        btsVar5.o0(Q2);
                    }
                    jeb1.f(str2, fnq0.a(c530Var, (tls) Q2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar5).h.b, btsVar5, ((intValue5 >> 3) & 14) | 384, 48, 14328);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                xfd xfdVar4 = (xfd) obj;
                ab11 ab11Var = (ab11) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                yed yedVar = yed.a;
                if ((intValue6 & 6) == 0) {
                    i4 = intValue6 | ((intValue6 & 8) == 0 ? ((bts) fidVar6).k(xfdVar4) : fidVar6.e(xfdVar4) ? 4 : 2);
                } else {
                    i4 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i4 |= ((bts) fidVar6).k(ab11Var) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i4 & 1, (i4 & 147) != 146)) {
                    lub1.f(ab11Var, ((bgd) xfdVar4).a, btsVar6, (i4 >> 3) & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                xfd xfdVar5 = (xfd) obj;
                x021 x021Var = (x021) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                bfd bfdVar = bfd.a;
                if ((intValue7 & 6) == 0) {
                    i5 = intValue7 | ((intValue7 & 8) == 0 ? ((bts) fidVar7).k(xfdVar5) : fidVar7.e(xfdVar5) ? 4 : 2);
                } else {
                    i5 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i5 |= ((bts) fidVar7).k(x021Var) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(i5 & 1, (i5 & 147) != 146)) {
                    id00.b(x021Var, ((bgd) xfdVar5).a, btsVar7, (i5 >> 3) & 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                xfd xfdVar6 = (xfd) obj;
                h141 h141Var = (h141) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                hfd hfdVar = hfd.a;
                if ((intValue8 & 6) == 0) {
                    i6 = intValue8 | ((intValue8 & 8) == 0 ? ((bts) fidVar8).k(xfdVar6) : fidVar8.e(xfdVar6) ? 4 : 2);
                } else {
                    i6 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i6 |= (intValue8 & 64) == 0 ? ((bts) fidVar8).k(h141Var) : fidVar8.e(h141Var) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i6 & 1, (i6 & 147) != 146)) {
                    if ((i6 & 14) == 4 || ((i6 & 8) != 0 && btsVar8.e(xfdVar6))) {
                        r13 = true;
                    }
                    Object Q3 = btsVar8.Q();
                    if (r13 || Q3 == o430Var) {
                        Q3 = new x1d(xfdVar6, i11);
                        btsVar8.o0(Q3);
                    }
                    ck91.a(h141Var, (tls) Q3, btsVar8, (i6 >> 3) & 14);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                xfd xfdVar7 = (xfd) obj;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                jfd jfdVar = jfd.a;
                if ((intValue9 & 6) == 0) {
                    intValue9 |= (intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar7) : fidVar9.e(xfdVar7) ? 4 : 2;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & HProv.PP_FAST_CODE) != 130)) {
                    dk91.c(((bgd) xfdVar7).a, btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                xfd xfdVar8 = (xfd) obj;
                b441 b441Var = (b441) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                lfd lfdVar = lfd.a;
                if ((intValue10 & 6) == 0) {
                    i7 = intValue10 | ((intValue10 & 8) == 0 ? ((bts) fidVar10).k(xfdVar8) : fidVar10.e(xfdVar8) ? 4 : 2);
                } else {
                    i7 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i7 |= (intValue10 & 64) == 0 ? ((bts) fidVar10).k(b441Var) : fidVar10.e(b441Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i7 & 1, (i7 & 147) != 146)) {
                    jk91.a(b441Var, ((bgd) xfdVar8).a, btsVar10, (i7 >> 3) & 14);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                xfd xfdVar9 = (xfd) obj;
                rx41 rx41Var = (rx41) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ofd ofdVar = ofd.a;
                if ((intValue11 & 6) == 0) {
                    i8 = intValue11 | ((intValue11 & 8) == 0 ? ((bts) fidVar11).k(xfdVar9) : fidVar11.e(xfdVar9) ? 4 : 2);
                } else {
                    i8 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i8 |= ((bts) fidVar11).k(rx41Var) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i8 & 1, (i8 & 147) != 146)) {
                    om91.c(rx41Var, ((bgd) xfdVar9).a, null, null, btsVar11, (i8 >> 3) & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                xfd xfdVar10 = (xfd) obj;
                nz41 nz41Var = (nz41) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                pfd pfdVar = pfd.a;
                if ((intValue12 & 6) == 0) {
                    i9 = ((intValue12 & 8) == 0 ? ((bts) fidVar12).k(xfdVar10) : fidVar12.e(xfdVar10) ? 4 : 2) | intValue12;
                } else {
                    i9 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i9 |= ((bts) fidVar12).k(nz41Var) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(i9 & 1, (i9 & 147) != 146)) {
                    fva0 a = f4z.a();
                    View view = (View) btsVar12.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar12.k(view);
                    Object Q4 = btsVar12.Q();
                    if (k || Q4 == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        Q4 = (xva0) tag;
                        btsVar12.o0(Q4);
                    }
                    xva0 xva0Var = (xva0) Q4;
                    Object Q5 = btsVar12.Q();
                    if (Q5 == o430Var) {
                        fva0.f(a, "WhoRidePaneV2Compose", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var.a;
                        if (yuf0Var != null) {
                            yuf0Var.I("WhoRidePaneV2Compose");
                            Q5 = zy11Var;
                        } else {
                            Q5 = null;
                        }
                        btsVar12.o0(Q5);
                    }
                    c.e(nz41Var, null, ((bgd) xfdVar10).a, btsVar12, (i9 >> 3) & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & HProv.PP_FAST_CODE) != 130)) {
                    float f = hk91.a.a;
                    if (Float.isNaN(f)) {
                        f = deb1.a(ibp0Var.c());
                    }
                    oeb1.c(btsVar13, ljs0.q(c530Var, f));
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            default:
                return new androidx.compose.foundation.text.selection.a((fse) obj, (Context) obj2, (SelectedTextType) obj3, (k5z) obj4);
        }
    }
}
