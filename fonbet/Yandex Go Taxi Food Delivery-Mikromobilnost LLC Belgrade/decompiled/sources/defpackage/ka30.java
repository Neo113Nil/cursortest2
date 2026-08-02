package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ka30 {
    public final long a;

    public /* synthetic */ ka30(long j) {
        this.a = j;
    }

    public static final /* synthetic */ ka30 a(long j) {
        return new ka30(j);
    }

    public static long b(long j, long j2) {
        short intBitsToFloat = (short) Float.intBitsToFloat((int) (j2 >> 32));
        return ((j & 2147483647L) << 1) | 1 | (((((short) Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & 65535) | (intBitsToFloat << 16)) << 32);
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public static final long d(long j) {
        int i = (int) (j >>> 32);
        return (Float.floatToRawIntBits((short) (i & 65535)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits((short) (i >>> 16)) << 32);
    }

    public static final long e(long j) {
        return (j >> 1) & 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ka30) {
            return this.a == ((ka30) obj).a;
        }
        return false;
    }

    public final /* synthetic */ long f() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ')';
    }
}
