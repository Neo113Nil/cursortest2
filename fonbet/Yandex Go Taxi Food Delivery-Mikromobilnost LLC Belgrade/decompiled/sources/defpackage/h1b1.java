package defpackage;

import android.content.Context;
import androidx.compose.animation.k;
import androidx.compose.animation.m;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.ble.api.exceptions.ScootersBluetoothNotGrantedException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes14.dex */
public abstract class h1b1 {
    public static final void a(wd3 wd3Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(265125439);
        int i2 = 16;
        int i3 = (btsVar.k(wd3Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.Y();
        } else if (wd3Var instanceof ud3) {
            btsVar.e0(-92728726);
            f((ud3) wd3Var, f530Var, btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!wd3Var.equals(vd3.a)) {
                throw unr0.y(1382479943, btsVar, false);
            }
            btsVar.e0(-92599766);
            g(f530Var, btsVar, (i3 >> 3) & 14);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(wd3Var, f530Var, i, i2);
        }
    }

    public static final void b(xd3 xd3Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1739583822);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ie3 ie3Var = xd3Var.b;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new gz6(AppColor$Palette.Background, AppColor$Palette.Text);
                btsVar.o0(Q);
            }
            gz6 gz6Var = (gz6) Q;
            boolean z = ie3Var != null;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new teb(20);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(f530Var, (tls) Q2);
            float size = ButtonSize.M.getSize();
            boolean a2 = btsVar.a(z) | ((i2 & 896) == 256) | btsVar.e(ie3Var);
            Object Q3 = btsVar.Q();
            if (a2 || Q3 == o430Var) {
                Q3 = new ex0(z, tlsVar, ie3Var, i3);
                btsVar.o0(Q3);
            }
            d17.b(a, z, gz6Var, null, size, Float.POSITIVE_INFINITY, true, (sls) Q3, wwg.S(2093083843, true, new bj0(14, xd3Var), btsVar), btsVar, 102436224);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) xd3Var, f530Var, (Object) tlsVar, i, 8);
        }
    }

    public static final void c(me3 me3Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        ee3 ee3Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1171514791);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(me3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            td3 td3Var = me3Var.a;
            ee3 ee3Var2 = me3Var.b;
            wd3 wd3Var = me3Var.c;
            he3 he3Var = me3Var.d;
            long n = tje.n(td3Var.a, btsVar);
            m3u0 a = m.a(n, null, null, btsVar, 0, 14);
            Float f = td3Var.b;
            if (f != null) {
                n = ldc.b(n, f.floatValue(), 0.0f, 0.0f, 0.0f, 14);
            }
            m3u0 a2 = m.a(n, null, null, btsVar, 0, 14);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            boolean k = btsVar.k(fwiVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                float w0 = fwiVar.w0(16.0f);
                ee3Var = ee3Var2;
                Q = new vre((Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                btsVar.o0(Q);
            } else {
                ee3Var = ee3Var2;
            }
            long j = ((vre) Q).a;
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 8.0f, 0.0f, 8.0f, 12.0f, 2);
            boolean k2 = btsVar.k(a) | btsVar.k(a2) | btsVar.d(j);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new ec1(a, a2, j, 1);
                btsVar.o0(Q2);
            }
            f530 g = bb1.g(o, (tls) Q2);
            ee3 ee3Var3 = ee3Var;
            int i4 = i3 & 896;
            boolean k3 = btsVar.k(ee3Var3) | (i4 == 256) | btsVar.k(he3Var);
            Object Q3 = btsVar.Q();
            if (k3 || Q3 == o430Var) {
                Q3 = new q(12, ee3Var3, tlsVar, he3Var);
                btsVar.o0(Q3);
            }
            f530 m = an91.m(fnq0.b(g, true, (tls) Q3), 16.0f, 0.0f, 2);
            lhl0 a3 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i5 = i4 | 48;
            e(ee3Var3, an91.m(c530Var, 0.0f, 14.0f, 1), tlsVar, btsVar, i5);
            a(wd3Var, ooc.d(an91.m(new x2y(1.0f, true), 0.0f, 8.0f, 1), null, 3), btsVar, 0);
            h(he3Var, an91.m(c530Var, 0.0f, 14.0f, 1), tlsVar, btsVar, i5);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) me3Var, f530Var2, (Object) tlsVar, i, 9);
        }
    }

    public static final void d(me3 me3Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1678780842);
        int i2 = i | (btsVar.k(me3Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            int i4 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i4);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i4);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ttb1.a(me3Var, c530Var, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "AuctionItem", wwg.S(1377036439, true, new o91(i3, tlsVar), btsVar), btsVar, (i2 & 14) | 224688, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(me3Var, f530Var2, tlsVar, i, 14);
        }
    }

    public static final void e(ee3 ee3Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1796768350);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ee3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            b(ee3Var.a, f530Var, tlsVar, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) ee3Var, f530Var, (Object) tlsVar, i, 11);
        }
    }

    public static final void f(ud3 ud3Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-530521049);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ud3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            jeb1.f(ud3Var.a, null, AppColor$Palette.EverBack, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, bza1.c(xya1.e(btsVar).e.a, fwiVar), btsVar, 384, 0, 16250);
            btsVar = btsVar;
            if (evu0.J(ud3Var.b)) {
                btsVar.e0(712596721);
                btsVar.t(false);
            } else {
                btsVar.e0(712379349);
                jeb1.f(ud3Var.b, null, AppColor$Palette.Fog, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, bza1.c(xya1.e(btsVar).h.a, fwiVar), btsVar, 384, 0, 16250);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(ud3Var, f530Var, i, 21);
        }
    }

    public static final void g(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2041380855);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            com.yandex.go.design.compose.loading.b.a(ljs0.e(f530Var, 24.0f), null, false, null, null, null, false, btsVar, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, i3);
        }
    }

    public static final void h(he3 he3Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1823881742);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(he3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            b(he3Var.a, f530Var, tlsVar, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) he3Var, f530Var, (Object) tlsVar, i, 10);
        }
    }

    public static final void i(piu piuVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(55477364);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(piuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(1691822922, true, new wg0(17, tlsVar), btsVar), wwg.S(-978206590, true, new nfj(12, piuVar, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(piuVar, tlsVar, i, 28);
        }
    }

    public static final void j(Context context) {
        if (jx81.e() && qke.h(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
            throw new ScootersBluetoothNotGrantedException();
        }
    }
}
