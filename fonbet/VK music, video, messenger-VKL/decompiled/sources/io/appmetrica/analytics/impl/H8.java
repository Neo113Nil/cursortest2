package io.appmetrica.analytics.impl;

import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;
import xsna.brm0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.erm0;
import xsna.hl10;
import xsna.j5g;
import xsna.v1v;
import xsna.z23;

/* loaded from: classes8.dex */
public final class H8 implements InterfaceC5259w2 {
    public final int a = 5;
    public final int b = 100;
    public final int c = 255;
    public final int d = 2;
    public final int e = 63;
    public final int f = 1;
    public final int g = 2;
    public final int h = 1;
    public final int i = 64;
    public final Regex j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");
    public final Regex k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");
    public final List l = e43.l("ru", "by", "kz", "az", "kg", "lv", com.ironsource.O6.u, "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");
    public final String m = "yandex.ru";
    public final String n = "gmail.com";
    public final String o = "googlemail.com";

    @Override // io.appmetrica.analytics.impl.InterfaceC5259w2
    public final String a(String str) {
        String str2;
        Character B0;
        String lowerCase = z23.c("^\\++", drm0.p0(str).toString(), "").toLowerCase(Locale.ROOT);
        int P = drm0.P(lowerCase, '@', 0, 6);
        if (P == -1) {
            return null;
        }
        String substring = lowerCase.substring(0, P);
        String substring2 = lowerCase.substring(P + 1);
        int length = substring.length();
        if (length < this.h || length > this.i) {
            return null;
        }
        List b0 = drm0.b0(substring, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
        if (!(b0 instanceof Collection) || !b0.isEmpty()) {
            Iterator it = b0.iterator();
            do {
                if (it.hasNext()) {
                    str2 = (String) it.next();
                    int length2 = str2.length();
                    if (length2 < this.h) {
                        return null;
                    }
                    Character y0 = erm0.y0(str2);
                    if (y0 != null && y0.charValue() == '\"' && (B0 = erm0.B0(str2)) != null && B0.charValue() == '\"' && length2 > 2) {
                        int i = 1;
                        while (true) {
                            int i2 = i + 2;
                            if (i2 >= str2.length()) {
                                break;
                            }
                            char charAt = str2.charAt(i);
                            if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                return null;
                            }
                            if (charAt == '\\') {
                                if (i2 == str2.length()) {
                                    return null;
                                }
                                i++;
                                if (str2.charAt(i) < ' ') {
                                    return null;
                                }
                            }
                            i++;
                        }
                    }
                }
            } while (this.j.f(str2));
            return null;
        }
        if (substring2.length() > this.c) {
            return null;
        }
        List c0 = drm0.c0(substring2, new String[]{"."}, 0, 6);
        if (c0.size() < this.d) {
            return null;
        }
        List T = j5g.T(1, c0);
        if (!(T instanceof Collection) || !T.isEmpty()) {
            Iterator it2 = T.iterator();
            while (it2.hasNext()) {
                if (!b((String) it2.next())) {
                    return null;
                }
            }
        }
        String str3 = (String) j5g.i0(c0);
        if (str3.length() < this.g || !b(str3)) {
            return null;
        }
        for (int i3 = 0; i3 < str3.length(); i3++) {
            if (!Character.isDigit(str3.charAt(i3))) {
                String y = brm0.y(substring2, this.o, this.n);
                hl10 b = this.k.b(y);
                if (b != null) {
                    hl10.a aVar = (hl10.a) b.b();
                    String str4 = (String) aVar.get(1);
                    String str5 = (String) aVar.get(2);
                    if (str5.length() <= 0 ? str4.length() > 0 : this.l.contains(str5)) {
                        y = this.m;
                    }
                }
                if (epx.f(y, this.m)) {
                    substring = brm0.y(substring, ".", "-");
                } else if (epx.f(y, this.n)) {
                    substring = brm0.y(substring, ".", "");
                }
                int length3 = substring.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        break;
                    }
                    if (substring.charAt(i4) == '+') {
                        substring = substring.substring(0, i4);
                        break;
                    }
                    i4++;
                }
                String a = v1v.a('@', substring, y);
                if (a.length() < this.a || a.length() > this.b) {
                    return null;
                }
                return a;
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.e || str.length() < this.f || !Character.isLetterOrDigit(erm0.x0(str)) || !Character.isLetterOrDigit(erm0.A0(str))) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-') {
                return false;
            }
        }
        return true;
    }
}
