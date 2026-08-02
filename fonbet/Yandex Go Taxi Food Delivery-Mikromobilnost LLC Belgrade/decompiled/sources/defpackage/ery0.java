package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ery0 {
    public final dry0 a;
    public rzx b = null;
    public rzx c;

    public ery0(dry0 dry0Var, rzx rzxVar) {
        this.a = dry0Var;
        this.c = rzxVar;
    }

    public final long a(long j) {
        zii0 zii0Var;
        rzx rzxVar = this.b;
        zii0 zii0Var2 = zii0.e;
        if (rzxVar != null) {
            if (rzxVar.d()) {
                rzx rzxVar2 = this.c;
                zii0Var = rzxVar2 != null ? rzxVar2.j(rzxVar, true) : null;
            } else {
                zii0Var = zii0Var2;
            }
            if (zii0Var != null) {
                zii0Var2 = zii0Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = zii0Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = zii0Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = zii0Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = zii0Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & d));
        dry0 dry0Var = this.a;
        int e = dry0Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= dry0Var.i(e) && Float.intBitsToFloat(i) <= dry0Var.j(e);
    }

    public final long d(long j) {
        rzx rzxVar;
        rzx rzxVar2 = this.b;
        if (rzxVar2 != null) {
            if (!rzxVar2.d()) {
                rzxVar2 = null;
            }
            if (rzxVar2 != null && (rzxVar = this.c) != null) {
                rzx rzxVar3 = rzxVar.d() ? rzxVar : null;
                if (rzxVar3 != null) {
                    return rzxVar2.T(rzxVar3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        rzx rzxVar;
        rzx rzxVar2 = this.b;
        if (rzxVar2 != null) {
            if (!rzxVar2.d()) {
                rzxVar2 = null;
            }
            if (rzxVar2 != null && (rzxVar = this.c) != null) {
                rzx rzxVar3 = rzxVar.d() ? rzxVar : null;
                if (rzxVar3 != null) {
                    return rzxVar3.T(rzxVar2, j);
                }
            }
        }
        return j;
    }
}
