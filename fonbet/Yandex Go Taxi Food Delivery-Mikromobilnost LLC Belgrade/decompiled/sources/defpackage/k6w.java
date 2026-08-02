package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class k6w {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k6w) {
            return this.a == ((k6w) obj).a;
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
