package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class oif implements u9e0 {
    public final long a;
    public final int[] b;
    public final uo5 c;
    public final long w;

    public oif(long j, int[] iArr, uo5 uo5Var, long j2) {
        this.a = j;
        this.b = iArr;
        this.c = uo5Var;
        this.w = j2;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        long d = (f6wVar.d() << 32) | (f6wVar.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        uo5 uo5Var = this.c;
        long a = uo5Var.a(0L, d, layoutDirection);
        long a2 = uo5Var.a(0L, (((int) (j2 >> 32)) << 32) | (((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), layoutDirection);
        int i = this.b[0];
        long j3 = this.a;
        long b = z5w.b(z5w.c(z5w.c(0L, ((i + ((int) Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | ((r9[1] + ((int) Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), a), (((int) (a2 >> 32)) << 32) | (((int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long j4 = this.w;
        return z5w.c(b, ((((int) (j4 >> 32)) * (layoutDirection != LayoutDirection.Ltr ? -1 : 1)) << 32) | (((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }
}
