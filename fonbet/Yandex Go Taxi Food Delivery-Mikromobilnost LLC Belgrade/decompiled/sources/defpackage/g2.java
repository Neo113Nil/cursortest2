package defpackage;

import com.adjust.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class g2 extends b3 {
    public static final p1 b = new p1(6, g2.class);
    public final byte[] a;

    public g2(byte[] bArr) {
        if (bArr.length < 4) {
            ny61.g("GeneralizedTime string too short");
            throw null;
        }
        this.a = bArr;
        if (F(0) && F(1) && F(2) && F(3)) {
            return;
        }
        ny61.g("illegal characters in GeneralizedTime string");
        throw null;
    }

    public static String G(String str) {
        StringBuilder sb;
        String str2;
        String sb2;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            sb2 = substring.substring(0, 4).concat(substring.substring(i));
        } else {
            if (i2 == 1) {
                sb = new StringBuilder();
                str2 = "00";
            } else {
                if (i2 != 2) {
                    return str;
                }
                sb = new StringBuilder();
                str2 = "0";
            }
            oyr.C(0, i, substring, str2, sb);
            sb.append(substring.substring(i));
            sb2 = sb.toString();
        }
        return str.substring(0, 14).concat(sb2);
    }

    public static String x(int i) {
        return i < 10 ? oyr.i(i, "0") : Integer.toString(i);
    }

    public static g2 z(Object obj) {
        if (obj == null || (obj instanceof g2)) {
            return (g2) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof g2) {
                return (g2) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            ny61.g(qv10.n(obj, "illegal object in getInstance: "));
            return null;
        }
        try {
            return (g2) b.Eg((byte[]) obj);
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    public final String A() {
        String str;
        String a = quu0.a(this.a);
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
                if (B()) {
                    a = G(a);
                }
                if (timeZone.inDaylightTime(u().parse(a + "GMT" + str + x(i3) + ":" + x(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        t.append("GMT" + str + x(i3) + ":" + x(i4));
        return t.toString();
    }

    public final boolean B() {
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

    public final boolean C() {
        return F(10) && F(11);
    }

    public final boolean E() {
        return F(12) && F(13);
    }

    public final boolean F(int i) {
        byte b2;
        byte[] bArr = this.a;
        return bArr.length > i && (b2 = bArr[i]) >= 48 && b2 <= 57;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (!(b3Var instanceof g2)) {
            return false;
        }
        return Arrays.equals(this.a, ((g2) b3Var).a);
    }

    @Override // defpackage.b3
    public void n(ryh ryhVar, boolean z) {
        ryhVar.I(24, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    @Override // defpackage.b3
    public b3 s() {
        return new tpf(this.a);
    }

    public final SimpleDateFormat u() {
        SimpleDateFormat simpleDateFormat = B() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : E() ? new SimpleDateFormat("yyyyMMddHHmmssz") : C() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final Date y() {
        SimpleDateFormat u;
        String a = quu0.a(this.a);
        if (a.endsWith("Z")) {
            u = B() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", s5z.a) : E() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", s5z.a) : C() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", s5z.a) : new SimpleDateFormat("yyyyMMddHH'Z'", s5z.a);
            u.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (a.indexOf(45) > 0 || a.indexOf(43) > 0) {
            a = A();
            u = u();
        } else {
            u = B() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : E() ? new SimpleDateFormat("yyyyMMddHHmmss") : C() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            u.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (B()) {
            a = G(a);
        }
        return u.parse(a);
    }

    public g2(String str) {
        this.a = quu0.b(str);
        try {
            y();
        } catch (ParseException e) {
            vg10.g(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
