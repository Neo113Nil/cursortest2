package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class kan extends gr11 {
    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + fr11.b(str);
            } catch (FormatException e) {
                yci0.r(e);
                return null;
            }
        } else {
            if (length != 8) {
                ny61.g(oyr.i(length, "Requested contents should be 7 or 8 digits long, but got "));
                return null;
            }
            try {
                if (!fr11.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                ny61.g("Illegal contents");
                return null;
            }
        }
        y170.c(str);
        boolean[] zArr = new boolean[67];
        int b = y170.b(zArr, 0, fr11.a, true);
        for (int i = 0; i <= 3; i++) {
            b += y170.b(zArr, b, fr11.d[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = y170.b(zArr, b, fr11.b, false) + b;
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += y170.b(zArr, b2, fr11.d[Character.digit(str.charAt(i2), 10)], true);
        }
        y170.b(zArr, b2, fr11.a, true);
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.EAN_8);
    }
}
