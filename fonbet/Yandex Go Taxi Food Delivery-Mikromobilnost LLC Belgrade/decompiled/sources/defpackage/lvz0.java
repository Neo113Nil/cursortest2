package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class lvz0 implements u9e0 {
    public final int a;
    public final long b;

    public lvz0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int c = x4e.c(f6wVar.d(), i, 2, f6wVar.a);
        long j3 = this.b;
        if (c < 0) {
            int i2 = f6wVar.a;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            c = i2 - (i3 >= 0 ? i3 : 0);
        } else if (c + i > ((int) (j3 >> 32)) && (c = f6wVar.c - i) < 0) {
            c = 0;
        }
        int i4 = f6wVar.b - ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i5 = this.a;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = f6wVar.d + i5;
        }
        return (c << 32) | (i6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }
}
