package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes8.dex */
public final class usj {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* compiled from: Cookie.kt */
    public static final class a {
        public String a;
        public String b;
        public String d;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public long c = 253402300799999L;
        public String e = DomExceptionUtils.SEPARATOR;

        public final usj a() {
            String str = this.a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.c;
            String str3 = this.d;
            if (str3 != null) {
                return new usj(str, str2, j, str3, this.e, this.f, this.g, this.h, this.i);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final void b(String str) {
            c(str, false);
        }

        public final void c(String str, boolean z) {
            String d = m9u0.d(str);
            if (d == null) {
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            this.d = d;
            this.i = z;
        }

        public final void d(String str) {
            if (!epx.f(drm0.p0(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.a = str;
        }

        public final void e(String str) {
            if (!epx.f(drm0.p0(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.b = str;
        }
    }

    /* compiled from: Cookie.kt */
    public static final class b {
        public static int a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public static boolean b(String str, String str2) {
            return epx.f(str, str2) || (brm0.v(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !x2r0.g.f(str));
        }

        public static usj c(okhttp3.l lVar, String str) {
            okhttp3.l lVar2;
            long j;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int g = x2r0.g(';', 0, 0, 6, str);
            char c2 = B5.U;
            int g2 = x2r0.g(B5.U, 0, g, 2, str);
            String str3 = null;
            if (g2 != g) {
                String y = x2r0.y(0, g2, str);
                if (y.length() != 0 && x2r0.l(y) == -1) {
                    String y2 = x2r0.y(g2 + 1, g, str);
                    if (x2r0.l(y2) == -1) {
                        int i = g + 1;
                        int length = str.length();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = true;
                        long j2 = 253402300799999L;
                        long j3 = -1;
                        String str4 = null;
                        while (true) {
                            if (i >= length) {
                                if (j3 == Long.MIN_VALUE) {
                                    lVar2 = lVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        lVar2 = lVar;
                                        j = 253402300799999L;
                                    } else {
                                        lVar2 = lVar;
                                        j = j4;
                                    }
                                } else {
                                    lVar2 = lVar;
                                    j = j2;
                                }
                                String str5 = lVar2.d;
                                if (str3 != null) {
                                    if (b(str5, str3)) {
                                        str2 = str3;
                                    }
                                    return null;
                                }
                                str2 = str5;
                                if (str5.length() == str2.length() || PublicSuffixDatabase.g.a(str2) != null) {
                                    String str6 = DomExceptionUtils.SEPARATOR;
                                    if (str4 == null || !brm0.B(str4, DomExceptionUtils.SEPARATOR, false)) {
                                        String b = lVar2.b();
                                        int P = drm0.P(b, '/', 0, 6);
                                        if (P != 0) {
                                            str6 = b.substring(0, P);
                                        }
                                        str4 = str6;
                                    }
                                    return new usj(y, y2, j, str2, str4, z3, z, z2, z4);
                                }
                                return null;
                            }
                            int f = x2r0.f(str, i, length, c);
                            int f2 = x2r0.f(str, i, f, c2);
                            String y3 = x2r0.y(i, f2, str);
                            String y4 = f2 < f ? x2r0.y(f2 + 1, f, str) : "";
                            if (y3.equalsIgnoreCase("expires")) {
                                try {
                                    j2 = d(y4.length(), y4);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                                i = f + 1;
                                c = ';';
                                c2 = B5.U;
                            } else if (y3.equalsIgnoreCase("max-age")) {
                                try {
                                    j3 = Long.parseLong(y4);
                                    if (j3 <= 0) {
                                        j3 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!new Regex("-?\\d+").f(y4)) {
                                        throw e;
                                    }
                                    j3 = brm0.B(y4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z2 = true;
                                i = f + 1;
                                c = ';';
                                c2 = B5.U;
                            } else {
                                if (y3.equalsIgnoreCase(X3.j.D)) {
                                    if (brm0.v(y4, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String d = m9u0.d(drm0.U(y4, "."));
                                    if (d == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = d;
                                    z4 = false;
                                } else if (y3.equalsIgnoreCase("path")) {
                                    str4 = y4;
                                } else if (y3.equalsIgnoreCase("secure")) {
                                    z3 = true;
                                } else if (y3.equalsIgnoreCase("httponly")) {
                                    z = true;
                                }
                                i = f + 1;
                                c = ';';
                                c2 = B5.U;
                            }
                        }
                    }
                }
            }
            return null;
        }

        public static long d(int i, String str) {
            int a = a(0, i, str, false);
            Matcher matcher = usj.m.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (a < i) {
                int a2 = a(a + 1, i, str, true);
                matcher.region(a, a2);
                if (i3 == -1 && matcher.usePattern(usj.m).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                    i6 = Integer.parseInt(matcher.group(2));
                    i7 = Integer.parseInt(matcher.group(3));
                } else if (i4 == -1 && matcher.usePattern(usj.l).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                } else {
                    if (i5 == -1) {
                        Pattern pattern = usj.k;
                        if (matcher.usePattern(pattern).matches()) {
                            i5 = drm0.K(0, 6, pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), false) / 4;
                        }
                    }
                    if (i2 == -1 && matcher.usePattern(usj.j).matches()) {
                        i2 = Integer.parseInt(matcher.group(1));
                    }
                }
                a = a(a2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i5 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i4 || i4 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i3 < 0 || i3 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 < 0 || i6 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(x2r0.f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, i5 - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public usj(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final String a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final boolean c() {
        return this.i;
    }

    public final boolean d(okhttp3.l lVar) {
        String str = lVar.d;
        boolean z = this.i;
        String str2 = this.d;
        if (z ? epx.f(str, str2) : b.b(str, str2)) {
            String b2 = lVar.b();
            String str3 = this.e;
            if ((b2.equals(str3) || (brm0.B(b2, str3, false) && (brm0.v(str3, DomExceptionUtils.SEPARATOR, false) || b2.charAt(str3.length()) == '/'))) && (!this.f || lVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof usj)) {
            return false;
        }
        usj usjVar = (usj) obj;
        return epx.f(usjVar.a, this.a) && epx.f(usjVar.b, this.b) && usjVar.c == this.c && epx.f(usjVar.d, this.d) && epx.f(usjVar.e, this.e) && usjVar.f == this.f && usjVar.g == this.g && usjVar.h == this.h && usjVar.i == this.i;
    }

    public final String f() {
        return this.e;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.f;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(bh10.a(urd0.a(urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String i() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(B5.U);
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(r1l.a.get().format(new Date(j2)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
