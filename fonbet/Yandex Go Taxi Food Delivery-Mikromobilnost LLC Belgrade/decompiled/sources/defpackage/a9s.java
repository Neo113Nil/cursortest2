package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class a9s implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a9s(Object obj, double d, int i) {
        this.a = i;
        this.c = obj;
        this.b = d;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        float f;
        long j;
        long j2;
        int i = this.a;
        double d = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                xdf xdfVar = (xdf) obj2;
                String str = (String) obj;
                if (str.length() <= 0) {
                    return str;
                }
                fef fefVar = new fef(null, null, str, null);
                xdfVar.getClass();
                return xdfVar.c(fefVar, zdf.a().format(d), true);
            default:
                rg90 rg90Var = (rg90) obj2;
                qam qamVar = (qam) obj;
                long j3 = rg90Var.a;
                long j4 = rg90Var.b;
                int i2 = rg90Var.c;
                int i3 = shf0.a[rg90Var.d.ordinal()];
                if (i3 == 1) {
                    f = 32.0f;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    f = 0.0f;
                }
                float w0 = qamVar.w0(rg90Var.e);
                float f2 = i2;
                float intBitsToFloat = (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - ((i2 - 1) * w0)) / f2;
                float f3 = w0 + intBitsToFloat;
                float f4 = ((float) d) * f2 * intBitsToFloat;
                int i4 = 0;
                while (i4 < i2) {
                    float f5 = i4;
                    float f6 = f5 * f3;
                    u7a1.g(qamVar, j3, f6, intBitsToFloat, f);
                    long j5 = j3;
                    float f7 = f4 - (f5 * intBitsToFloat);
                    if (f7 > 0.0f) {
                        float min = Math.min(f7, intBitsToFloat);
                        if (min > 0.0f) {
                            float f8 = f6 + min;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            nfh N = qamVar.N();
                            long v = N.v();
                            N.q().save();
                            try {
                                ((cot) N.a).f(f6, 0.0f, f8, intBitsToFloat2, 1);
                                long j6 = j4;
                                j2 = v;
                                j = j6;
                                try {
                                    u7a1.g(qamVar, j, f6, intBitsToFloat, f);
                                    b64.C(N, j2);
                                    i4++;
                                    j4 = j;
                                    j3 = j5;
                                } catch (Throwable th) {
                                    th = th;
                                    b64.C(N, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = v;
                            }
                        }
                    }
                    j = j4;
                    i4++;
                    j4 = j;
                    j3 = j5;
                }
                return zy11.a;
        }
    }
}
