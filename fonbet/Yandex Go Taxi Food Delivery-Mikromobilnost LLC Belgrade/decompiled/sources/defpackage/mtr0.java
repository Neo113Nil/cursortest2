package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class mtr0 {
    public final float a;
    public final eur0 b;
    public final boolean c;
    public final fwi d;
    public zii0 e = zii0.e;

    public mtr0(float f, eur0 eur0Var, boolean z, fwi fwiVar) {
        this.a = f;
        this.b = eur0Var;
        this.c = z;
        this.d = fwiVar;
    }

    public final void a(rzx rzxVar, dur0 dur0Var) {
        long m = rzxVar.m(0L);
        long e = rzxVar.e();
        float f = (int) (e >> 32);
        float f2 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long m2 = rzxVar.m((Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32));
        int i = (int) (m >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (m2 >> 32)) - Float.intBitsToFloat(i);
        this.e = new zii0(0.0f, 0.0f, intBitsToFloat, Float.intBitsToFloat((int) (m2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (m & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        boolean z = this.c;
        eur0 eur0Var = this.b;
        fwi fwiVar = this.d;
        if (z) {
            float w0 = fwiVar.w0(this.a);
            float a = eur0Var.a(w0, fwiVar);
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            dur0Var.d = a;
            dur0Var.e = w0;
            dur0Var.f = intBitsToFloat2;
            return;
        }
        float a2 = eur0Var.a(intBitsToFloat - 0.0f, fwiVar);
        zii0 zii0Var = this.e;
        float f3 = zii0Var.c - zii0Var.a;
        dur0Var.d = a2;
        dur0Var.e = f3;
        dur0Var.f = 0.0f;
    }
}
