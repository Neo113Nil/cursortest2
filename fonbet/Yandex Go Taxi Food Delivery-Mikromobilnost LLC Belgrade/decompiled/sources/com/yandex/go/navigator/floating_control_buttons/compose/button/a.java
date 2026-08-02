package com.yandex.go.navigator.floating_control_buttons.compose.button;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.navigator.alt_select.traffic.TrafficLevel;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import defpackage.a6t0;
import defpackage.aii0;
import defpackage.au2;
import defpackage.bj6;
import defpackage.bts;
import defpackage.c36;
import defpackage.c530;
import defpackage.ck11;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.gpb1;
import defpackage.hob1;
import defpackage.iq2;
import defpackage.jvx0;
import defpackage.lgv;
import defpackage.ljs0;
import defpackage.mt71;
import defpackage.nnm;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oz40;
import defpackage.q12;
import defpackage.r901;
import defpackage.rrb1;
import defpackage.rya1;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sya1;
import defpackage.trb1;
import defpackage.uo5;
import defpackage.uq90;
import defpackage.v2h0;
import defpackage.vog0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xg0;
import defpackage.xm1;
import defpackage.y4b1;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(bj6 bj6Var, TrafficLevel trafficLevel, int i, fid fidVar, int i2) {
        int i3;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(64693930);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(bj6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(trafficLevel.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= btsVar.c(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 40.0f);
            uo5 uo5Var = x4c.y;
            o4b1.b(mt71.m(v2h0.traffic_light_48, 0, btsVar), null, bj6Var.a(m, uo5Var), null, null, 0.0f, new c36(hob1.a(btsVar, trb1.b(trafficLevel)), 5), btsVar, 56, 56);
            o4b1.b(mt71.m(trb1.a(i4), 0, btsVar), null, bj6Var.a(c530Var, uo5Var), null, null, 0.0f, new c36(hob1.a(btsVar, trb1.c(trafficLevel)), 5), btsVar, 56, 56);
            o4b1.b(mt71.m(v2h0.traffic_head_48, 0, btsVar), null, bj6Var.a(ljs0.m(c530Var, 40.0f), uo5Var), null, null, 0.0f, null, btsVar, 56, 120);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i4, i2, 10, bj6Var, trafficLevel);
        }
    }

    public static final void b(f530 f530Var, ButtonSize buttonSize, CustomButtonStyle customButtonStyle, sls slsVar, r901 r901Var, fid fidVar, int i, int i2) {
        int i3;
        ButtonSize buttonSize2;
        CustomButtonStyle customButtonStyle2;
        ButtonSize buttonSize3;
        CustomButtonStyle customButtonStyle3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1660635169);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(customButtonStyle != null ? customButtonStyle.ordinal() : -1) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= (32768 & i) == 0 ? btsVar.k(r901Var) : btsVar.e(r901Var) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                buttonSize3 = i4 != 0 ? ButtonSize.L : buttonSize;
                customButtonStyle3 = i5 != 0 ? CustomButtonStyle.Blur80 : customButtonStyle;
            } else {
                btsVar.Y();
                buttonSize3 = buttonSize;
                customButtonStyle3 = customButtonStyle;
            }
            btsVar.u();
            y4b1.a(f530Var, customButtonStyle3, buttonSize3, slsVar, wwg.S(-1167856409, true, new jvx0(13, r901Var), btsVar), btsVar, (i3 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168), 0);
            customButtonStyle2 = customButtonStyle3;
            buttonSize2 = buttonSize3;
        } else {
            btsVar.Y();
            buttonSize2 = buttonSize;
            customButtonStyle2 = customButtonStyle;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(f530Var, buttonSize2, customButtonStyle2, slsVar, r901Var, i, i2, 18);
        }
    }

    public static final void c(bj6 bj6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(864225305);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 f = gpb1.f(btsVar, bj6Var.a(ljs0.m(c530.a, 26.0f), x4c.y));
            au2 au2Var = rrb1.a;
            if (au2Var == null) {
                lgv lgvVar = new lgv("Traffic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 e = nnm.e(1.0f, 8.88f);
                e.e(0.0f, 1.1f, 0.25f, 2.13f, 1.0f, 3.06f);
                e.o(12.0f);
                e.b(10.0f, 10.0f, true, false, 20.0f, -0.26f);
                e.a(9.95f, 9.95f, false, false, 12.12f, 2.0f);
                e.f(9.65f);
                e.d(3.52f, 2.0f, 1.0f, 5.09f, 1.0f, 8.88f);
                e.k(5.43f, 8.86f);
                e.a(8.0f, 8.0f, false, true, 12.13f, 4.0f);
                e.b(11.0f, 11.0f, false, true, 2.76f, 2.44f);
                e.m(0.83f, 1.0f, 1.61f, 2.03f);
                e.e(0.56f, 0.72f, 1.0f, 1.31f, 1.57f, 1.88f);
                e.m(0.83f, 0.84f, 1.92f, 1.27f);
                e.b(8.0f, 8.0f, false, true, -13.56f, 6.12f);
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                au2Var = rya1.a(lgvVar.d(), true);
                rrb1.a = au2Var;
            }
            sya1.a(au2Var, f, null, AppColor$Palette.Text, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xm1(bj6Var, i, 2);
        }
    }

    public static final void d(bj6 bj6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1933134306);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Boolean bool = (Boolean) oz40Var.getValue();
            bool.booleanValue();
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new TrafficButtonKt$TrafficLoading$1$1(700, oz40Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, bool);
            Boolean bool2 = (Boolean) oz40Var.getValue();
            bool2.getClass();
            ck11 K = sb2.K(700, 0, null, 6);
            androidx.compose.runtime.internal.a S = wwg.S(1787927453, true, new jvx0(14, bj6Var), btsVar);
            c530 c530Var = c530.a;
            androidx.compose.animation.a.d(bool2, c530Var, K, null, S, btsVar, 25008, 8);
            o4b1.b(mt71.m(v2h0.traffic_head_48, 0, btsVar), null, bj6Var.a(ljs0.m(c530Var, 40.0f), x4c.y), null, null, 0.0f, null, btsVar, 56, 120);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xm1(bj6Var, i, 1);
        }
    }

    public static final void e(bj6 bj6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1059721266);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 40.0f);
            uo5 uo5Var = x4c.y;
            o4b1.b(mt71.m(v2h0.traffic_light_48, 0, btsVar), null, bj6Var.a(m, uo5Var), null, null, 0.0f, new c36(hob1.a(btsVar, vog0.traffic_na), 5), btsVar, 56, 56);
            o4b1.b(mt71.m(v2h0.traffic_head_48, 0, btsVar), null, bj6Var.a(ljs0.m(c530Var, 40.0f), uo5Var), null, null, 0.0f, null, btsVar, 56, 120);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xm1(bj6Var, i, 3);
        }
    }
}
