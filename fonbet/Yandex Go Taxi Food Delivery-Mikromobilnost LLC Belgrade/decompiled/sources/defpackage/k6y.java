package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class k6y implements g5y {
    public final b a;

    public k6y(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.g5y
    public final int a() {
        int i;
        b bVar = this.a;
        if (bVar.j().k.isEmpty()) {
            return 0;
        }
        s6y j = bVar.j();
        int e = (int) (j.o == Orientation.Vertical ? j.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : j.e() >> 32);
        int e2 = ndb1.e(bVar.j());
        if (e2 != 0 && (i = e / e2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.g5y
    public final int b() {
        return Math.max(0, this.a.h());
    }

    @Override // defpackage.g5y
    public final boolean c() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.g5y
    public final int d() {
        return Math.min(getItemCount() - 1, ((t6y) ((n6y) a.Z(this.a.j().k))).a);
    }

    @Override // defpackage.g5y
    public final int getItemCount() {
        return this.a.j().n;
    }
}
