package defpackage;

import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.OverScrollMode;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class cl91 {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1338690132);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 0.0f, 0.0f, 48.0f, 7);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i4 = r2h0.ble_error_bus;
            c530 c530Var = c530.a;
            o4b1.b(vfc.k(i4, 0, -1411607277, btsVar, false), null, ljs0.m(c530Var, 120.0f), null, null, 0.0f, null, btsVar, 392, 56);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            String e = ohb1.e(btsVar, cyh0.no_buses_title);
            ety0 ety0Var = xya1.d(btsVar).f.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(e, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, 0, 16378);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            jeb1.f(ohb1.e(btsVar, cyh0.try_refresh_list), null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            if (str == null || str.length() == 0) {
                tse0.s(btsVar, -1902044499, c530Var, 20.0f, btsVar);
                m(ohb1.e(btsVar, cyh0.update), tlsVar, btsVar, (i3 >> 3) & 112);
                btsVar.t(false);
            } else {
                btsVar.e0(-1901872480);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xwr(f530Var, str, tlsVar, i);
        }
    }

    public static final void b(f530 f530Var, String str, String str2, ml30 ml30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        String str3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1072059043);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= btsVar.k(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(ml30Var) : btsVar.e(ml30Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = r2h0.ble_error_bus;
            c530 c530Var = c530.a;
            int i4 = i2;
            o4b1.b(vfc.k(i3, 0, -1411607277, btsVar, false), null, ljs0.m(c530Var, 120.0f), null, null, 0.0f, null, btsVar, 392, 56);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            ety0 ety0Var = xya1.d(btsVar).f.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(str3, null, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, ((i4 >> 3) & 14) | 384, 0, 16250);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            jeb1.f(ohb1.e(btsVar, cyh0.needed_to_see_near_buses), null, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16250);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            c(str2, ml30Var, tlsVar, btsVar, (i4 >> 6) & 1022);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, str, str2, ml30Var, tlsVar, i);
        }
    }

    public static final void c(String str, ml30 ml30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(591462335);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(ml30Var) : btsVar.e(ml30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ButtonForm buttonForm = ButtonForm.Circle;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            ButtonSize buttonSize = ButtonSize.M;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(ml30Var)));
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ve30(5, ml30Var, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(null, false, buttonSize, buttonStyle, buttonForm, (sls) Q, wwg.S(-1986028453, true, new jk30(str, i3), btsVar), btsVar, 1600896, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(str, ml30Var, tlsVar, i, 5);
        }
    }

    public static final void d(fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1619903293);
        if (btsVar2.V(i & 1, i != 0)) {
            String e = ohb1.e(btsVar2, cyh0.ble_buses_nearby);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new pi30(3);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(e, fnq0.b(c530.a, false, (tls) Q), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).f, btsVar, 0, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 21);
        }
    }

    public static final void e(fd30 fd30Var, ll30 ll30Var, tls tlsVar, fid fidVar, int i) {
        String str;
        String obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-157658808);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(fd30Var) ? 4 : 2) | (btsVar.e(ll30Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            AppColor$Palette appColor$Palette = AppColor$Palette.ControlMinor;
            ((nx2) btsVar.m(uy2.c)).getClass();
            f530 n = an91.n(ljs0.e(bzk0.c(c, appColor$Palette, cyk0.c(24.0f)), 72.0f), 16.0f, 14.0f, 8.0f, 12.0f);
            boolean e = ((i2 & 896) == 256) | btsVar.e(ll30Var) | btsVar.e(fd30Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new b700(5, tlsVar, ll30Var, fd30Var);
                btsVar.o0(Q);
            }
            f530 d = q791.d(n, false, null, null, (sls) Q, 15);
            lhl0 a = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 o2 = an91.o(c530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            sic a2 = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            CharSequence charSequence = fd30Var.b;
            String str2 = fd30Var.a;
            String str3 = "";
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            j(str, btsVar, 0);
            CharSequence charSequence2 = fd30Var.c;
            if (charSequence2 != null && (obj = charSequence2.toString()) != null) {
                str3 = obj;
            }
            i(str3, btsVar, 0);
            btsVar.t(true);
            ovi0 ovi0Var = fd30Var.f;
            if (ovi0Var == null || str2.length() <= 0) {
                btsVar.e0(-1390977730);
                btsVar.t(false);
            } else {
                btsVar.e0(-1391085362);
                g(str2, ovi0Var, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(fd30Var, ll30Var, tlsVar, i, 29);
        }
    }

    public static final void f(f530 f530Var, ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(171472992);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(ovi0Var) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v0b1.a(ovi0Var, f530Var, null, null, null, null, null, null, 0.0f, 0, btsVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 1020);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kk30(f530Var, ovi0Var, i, i3);
        }
    }

    public static final void g(String str, ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(496626651);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(ovi0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            k3r k3rVar = ljs0.c;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            uo5 uo5Var = x4c.w;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            h((i2 << 3) & 112, btsVar, cj6Var.a(c530Var, uo5Var), str);
            f(cj6Var.a(c530Var, x4c.C), ovi0Var, btsVar, i2 & 112);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(str, ovi0Var, i, 26);
        }
    }

    public static final void h(int i, fid fidVar, f530 f530Var, String str) {
        int i2;
        String str2;
        bts btsVar;
        int i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1589549977);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(f530Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(str) ? 32 : 16;
        }
        int i4 = i2;
        if (!btsVar2.V(i4 & 1, (i4 & 19) != 18)) {
            str2 = str;
            btsVar = btsVar2;
            i3 = 1;
            btsVar.Y();
        } else if (str.length() > 0) {
            btsVar2.e0(-2025940540);
            f530 l = an91.l(bzk0.c(ymb1.l(an91.o(f530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), cyk0.c(4.0f)), AppColor$Palette.ControlMinor, qke.q), 8.0f, 4.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, l);
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
            i3 = 1;
            str2 = str;
            jeb1.f(str2, c530.a, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.c, btsVar2, ((i4 >> 3) & 14) | 432, 0, 16376);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(false);
        } else {
            str2 = str;
            btsVar = btsVar2;
            i3 = 1;
            btsVar.e0(-2025566711);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new doj(f530Var, str2, i, i3);
        }
    }

    public static final void i(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1031060756);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar2).h.a, btsVar, (i2 & 14) | 805306752, 48, 13818);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 4);
        }
    }

    public static final void j(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1623464020);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar2).f.c, btsVar, (i2 & 14) | 805306752, 48, 13818);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 3);
        }
    }

    public static final void k(f530 f530Var, List list, ll30 ll30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-765318597);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(list) : btsVar.e(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(ll30Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 18.0f, 0.0f, 0.0f, 13);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean e = ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(list))) | btsVar.e(ll30Var) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ynn(27, list, ll30Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(o, a, null, i43Var, null, null, false, null, (tls) Q, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 492);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var, list, ll30Var, tlsVar, i, 10);
        }
    }

    public static final void l(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2016408679);
        if (btsVar.V(i & 1, i != 0)) {
            f530 e = ljs0.e(ljs0.c(c530.a, 1.0f), 72.0f);
            ((nx2) btsVar.m(uy2.c)).getClass();
            com.yandex.go.design.compose.loading.b.a(e, cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 20);
        }
    }

    public static final void m(String str, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-692847641);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ButtonForm buttonForm = ButtonForm.Circle;
            ButtonSize buttonSize = ButtonSize.M;
            boolean z = false;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new kiu(21, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(c530.a, false, buttonSize, buttonStyle, buttonForm, (sls) Q, wwg.S(530416331, true, new jk30(str, i3), btsVar), btsVar, 1600902, 2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(str, tlsVar, i, 13);
        }
    }

    public static final void n(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1167027618);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0.a(xya1.d(btsVar2).g.a, 0L, 0L, null, null, null, 0L, null, null, null, 0, uh6.E(19), null, null, 16646143), btsVar, (i2 & 14) | 48, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 5);
        }
    }

    public static final long o(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void p(final f530 f530Var, y7m y7mVar, final boolean z, final List list, final String str, final String str2, final ml30 ml30Var, final tls tlsVar, final ll30 ll30Var, final boolean z2, final boolean z3, fid fidVar, final int i) {
        int i2;
        y7m y7mVar2;
        String str3;
        ll30 ll30Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(590071881);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            y7mVar2 = y7mVar;
            i2 |= btsVar.k(y7mVar2) ? 32 : 16;
        } else {
            y7mVar2 = y7mVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(list) : btsVar.e(list) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str3 = str2;
            i2 |= btsVar.k(str3) ? 131072 : 65536;
        } else {
            str3 = str2;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? btsVar.k(ml30Var) : btsVar.e(ml30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            ll30Var2 = ll30Var;
            i2 |= btsVar.e(ll30Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            ll30Var2 = ll30Var;
        }
        if ((i & 805306368) == 0) {
            i2 |= btsVar.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar.V(i2 & 1, ((i2 & 306783379) == 306783378 && ((btsVar.a(z3) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            c530 c530Var = c530.a;
            f530 k = f530Var.k(z ? ljs0.b : c530Var);
            byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
            if (!z3) {
                k = ymb1.l(k, e);
            }
            f530 m = an91.m(bzk0.c(k, AppColor$Palette.Background, qke.q), 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (z2 || z3) {
                btsVar.e0(220845891);
                btsVar.t(false);
            } else {
                btsVar.e0(220770933);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                d(btsVar, 0);
                btsVar.t(false);
            }
            if (str != null && str.length() != 0) {
                btsVar.e0(220901877);
                b(w(y7mVar2), str, str3, ml30Var, tlsVar, btsVar, (i2 >> 9) & 65520);
                btsVar.t(false);
            } else if (list.isEmpty()) {
                btsVar.e0(221197121);
                a(((i2 >> 9) & 112) | ((i2 >> 15) & 896), btsVar, tlsVar, w(y7mVar2), str);
                btsVar.t(false);
            } else {
                btsVar.e0(221375216);
                k(w(y7mVar2), list, ll30Var2, tlsVar, btsVar, ((i2 >> 6) & 112) | ((i2 >> 18) & 896) | ((i2 >> 12) & 7168));
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final y7m y7mVar3 = y7mVar2;
            v.d = new wls() { // from class: mk30
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cl91.p(f530.this, y7mVar3, z, list, str, str2, ml30Var, tlsVar, ll30Var, z2, z3, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void q(nl30 nl30Var, tls tlsVar, f530 f530Var, ll30 ll30Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1105460909);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(nl30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(null) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(ll30Var) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            s(nl30Var.a, nl30Var.d, nl30Var.f, nl30Var.e, ll30Var, tlsVar, nl30Var.b, btsVar, ((i2 >> 3) & HProv.ALG_CLASS_ALL) | ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES));
            if (nl30Var.c) {
                btsVar.e0(-1022714749);
                ly3.B(c530.a, 2.0f, btsVar, false);
            } else {
                btsVar.e0(-1022666699);
                btsVar.t(false);
            }
            boolean z = nl30Var.g;
            boolean z2 = nl30Var.b;
            List list = nl30Var.j;
            if (list == null) {
                list = EmptyList.a;
            }
            p(f530Var, null, true, list, nl30Var.h, nl30Var.i, nl30Var.k, tlsVar, ll30Var, z, z2, btsVar, ((i2 >> 6) & 1022) | ((i2 << 18) & 29360128) | ((i2 << 9) & 234881024));
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) nl30Var, (Object) tlsVar, f530Var, (Object) ll30Var, i, 11);
        }
    }

    public static final void r(nl30 nl30Var, tls tlsVar, f530 f530Var, ll30 ll30Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1920125120);
        int i2 = i | (btsVar.e(nl30Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(ll30Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            f530 k = f530Var.k(ljs0.c);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            q(nl30Var, tlsVar, ljs0.c(n.d(btsVar, d, d.d, 1.0f, true), 1.0f), ll30Var, btsVar, (i2 & 14) | 27648 | (i2 & 112) | ((i2 << 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) nl30Var, tlsVar, (Object) f530Var, (Object) ll30Var, i, 15);
        }
    }

    public static final void s(String str, String str2, String str3, ovi0 ovi0Var, ll30 ll30Var, tls tlsVar, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1759409773);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(ovi0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(ll30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.a(z) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            c530 c530Var = c530.a;
            f530 c = fj91.c(c530Var, intrinsicSize);
            byk0 e = cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3);
            if (!z) {
                c = ymb1.l(c, e);
            }
            f530 o = an91.o(bzk0.c(c, AppColor$Palette.Background, qke.q), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            int i3 = i2;
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            u(str == null ? "" : str, btsVar, 0);
            n(str2 == null ? "" : str2, btsVar, 0);
            if (z) {
                btsVar.e0(-892781089);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, -893085726, c530Var, 20.0f, btsVar);
                t(str3 == null ? "" : str3, ovi0Var == null ? mja1.a("", null, 6) : ovi0Var, ll30Var, tlsVar, btsVar, (i3 >> 6) & 8064);
                ly3.B(c530Var, 12.0f, btsVar, false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(str, str2, str3, ovi0Var, ll30Var, tlsVar, z, i);
        }
    }

    public static final void t(String str, ovi0 ovi0Var, ll30 ll30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(761130080);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ovi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(ll30Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            boolean e = ((i2 & 7168) == 2048) | btsVar.e(ll30Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new lk30(tlsVar, ll30Var, i3);
                btsVar.o0(Q);
            }
            d17.c(null, false, null, buttonStyle, null, (sls) Q, wwg.S(1341444420, true, new nfj(22, ovi0Var, str), btsVar), btsVar, 1575936, 23);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(str, ovi0Var, ll30Var, tlsVar, i, 12);
        }
    }

    public static final void u(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1163929470);
        int i2 = 2;
        int i3 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i3 & 1, (i3 & 3) != 2)) {
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new pi30(i2);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(str, fnq0.b(c530.a, false, (tls) Q), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).e, btsVar, i3 & 14, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 2);
        }
    }

    public static final String v(boolean z) {
        return z ? "1" : "0";
    }

    public static final f530 w(y7m y7mVar) {
        if (y7mVar != null) {
            return ljs0.e(c530.a, y7mVar.a);
        }
        if (1.0f <= 0.0d) {
            gxv.a("invalid weight; must be greater than zero");
        }
        return new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
    }

    public static void x(tt5 tt5Var, final prr prrVar) {
        xv10 xv10Var;
        rs10 ld2Var = (prrVar == null || (xv10Var = prrVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", ld2Var, obj);
        if (prrVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i2 = i;
                    prr prrVar2 = prrVar;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i3 = gu31.a[overScrollMode.ordinal()];
                                if (i3 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i3 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i3 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i3 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", ld2Var, obj);
        if (prrVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i2;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i3 = gu31.a[overScrollMode.ordinal()];
                                if (i3 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i3 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i3 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i3 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", ld2Var, obj);
        if (prrVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i3;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i32 = gu31.a[overScrollMode.ordinal()];
                                if (i32 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i32 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i32 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i32 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", ld2Var, obj);
        if (prrVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i4;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i32 = gu31.a[overScrollMode.ordinal()];
                                if (i32 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i32 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i32 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i32 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", ld2Var, obj);
        if (prrVar != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i5;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i32 = gu31.a[overScrollMode.ordinal()];
                                if (i32 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i32 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i32 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i32 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", ld2Var, obj);
        if (prrVar == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: ctb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i6;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            View view = (View) list.get(0);
                            long longValue = ((Long) list.get(1)).longValue();
                            long longValue2 = ((Long) list.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            View view2 = (View) list2.get(0);
                            long longValue3 = ((Long) list2.get(1)).longValue();
                            long longValue4 = ((Long) list2.get(2)).longValue();
                            try {
                                prrVar2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            View view3 = (View) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g3 = Collections.singletonList(new ks41(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            View view4 = (View) list3.get(0);
                            boolean booleanValue = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            View view5 = (View) list4.get(0);
                            boolean booleanValue2 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                prrVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            List list5 = (List) obj2;
                            View view6 = (View) list5.get(0);
                            OverScrollMode overScrollMode = (OverScrollMode) list5.get(1);
                            try {
                                prrVar2.getClass();
                                int i32 = gu31.a[overScrollMode.ordinal()];
                                if (i32 == 1) {
                                    view6.setOverScrollMode(0);
                                } else if (i32 == 2) {
                                    view6.setOverScrollMode(1);
                                } else if (i32 == 3) {
                                    view6.setOverScrollMode(2);
                                } else if (i32 == 4) {
                                    xv10 xv10Var2 = prrVar2.a;
                                    OverScrollMode overScrollMode2 = OverScrollMode.UNKNOWN;
                                    xv10Var2.getClass();
                                    throw new IllegalArgumentException(overScrollMode2 + " doesn't represent a native value.");
                                }
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        }
    }
}
