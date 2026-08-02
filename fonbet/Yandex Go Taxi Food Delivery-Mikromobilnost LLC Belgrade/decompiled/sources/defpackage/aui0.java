package defpackage;

import androidx.compose.ui.graphics.vector.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class aui0 extends pa90 {
    public final /* synthetic */ float A;
    public final /* synthetic */ b B;
    public final /* synthetic */ wec C;
    public final long y;
    public final /* synthetic */ long z;

    public aui0(float f, long j, float f2, b bVar, wec wecVar) {
        this.z = j;
        this.A = f2;
        this.B = bVar;
        this.C = wecVar;
        this.y = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.pa90
    public final long i() {
        return this.y;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        qam.t0(qamVar, this.z, 0L, qamVar.c(), 0.0f, null, 122);
        long c = qamVar.c();
        float intBitsToFloat = Float.intBitsToFloat((int) (c >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * this.A;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat * r5) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) / 2.0f;
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        b bVar = this.B;
        wec wecVar = this.C;
        ((cot) qamVar.N().a).n(intBitsToFloat3, intBitsToFloat4);
        try {
            pa90.h(bVar, qamVar, floatToRawIntBits, wecVar, 2);
        } finally {
            ((cot) qamVar.N().a).n(-intBitsToFloat3, -intBitsToFloat4);
        }
    }
}
