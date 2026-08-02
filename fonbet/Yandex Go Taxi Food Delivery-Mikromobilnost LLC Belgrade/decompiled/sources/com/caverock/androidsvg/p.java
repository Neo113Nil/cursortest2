package com.caverock.androidsvg;

import defpackage.dn60;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public class p {
    public final String a;
    public final int c;
    public int b = 0;
    public final dn60 d = new dn60(0);

    public p(String str) {
        this.c = 0;
        String trim = str.trim();
        this.a = trim;
        this.c = trim.length();
    }

    public static boolean g(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final int a() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return this.a.charAt(i3);
        }
        return -1;
    }

    public final Boolean b(Object obj) {
        if (obj == null) {
            return null;
        }
        p();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char charAt = this.a.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(charAt == '1');
    }

    public final float c(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        p();
        return i();
    }

    public final boolean d(char c) {
        int i = this.b;
        boolean z = i < this.c && this.a.charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public final boolean e(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public final boolean f() {
        return this.b == this.c;
    }

    public final Integer h() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        this.b = i + 1;
        return Integer.valueOf(this.a.charAt(i));
    }

    public final float i() {
        int i = this.b;
        int i2 = this.c;
        dn60 dn60Var = this.d;
        float D = dn60Var.D(i, i2, this.a);
        if (!Float.isNaN(D)) {
            this.b = dn60Var.b;
        }
        return D;
    }

    public final j j() {
        float i = i();
        if (Float.isNaN(i)) {
            return null;
        }
        SVG$Unit n = n();
        return n == null ? new j(i, SVG$Unit.px) : new j(i, n);
    }

    public final String k() {
        if (f()) {
            return null;
        }
        int i = this.b;
        String str = this.a;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int a = a();
        while (a != -1 && a != charAt) {
            a = a();
        }
        if (a == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public final String l() {
        return m(false, HexString.CHAR_SPACE);
    }

    public final String m(boolean z, char c) {
        if (f()) {
            return null;
        }
        int i = this.b;
        String str = this.a;
        char charAt = str.charAt(i);
        if ((!z && g(charAt)) || charAt == c) {
            return null;
        }
        int i2 = this.b;
        int a = a();
        while (a != -1 && a != c && (z || !g(a))) {
            a = a();
        }
        return str.substring(i2, this.b);
    }

    public final SVG$Unit n() {
        if (f()) {
            return null;
        }
        int i = this.b;
        String str = this.a;
        char charAt = str.charAt(i);
        int i2 = this.b;
        if (charAt == '%') {
            this.b = i2 + 1;
            return SVG$Unit.percent;
        }
        if (i2 > this.c - 2) {
            return null;
        }
        try {
            SVG$Unit valueOf = SVG$Unit.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
            this.b += 2;
            return valueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final float o() {
        p();
        int i = this.b;
        int i2 = this.c;
        dn60 dn60Var = this.d;
        float D = dn60Var.D(i, i2, this.a);
        if (!Float.isNaN(D)) {
            this.b = dn60Var.b;
        }
        return D;
    }

    public final boolean p() {
        q();
        int i = this.b;
        if (i == this.c || this.a.charAt(i) != ',') {
            return false;
        }
        this.b++;
        q();
        return true;
    }

    public final void q() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !g(this.a.charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }
}
