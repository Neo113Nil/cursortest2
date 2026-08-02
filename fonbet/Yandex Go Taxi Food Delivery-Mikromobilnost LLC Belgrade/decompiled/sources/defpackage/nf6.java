package defpackage;

import androidx.compose.ui.node.s;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class nf6 extends e530 implements ejt {
    public wg6 a;
    public lx40 b;
    public to5 c;

    @Override // defpackage.ejt
    public final void g(s sVar) {
        rzx rzxVar = this.a.D;
        if (rzxVar == null) {
            return;
        }
        lx40 lx40Var = this.b;
        float a = this.c.a(0, (int) (sVar.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        lx40Var.a(Float.intBitsToFloat((int) (rzxVar.T(sVar, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }
}
