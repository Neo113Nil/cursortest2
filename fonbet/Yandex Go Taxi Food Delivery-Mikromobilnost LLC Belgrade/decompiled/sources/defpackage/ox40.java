package defpackage;

import android.graphics.Matrix;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ox40 extends jdf {
    public ox40() {
        super(0);
    }

    public final void f(krl0 krl0Var, int i) {
        float[] fArr = this.a;
        float f = fArr[i];
        int i2 = i + 1;
        float f2 = fArr[i2];
        float[] fArr2 = (float[]) krl0Var.a;
        fArr2[0] = f;
        fArr2[1] = f2;
        ((Matrix) krl0Var.b).mapPoints(fArr2);
        long a = ior.a(fArr2[0], fArr2[1]);
        fArr[i] = Float.intBitsToFloat((int) (a >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & a));
    }
}
