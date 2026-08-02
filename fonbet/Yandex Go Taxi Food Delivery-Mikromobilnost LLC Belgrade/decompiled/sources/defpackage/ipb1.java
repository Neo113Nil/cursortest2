package defpackage;

import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.MtPerforationEdge;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class ipb1 {
    public static final void a(ky kyVar, w3b1 w3b1Var, String str, String str2, Object obj, f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        String str3;
        bts btsVar;
        long j;
        Object sq0Var;
        m27 m27Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1367259002);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(kyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(w3b1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(str) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            str3 = str2;
            i2 |= btsVar2.k(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(obj) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.k(f530Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.e(aVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
            lhg lhgVar = (lhg) btsVar2.m(mhg.a);
            o430 o430Var = did.a;
            if (kyVar != null) {
                btsVar2.e0(1457259123);
                byk0 b = ((YandexShapes) btsVar2.m(qm51.a)).b();
                long c = ((el51) btsVar2.m(gl51.a)).c();
                ldc b2 = w3b1Var != null ? w3b1Var.b() : null;
                if (b2 == null) {
                    btsVar2.e0(324108877);
                    j = ((ldc) btsVar2.m(srk0.a)).a;
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(324107513);
                    btsVar2.t(false);
                    j = b2.a;
                }
                long j2 = j;
                String str4 = kyVar.a;
                boolean z = (i3 & 896) == 256;
                Object Q = btsVar2.Q();
                if (z || Q == o430Var) {
                    Q = new g8r0(str, 24);
                    btsVar2.o0(Q);
                }
                m27 m27Var2 = new m27((tls) Q);
                boolean e = btsVar2.e(lhgVar) | ((i3 & 7168) == 2048) | btsVar2.e(obj) | ((i3 & 14) == 4);
                Object Q2 = btsVar2.Q();
                if (e || Q2 == o430Var) {
                    m27Var = m27Var2;
                    sq0Var = new sq0(lhgVar, str3, obj, kyVar, 4);
                    btsVar2.o0(sq0Var);
                } else {
                    sq0Var = Q2;
                    m27Var = m27Var2;
                }
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) sq0Var, f530Var, b, c, j2, null, null, null, false, str4, null, m27Var, wwg.S(2144428162, true, new o4z0(w3b1Var, aVar, 0), btsVar2), btsVar2, (i3 >> 12) & 112, 384, 1504);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                btsVar.e0(1457966078);
                f530 d = hi91.d(f530Var, false, null, 3);
                boolean z2 = (i3 & 896) == 256;
                Object Q3 = btsVar.Q();
                if (z2 || Q3 == o430Var) {
                    Q3 = new g8r0(str, 25);
                    btsVar.o0(Q3);
                }
                r3b1.a(fnq0.b(d, true, (tls) Q3), w3b1Var, null, null, wwg.S(1984958016, true, new jz2(aVar, 5), btsVar), btsVar, (i3 & 112) | HProv.ALG_CLASS_DATA_ENCRYPT, 12);
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ft0(kyVar, w3b1Var, str, str2, obj, f530Var, aVar, i, 4);
        }
    }

    public static final List b(dus0 dus0Var) {
        boolean z = dus0Var.f;
        int[] iArr = dus0Var.b;
        if (z || dus0Var.c == 0) {
            return EmptyList.a;
        }
        dci0 dci0Var = new dci0(dus0Var);
        int i = dus0Var.i;
        Object valueOf = Integer.valueOf(dus0Var.l - uus0.d(i, iArr));
        while (i >= 0) {
            dci0Var.b(dus0Var.i(i), dus0Var.k(i) ? dus0Var.p(i, iArr) : did.a, dus0Var.a.m(i), valueOf);
            valueOf = dus0Var.a(i);
            i = dus0Var.q(i);
        }
        return dci0Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ahd, dci0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yss] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List c(ows0 ows0Var, Integer num, int i, Integer num2) {
        int i2;
        int s;
        xy40 xy40Var;
        if (ows0Var.w || ows0Var.p() == 0) {
            return EmptyList.a;
        }
        ?? dci0Var = new dci0(ows0Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = ows0Var.v;
            if (i2 < 0) {
                i2 = ows0Var.G(i, ows0Var.b);
            }
        }
        if (num == 0) {
            int P = ows0Var.i - ows0Var.P(ows0Var.r(i), ows0Var.b);
            wx40 wx40Var = ows0Var.s;
            num = Integer.valueOf(P + ((wx40Var == null || (xy40Var = (xy40) wx40Var.b(i)) == null) ? 0 : xy40Var.b));
        }
        int r = ows0Var.r(i) * 5;
        int[] iArr = ows0Var.b;
        if (r < iArr.length) {
            s = ows0Var.s(i);
        } else {
            int G = i2 >= 0 ? ows0Var.G(i2, iArr) : i2;
            s = ows0Var.s(i2);
            int i3 = i2;
            i2 = G;
            i = i3;
        }
        while (i >= 0) {
            dci0Var.b(s, (ows0Var.b[(ows0Var.r(i) * 5) + 1] & 536870912) != 0 ? ows0Var.t(i) : did.a, ows0Var.Q(i), num);
            num = ows0Var.b(i);
            if (i2 >= 0) {
                int G2 = ows0Var.G(i2, ows0Var.b);
                s = ows0Var.s(i2);
                int i4 = i2;
                i2 = G2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return dci0Var.a;
    }

    public static List d(ows0 ows0Var) {
        return c(ows0Var, null, ows0Var.t, null);
    }

    public static final Integer e(sus0 sus0Var, ttd ttdVar) {
        dus0 j = sus0Var.j();
        try {
            return f(j, ttdVar, 0, j.c);
        } finally {
            j.c();
        }
    }

    public static final Integer f(dus0 dus0Var, ttd ttdVar, int i, int i2) {
        Integer f;
        int[] iArr = dus0Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int a = uus0.a(i, iArr) + i;
            if (dus0Var.j(i) && dus0Var.i(i) == 206 && jl40.l(dus0Var.p(i, iArr), lid.e)) {
                Object h = dus0Var.h(i, 0);
                gts gtsVar = h instanceof gts ? (gts) h : null;
                Object obj = gtsVar != null ? gtsVar.a : null;
                zss zssVar = obj instanceof zss ? (zss) obj : null;
                if (zssVar != null && zssVar.a == ttdVar) {
                    return Integer.valueOf(i);
                }
            }
            if (dus0Var.d(i) && (f = f(dus0Var, ttdVar, i + 1, a)) != null) {
                return Integer.valueOf(f.intValue());
            }
            i = a;
        }
    }

    public static final f530 g(f530 f530Var, final MtPerforationEdge mtPerforationEdge, final boolean z, boolean z2, fid fidVar, int i, int i2) {
        boolean z3 = true;
        if ((i2 & 2) != 0) {
            z = true;
        }
        final boolean z4 = (i2 & 4) != 0 ? true : z2;
        final long n = tje.n(AppColor$Palette.Background, fidVar);
        boolean z5 = ((((i & 896) ^ 384) > 256 && fidVar.a(z)) || (i & 384) == 256) | ((((3670016 & i) ^ 1572864) > 1048576 && fidVar.b(4.5f)) || (i & 1572864) == 1048576) | ((((234881024 & i) ^ 100663296) > 67108864 && fidVar.b(10.0f)) || (i & 100663296) == 67108864) | ((((29360128 & i) ^ 12582912) > 8388608 && fidVar.b(30.0f)) || (i & 12582912) == 8388608) | ((((i & 112) ^ 48) > 32 && fidVar.c(mtPerforationEdge.ordinal())) || (i & 48) == 32) | ((((1879048192 & i) ^ 805306368) > 536870912 && fidVar.b(0.5f)) || (i & 805306368) == 536870912) | ((((57344 & i) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && fidVar.a(true)) || (i & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | ((((458752 & i) ^ ImageMetadata.EDGE_MODE) > 131072 && fidVar.d(n)) || (i & ImageMetadata.EDGE_MODE) == 131072);
        if ((((i & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) <= 2048 || !fidVar.a(z4)) && (i & HProv.ALG_TYPE_SECURECHANNEL) != 2048) {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z6 || Q == did.a) {
            tls tlsVar = new tls() { // from class: k740
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    qam qamVar = (qam) obj;
                    if (z) {
                        float w0 = qamVar.w0(4.5f);
                        float w02 = qamVar.w0(10.0f);
                        float w03 = qamVar.w0(30.0f);
                        int i3 = l740.a[mtPerforationEdge.ordinal()];
                        float f = 0.5f;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            f = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - 0.5f;
                        }
                        float f2 = f;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32);
                        long j = n;
                        qam.z(qamVar, j, w02, floatToRawIntBits, 0.0f, null, 0, 120);
                        qam.z(qamVar, j, w02, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32))) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                        if (z4) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - (w02 * 2.0f);
                            if (intBitsToFloat > 0.0f) {
                                float f3 = 2.0f * w0;
                                int floor = (int) Math.floor((intBitsToFloat + w03) / (w03 + f3));
                                int i4 = floor < 0 ? 0 : floor;
                                if (i4 != 0) {
                                    float f4 = (intBitsToFloat - (i4 * f3)) / (i4 + 1);
                                    float f5 = f3 + f4;
                                    float f6 = w02 + f4 + w0;
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        float f7 = w0;
                                        int i6 = i5;
                                        qam qamVar2 = qamVar;
                                        long j2 = j;
                                        qam.z(qamVar2, j2, f7, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                                        qamVar = qamVar2;
                                        f6 += f5;
                                        i5 = i6 + 1;
                                        w0 = f7;
                                        j = j2;
                                    }
                                }
                            }
                        }
                    }
                    return zy11.a;
                }
            };
            btsVar.o0(tlsVar);
            Q = tlsVar;
        }
        return bb1.g(f530Var, (tls) Q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ahd, dci0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList h(dus0 dus0Var, int i, Integer num) {
        ?? dci0Var = new dci0(dus0Var);
        int q = dus0Var.q(i);
        yss a = dus0Var.a(i);
        while (i >= 0) {
            dci0Var.b(dus0Var.i(i), dus0Var.k(i) ? dus0Var.p(i, dus0Var.b) : did.a, dus0Var.a.m(i), num);
            if (q >= 0) {
                yss yssVar = a;
                a = dus0Var.a(q);
                i = q;
                q = dus0Var.q(q);
                num = yssVar;
            } else {
                i = q;
                num = a;
            }
        }
        return dci0Var.a;
    }
}
