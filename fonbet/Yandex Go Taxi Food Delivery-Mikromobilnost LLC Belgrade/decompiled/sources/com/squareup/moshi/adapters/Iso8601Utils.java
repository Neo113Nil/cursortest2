package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonDataException;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.g8e;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
final class Iso8601Utils {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static boolean a(char c, int i, String str) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static void b(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append(MoneyInputEditView.DEFAULT_VALUE);
        }
        sb.append(num);
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        b(sb, gregorianCalendar.get(1), 4);
        sb.append(LicenseUtility.SEPARATOR);
        b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append(LicenseUtility.SEPARATOR);
        b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        b(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    public static Date parse(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char charAt;
        try {
            int c = c(0, 4, str);
            int i6 = a(LicenseUtility.SEPARATOR, 4, str) ? 5 : 4;
            int i7 = i6 + 2;
            int c2 = c(i6, i7, str);
            if (a(LicenseUtility.SEPARATOR, i7, str)) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int c3 = c(i7, i8, str);
            boolean a2 = a('T', i8, str);
            if (!a2 && str.length() <= i8) {
                return new GregorianCalendar(c, c2 - 1, c3).getTime();
            }
            if (a2) {
                int i9 = i7 + 5;
                int c4 = c(i7 + 3, i9, str);
                if (a(':', i9, str)) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                i5 = c(i9, i10, str);
                if (a(':', i10, str)) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (charAt = str.charAt(i10)) == 'Z' || charAt == '+' || charAt == '-') {
                    i = c;
                    i2 = c4;
                    i8 = i10;
                    i3 = 0;
                    i4 = 0;
                } else {
                    int i11 = i10 + 2;
                    i4 = c(i10, i11, str);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a('.', i11, str)) {
                        int i12 = i10 + 3;
                        int i13 = i10 + 4;
                        while (true) {
                            if (i13 >= str.length()) {
                                i13 = str.length();
                                break;
                            }
                            char charAt2 = str.charAt(i13);
                            if (charAt2 < '0' || charAt2 > '9') {
                                break;
                            }
                            i13++;
                        }
                        int min = Math.min(i13, i10 + 6);
                        i = c;
                        i3 = (int) (Math.pow(10.0d, 3 - (min - i12)) * c(i12, min, str));
                        i2 = c4;
                        i8 = i13;
                    } else {
                        i = c;
                        i2 = c4;
                        i8 = i11;
                        i3 = 0;
                    }
                }
            } else {
                i = c;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (str.length() <= i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt3 = str.charAt(i8);
            TimeZone timeZone = a;
            if (charAt3 != 'Z') {
                if (charAt3 != '+' && charAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                }
                String substring = str.substring(i8);
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str2 = "GMT" + substring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, c2 - 1);
            gregorianCalendar.set(5, c3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i4);
            gregorianCalendar.set(14, i3);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new JsonDataException(g8e.o("Not an RFC 3339 date: ", str), e);
        }
    }
}
