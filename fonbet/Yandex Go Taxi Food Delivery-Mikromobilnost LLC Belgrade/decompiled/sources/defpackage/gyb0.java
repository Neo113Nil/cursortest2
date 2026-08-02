package defpackage;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.Path$Direction;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public abstract class gyb0 {
    public static final jb2 a;

    static {
        jb2 a2 = nb2.a();
        zr90 zr90Var = new zr90();
        ArrayList arrayList = zr90Var.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            zr90Var.a = arrayList;
        } else {
            arrayList.clear();
        }
        zr90Var.a("M 8 5.333 L 7.719 4.77 C 7.551 4.434 7.466 4.266 7.382 4.114 C 6.031 1.684 3.515 0.129 0.737 0.008 C 0.563 0 0.376 0 0 0 H 16 C 15.624 0 15.437 0 15.263 0.008 C 12.485 0.129 9.969 1.684 8.618 4.114 C 8.534 4.266 8.449 4.434 8.281 4.77 L 8 5.333 Z", arrayList);
        ArrayList arrayList2 = zr90Var.a;
        if (arrayList2 != null) {
            r891.g(arrayList2, a2);
        } else {
            nb2.a();
        }
        a = a2;
    }

    public static jb2 a(float f, float f2, float f3, boolean z) {
        float min = Math.min(f, f2);
        float f4 = uvb0.a;
        float f5 = (f4 * min) / (f3 + f4);
        float f6 = (min - f5) * 0.3f;
        long floatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        jb2 a2 = nb2.a();
        float f7 = f5 / 2.0f;
        a2.f(ora1.c(f7, 0.0f, f - f7, f2 - f5, floatToRawIntBits), Path$Direction.CounterClockwise);
        if (!z) {
            return a2;
        }
        jb2 a3 = nb2.a();
        a3.d(a);
        zii0 i = a3.i();
        float f8 = f5 / (i.d - i.b);
        float[] a4 = n810.a();
        n810.e(a4, f8, f8);
        if (a3.d == null) {
            a3.d = new Matrix();
        }
        gtq0.M(a3.d, a4);
        a3.a.transform(a3.d);
        float intBitsToFloat = Float.intBitsToFloat((int) (a2.i().c() >> 32)) - Float.intBitsToFloat((int) (a3.i().c() >> 32));
        zii0 i2 = a2.i();
        float f9 = i2.d - i2.b;
        a3.r((Float.floatToRawIntBits(f9) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        jb2 a5 = nb2.a();
        a5.n(a2, a3, 2);
        return a5;
    }
}
