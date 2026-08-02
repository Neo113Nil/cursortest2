package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final class l0j0 implements l3y {
    public final /* synthetic */ n6y a;
    public final /* synthetic */ Orientation b;

    public l0j0(n6y n6yVar, Orientation orientation) {
        this.a = n6yVar;
        this.b = orientation;
    }

    public final int a() {
        return ((t6y) this.a).a;
    }

    public final long b() {
        int i = ((t6y) this.a).o;
        int i2 = vw21.a[this.b.ordinal()];
        if (i2 == 1) {
            return i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        }
        if (i2 == 2) {
            return i << 32;
        }
        w511.b();
        return 0L;
    }

    public final long c() {
        int i = ((t6y) this.a).p;
        int i2 = vw21.a[this.b.ordinal()];
        if (i2 == 1) {
            return i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        }
        if (i2 == 2) {
            return i << 32;
        }
        w511.b();
        return 0L;
    }
}
