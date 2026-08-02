package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class dur0 {
    public final boolean a;
    public final LinearGradient b;
    public final Matrix c;
    public float d;
    public float e;
    public float f;

    public dur0(List list, boolean z) {
        List g = scc.g(Float.valueOf(0.0f), Float.valueOf(0.5f), Float.valueOf(1.0f));
        this.a = z;
        this.b = xab1.b((Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32), (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), list, g, 0);
        this.c = new Matrix();
    }

    public final void a(float f) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postScale(this.d, 1.0f);
        if (this.a) {
            f = 1.0f - f;
        }
        float f2 = this.d;
        matrix.postTranslate((((this.e + f2) * f) + (-f2)) - this.f, 0.0f);
        this.b.setLocalMatrix(matrix);
    }
}
