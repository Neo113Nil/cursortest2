package xsna;

import com.vk.dto.common.ImageSizeKey;

/* compiled from: AbstractJsonLexer.kt */
/* loaded from: classes8.dex */
public abstract class af {
    public int a;
    public final gay b;
    public String c;
    public final StringBuilder d;

    public af() {
        gay gayVar = new gay();
        gayVar.a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        gayVar.b = iArr;
        gayVar.c = -1;
        this.b = gayVar;
        this.d = new StringBuilder();
    }

    public static /* synthetic */ void q(af afVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = afVar.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        afVar.p(i, str, str2);
        throw null;
    }

    public static /* synthetic */ void s(af afVar, byte b) {
        afVar.r(b, true);
        throw null;
    }

    public static boolean v(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract int A();

    public String B(int i, int i2) {
        return u().subSequence(i, i2).toString();
    }

    public final boolean C() {
        int A = A();
        CharSequence u = u();
        if (A >= u.length() || A == -1 || u.charAt(A) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final boolean D(boolean z) {
        int z2 = z(A());
        int length = u().length() - z2;
        if (length >= 4 && z2 != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != u().charAt(z2 + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || jgz.l(u().charAt(z2 + 4)) != 0) {
                    if (z) {
                        this.a = z2 + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void E(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String l = l();
                this.a = i;
                if (epx.f(l, "null")) {
                    p(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        s(this, jgz.l(c));
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (t(i + 3, charSequence) + (t(i, charSequence) << 12) + (t(i + 1, charSequence) << 8) + (t(i + 2, charSequence) << 4)));
            return i2;
        }
        this.a = i;
        n();
        if (this.a + 4 < charSequence.length()) {
            return a(this.a, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.d.append(u(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (u().length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (u().charAt(i + i2) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b) {
        byte f = f();
        if (f == b) {
            return f;
        }
        s(this, b);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ca, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        q(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (u().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        r21.a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        boolean z;
        boolean z2;
        boolean z3;
        int z4 = z(A());
        int i = 0;
        if (z4 < u().length() && z4 != -1) {
            if (u().charAt(z4) == '\"') {
                z4++;
                if (z4 == u().length()) {
                    q(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i2 = z4;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i2 == u().length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char charAt = u().charAt(i2);
                if ((charAt != 'e' && charAt != 'E') || z5) {
                    z2 = z;
                    if (charAt == '-' && z5) {
                        if (i2 == z4) {
                            q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        i3 = i;
                        z = z2;
                    } else if (charAt != '+' || !z5) {
                        z3 = z5;
                        if (charAt != '-') {
                            if (jgz.l(charAt) != 0) {
                                break;
                            }
                            i2++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + i4;
                                z = z2;
                                z5 = z3;
                            } else {
                                j2 = (j2 * 10) - i4;
                                if (j2 > 0) {
                                    q(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z = z2;
                                z5 = z3;
                                i = 0;
                            }
                        } else {
                            if (i2 != z4) {
                                q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                                throw null;
                            }
                            i2++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i2 == z4) {
                            q(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        z = z2;
                        i3 = 1;
                    }
                } else {
                    if (i2 == z4) {
                        q(this, "Unexpected symbol " + charAt + " in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    i3 = 1;
                    z5 = true;
                }
            }
        } else {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String j() {
        String str = this.c;
        if (str == null) {
            return e();
        }
        this.c = null;
        return str;
    }

    public final String k(int i, int i2, CharSequence charSequence) {
        String str;
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                b(i, i2);
                int z2 = z(i2 + 1);
                if (z2 == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int i3 = z2 + 1;
                char charAt2 = u().charAt(z2);
                if (charAt2 == 'u') {
                    i3 = a(i3, u());
                } else {
                    char c = charAt2 < 'u' ? rlb.a[charAt2] : (char) 0;
                    if (c == 0) {
                        q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.d.append(c);
                }
                i = z(i3);
                if (i == -1) {
                    q(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = z(i2);
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
        if (z) {
            b(i, i2);
            StringBuilder sb = this.d;
            String sb2 = sb.toString();
            sb.setLength(0);
            str = sb2;
        } else {
            str = B(i, i2);
        }
        this.a = i2 + 1;
        return str;
    }

    public final String l() {
        String str;
        String str2 = this.c;
        if (str2 != null) {
            this.c = null;
            return str2;
        }
        int A = A();
        if (A >= u().length() || A == -1) {
            q(this, "EOF", A, null, 4);
            throw null;
        }
        byte l = jgz.l(u().charAt(A));
        if (l == 1) {
            return j();
        }
        if (l != 0) {
            q(this, "Expected beginning of the string, but got " + u().charAt(A), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (jgz.l(u().charAt(A)) == 0) {
            A++;
            if (A >= u().length()) {
                b(this.a, A);
                int z2 = z(A);
                if (z2 == -1) {
                    this.a = A;
                    b(0, 0);
                    StringBuilder sb = this.d;
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                A = z2;
                z = true;
            }
        }
        if (z) {
            b(this.a, A);
            StringBuilder sb3 = this.d;
            String sb4 = sb3.toString();
            sb3.setLength(0);
            str = sb4;
        } else {
            str = B(this.a, A);
        }
        this.a = A;
        return str;
    }

    public final String m() {
        String l = l();
        if (!epx.f(l, "null") || u().charAt(this.a - 1) == '\"') {
            return l;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + u().charAt(this.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void p(int i, String str, String str2) {
        String concat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder b = ho8.b(str, " at path: ");
        b.append(this.b.a());
        b.append(concat);
        throw ne7.d(b.toString(), u(), i);
    }

    public final void r(byte b, boolean z) {
        String w = jgz.w(b);
        int i = z ? this.a - 1 : this.a;
        q(this, ss9.a("Expected ", w, ", but had '", (this.a == u().length() || i < 0) ? "EOF" : String.valueOf(u().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int t(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - ImageSizeKey.SIZE_KEY_UNDEFINED;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) u());
        sb.append("', currentPosition=");
        return vu5.b(sb, this.a, ')');
    }

    public abstract CharSequence u();

    public abstract String w(String str, boolean z);

    public byte x() {
        CharSequence u = u();
        int i = this.a;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.a = z;
                return (byte) 10;
            }
            char charAt = u.charAt(z);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.a = z;
                return jgz.l(charAt);
            }
            i = z + 1;
        }
    }

    public final String y(boolean z) {
        String j;
        byte x = x();
        if (z) {
            if (x != 1 && x != 0) {
                return null;
            }
            j = l();
        } else {
            if (x != 1) {
                return null;
            }
            j = j();
        }
        this.c = j;
        return j;
    }

    public abstract int z(int i);

    public void n() {
    }
}
