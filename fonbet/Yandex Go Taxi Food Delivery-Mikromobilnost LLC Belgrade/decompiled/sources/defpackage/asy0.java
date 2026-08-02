package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class asy0 {
    public static final long b = eja1.c(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ asy0(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof asy0) && j == ((asy0) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(Extension.FIX_SPACE);
        return oyr.s(sb, (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
