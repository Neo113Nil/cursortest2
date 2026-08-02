package xsna;

/* compiled from: ExpireDateTextWatcher.kt */
/* loaded from: classes6.dex */
public final class p9q extends ys6 {
    public static String b(String str) {
        int length = str.length();
        if (length <= 2) {
            return str;
        }
        return str.substring(0, 2) + '/' + str.substring(2, length);
    }

    @Override // xsna.ys6
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return sb2;
        }
        int length2 = sb2.length();
        char charAt2 = sb2.charAt(0);
        if (charAt2 == '0') {
            if (length2 > 1 && sb2.charAt(1) == '0') {
                sb2 = sb2.substring(0, 1);
            }
            return b(sb2);
        }
        if (charAt2 != '1') {
            return length2 == 1 ? "0".concat(sb2) : "";
        }
        if (length2 <= 1) {
            return sb2;
        }
        switch (sb2.charAt(1)) {
            case '0':
            case '1':
            case '2':
                return b(sb2);
            default:
                return sb2.substring(0, 1);
        }
    }
}
