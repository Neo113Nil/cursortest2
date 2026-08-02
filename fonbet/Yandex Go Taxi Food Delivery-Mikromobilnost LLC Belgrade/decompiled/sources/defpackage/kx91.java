package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class kx91 {
    public static mgv a;

    public static final boolean a(zvd0 zvd0Var) {
        return (zvd0Var.j() || zvd0Var.h || !zvd0Var.d) ? false : true;
    }

    public static final boolean b(zvd0 zvd0Var) {
        return !zvd0Var.h && zvd0Var.d;
    }

    public static final boolean c(zvd0 zvd0Var) {
        return (zvd0Var.j() || !zvd0Var.h || zvd0Var.d) ? false : true;
    }

    public static final boolean d(zvd0 zvd0Var) {
        return zvd0Var.h && !zvd0Var.d;
    }

    public static final boolean e(long j, zvd0 zvd0Var) {
        long j2 = zvd0Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i = (int) (j >> 32);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return (intBitsToFloat2 < 0.0f) | (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    public static final boolean f(zvd0 zvd0Var, long j, long j2) {
        int i = zvd0Var.i == 1 ? 1 : 0;
        long j3 = zvd0Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + intBitsToFloat4);
    }

    public static final long g(zvd0 zvd0Var, boolean z) {
        long e = wu60.e(zvd0Var.c, zvd0Var.g);
        if (z || !zvd0Var.j()) {
            return e;
        }
        return 0L;
    }

    public static final boolean h(zvd0 zvd0Var) {
        return !wu60.c(g(zvd0Var, true), 0L);
    }

    public static final f530 i(f530 f530Var, boolean z, zx40 zx40Var, jrv jrvVar, boolean z2, awk0 awk0Var, sls slsVar) {
        f530 k;
        if (jrvVar instanceof prv) {
            k = new cfq0(z, zx40Var, (prv) jrvVar, false, z2, awk0Var, slsVar);
        } else if (jrvVar == null) {
            k = new cfq0(z, zx40Var, null, false, z2, awk0Var, slsVar);
        } else {
            c530 c530Var = c530.a;
            k = zx40Var != null ? lrv.a(c530Var, zx40Var, jrvVar).k(new cfq0(z, zx40Var, null, false, z2, awk0Var, slsVar)) : b.a(c530Var, m.a(), new efq0(jrvVar, z, z2, awk0Var, slsVar, 0));
        }
        return f530Var.k(k);
    }
}
