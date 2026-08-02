package defpackage;

import android.util.Log;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class ha91 {
    public static final y7l a = new y7l(29);

    public static final void a(bj6 bj6Var, ra90 ra90Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2117306192);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ra90Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            uo5 uo5Var = x4c.C;
            c530 c530Var = c530.a;
            f530 a2 = bj6Var.a(c530Var, uo5Var);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            s3b1.f(new cuj0(vzg0.ic_delivery_corp_car, null, null, null, 30), ljs0.n(c530Var, 74.0f, 32.0f), null, btsVar, 48, 4);
            s3b1.f(ra90Var, aab1.a(1.5f, ldc.f, ymb1.l(cj6.a.a(ljs0.m(c530Var, 27.0f), uo5Var), cyk0.c(8.0f)), cyk0.c(8.0f)), null, btsVar, (i2 >> 3) & 14, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(bj6Var, ra90Var, i, 15);
        }
    }

    public static final void b(bj6 bj6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1962063000);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            s3b1.f(new cuj0(vzg0.ic_delivery_tracking_default_car, null, null, null, 30), bj6Var.a(ljs0.n(c530.a, 74.0f, 32.0f), x4c.C), null, btsVar, 0, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xm1(bj6Var, i, 4);
        }
    }

    public static final void c(String str, String str2, tls tlsVar, fid fidVar, int i) {
        int i2;
        String str3;
        float f;
        String str4;
        boolean z;
        kk2 i3;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1914518035);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= btsVar.k(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i4 = i2;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                f = 0.0f;
                Q2 = f.j(new wu60((Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32)));
                btsVar.o0(Q2);
            } else {
                f = 0.0f;
            }
            oz40 oz40Var2 = (oz40) Q2;
            c530 c530Var = c530.a;
            f530 e = ljs0.e(c530Var, 27.0f);
            a7u0 a7u0Var = gl51.a;
            f530 b = m4m0.b(e, ((el51) btsVar.m(a7u0Var)).g(), cyk0.c(4.0f));
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new uny0(6, oz40Var2);
                btsVar.o0(Q3);
            }
            f530 b2 = tm91.b(b, (tls) Q3);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new yuz0(1, oz40Var);
                btsVar.o0(Q4);
            }
            f530 d = q791.d(b2, false, null, null, (sls) Q4, 15);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            List list = null;
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(-2069711208);
                long j = ((wu60) oz40Var2.getValue()).a;
                Object Q5 = btsVar.Q();
                if (Q5 == o430Var) {
                    Q5 = new yuz0(2, oz40Var);
                    btsVar.o0(Q5);
                }
                str4 = str;
                d(str4, str3, j, (sls) Q5, tlsVar, btsVar, (i4 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i4 & 112) | ((i4 << 6) & HProv.ALG_CLASS_ALL));
                btsVar.t(false);
            } else {
                str4 = str;
                btsVar.e0(-2069418103);
                btsVar.t(false);
            }
            f530 m = an91.m(cj6.a.a(c530Var, x4c.y), 8.0f, f, 2);
            lzr lzrVar = lzr.G;
            long n = ((el51) btsVar.m(a7u0Var)).n();
            t68 t68Var = t68.a;
            int i5 = i4 & 14;
            if (!evu0.J(str4)) {
                Matcher matcher = t68.b.matcher(str4);
                if (matcher.matches()) {
                    list = evu0.Y(matcher.replaceFirst("$1 $2 $3 $4"), new char[]{160}, 0, 6);
                } else {
                    Matcher matcher2 = t68.c.matcher(str4);
                    if (matcher2.matches()) {
                        list = evu0.Y(matcher2.replaceFirst("$1 $2 $3"), new char[]{160}, 0, 6).subList(0, 2);
                    } else {
                        Log.e("CarPlateFormatUtils", "failed to parse car number: ".concat(str4));
                    }
                }
            }
            List list2 = list;
            List list3 = list2;
            if (list3 != null && !list3.isEmpty()) {
                z = true;
                if (list2.size() != 1) {
                    if (list2.size() <= 4) {
                        btsVar.e0(-1824928281);
                        hk2 hk2Var = new hk2(0);
                        t68Var.b(hk2Var, (String) list2.get(0), btsVar, 8);
                        hk2Var.d(" ");
                        z = true;
                        t68Var.a(hk2Var, (String) list2.get(1), btsVar, 8);
                        if (a.S(2, list2) != null) {
                            btsVar.e0(-1648254432);
                            hk2Var.d(" ");
                            t68Var.b(hk2Var, (String) list2.get(2), btsVar, 8);
                            z2 = false;
                            btsVar.t(false);
                        } else {
                            z2 = false;
                            btsVar.e0(-1648141034);
                            btsVar.t(false);
                        }
                        i3 = hk2Var.i();
                        btsVar.t(z2);
                        ymb1.d(i3, m, n, lzrVar, 0L, 0L, 0L, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                        btsVar.t(z);
                    }
                }
                btsVar.e0(-1825046732);
                hk2 hk2Var2 = new hk2(0);
                t68Var.a(hk2Var2, str4, btsVar, ((i5 << 3) & 112) | 8);
                i3 = hk2Var2.i();
                btsVar.t(false);
                ymb1.d(i3, m, n, lzrVar, 0L, 0L, 0L, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                btsVar.t(z);
            }
            z = true;
            btsVar.e0(-1825046732);
            hk2 hk2Var22 = new hk2(0);
            t68Var.a(hk2Var22, str4, btsVar, ((i5 << 3) & 112) | 8);
            i3 = hk2Var22.i();
            btsVar.t(false);
            ymb1.d(i3, m, n, lzrVar, 0L, 0L, 0L, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(str, str2, tlsVar, i, 10);
        }
    }

    public static final void d(String str, String str2, long j, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1947376074);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            androidx.compose.runtime.internal.a S = wwg.S(2110003676, true, new qpm0(ohb1.e(btsVar, uzh0.delivery_copy_text_button), 12), btsVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new w8e0(str, S, ohb1.e(btsVar, uzh0.notification_car_number_copied)));
            btsVar.e0(-402161880);
            arrayList.add(new w8e0(str2, S, ohb1.e(btsVar, uzh0.notification_car_mark_copied)));
            arrayList.add(new w8e0(g8e.p(str, " ", str2), S, ohb1.e(btsVar, uzh0.notification_car_number_mark_copied)));
            btsVar.t(false);
            int i3 = (i2 & 896) | 6;
            int i4 = i2 << 3;
            urb1.d((-((fwi) btsVar.m(j.h)).f0(35.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD, j, arrayList, slsVar, tlsVar, btsVar, i3 | (57344 & i4) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nx20(str, str2, j, slsVar, tlsVar, i);
        }
    }

    public static final void e(f530 f530Var, String str, String str2, tls tlsVar, zls zlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1574161634);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(zlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 e = ljs0.e(f530Var, 46.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            c(str, str2, tlsVar, btsVar, (i2 >> 3) & 1022);
            ly3.x(((i2 >> 9) & 112) | 6, zlsVar, cj6.a, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(f530Var, str, str2, tlsVar, zlsVar, i);
        }
    }

    public static final DefaultEnvironment f(PaymentKitEnvironment paymentKitEnvironment) {
        int i = y2a0.a[paymentKitEnvironment.ordinal()];
        if (i == 1) {
            return DefaultEnvironment.PRODUCTION;
        }
        if (i == 2) {
            return DefaultEnvironment.TESTING;
        }
        w511.b();
        return null;
    }
}
