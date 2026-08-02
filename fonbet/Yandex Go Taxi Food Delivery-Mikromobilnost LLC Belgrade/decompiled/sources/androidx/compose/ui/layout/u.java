package androidx.compose.ui.layout;

import defpackage.rzx;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class u extends r {
    public u() {
        super(null);
    }

    @Override // androidx.compose.ui.layout.r
    public final float a(float f, rzx rzxVar, rzx rzxVar2) {
        float e = ((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
        return Float.intBitsToFloat((int) (rzxVar2.T(rzxVar, (Float.floatToRawIntBits(e) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32)) >> 32));
    }
}
