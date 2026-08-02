package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class gzz0 {
    public Orientation a;
    public long b;

    public /* synthetic */ gzz0(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
    }

    public final long a(float f, long j, boolean z) {
        long f2;
        long j2 = this.b;
        if (z) {
            f2 = wu60.f(j2, j);
            this.b = f2;
        } else {
            f2 = wu60.f(j2, j);
        }
        if ((this.a == null ? wu60.d(f2) : Math.abs(b(f2))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = this.a;
        long j3 = this.b;
        if (orientation == null) {
            return wu60.e(this.b, wu60.g(f, wu60.b(wu60.d(j3), j3)));
        }
        float b = b(j3) - (Math.signum(b(this.b)) * f);
        long j4 = this.b;
        Orientation orientation2 = this.a;
        Orientation orientation3 = Orientation.Horizontal;
        float intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : j4 >> 32));
        if (this.a != orientation3) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(b) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == Orientation.Horizontal ? j >> 32 : j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public gzz0(long j, Orientation orientation) {
        this.a = orientation;
        this.b = j;
    }
}
