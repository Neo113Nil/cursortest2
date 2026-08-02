package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.d;
import java.util.Locale;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public abstract class dr31 {
    public static final jh6 a = new jh6();

    public static final float a(d dVar) {
        return dVar.n().e == Orientation.Horizontal ? Float.intBitsToFloat((int) (dVar.r() >> 32)) : Float.intBitsToFloat((int) (dVar.r() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final boolean b(d dVar, float f) {
        dVar.n().getClass();
        return !(((dVar.s() ? -f : a(dVar)) > 0.0f ? 1 : ((dVar.s() ? -f : a(dVar)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final void c(int i) {
        throw new SerializationException(oyr.i(i, "An unknown field for index "));
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (evu0.z("!#$&'\"()*+,/:;=?@[]{}% ", charAt)) {
                rza.a(16);
                sb.append("%".concat(Integer.toString(charAt, 16)).toUpperCase(Locale.ROOT));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
