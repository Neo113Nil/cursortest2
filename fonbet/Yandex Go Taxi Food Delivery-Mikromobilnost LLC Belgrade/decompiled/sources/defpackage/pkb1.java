package defpackage;

import android.net.Uri;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class pkb1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-577904489);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            ced.a.getClass();
            slsVar2 = slsVar;
            d17.c(c, false, null, buttonStyle, null, slsVar2, ced.d, btsVar, ((i2 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575936, 22);
            f530Var = c530Var;
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, 13);
        }
    }

    public static final void b(qfx0 qfx0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        qfx0 qfx0Var2;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-766096484);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(qfx0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        }
        int i3 = 18;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            btsVar.e0(-496795252);
            ((nx2) btsVar.m(uy2.c)).getClass();
            float w0 = fwiVar.w0(24.0f);
            btsVar.t(false);
            boolean k = btsVar.k(o);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = jeb1.g(f.d(new k0v(o, w0, 3)));
                btsVar.o0(Q);
            }
            qor qorVar = (qor) Q;
            boolean z = (i2 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new lao0(i3, tlsVar2);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            wg6 a2 = b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            int i4 = 9;
            a S = wwg.S(-272709142, true, new wu40(i4, slsVar), btsVar);
            ced.a.getClass();
            a aVar = ced.b;
            a S2 = wwg.S(-226632024, true, new ays0(i4, qorVar, slsVar), btsVar);
            qfx0Var2 = qfx0Var;
            a S3 = wwg.S(1384884988, true, new dhj0(qfx0Var2, o, tlsVar, 18), btsVar);
            btsVar = btsVar;
            tlsVar2 = tlsVar;
            c.a(null, a2, null, false, false, null, null, S, null, aVar, S2, S3, btsVar, 817889280, 54, 381);
        } else {
            qfx0Var2 = qfx0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(qfx0Var2, tlsVar2, i, 2);
        }
    }

    public static final void c(qfx0 qfx0Var, j690 j690Var, oip0 oip0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1210915118);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qfx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(j690Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(oip0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 j = an91.j(pw91.u(ljs0.c(c530Var, 1.0f), oip0Var, 14), j690Var);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, j);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            vdu vduVar = qfx0Var.a;
            List list = qfx0Var.b;
            vza1.a(vduVar, null, btsVar, 0);
            List list2 = list;
            if (list2.isEmpty()) {
                btsVar.e0(-118723110);
                btsVar.t(false);
            } else {
                float f = 16.0f;
                tse0.s(btsVar, -119217064, c530Var, 16.0f, btsVar);
                int size = list2.size();
                int i3 = 0;
                while (i3 < size) {
                    float f2 = f;
                    abb1.a((lj6) list.get(i3), tlsVar, bzk0.c(ymb1.l(an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 4.0f, 2), cyk0.c(f2)), AppColor$Palette.BgMinor, qke.q), btsVar, (i2 >> 6) & 112);
                    i3++;
                    f = f2;
                }
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(qfx0Var, j690Var, oip0Var, tlsVar, i, 15);
        }
    }

    public static final void d(qor qorVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1475007914);
        int i2 = 4;
        int i3 = (btsVar.k(qorVar) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            ocb1.a(null, false, qorVar, false, false, null, 0.0f, 0, wwg.S(1450221491, true, new us4(12, slsVar), btsVar), btsVar, ((i3 << 6) & 896) | 805306368, 507);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(qorVar, slsVar, i, i2);
        }
    }

    public static final au2 e() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(2.0f, 10.0f);
        e.e(0.0f, -5.33f, 4.47f, -8.0f, 10.0f, -8.0f);
        e.n(10.0f, 2.67f, 10.0f, 8.0f);
        e.n(-4.47f, 8.0f, -10.0f, 8.0f);
        e.m(-0.5f, 0.0f, -0.97f, -0.03f);
        e.h(8.0f, 21.0f);
        e.f(7.0f);
        e.p(-3.87f);
        e.d(4.01f, 15.95f, 2.0f, 13.57f, 2.0f, 10.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static boolean f(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
