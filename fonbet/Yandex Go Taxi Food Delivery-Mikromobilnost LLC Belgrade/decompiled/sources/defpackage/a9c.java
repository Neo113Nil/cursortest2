package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class a9c extends y170 {
    public static void h(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
    }

    public static int i(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) (charAt + '&'));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) (charAt + HexString.CHAR_SPACE));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) (charAt - ' '));
            } else {
                if (charAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                }
                sb.append('b');
                sb.append((char) (charAt - '+'));
            }
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        if (length2 > 80) {
            ny61.g(oyr.i(length2, "Requested contents should be less than 80 digits long after converting to extended encoding, but got "));
            return null;
        }
        int i2 = 9;
        boolean[] zArr = new boolean[((sb2.length() + 4) * 9) + 1];
        h(zArr, 0, z8c.b);
        for (int i3 = 0; i3 < length2; i3++) {
            h(zArr, i2, z8c.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb2.charAt(i3))]);
            i2 += 9;
        }
        int i4 = i(20, sb2);
        int[] iArr = z8c.a;
        h(zArr, i2, iArr[i4]);
        StringBuilder t = qv10.t(sb2);
        t.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i4));
        h(zArr, i2 + 9, iArr[i(15, t.toString())]);
        h(zArr, i2 + 18, z8c.b);
        zArr[i2 + 27] = true;
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }
}
