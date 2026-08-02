package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Collection;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class ikb1 {
    public static final void a(mya myaVar, fid fidVar, int i) {
        mya myaVar2;
        Integer valueOf;
        Integer valueOf2;
        sls slsVar;
        boolean z;
        Throwable th;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1161172792);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(myaVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            kdc kdcVar = myaVar.h;
            List list = myaVar.j;
            if (kdcVar == null) {
                btsVar.e0(-831854085);
                btsVar.t(false);
                valueOf = null;
            } else {
                btsVar.e0(804449990);
                int m = s8o.m(kdcVar, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b));
                btsVar.t(false);
                valueOf = Integer.valueOf(m);
            }
            up2 up2Var = new up2(eq2.c);
            if (valueOf != null) {
                up2Var = new up2(rzo.d(valueOf.intValue()));
            }
            long n = tje.n(up2Var, btsVar);
            kdc kdcVar2 = myaVar.i;
            if (kdcVar2 == null) {
                btsVar.e0(-831667589);
                btsVar.t(false);
                valueOf2 = null;
            } else {
                btsVar.e0(804456006);
                int m2 = s8o.m(kdcVar2, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b));
                btsVar.t(false);
                valueOf2 = Integer.valueOf(m2);
            }
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            long n2 = tje.n(valueOf2 != null ? new up2(rzo.d(valueOf2.intValue())) : appColor$Palette, btsVar);
            c530 c530Var = c530.a;
            f530 u = pw91.u(bzk0.c(ljs0.c(c530Var, 1.0f), AppColor$Palette.Background, zr9.a), pw91.o(btsVar), 14);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf3 = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf3);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = myaVar.a;
            ety0 ety0Var = xya1.d(btsVar).e.d;
            AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
            qgy.b(charSequence, null, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar, 3456, 0, 12274);
            qgy.b(myaVar.b, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 4.0f, 16.0f, 4.0f), appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, 3456, 0, 12274);
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
            to5 to5Var = x4c.D;
            f43 f43Var = lr20.a;
            lhl0 a2 = khl0.a(f43Var, to5Var, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                slsVar = slsVar2;
                btsVar.n(slsVar);
            } else {
                slsVar = slsVar2;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            f530 c = ljs0.c(c530Var, 1.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k2 = c.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            lhb1.b(myaVar.c, myaVar.d, an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 12.0f, 1), n, n2, btsVar, 384);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            lhl0 a4 = khl0.a(f43Var, to5Var, btsVar, 0);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            CharSequence charSequence2 = myaVar.f;
            ety0 ety0Var2 = xya1.e(btsVar).h.a;
            if (0.6f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            myaVar2 = myaVar;
            qgy.b(charSequence2, null, new x2y(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, false), appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, ety0Var2, null, btsVar, 805309440, 6, 10738);
            btsVar = btsVar;
            CharSequence charSequence3 = myaVar2.g;
            if (charSequence3 == null) {
                btsVar.e0(-398562299);
                z = false;
                btsVar.t(false);
            } else {
                btsVar.e0(-398562298);
                qgy.b(charSequence3, null, null, appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10742);
                btsVar = btsVar;
                z = false;
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.q(c530Var, 24.0f));
            String str = myaVar2.e;
            if (str == null) {
                btsVar.e0(848284869);
                btsVar.t(z);
                th = null;
            } else {
                btsVar.e0(848284870);
                th = null;
                bts btsVar2 = btsVar;
                v0b1.a(mja1.a(str, null, 6), ljs0.m(c530Var, 41.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.e0(2077553655);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw th;
                }
                lya lyaVar = (lya) obj;
                l8a1.a(lyaVar.a, lyaVar.b, lyaVar.c, i3 != scc.f(list), null, btsVar, 0);
                i3 = i4;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            myaVar2 = myaVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(myaVar2, i, 29);
        }
    }

    public static final boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return jl40.l(evu0.k0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String d(Collection collection) {
        return !collection.isEmpty() ? vuu0.b(a.X(collection, ",\n", "\n", "\n", null, 56), Extension.TAB_CHAR).concat("},") : " }";
    }

    public static final String e(Collection collection) {
        return vuu0.b(a.X(collection, ",", null, null, null, 62), Extension.TAB_CHAR).concat(vuu0.b(" }", Extension.TAB_CHAR));
    }

    public static final String f(Collection collection) {
        return vuu0.b(a.X(collection, ",", null, null, null, 62), Extension.TAB_CHAR).concat(vuu0.b("},", Extension.TAB_CHAR));
    }
}
