package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ior {
    public final long a;

    public static long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String b(long j) {
        return Extension.O_BRAKE + Float.intBitsToFloat((int) (j >> 32)) + Extension.FIX_SPACE + Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ior) {
            return this.a == ((ior) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
