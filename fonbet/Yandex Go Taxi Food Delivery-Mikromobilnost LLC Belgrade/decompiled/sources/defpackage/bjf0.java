package defpackage;

import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class bjf0 {
    static {
        ldf ldfVar = cb30.b;
    }

    public static final void a(final sls slsVar, final f530 f530Var, final long j, final float f, final long j2, float f2, fid fidVar, final int i) {
        int i2;
        final float f3;
        final float f4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1798883595);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.b(f) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.d(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.c(1) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (btsVar.V(i3 & 1, (599187 & i3) != 599186)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f4 = 4.0f;
            } else {
                btsVar.Y();
                f4 = f2;
            }
            btsVar.u();
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (z || Q == obj) {
                Q = new zvr(23, slsVar);
                btsVar.o0(Q);
            }
            final sls slsVar2 = (sls) Q;
            final jvu0 jvu0Var = new jvu0(1, 0, 26, ((fwi) btsVar.m(j.h)).w0(f), 0.0f);
            boolean k = btsVar.k(slsVar2);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new e350(10, slsVar2);
                btsVar.o0(Q2);
            }
            f530 m = ljs0.m(fnq0.b(f530Var, true, (tls) Q2), 40.0f);
            boolean k2 = ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | btsVar.k(slsVar2) | ((3670016 & i3) == 1048576) | ((i3 & 7168) == 2048) | ((((57344 & i3) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.d(j2)) || (i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | btsVar.e(jvu0Var) | ((((i3 & 896) ^ 384) > 256 && btsVar.d(j)) || (i3 & 384) == 256);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj) {
                Object obj2 = new tls() { // from class: xif0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        qam qamVar = (qam) obj3;
                        float floatValue = ((Number) sls.this.invoke()).floatValue() * 360.0f;
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                        float f5 = f4;
                        if (intBitsToFloat <= intBitsToFloat2) {
                            f5 += f;
                        }
                        float I = (f5 / ((float) (qamVar.I(Float.intBitsToFloat((int) (qamVar.c() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float min = Math.min(floatValue, I) + 270.0f + floatValue;
                        float min2 = (360.0f - floatValue) - (Math.min(floatValue, I) * 2.0f);
                        long j3 = j2;
                        jvu0 jvu0Var2 = jvu0Var;
                        bjf0.b(qamVar, min, min2, j3, jvu0Var2);
                        bjf0.b(qamVar, 270.0f, floatValue, j, jvu0Var2);
                        return zy11.a;
                    }
                };
                btsVar.o0(obj2);
                Q3 = obj2;
            }
            qeb1.a(0, btsVar, (tls) Q3, m);
            f3 = f4;
        } else {
            btsVar.Y();
            f3 = f2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: yif0
                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    bjf0.a(sls.this, f530Var, j, f, j2, f3, (fid) obj3, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(qam qamVar, float f, float f2, long j, jvu0 jvu0Var) {
        float f3 = jvu0Var.a / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - (2.0f * f3);
        qamVar.F(j, f, f2, false, (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3) << 32), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
    }
}
