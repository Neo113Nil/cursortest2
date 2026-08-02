package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class nt1 implements u9e0 {
    public final jt1 a;
    public final long b;

    public nt1(jt1 jt1Var, long j) {
        this.a = jt1Var;
        this.b = j;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        long a = this.a.a(0L, (f6wVar.d() << 32) | (f6wVar.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), layoutDirection);
        long a2 = this.a.a(0L, j2, layoutDirection);
        return z5w.c(z5w.c(z5w.c(f6wVar.c(), a), ((-((int) (a2 >> 32))) << 32) | ((-((int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (((int) (r8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((((int) (this.b >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32));
    }
}
