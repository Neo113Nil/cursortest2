package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import kotlin.Triple;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class oy91 {
    public static final long[] a = new long[0];
    public static au2 b;

    public static final void a(final long j, final String str, final String str2, final long j2, final lzr lzrVar, final sls slsVar, final f530 f530Var, fid fidVar, final int i) {
        int i2;
        lzr lzrVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-643634956);
        if ((i & 6) == 0) {
            i2 = (btsVar2.d(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.d(j2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            lzrVar2 = lzrVar;
            i2 |= btsVar2.k(lzrVar2) ? 16384 : 8192;
        } else {
            lzrVar2 = lzrVar;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(slsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.k(f530Var) ? 1048576 : 524288;
        }
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar = btsVar2;
            a.b(slsVar, ljs0.e(f530Var, 56.0f), null, j, 0L, null, null, null, false, null, null, null, wwg.S(-331321869, true, new exm(j2, lzrVar2, str, str2), btsVar2), btsVar, ((i2 >> 15) & 14) | ((i2 << 9) & 7168), 384, 4084);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: fxm
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oy91.a(j, str, str2, j2, lzrVar, slsVar, f530Var, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(fvm fvmVar, fvm fvmVar2, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1649037609);
        int i2 = i | (btsVar.k(fvmVar) ? 4 : 2) | (btsVar.k(fvmVar2) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 o = an91.o(c530.a, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (fvmVar2 != null) {
                btsVar.e0(541413050);
                a7u0 a7u0Var = gl51.a;
                long g = ((el51) btsVar.m(a7u0Var)).g();
                long q = ((el51) btsVar.m(a7u0Var)).q();
                String str = fvmVar2.a;
                String str2 = fvmVar2.b;
                lzr lzrVar = lzr.D;
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                a(g, str, str2, q, lzrVar, slsVar2, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, ((i2 << 6) & ImageMetadata.JPEG_GPS_COORDINATES) | HProv.ALG_CLASS_DATA_ENCRYPT);
                btsVar.t(false);
            } else {
                btsVar.e0(541804487);
                btsVar.t(false);
            }
            a7u0 a7u0Var2 = gl51.a;
            long f = ((el51) btsVar.m(a7u0Var2)).f();
            long p = ((el51) btsVar.m(a7u0Var2)).p();
            String str3 = fvmVar.a;
            String str4 = fvmVar.b;
            lzr lzrVar2 = lzr.E;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            a(f, str3, str4, p, lzrVar2, slsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, ((i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | HProv.ALG_CLASS_DATA_ENCRYPT);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) fvmVar, (Object) fvmVar2, (Object) slsVar, (Object) slsVar2, i, 27);
        }
    }

    public static final void c(jvm jvmVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(242344648);
        int i2 = (btsVar.k(jvmVar) ? 4 : 2) | i;
        byte b2 = 0;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            web1.c(null, 0.0f, false, 0.0f, null, wwg.S(-938738043, true, new ixm(jvmVar, b2, b2), btsVar), wwg.S(662428004, true, new ixm(jvmVar, i3, b2), btsVar), null, null, null, null, null, false, btsVar, 1769472, 0, 8095);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ixm(jvmVar, i);
        }
    }

    public static final void d(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        int i2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-149262037);
        int i3 = 4;
        int i4 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16);
        if (btsVar2.V(i4 & 1, (i4 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, k);
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
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            f530 o2 = an91.o(c530Var, 0.0f, 4.0f, 0.0f, str2 == null ? 4.0f : 0.0f, 5);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new urm(i3);
                btsVar2.o0(Q);
            }
            ymb1.j(str, fnq0.b(o2, false, (tls) Q), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, (i4 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
            if (str2 == null) {
                btsVar2.e0(141138408);
                btsVar2.t(false);
                btsVar = btsVar2;
                str3 = str2;
            } else {
                btsVar2.e0(141138409);
                str3 = str2;
                ymb1.e(str3, an91.o(c530Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 48, 0, 65532);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            i2 = 1;
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar = btsVar2;
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, i2);
        }
    }

    public static final void e(jxm jxmVar, Triple triple, tls tlsVar, tls tlsVar2, tls tlsVar3, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1300256512);
        int i2 = i | (btsVar.k(jxmVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.e(tlsVar3) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536) | (btsVar.e(slsVar2) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((3670016 & i2) == 1048576);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                rs5 rs5Var = new rs5(jxmVar, triple, tlsVar, tlsVar2, tlsVar3, slsVar, slsVar2, 2);
                btsVar.o0(rs5Var);
                Q = rs5Var;
            }
            b2q0.b(null, 6.0f, 0L, true, false, jxmVar, (tls) Q, btsVar, ((i2 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | 3120, 21);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(jxmVar, triple, tlsVar, tlsVar2, tlsVar3, slsVar, slsVar2, i, 7);
        }
    }

    public static final void f(pwm pwmVar, int i, int i2, int i3, tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i4) {
        List list = pwmVar.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-261568580);
        int i5 = i4 | (btsVar.k(pwmVar) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | (btsVar.c(i2) ? 256 : 128) | (btsVar.c(i3) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.e(tlsVar2) ? 131072 : 65536) | (btsVar.e(tlsVar3) ? 1048576 : 524288);
        if (btsVar.V(i5 & 1, (599187 & i5) != 599186)) {
            List list2 = list;
            int i6 = (list2 == null || list2.isEmpty()) ? 2 : 3;
            c530 c530Var = c530.a;
            f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            nhl0 nhl0Var = nhl0.a;
            int i7 = i5 >> 3;
            ay41.b(an91.m(nhl0Var.a(c530Var, 1.0f, true), 16.0f, 0.0f, 2), pwmVar.a, i, tlsVar, 3, 0L, 0L, 0L, 0L, null, btsVar, ((i5 << 3) & 896) | (i7 & 7168), 992);
            ay41.b(an91.m(nhl0Var.a(c530Var, 4.0f - i6, true), 16.0f, 0.0f, 2), pwmVar.b, i2, tlsVar2, 3, 0L, 0L, 0L, 0L, ohb1.e(btsVar, rzh0.accessibility_hours), btsVar, (i5 & 896) | ((i5 >> 6) & 7168), 480);
            btsVar = btsVar;
            List list3 = list;
            if (list3 == null || list3.isEmpty()) {
                btsVar.e0(-910970142);
                btsVar.t(false);
            } else {
                btsVar.e0(-911443264);
                ay41.b(an91.m(nhl0Var.a(c530Var, 1.0f, true), 16.0f, 0.0f, 2), pwmVar.c, i3, tlsVar3, 3, 0L, 0L, 0L, 0L, ohb1.e(btsVar, rzh0.accessibility_minutes), btsVar, (i7 & 896) | ((i5 >> 9) & 7168), 480);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hxm(pwmVar, i, i2, i3, tlsVar, tlsVar2, tlsVar3, i4);
        }
    }

    public static final int g(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }
}
