package defpackage;

import android.content.res.XmlResourceParser;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class cra1 {
    public static final void a(f530 f530Var, String str, String str2, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        int i2;
        float f;
        c530 c530Var;
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(509411931);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            String e = ohb1.e(btsVar, kyh0.common_back);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d2 = b.d(btsVar, c530Var2);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            boolean k = ((i4 & 7168) == 2048) | btsVar.k(e);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                i2 = 0;
                Q = new kp1(e, slsVar, i2);
                btsVar.o0(Q);
            } else {
                i2 = 0;
            }
            sya1.a(vza1.c(), an91.l(q791.d(fnq0.a(c530Var2, (tls) Q), false, null, null, slsVar, 15), 16.0f, 20.0f), null, null, btsVar, 0, 12);
            f530 a = cj6.a.a(ljs0.c(c530Var2, 1.0f), x4c.y);
            sic a2 = qic.a(new i43(1.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            if (str.length() > 0) {
                btsVar.e0(1539285596);
                f530 c = ljs0.c(c530Var2, 1.0f);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new j01(20);
                    btsVar.o0(Q2);
                }
                z2 = false;
                c530Var = c530Var2;
                f = 1.0f;
                z = true;
                jeb1.f(str, fnq0.b(c, false, (tls) Q2), AppColor$Palette.Text, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, ((i4 >> 3) & 14) | 384, 0, 16248);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                f = 1.0f;
                c530Var = c530Var2;
                z = true;
                z2 = false;
                btsVar.e0(1539546275);
                btsVar.t(false);
            }
            if (str2.length() > 0) {
                btsVar.e0(1539596898);
                bts btsVar2 = btsVar;
                jeb1.f(str2, ljs0.c(c530Var, f), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar2, ((i4 >> 6) & 14) | 432, 0, 16248);
                btsVar = btsVar2;
                btsVar.t(z2);
            } else {
                btsVar.e0(1539821059);
                btsVar.t(z2);
            }
            btsVar.t(z);
            btsVar.t(z);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(f530Var2, str, str2, slsVar, i, 3);
        }
    }

    public static final void b(int i, fid fidVar, sls slsVar, f530 f530Var) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1245122175);
        int i2 = 4;
        int i3 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530Var2 = c530.a;
            f530 o = an91.o(f530Var2, 0.0f, 8.0f, 8.0f, 8.0f, 1);
            ButtonSize buttonSize = ButtonSize.M;
            j7d.a.getClass();
            vpa1.a(o, false, buttonSize, slsVar, j7d.b, btsVar, ((i3 << 9) & 7168) | 24960, 2);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar, f530Var2, i, i2);
        }
    }

    public static final void c(xuk0 xuk0Var, wg6 wg6Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(73785084);
        int i2 = i | (btsVar.k(xuk0Var) ? 4 : 2) | (btsVar.k(wg6Var) ? 32 : 16) | 384 | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            rab1.a(wg6Var, c530Var, wwg.S(-458717044, true, new o990(25, xuk0Var, tlsVar), btsVar), null, null, null, null, null, btsVar, ((i2 >> 3) & 14) | 432, 248);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(xuk0Var, wg6Var, f530Var2, tlsVar, i, 7);
        }
    }

    public static final void d(wuk0 wuk0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1366813275);
        int i2 = (btsVar.k(wuk0Var) ? 4 : 2) | i | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            au2 au2Var = wuk0Var.a;
            String str = wuk0Var.b;
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new v6k0(tlsVar, 9, wuk0Var);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            nab1.b(au2Var, str, (sls) Q, c530Var, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) wuk0Var, (Object) f530Var2, tlsVar, i, 10);
        }
    }

    public static final String e(String str, XmlResourceParser xmlResourceParser) {
        for (int i = 0; i < xmlResourceParser.getAttributeCount(); i++) {
            if (xmlResourceParser.getAttributeName(i).equals(str)) {
                return xmlResourceParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final void f(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
