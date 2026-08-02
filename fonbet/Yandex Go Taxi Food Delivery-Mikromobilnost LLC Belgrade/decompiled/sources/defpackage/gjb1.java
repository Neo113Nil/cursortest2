package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.utils.ext.ViewState;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gjb1 {
    public static final void a(kna knaVar, fid fidVar, int i) {
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1796884448);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(knaVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var2 = c530.a;
            f530 u = pw91.u(bzk0.c(ljs0.c(c530Var2, 1.0f), AppColor$Palette.Background, zr9.a), pw91.o(btsVar), 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 o2 = an91.o(ljs0.c(c530Var2, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            to5 to5Var = x4c.D;
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            CharSequence charSequence = knaVar.a;
            List list = knaVar.k;
            qgy.b(charSequence, null, new x2y(1.0f, true), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
            tn9 tn9Var = knaVar.c;
            if (tn9Var == null) {
                btsVar.e0(-617525450);
                btsVar.t(false);
                c530Var = c530Var2;
            } else {
                btsVar.e0(-617525449);
                c530Var = c530Var2;
                chb1.a(tn9Var, an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), btsVar, 48, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
            CharSequence charSequence2 = knaVar.b;
            ety0 ety0Var = xya1.e(btsVar).h.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            c530 c530Var3 = c530Var;
            qgy.b(charSequence2, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 4.0f, 16.0f, 12.0f), appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar, 3456, 0, 12274);
            lna lnaVar = knaVar.d;
            lna lnaVar2 = knaVar.f;
            int i3 = knaVar.i;
            int i4 = knaVar.j;
            String str = knaVar.h;
            Integer num = lnaVar != null ? lnaVar.d : null;
            up2 up2Var = new up2(rzo.e(0, 173, 255, 255));
            if (num != null) {
                up2Var = new up2(rzo.d(num.intValue()));
            }
            up2 up2Var2 = up2Var;
            lna lnaVar3 = knaVar.f;
            Integer num2 = lnaVar3 != null ? lnaVar3.d : null;
            q8a1.a(lnaVar, lnaVar2, i3, i4, str, up2Var2, num2 != null ? new up2(rzo.d(num2.intValue())) : AppColor$Palette.Line, an91.n(ljs0.c(c530Var3, 1.0f), 16.0f, 8.0f, 16.0f, 4.0f), AppColor$Palette.EverFront, btsVar, 113246208);
            f530 o4 = an91.o(ljs0.c(c530Var3, 1.0f), 16.0f, 0.0f, 16.0f, 20.0f, 2);
            lhl0 a3 = khl0.a(lr20.g, to5Var, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d3 = b.d(btsVar, o4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            qgy.b(knaVar.e, null, null, appColor$Palette, 0L, 0L, new sjy0(5), 0L, 2, 1, 0, xya1.e(btsVar).i.a, null, btsVar, 805309440, 6, 10614);
            qgy.b(knaVar.g, null, null, appColor$Palette, 0L, 0L, new sjy0(6), 0L, 2, 1, 0, xya1.e(btsVar).i.a, null, btsVar, 805309440, 6, 10614);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.e0(1833169903);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                jna jnaVar = (jna) obj;
                l8a1.a(jnaVar.a, jnaVar.b, jnaVar.c, i5 != scc.f(list), null, btsVar, 0);
                i5 = i6;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(knaVar, i, 20);
        }
    }

    public static boolean b(float f, float f2) {
        return f == f2 || Math.abs(f - f2) < Math.max(Math.ulp(f), Math.ulp(f2));
    }

    public static boolean c(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public static final void d(SwitchCompat switchCompat) {
        int a = rje.a(switchCompat.getContext(), ung0.ybColor_control_activeDark);
        ViewState viewState = ViewState.CHECKED;
        ViewState viewState2 = ViewState.ENABLED;
        int i = 1;
        we6 we6Var = new we6(a, new ViewState[]{viewState, viewState2}, i);
        int a2 = rje.a(switchCompat.getContext(), ung0.ybColor_control_activeDarkDisabled);
        ViewState viewState3 = ViewState.DISABLED;
        we6 we6Var2 = new we6(a2, new ViewState[]{viewState, viewState3}, i);
        int a3 = rje.a(switchCompat.getContext(), ung0.ybColor_control_default);
        ViewState viewState4 = ViewState.UNCHECKED;
        switchCompat.setTrackTintList(cob1.b(we6Var, we6Var2, new we6(a3, new ViewState[]{viewState4, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_defaultDisabled), new ViewState[]{viewState4, viewState3}, i)));
        switchCompat.setThumbTintList(cob1.b(new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDefault), new ViewState[]{viewState, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDisabled), new ViewState[]{viewState, viewState3}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDefault), new ViewState[]{viewState4, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDisabled), new ViewState[]{viewState4, viewState3}, i)));
    }
}
