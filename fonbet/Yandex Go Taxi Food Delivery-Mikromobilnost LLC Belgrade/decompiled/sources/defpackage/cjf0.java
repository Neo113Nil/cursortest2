package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class cjf0 {
    public static final ldf a;

    static {
        new ldf(0.2f, 0.0f, 0.8f, 1.0f);
        new ldf(0.4f, 0.0f, 1.0f, 1.0f);
        new ldf(0.0f, 0.0f, 0.65f, 1.0f);
        new ldf(0.1f, 0.0f, 0.45f, 1.0f);
        a = new ldf(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void a(final float f, final f530 f530Var, final long j, final float f2, long j2, fid fidVar, final int i) {
        int i2;
        final long j3;
        long j4;
        int i3;
        Object ajf0Var;
        f530 f530Var2;
        long j5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1746618448);
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
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
            i2 |= btsVar.b(f2) ? 2048 : 1024;
        }
        int i4 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                j4 = ldc.l;
                i3 = i4 & (-458753);
            } else {
                btsVar.Y();
                i3 = i4 & (-458753);
                j4 = j2;
            }
            btsVar.u();
            float f3 = f < 0.0f ? 0.0f : f;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            jvu0 jvu0Var = new jvu0(0, 0, 26, ((fwi) btsVar.m(j.h)).w0(f2), 0.0f);
            Float valueOf = Float.valueOf(f3);
            if (Float.isNaN(f3)) {
                valueOf = null;
            }
            f530 m = ljs0.m(b9a1.d(f530Var, valueOf != null ? valueOf.floatValue() : 0.0f), 40.0f);
            boolean b = ((i3 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.b(f3) | btsVar.e(jvu0Var) | ((((i3 & 896) ^ 384) > 256 && btsVar.d(j)) || (i3 & 384) == 256);
            Object Q = btsVar.Q();
            if (b || Q == did.a) {
                f530Var2 = m;
                j5 = j4;
                ajf0Var = new ajf0(f3, j5, jvu0Var, j);
                btsVar.o0(ajf0Var);
            } else {
                f530Var2 = m;
                ajf0Var = Q;
                j5 = j4;
            }
            qeb1.a(0, btsVar, (tls) ajf0Var, f530Var2);
            j3 = j5;
        } else {
            btsVar.Y();
            j3 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: wif0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cjf0.a(f, f530Var, j, f2, j3, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(float f, int i, int i2, long j, long j2, fid fidVar, f530 f530Var) {
        float f2;
        int i3;
        long j3;
        f530 f530Var2;
        float f3;
        int i4;
        int i5;
        f530 f530Var3;
        long j4;
        long j5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1119119072);
        int i6 = i2 | 6 | (btsVar.d(j) ? 32 : 16) | 11648;
        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
            btsVar.a0();
            if ((i2 & 1) == 0 || btsVar.C()) {
                long j6 = ldc.l;
                f3 = 4.0f;
                i4 = i6 & (-57345);
                i5 = 2;
                f530Var3 = c530.a;
                j4 = j6;
            } else {
                btsVar.Y();
                f3 = f;
                i5 = i;
                f530Var3 = f530Var;
                i4 = i6 & (-57345);
                j4 = j2;
            }
            btsVar.u();
            jvu0 jvu0Var = new jvu0(i5, 0, 26, ((fwi) btsVar.m(j.h)).w0(f3), 0.0f);
            float f4 = f3;
            c g = z5b1.g(null, btsVar, 1);
            gl11 gl11Var = gtq0.g;
            tbn tbnVar = ubn.d;
            f530 f530Var4 = f530Var3;
            long j7 = j4;
            osv e = z5b1.e(g, 0, 5, gl11Var, sb2.w(sb2.K(6660, 0, tbnVar, 2), null, 0L, 6), null, btsVar, 33208, 16);
            btsVar = btsVar;
            osv d = z5b1.d(g, 0.0f, 286.0f, sb2.w(sb2.K(1332, 0, tbnVar, 2), null, 0L, 6), null, btsVar, 4536, 8);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new gdf0(12);
                btsVar.o0(Q);
            }
            osv d2 = z5b1.d(g, 0.0f, 290.0f, sb2.w(sb2.y((tls) Q), null, 0L, 6), null, btsVar, 4536, 8);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new gdf0(13);
                btsVar.o0(Q2);
            }
            osv d3 = z5b1.d(g, 0.0f, 290.0f, sb2.w(sb2.y((tls) Q2), null, 0L, 6), null, btsVar, 4536, 8);
            f530 m = ljs0.m(fnq0.b(f530Var4, true, new gdf0(15)), 40.0f);
            boolean e2 = btsVar.e(jvu0Var) | btsVar.k(e) | btsVar.k(d2) | btsVar.k(d3) | btsVar.k(d) | ((((i4 & 112) ^ 48) > 32 && btsVar.d(j)) || (i4 & 48) == 32);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                j5 = j7;
                nj20 nj20Var = new nj20(j5, jvu0Var, f4, j, e, d2, d3, d);
                btsVar.o0(nj20Var);
                Q3 = nj20Var;
            } else {
                j5 = j7;
            }
            qeb1.a(0, btsVar, (tls) Q3, m);
            j3 = j5;
            f530Var2 = f530Var4;
            f2 = f4;
            i3 = i5;
        } else {
            btsVar.Y();
            f2 = f;
            i3 = i;
            j3 = j2;
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zif0(f2, i3, i2, j, j3, f530Var2);
        }
    }

    public static final void c(float f, int i, long j, long j2, fid fidVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-531984864);
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
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
            i2 |= btsVar.d(j2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= 8192;
        }
        boolean z = true;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            int i3 = i2 & (-57345);
            btsVar.u();
            float f2 = f < 0.0f ? 0.0f : f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f530 m = an91.m(fnq0.b(kp50.F(f530Var, new sed(29)), true, new gdf0(14)), 0.0f, 10.0f, 1);
            Float valueOf = Float.valueOf(f2);
            if (Float.isNaN(f2)) {
                valueOf = null;
            }
            f530 n = ljs0.n(b9a1.d(m, valueOf != null ? valueOf.floatValue() : 0.0f), 240.0f, 4.0f);
            boolean c = ((((i3 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j2)) || (i3 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | btsVar.c(0) | btsVar.b(f2);
            if ((((i3 & 896) ^ 384) <= 256 || !btsVar.d(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z2 = c | z;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                kib kibVar = new kib(j2, f2, j);
                btsVar.o0(kibVar);
                Q = kibVar;
            }
            qeb1.a(0, btsVar, (tls) Q, n);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zif0(f, i, j, j2, f530Var);
        }
    }

    public static final void d(qam qamVar, float f, float f2, long j, jvu0 jvu0Var) {
        float f3 = jvu0Var.a / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - (2.0f * f3);
        qamVar.F(j, f, f2, false, (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3) << 32), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
    }

    public static final void e(qam qamVar, float f, long j, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
        boolean z = qamVar.getLayoutDirection() == LayoutDirection.Ltr;
        float f3 = (z ? 0.0f : 1.0f - f) * intBitsToFloat;
        qamVar.h(j, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits((z ? f : 1.0f) * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), f2, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
    }
}
