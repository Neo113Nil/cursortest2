package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.adjust.sdk.Constants;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.FileOutputStream;
import kotlin.time.Instant;
import kotlin.time.a;
import kotlin.time.b;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public abstract class ej91 {
    public static final int[] a = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] c = {3, 6};
    public static final int[] d = {1, 2, 4, 5, 7, 8};

    public static pdi0 a(View view) {
        return new pdi0(view);
    }

    public static final void b(float f, String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        matrix.postScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        decodeFile.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final String c(Instant instant) {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long epochSeconds = instant.getEpochSeconds();
        long j2 = epochSeconds / 86400;
        if ((epochSeconds ^ 86400) < 0 && j2 * 86400 != epochSeconds) {
            j2--;
        }
        long j3 = epochSeconds % 86400;
        int i = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
        long j4 = 719468 + j2;
        if (j4 < 0) {
            long j5 = ((j2 + 719469) / 146097) - 1;
            j = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j = 0;
        }
        long j6 = ((400 * j4) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / BlendingGradientView.BASE_ALPHA;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j6 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int nanosecondsOfSecond = instant.getNanosecondsOfSecond();
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append(LicenseUtility.SEPARATOR);
        f(sb, sb, i4);
        sb.append(LicenseUtility.SEPARATOR);
        f(sb, sb, i5);
        sb.append('T');
        f(sb, sb, i7);
        sb.append(':');
        f(sb, sb, i9);
        sb.append(':');
        f(sb, sb, i10);
        if (nanosecondsOfSecond != 0) {
            sb.append('.');
            while (true) {
                int i12 = i11 + 1;
                iArr = a;
                if (nanosecondsOfSecond % iArr[i12] != 0) {
                    break;
                }
                i11 = i12;
            }
            int i13 = i11 - (i11 % 3);
            sb.append(String.valueOf((nanosecondsOfSecond / iArr[i13]) + iArr[9 - i13]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    public static final s3w d(String str) {
        int i;
        int i2;
        int b2;
        int i3;
        char charAt;
        char charAt2;
        if (str.length() == 0) {
            return new a("An empty string is not a valid Instant", str);
        }
        char charAt3 = str.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            charAt3 = ' ';
        }
        int i4 = 0;
        int i5 = i;
        while (i5 < str.length() && '0' <= (charAt2 = str.charAt(i5)) && charAt2 < ':') {
            i4 = (i4 * 10) + (str.charAt(i5) - MoneyInputEditView.DEFAULT_VALUE);
            i5++;
        }
        int i6 = i5 - i;
        if (i6 > 10) {
            return h(str, "Expected at most 10 digits for the year number, got " + i6 + " digits");
        }
        if (i6 == 10 && str.charAt(i) >= '2') {
            return h(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
        }
        int i7 = 4;
        if (i6 < 4) {
            return h(str, "The year number must be padded to 4 digits, got " + i6 + " digits");
        }
        if (charAt3 == '+' && i6 == 4) {
            return h(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i6 != 4) {
            return h(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i4 = -i4;
        }
        int i8 = i5 + 16;
        if (str.length() < i8) {
            return h(str, "The input string is too short");
        }
        a g = g(str, "'-'", i5, new xuv(i7));
        if (g != null) {
            return g;
        }
        a g2 = g(str, "'-'", i5 + 3, new xuv(5));
        if (g2 != null) {
            return g2;
        }
        a g3 = g(str, "'T' or 't'", i5 + 6, new xuv(6));
        if (g3 != null) {
            return g3;
        }
        a g4 = g(str, "':'", i5 + 9, new xuv(7));
        if (g4 != null) {
            return g4;
        }
        a g5 = g(str, "':'", i5 + 12, new xuv(8));
        if (g5 != null) {
            return g5;
        }
        int i9 = 0;
        while (true) {
            int i10 = 9;
            if (i9 >= 10) {
                int i11 = i(i5 + 1, str);
                int i12 = i(i5 + 4, str);
                int i13 = i(i5 + 7, str);
                int i14 = i(i5 + 10, str);
                int i15 = i(i5 + 13, str);
                int i16 = i5 + 15;
                if (str.charAt(i16) == '.') {
                    i16 = i8;
                    int i17 = 0;
                    while (i16 < str.length() && '0' <= (charAt = str.charAt(i16)) && charAt < ':') {
                        i17 = (i17 * 10) + (str.charAt(i16) - MoneyInputEditView.DEFAULT_VALUE);
                        i16++;
                    }
                    int i18 = i16 - i8;
                    if (1 > i18 || i18 >= 10) {
                        return h(str, "1..9 digits are supported for the fraction of the second, got " + i18 + " digits");
                    }
                    i2 = i17 * a[9 - i18];
                } else {
                    i2 = 0;
                }
                if (i16 >= str.length()) {
                    return h(str, "The UTC offset at the end of the string is missing");
                }
                char charAt4 = str.charAt(i16);
                if (charAt4 == '+' || charAt4 == '-') {
                    int length = str.length() - i16;
                    if (length > 9) {
                        return h(str, "The UTC offset string \"" + j(16, str.subSequence(i16, str.length()).toString()) + "\" is too long");
                    }
                    if (length % 3 != 0) {
                        return h(str, "Invalid UTC offset string \"" + str.subSequence(i16, str.length()).toString() + OpenList.CHAR_QUOTE);
                    }
                    int i19 = 0;
                    for (int i20 = 2; i19 < i20; i20 = 2) {
                        int i21 = i16 + c[i19];
                        if (i21 >= str.length()) {
                            break;
                        }
                        if (str.charAt(i21) != ':') {
                            StringBuilder t = b64.t(i21, "Expected ':' at index ", ", got '");
                            t.append(str.charAt(i21));
                            t.append('\'');
                            return h(str, t.toString());
                        }
                        i19++;
                    }
                    int i22 = 0;
                    while (i22 < 6 && (i3 = d[i22] + i16) < str.length()) {
                        char charAt5 = str.charAt(i3);
                        int i23 = i22;
                        if ('0' > charAt5 || charAt5 >= ':') {
                            StringBuilder t2 = b64.t(i3, "Expected an ASCII digit at index ", ", got '");
                            t2.append(str.charAt(i3));
                            t2.append('\'');
                            return h(str, t2.toString());
                        }
                        i22 = i23 + 1;
                    }
                    int i24 = i(i16 + 1, str);
                    int i25 = length > 3 ? i(i16 + 4, str) : 0;
                    int i26 = length > 6 ? i(i16 + 7, str) : 0;
                    if (i25 > 59) {
                        return h(str, "Expected offset-minute-of-hour in 0..59, got " + i25);
                    }
                    if (i26 > 59) {
                        return h(str, "Expected offset-second-of-minute in 0..59, got " + i26);
                    }
                    if (i24 > 17 && (i24 != 18 || i25 != 0 || i26 != 0)) {
                        return h(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i16, str.length()).toString());
                    }
                    b2 = b64.b(i25, 60, i24 * 3600, i26) * (charAt4 == '-' ? -1 : 1);
                } else {
                    if (charAt4 != 'Z' && charAt4 != 'z') {
                        return h(str, "Expected the UTC offset at position " + i16 + ", got '" + charAt4 + '\'');
                    }
                    int i27 = i16 + 1;
                    if (str.length() != i27) {
                        return h(str, "Extra text after the instant at position " + i27);
                    }
                    b2 = 0;
                }
                if (1 > i11 || i11 >= 13) {
                    return h(str, "Expected a month number in 1..12, got " + i11);
                }
                if (1 <= i12) {
                    int i28 = i4 & 3;
                    if (i12 <= (i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : i28 == 0 && (i4 % 100 != 0 || i4 % Constants.MINIMAL_ERROR_STATUS_CODE == 0) ? 29 : 28)) {
                        if (i13 > 23) {
                            return h(str, "Expected hour in 0..23, got " + i13);
                        }
                        if (i14 > 59) {
                            return h(str, "Expected minute-of-hour in 0..59, got " + i14);
                        }
                        if (i15 > 59) {
                            return h(str, "Expected second-of-minute in 0..59, got " + i15);
                        }
                        long j = i4;
                        long j2 = 365 * j;
                        long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (((i11 * 367) - 362) / 12) + (i12 - 1);
                        if (i11 > 2) {
                            j3 = (i28 != 0 || (i4 % 100 == 0 && i4 % Constants.MINIMAL_ERROR_STATUS_CODE != 0)) ? j3 - 2 : (-1) + j3;
                        }
                        return new b((((j3 - 719528) * 86400) + b64.b(i14, 60, i13 * 3600, i15)) - b2, i2);
                    }
                }
                StringBuilder s = b64.s(i11, i4, "Expected a valid day-of-month for month ", " of year ", ", got ");
                s.append(i12);
                return h(str, s.toString());
            }
            a g6 = g(str, "an ASCII digit", b[i9] + i5, new xuv(i10));
            if (g6 != null) {
                return g6;
            }
            i9++;
        }
    }

    public static final Object e(xll xllVar, rvo rvoVar) {
        if (xllVar instanceof pll) {
            return ((pll) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof qll) {
            return ((qll) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof rll) {
            return jdc.a(((Number) ((rll) xllVar).b.a.a(rvoVar)).intValue());
        }
        if (xllVar instanceof sll) {
            return ((sll) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof tll) {
            return ((tll) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof ull) {
            return ((ull) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof vll) {
            return ((vll) xllVar).b.a.a(rvoVar);
        }
        if (xllVar instanceof wll) {
            return ((Uri) ((wll) xllVar).b.a.a(rvoVar)).toString();
        }
        w511.b();
        return null;
    }

    public static final void f(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append(MoneyInputEditView.DEFAULT_VALUE);
        }
        sb2.append(i);
    }

    public static final a g(String str, String str2, int i, tls tlsVar) {
        char charAt = str.charAt(i);
        if (((Boolean) tlsVar.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return h(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i);
    }

    public static final a h(String str, String str2) {
        StringBuilder v = oyr.v(str2, " when parsing an Instant from \"");
        v.append(j(64, str));
        v.append(OpenList.CHAR_QUOTE);
        return new a(v.toString(), str);
    }

    public static final int i(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static final String j(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }
}
