package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import kotlinx.serialization.json.JsonDecodingException;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public abstract class b8 {
    public final ccx a;
    public int b;
    public final qdx c;
    public String d;
    public final StringBuilder e = new StringBuilder();

    public b8(ccx ccxVar) {
        this.a = ccxVar;
        this.c = new qdx(ccxVar);
    }

    public static /* synthetic */ void q(b8 b8Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = b8Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        b8Var.p(i, str, str2);
        throw null;
    }

    public static boolean t(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public final boolean A() {
        int y = y();
        CharSequence s = s();
        if (y >= s.length() || y == -1 || s.charAt(y) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final boolean B(boolean z) {
        int x = x(y());
        int length = s().length() - x;
        if (length >= 4 && x != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != s().charAt(x + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || tje.l(s().charAt(x + 4)) != 0) {
                    if (z) {
                        this.b = x + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void C(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String l = l();
                this.b = i;
                if (jl40.l(l, "null")) {
                    p(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String i0 = tje.i0(tje.l(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        q(this, unr0.p("Expected ", i0, ", but had '", (i2 == s().length() || i3 < 0) ? "EOF" : String.valueOf(s().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.e.append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        n();
        if (this.b + 4 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.e.append(s(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (s().length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (s().charAt(i + i2) | HexString.CHAR_SPACE)) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b) {
        byte f = f();
        if (f == b) {
            return f;
        }
        String i0 = tje.i0(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        q(this, unr0.p("Expected ", i0, ", but had '", (i == s().length() || i2 < 0) ? "EOF" : String.valueOf(s().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x013b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (r21 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if (s().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        q(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0163, code lost:
    
        q(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r22.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        if (r8 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        q(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        if (r8 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r21 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c9, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        q(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        q(r22, "Expected numeric literal", r11, null, 4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char charAt;
        int x = x(y());
        if (x >= s().length() || x == -1) {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
        if (s().charAt(x) == '\"') {
            x++;
            if (x == s().length()) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = x;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == s().length()) {
                z2 = z;
                z3 = z6;
                z4 = z7;
                break;
            }
            charAt = s().charAt(i);
            z2 = z;
            if ((charAt != 'e' && charAt != 'E') || z6) {
                z3 = z6;
                if (charAt == '-' && z3) {
                    if (i == x) {
                        q(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z6 = z3;
                    z5 = false;
                } else if (charAt != '+' || !z3) {
                    z4 = z7;
                    if (charAt != '-') {
                        if (tje.l(charAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = charAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            break;
                        }
                        if (z3) {
                            j = (j * 10) + i3;
                        } else {
                            j2 = (j2 * 10) - i3;
                            if (j2 > 0) {
                                q(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z6 = z3;
                        z7 = z4;
                    } else {
                        if (i != x) {
                            q(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z6 = z3;
                        z7 = true;
                    }
                } else {
                    if (i == x) {
                        q(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z6 = z3;
                    z5 = true;
                }
            } else {
                if (i == x) {
                    q(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z = z2;
                z5 = true;
                z6 = true;
            }
        }
        q(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
        throw null;
    }

    public final String j() {
        String str = this.d;
        if (str == null) {
            return e();
        }
        this.d = null;
        return str;
    }

    public final String k(int i, int i2, CharSequence charSequence) {
        String sb;
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (true) {
            StringBuilder sb2 = this.e;
            if (charAt == '\"') {
                if (z) {
                    b(i, i2);
                    sb = sb2.toString();
                    sb2.setLength(0);
                } else {
                    sb = z(i, i2);
                }
                this.b = i2 + 1;
                return sb;
            }
            if (charAt == '\\') {
                b(i, i2);
                int x = x(i2 + 1);
                if (x == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int i3 = x + 1;
                char charAt2 = s().charAt(x);
                if (charAt2 == 'u') {
                    i3 = a(i3, s());
                } else {
                    char c = charAt2 < 'u' ? aj9.a[charAt2] : (char) 0;
                    if (c == 0) {
                        q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb2.append(c);
                }
                i = x(i3);
                if (i == -1) {
                    q(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = x(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
    }

    public final String l() {
        String sb;
        String str = this.d;
        if (str != null) {
            this.d = null;
            return str;
        }
        int y = y();
        if (y >= s().length() || y == -1) {
            q(this, "EOF", y, null, 4);
            throw null;
        }
        byte l = tje.l(s().charAt(y));
        if (l == 1) {
            return j();
        }
        if (l != 0) {
            q(this, "Expected beginning of the string, but got " + s().charAt(y), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte l2 = tje.l(s().charAt(y));
            StringBuilder sb2 = this.e;
            if (l2 != 0) {
                int i = this.b;
                if (z) {
                    b(i, y);
                    sb = sb2.toString();
                    sb2.setLength(0);
                } else {
                    sb = z(i, y);
                }
                this.b = y;
                return sb;
            }
            y++;
            if (y >= s().length()) {
                b(this.b, y);
                int x = x(y);
                if (x == -1) {
                    this.b = y;
                    b(0, 0);
                    String sb3 = sb2.toString();
                    sb2.setLength(0);
                    return sb3;
                }
                y = x;
                z = true;
            }
        }
    }

    public final String m() {
        String l = l();
        if (!jl40.l(l, "null") || s().charAt(this.b - 1) == '\"') {
            return l;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void n() {
    }

    public final void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void p(int i, String str, String str2) {
        String o = this.c.o();
        String obj = this.a.n ? qje.G(i, s()).toString() : null;
        throw new JsonDecodingException(qje.n(i, str, o, str2, obj), str, o, obj, i, str2);
    }

    public final int r(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - MoneyInputEditView.DEFAULT_VALUE;
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence s();

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) s());
        sb.append("', currentPosition=");
        return oyr.s(sb, this.b, ')');
    }

    public abstract String u(String str, boolean z);

    public byte v() {
        CharSequence s = s();
        int i = this.b;
        while (true) {
            int x = x(i);
            if (x == -1) {
                this.b = x;
                return (byte) 10;
            }
            char charAt = s.charAt(x);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.b = x;
                return tje.l(charAt);
            }
            i = x + 1;
        }
    }

    public final String w(boolean z) {
        String j;
        byte v = v();
        if (z) {
            if (v != 1 && v != 0) {
                return null;
            }
            j = l();
        } else {
            if (v != 1) {
                return null;
            }
            j = j();
        }
        this.d = j;
        return j;
    }

    public abstract int x(int i);

    public abstract int y();

    public String z(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }
}
