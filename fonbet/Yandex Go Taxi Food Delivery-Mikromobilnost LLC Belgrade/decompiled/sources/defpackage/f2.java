package defpackage;

import com.adjust.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class f2 extends a3 {
    public final byte[] a;

    public f2(byte[] bArr) {
        if (bArr.length < 4) {
            ny61.g("GeneralizedTime string too short");
            throw null;
        }
        this.a = bArr;
        if (z(0) && z(1) && z(2) && z(3)) {
            return;
        }
        ny61.g("illegal characters in GeneralizedTime string");
        throw null;
    }

    public static String A(String str) {
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            return str.substring(0, 14).concat(substring.substring(0, 4).concat(substring.substring(i)));
        }
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            oyr.C(0, i, substring, "00", sb);
            sb.append(substring.substring(i));
            return str.substring(0, 14).concat(sb.toString());
        }
        if (i2 != 2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        oyr.C(0, i, substring, "0", sb2);
        sb2.append(substring.substring(i));
        return str.substring(0, 14).concat(sb2.toString());
    }

    public static String q(int i) {
        return i < 10 ? oyr.i(i, "0") : Integer.toString(i);
    }

    public static f2 r(byte[] bArr) {
        return new f2(bArr);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (!(a3Var instanceof f2)) {
            return false;
        }
        return Arrays.equals(this.a, ((f2) a3Var).a);
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public void i(g191 g191Var, boolean z) {
        g191Var.Y(24, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public int k(boolean z) {
        return g191.M(this.a.length, z);
    }

    @Override // defpackage.a3
    public a3 n() {
        return new spf(this.a);
    }

    public final SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = u() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : y() ? new SimpleDateFormat("yyyyMMddHHmmssz") : x() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final void s() {
        SimpleDateFormat p;
        String a = ruu0.a(this.a);
        if (a.endsWith("Z")) {
            p = u() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", r5z.a) : y() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", r5z.a) : x() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", r5z.a) : new SimpleDateFormat("yyyyMMddHH'Z'", r5z.a);
            p.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (a.indexOf(45) > 0 || a.indexOf(43) > 0) {
            a = t();
            p = p();
        } else {
            p = u() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : y() ? new SimpleDateFormat("yyyyMMddHHmmss") : x() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            p.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (u()) {
            a = A(a);
        }
        p.parse(a);
    }

    public final String t() {
        String str;
        String a = ruu0.a(this.a);
        if (g8e.a(1, a) == 'Z') {
            return a.substring(0, a.length() - 1).concat("GMT+00:00");
        }
        int length = a.length();
        char charAt = a.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && a.indexOf("GMT") == length - 9) {
            return a;
        }
        int length2 = a.length();
        int i = length2 - 5;
        char charAt2 = a.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            oyr.C(i, i2, a, ":", sb);
            sb.append(a.substring(i2));
            return sb.toString();
        }
        int length3 = a.length() - 3;
        char charAt3 = a.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            StringBuilder sb2 = new StringBuilder();
            oyr.C(0, length3, a, "GMT", sb2);
            sb2.append(a.substring(length3));
            sb2.append(":00");
            return sb2.toString();
        }
        StringBuilder t = qv10.t(a);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / Constants.ONE_HOUR;
        int i4 = (rawOffset - (Constants.ONE_HOUR * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (u()) {
                    a = A(a);
                }
                if (timeZone.inDaylightTime(p().parse(a + "GMT" + str + q(i3) + ":" + q(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        t.append("GMT" + str + q(i3) + ":" + q(i4));
        return t.toString();
    }

    public final boolean u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public final boolean x() {
        return z(10) && z(11);
    }

    public final boolean y() {
        return z(12) && z(13);
    }

    public final boolean z(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public f2(String str) {
        this.a = ruu0.b(str);
        try {
            s();
        } catch (ParseException e) {
            vg10.g(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
