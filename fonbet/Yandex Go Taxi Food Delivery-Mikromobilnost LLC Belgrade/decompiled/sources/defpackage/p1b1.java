package defpackage;

import android.os.Build;
import androidx.compose.runtime.f;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class p1b1 {
    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static boolean d(int i) {
        return (i & 32768) != 0;
    }

    public static boolean e(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        return i != 32768 ? i != 32783 ? i == 33023 || i == 0 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
    }

    public static final m3u0 f(oip0 oip0Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = f.d(new is6(oip0Var, 5));
            btsVar.o0(Q);
        }
        return (m3u0) Q;
    }
}
