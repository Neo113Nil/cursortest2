package defpackage;

import androidx.compose.ui.node.a;
import androidx.compose.ui.node.s;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class koz extends a {
    @Override // androidx.compose.ui.node.a
    public final long b(s sVar, long j) {
        long j2 = sVar.Z0().J;
        float f = (int) (j2 >> 32);
        float f2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return wu60.f((Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32), j);
    }

    @Override // androidx.compose.ui.node.a
    public final Map c(s sVar) {
        return sVar.Z0().J0().b();
    }

    @Override // androidx.compose.ui.node.a
    public final int d(s sVar, kt1 kt1Var) {
        return sVar.Z0().u(kt1Var);
    }
}
