package defpackage;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes10.dex */
public abstract class bac {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", CA20Status.STATUS_REQUEST_C};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String b(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = tw21.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017d, code lost:
    
        if (r11.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(String str, String[] strArr, kfc kfcVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            lk91.j("Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            lk91.j("Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        char c2 = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (kfcVar == null || kfcVar.c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                lk91.j("Unknown HEVC profile string: " + group);
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c2 = HexString.LF;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = Integer.valueOf(SelfTester_JCP.ENCRYPT_CNT);
                    break;
                case 17:
                    num = Integer.valueOf(SelfTester_JCP.DECRYPT_CFB);
                    break;
                case 18:
                    num = 1024;
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = 262144;
                    break;
                case 23:
                    num = 1048576;
                    break;
                case 24:
                    num = Integer.valueOf(SelfTester_JCP.ENCRYPT_CBC);
                    break;
                case 25:
                    num = 16777216;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            lk91.j("Unknown HEVC level string: " + str2);
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
