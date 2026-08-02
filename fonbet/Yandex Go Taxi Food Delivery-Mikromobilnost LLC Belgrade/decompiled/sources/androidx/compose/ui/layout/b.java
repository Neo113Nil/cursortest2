package androidx.compose.ui.layout;

import defpackage.rzx;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class b extends r {
    public b() {
        super(null);
    }

    @Override // androidx.compose.ui.layout.r
    public final float a(float f, rzx rzxVar, rzx rzxVar2) {
        return Float.intBitsToFloat((int) (rzxVar2.T(rzxVar, (Float.floatToRawIntBits(((int) (rzxVar.e() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }
}
