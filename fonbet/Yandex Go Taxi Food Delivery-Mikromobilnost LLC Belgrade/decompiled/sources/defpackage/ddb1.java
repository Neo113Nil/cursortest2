package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.compose.foundation.gestures.Orientation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class ddb1 {
    public static final int a(byte[] bArr) {
        int length = bArr.length;
        if (1 > length || length >= 5) {
            ny61.g(oyr.i(length, "Length must be between 1 and 4. Length = "));
            return 0;
        }
        if (bArr.length < length) {
            ny61.g("Length or startPos not valid");
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (bArr[i2] & 255) << (((length - i2) - 1) * 8);
        }
        return i;
    }

    public static final byte[] b(String str) {
        int i = 0;
        String v = cvu0.v(str, " ", "", false);
        if (v.length() % 2 != 0) {
            ny61.g("Hex binary needs to be even-length :".concat(str));
            return null;
        }
        byte[] bArr = new byte[m810.b(v.length() / 2.0f)];
        int i2 = 0;
        while (i < v.length()) {
            int i3 = i + 2;
            String substring = v.substring(i, i3);
            rza.a(16);
            bArr[i2] = (byte) Integer.parseInt(substring, 16);
            i = i3;
            i2++;
        }
        return bArr;
    }

    public static final boolean c(byte b, int i) {
        if (i >= 0 && i < 32) {
            return (b & (1 << i)) != 0;
        }
        ny61.g(oyr.i(i, "parameter 'pBitIndex' must be between 0 and 31. pBitIndex="));
        return false;
    }

    public static final int d(a4y a4yVar, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? ((j4y) a4yVar).t & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : ((j4y) a4yVar).t >> 32);
    }

    public static final float e(Context context) {
        Display defaultDisplay;
        WindowMetrics currentWindowMetrics;
        float density;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 34) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            density = currentWindowMetrics.getDensity();
            return density;
        }
        if (jx81.d()) {
            defaultDisplay = context.getDisplay();
            if (defaultDisplay == null) {
                ny61.r("Context is not associated with a Display!");
                return 0.0f;
            }
        } else {
            defaultDisplay = windowManager.getDefaultDisplay();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static final byte f(byte b, int i) {
        if (i >= 0 && i < 8) {
            return (byte) (b | (1 << i));
        }
        ny61.g(oyr.i(i, "parameter 'pBitIndex' must be between 0 and 7. pBitIndex="));
        return (byte) 0;
    }
}
