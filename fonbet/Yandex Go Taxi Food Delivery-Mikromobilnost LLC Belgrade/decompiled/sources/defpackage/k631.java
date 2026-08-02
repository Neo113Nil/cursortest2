package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class k631 {
    public final long a;

    public /* synthetic */ k631(long j) {
        this.a = j;
    }

    public static final /* synthetic */ k631 a(long j) {
        return new k631(j);
    }

    public static long b(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final long e(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final long f(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long g(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String h(long j) {
        return Extension.O_BRAKE + c(j) + Extension.FIX_SPACE + d(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k631) {
            return this.a == ((k631) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final /* synthetic */ long i() {
        return this.a;
    }

    public final String toString() {
        return h(this.a);
    }
}
