package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a8m {
    public final long a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return Extension.O_BRAKE + ((Object) y7m.c(Float.intBitsToFloat((int) (j >> 32)))) + Extension.FIX_SPACE + ((Object) y7m.c(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a8m) {
            return this.a == ((a8m) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
