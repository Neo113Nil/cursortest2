package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.e;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class dam extends e530 implements v0y {
    public e a;
    public wls b;
    public Orientation c;
    public boolean w;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        o l0 = x910Var.l0(j);
        if (!kVar.d0() || !this.w) {
            Pair pair = (Pair) this.b.invoke(new k6w((l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (l0.a << 32)), new n8e(j));
            this.a.k((lah) pair.c(), pair.f());
        }
        this.w = kVar.d0() || this.w;
        return kVar.w(l0.a, l0.b, b.f(), new f89(26, kVar, this, l0));
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.w = false;
    }
}
