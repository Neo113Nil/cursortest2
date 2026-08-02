package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes8.dex */
public final class jq4 {
    public static Bitmap a(Context context, String str, Integer num, Integer num2, boolean z) {
        if (str == null || !cvu0.x(str, "data:", false) || evu0.H(str, "base64,", 0, false, 6) <= 0) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(evu0.G(str, HexString.CHAR_COMMA, 0, 6) + 1), 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (z) {
                return Bitmap.createScaledBitmap(decodeByteArray, num != null ? num.intValue() : tje.u(36, context), num2 != null ? num2.intValue() : tje.u(24, context), true);
            }
            return Bitmap.createScaledBitmap(decodeByteArray, num != null ? num.intValue() : tje.u(40, context), num2 != null ? num2.intValue() : tje.u(40, context), true);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
