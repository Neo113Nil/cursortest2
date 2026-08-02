package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class mt1 implements u9e0 {
    public final long a;

    public mt1(int i) {
        this.a = i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        uo5 uo5Var = x4c.c;
        long a = uo5Var.a(0L, (f6wVar.d() << 32) | (f6wVar.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), layoutDirection);
        long a2 = uo5Var.a(0L, j2, layoutDirection);
        long j3 = ((-((int) (a2 >> 32))) << 32) | ((-((int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long j4 = this.a;
        return z5w.c(z5w.c(a, j3), ((((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }
}
