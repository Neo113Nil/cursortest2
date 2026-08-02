package xsna;

import com.vk.dto.common.ImageSizeKey;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: NumberInput.java */
/* loaded from: classes12.dex */
public final class en70 {
    public static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String b = String.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BigDecimal a(String str, boolean z) throws NumberFormatException {
        String message;
        String c;
        if (z) {
            try {
                return gxx.a(str);
            } catch (NumberFormatException e) {
                if (str.length() > 1000) {
                    str = str.substring(0, 1000) + " [truncated]";
                }
                StringBuilder a2 = t33.a("Value \"", str, "\" can not be represented as `java.math.BigDecimal`, reason: ");
                a2.append(e.getMessage());
                throw new NumberFormatException(a2.toString());
            }
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        try {
            return length < 500 ? new BigDecimal(charArray, 0, length) : gcd0.u(charArray, length, length / 10);
        } catch (ArithmeticException e2) {
            e = e2;
            message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (length > 1000) {
                c = new String(charArray, 0, length);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(new String(Arrays.copyOfRange(charArray, 0, 1000)));
                sb.append("(truncated, full length is ");
                c = h5s.c(charArray.length, " chars)", sb);
            }
            throw new NumberFormatException(y57.a("Value \"", c, "\" can not be represented as `java.math.BigDecimal`, reason: ", message));
        } catch (NumberFormatException e3) {
            e = e3;
            message = e.getMessage();
            if (message == null) {
            }
            if (length > 1000) {
            }
            throw new NumberFormatException(y57.a("Value \"", c, "\" can not be represented as `java.math.BigDecimal`, reason: ", message));
        }
    }

    public static BigInteger b(String str, boolean z) throws NumberFormatException {
        if (!z) {
            return new BigInteger(str);
        }
        try {
            return kxx.a(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000) + " [truncated]";
            }
            StringBuilder a2 = t33.a("Value \"", str, "\" can not be represented as `java.math.BigInteger`, reason: ");
            a2.append(e.getMessage());
            throw new NumberFormatException(a2.toString());
        }
    }

    public static int c(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - ImageSizeKey.SIZE_KEY_UNDEFINED;
        switch (i2) {
            case 9:
                i3 = ir.b(cArr[i], 48, 100000000, i3);
                i++;
            case 8:
                i3 = ir.b(cArr[i], 48, 10000000, i3);
                i++;
            case 7:
                i3 = ir.b(cArr[i], 48, 1000000, i3);
                i++;
            case 6:
                i3 = ir.b(cArr[i], 48, 100000, i3);
                i++;
            case 5:
                i3 = ir.b(cArr[i], 48, 10000, i3);
                i++;
            case 4:
                i3 = ir.b(cArr[i], 48, 1000, i3);
                i++;
            case 3:
                i3 = ir.b(cArr[i], 48, 100, i3);
                i++;
            case 2:
                return ir.b(cArr[i], 48, 10, i3);
            default:
                return i3;
        }
    }

    public static long d(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (c(cArr, i, i3) * 1000000000) + c(cArr, i + i3, 9);
    }
}
