package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class b0z0 {
    public a0z0 b;
    public long f;
    public float[] g;
    public final wx40 a = y5w.a();
    public long c = -1;
    public long d = 0;
    public long e = 0;

    public final void a(a0z0 a0z0Var, long j, long j2, float[] fArr, long j3) {
        long j4 = a0z0Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            a0z0Var.g = j3;
            a0z0Var.a(a0z0Var.e, a0z0Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (z5w.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!z5w.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
