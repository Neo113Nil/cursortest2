package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class jan extends gr11 {
    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + fr11.b(str);
            } catch (FormatException e) {
                yci0.r(e);
                return null;
            }
        } else {
            if (length != 13) {
                ny61.g(oyr.i(length, "Requested contents should be 12 or 13 digits long, but got "));
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
        int i = ian.f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b = y170.b(zArr, 0, fr11.a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b += y170.b(zArr, b, fr11.e[digit], false);
        }
        int b2 = y170.b(zArr, b, fr11.b, false) + b;
        for (int i3 = 7; i3 <= 12; i3++) {
            b2 += y170.b(zArr, b2, fr11.d[Character.digit(str.charAt(i3), 10)], true);
        }
        y170.b(zArr, b2, fr11.a, true);
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.EAN_13);
    }
}
