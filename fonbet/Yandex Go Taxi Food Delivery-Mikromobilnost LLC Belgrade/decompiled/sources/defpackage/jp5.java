package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;
import com.yandex.go.rida.bids.ui.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jp5 {
    public static final gz6 a;
    public static final gz6 b;

    static {
        AppColor$Palette appColor$Palette = AppColor$Palette.Background;
        a = new gz6(appColor$Palette, AppColor$Palette.Text);
        b = new gz6(new up2(hq2.b), appColor$Palette);
    }

    public static final void a(wg6 wg6Var, as5 as5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1720707607);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wg6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(as5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            k3r k3rVar = ljs0.c;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = a12.d;
                btsVar.o0(Q);
            }
            f530 a2 = exw0.a(k3rVar, zy11.a, (PointerInputEventHandler) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
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
            c(as5Var.f, btsVar, 0);
            d(wg6Var, as5Var.d, as5Var.g, tlsVar, btsVar, (i2 & 14) | ((i2 << 3) & 7168));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(wg6Var, as5Var, tlsVar, i, 16);
        }
    }

    public static final void b(kp5 kp5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        kp5 kp5Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1233376268);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(kp5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new a0(15, tlsVar);
                btsVar.o0(Q);
            }
            kp5Var2 = kp5Var;
            ttb1.a(kp5Var2, xm91.b(c530.a, (tls) Q), null, null, null, wwg.S(1060065361, true, new o91(i3, tlsVar), btsVar), btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE, 28);
        } else {
            kp5Var2 = kp5Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(kp5Var2, tlsVar, i, 5);
        }
    }

    public static final void c(jh00 jh00Var, fid fidVar, int i) {
        jh00 jh00Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1193458377);
        int i2 = (btsVar.k(jh00Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            i3d.a.getClass();
            jh00Var2 = jh00Var;
            ttb1.a(jh00Var2, null, null, null, null, i3d.b, btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE, 30);
        } else {
            jh00Var2 = jh00Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn1(jh00Var2, i, 23);
        }
    }

    public static final void d(wg6 wg6Var, kp5 kp5Var, int i, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1818174937);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(wg6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(kp5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.c(i) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.d(new gp5(wg6Var, 0));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            boolean z = (i3 & 7168) == 2048;
            Object Q2 = btsVar.Q();
            int i5 = 14;
            if (z || Q2 == o430Var) {
                Q2 = new a0(i5, tlsVar);
                btsVar.o0(Q2);
            }
            f530 b2 = xm91.b(c530.a, (tls) Q2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new xo1(m3u0Var, i4);
                btsVar.o0(Q3);
            }
            f530 a2 = androidx.compose.ui.graphics.d.a(b2, (tls) Q3);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a2);
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i6 = i3 >> 6;
            f(i, i6 & 14, btsVar);
            b(kp5Var, tlsVar, btsVar, ((i3 >> 3) & 14) | (i6 & 112));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(wg6Var, kp5Var, i, tlsVar, i2);
        }
    }

    public static final void e(MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType, m3u0 m3u0Var, fid fidVar, int i) {
        m3u0 m3u0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1881817689);
        int i2 = (btsVar.c(mapDecorationUiState$PulsarType.ordinal()) ? 4 : 2) | i | (btsVar.k(m3u0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i3 = ip5.b[mapDecorationUiState$PulsarType.ordinal()];
            if (i3 == 1) {
                m3u0Var2 = m3u0Var;
                btsVar.e0(-977168428);
                q6a1.a(null, m3u0Var2, true, null, 0.0f, btsVar, (i2 & 112) | 384);
                btsVar.t(false);
            } else if (i3 == 2) {
                btsVar.e0(-977031501);
                m3u0Var2 = m3u0Var;
                c.n(null, m3u0Var2, true, null, 0.0f, btsVar, (i2 & 112) | 384);
                btsVar.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(245571094, btsVar, false);
                }
                btsVar.e0(245581661);
                btsVar.t(false);
                m3u0Var2 = m3u0Var;
            }
        } else {
            m3u0Var2 = m3u0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(mapDecorationUiState$PulsarType, m3u0Var2, i, 20);
        }
    }

    public static final void f(int i, int i2, fid fidVar) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-857449598);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            oeb1.c(btsVar, ljs0.e(c530.a, ((fwi) btsVar.m(j.h)).H(((Number) androidx.compose.animation.core.b.c(Integer.valueOf(i), gtq0.g, androidx.compose.animation.core.b.c, null, "RidaHeaderSpacer", null, btsVar, (((i3 & 14) | 384) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 8).getValue()).intValue())));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hp5(i, i2, 0, (byte) 0);
        }
    }
}
