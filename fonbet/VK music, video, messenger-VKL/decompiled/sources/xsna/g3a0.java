package xsna;

import android.telephony.PhoneNumberUtils;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhoneFormatter.kt */
/* loaded from: classes.dex */
public final class g3a0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new xh6(10));

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        Character y0;
        char charValue;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        Character y02 = erm0.y0(str2);
        if (y02 != null) {
            char charValue2 = y02.charValue();
            if (Character.isDigit(charValue2) && charValue2 != '8') {
                str3 = "+".concat(str2);
                String formatNumber = PhoneNumberUtils.formatNumber(str3, "");
                str4 = (formatNumber == null || (formatNumber = PhoneNumberUtils.formatNumber(str2, (String) this.a.getValue())) != null) ? formatNumber : "";
                if (str4.length() == 0) {
                    if (str2.length() > 10) {
                        int length2 = str2.length();
                        int i2 = length2 - 10;
                        int i3 = length2 - 7;
                        int i4 = length2 - 4;
                        int i5 = length2 - 2;
                        str2 = "+" + str2.substring(0, i2) + ' ' + str2.substring(i2, i3) + ' ' + str2.substring(i3, i4) + ' ' + str2.substring(i4, i5) + ' ' + str2.substring(i5);
                    }
                    str4 = str2;
                }
                if (str4.length() > 0 && (y0 = erm0.y0(str4)) != null) {
                    charValue = y0.charValue();
                    if (Character.isDigit(charValue) && charValue != '8') {
                        str4 = "+".concat(str4);
                    }
                }
                return str4.replace('-', ' ');
            }
        }
        str3 = str2;
        String formatNumber2 = PhoneNumberUtils.formatNumber(str3, "");
        if (formatNumber2 == null) {
        }
        if (str4.length() == 0) {
        }
        if (str4.length() > 0) {
            charValue = y0.charValue();
            if (Character.isDigit(charValue)) {
                str4 = "+".concat(str4);
            }
        }
        return str4.replace('-', ' ');
    }
}
