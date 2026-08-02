package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class ir11 extends gr11 {
    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + fr11.b(hr11.c(str));
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
                if (!fr11.a(hr11.c(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                ny61.g("Illegal contents");
                return null;
            }
        }
        y170.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            ny61.g("Number system must be 0 or 1");
            return null;
        }
        int i = hr11.f[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int b = y170.b(zArr, 0, fr11.a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            b += y170.b(zArr, b, fr11.e[digit2], false);
        }
        y170.b(zArr, b, fr11.c, false);
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.UPC_E);
    }
}
