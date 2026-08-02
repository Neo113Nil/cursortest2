package org.jsoup.parser;

import com.ironsource.B5;
import java.util.Arrays;
import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;
import xsna.bmb;
import xsna.j0u0;

/* compiled from: Tokeniser.java */
/* loaded from: classes8.dex */
public final class c {
    public static final char[] t;
    public static final int[] u = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final bmb a;
    public final ParseErrorList b;
    public d c = d.Data;
    public Token d = null;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);
    public final Token.g i;
    public final Token.f j;
    public Token.h k;
    public final Token.b l;
    public final Token.d m;
    public final Token.c n;
    public String o;
    public String p;
    public int q;
    public final int[] r;
    public final int[] s;

    /* compiled from: Tokeniser.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.TagOpen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.Data.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        t = cArr;
        Arrays.sort(cArr);
    }

    public c(bmb bmbVar, ParseErrorList parseErrorList) {
        Token.g gVar = new Token.g();
        this.i = gVar;
        this.j = new Token.f();
        this.k = gVar;
        this.l = new Token.b();
        this.m = new Token.d();
        this.n = new Token.c();
        this.q = -1;
        this.r = new int[1];
        this.s = new int[2];
        this.a = bmbVar;
        this.b = parseErrorList;
    }

    public final void a(d dVar) {
        p(dVar);
        this.a.a();
    }

    public final void b(String str, Object... objArr) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.i()) {
            String format = String.format("Invalid character reference: ".concat(str), objArr);
            j0u0 j0u0Var = new j0u0(4);
            bmb bmbVar = this.a;
            bmbVar.getClass();
            j0u0Var.b = bmbVar.m();
            j0u0Var.c = format;
            parseErrorList.add(j0u0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (java.util.Arrays.binarySearch(org.jsoup.parser.c.t, r0.a[r0.e]) >= 0) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch, boolean z) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        String c5;
        char c6;
        int i3;
        int i4;
        char c7;
        bmb bmbVar = this.a;
        if (!bmbVar.n() && (ch == null || ch.charValue() != bmbVar.l())) {
            bmbVar.b();
            if (!bmbVar.n()) {
            }
            if (bmbVar.c - bmbVar.e < 1024) {
                bmbVar.d = 0;
            }
            bmbVar.b();
            bmbVar.g = bmbVar.e;
            boolean p = bmbVar.p("#");
            int[] iArr = this.r;
            if (p) {
                boolean q = bmbVar.q("X");
                if (q) {
                    bmbVar.b();
                    int i5 = bmbVar.e;
                    while (true) {
                        i4 = bmbVar.e;
                        if (i4 >= bmbVar.c || (((c7 = bmbVar.a[i4]) < '0' || c7 > '9') && ((c7 < 'A' || c7 > 'F') && (c7 < 'a' || c7 > 'f')))) {
                            break;
                        }
                        bmbVar.e = i4 + 1;
                    }
                    c5 = bmb.c(bmbVar.a, bmbVar.h, i5, i4 - i5);
                } else {
                    bmbVar.b();
                    int i6 = bmbVar.e;
                    while (true) {
                        i2 = bmbVar.e;
                        if (i2 >= bmbVar.c || (c6 = bmbVar.a[i2]) < '0' || c6 > '9') {
                            break;
                        }
                        bmbVar.e = i2 + 1;
                    }
                    c5 = bmb.c(bmbVar.a, bmbVar.h, i6, i2 - i6);
                }
                if (c5.length() == 0) {
                    b("numeric reference with no numerals", new Object[0]);
                    bmbVar.x();
                    return null;
                }
                bmbVar.g = -1;
                if (!bmbVar.p(";")) {
                    b("missing semicolon on [&#%s]", c5);
                }
                try {
                    i3 = Integer.valueOf(c5, q ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i3 = -1;
                }
                if (i3 == -1 || ((i3 >= 55296 && i3 <= 57343) || i3 > 1114111)) {
                    b("character [%s] outside of valid range", Integer.valueOf(i3));
                    iArr[0] = 65533;
                } else {
                    if (i3 >= 128 && i3 < 160) {
                        b("character [%s] is not a valid unicode code point", Integer.valueOf(i3));
                        i3 = u[i3 - 128];
                    }
                    iArr[0] = i3;
                }
                return iArr;
            }
            bmbVar.b();
            int i7 = bmbVar.e;
            while (true) {
                int i8 = bmbVar.e;
                if (i8 >= bmbVar.c || (((c4 = bmbVar.a[i8]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                    break;
                }
                bmbVar.e++;
            }
            while (true) {
                i = bmbVar.e;
                if (i < bmbVar.c && (c3 = bmbVar.a[i]) >= '0' && c3 <= '9') {
                    bmbVar.e = i + 1;
                }
            }
            String c8 = bmb.c(bmbVar.a, bmbVar.h, i7, i - i7);
            boolean r = bmbVar.r(';');
            char[] cArr = Entities.a;
            if (Entities.EscapeMode.base.a(c8) != -1 || (Entities.EscapeMode.extended.a(c8) != -1 && r)) {
                if (z && (bmbVar.u() || ((!bmbVar.n() && (c2 = bmbVar.a[bmbVar.e]) >= '0' && c2 <= '9') || bmbVar.s(B5.U, '-', '_')))) {
                    bmbVar.x();
                    return null;
                }
                bmbVar.g = -1;
                if (!bmbVar.p(";")) {
                    b("missing semicolon on [&%s]", c8);
                }
                String str = Entities.b.get(c8);
                int[] iArr2 = this.s;
                if (str != null) {
                    iArr2[0] = str.codePointAt(0);
                    iArr2[1] = str.codePointAt(1);
                    c = 2;
                } else {
                    int a2 = Entities.EscapeMode.extended.a(c8);
                    if (a2 != -1) {
                        iArr2[0] = a2;
                        c = 1;
                    } else {
                        c = 0;
                    }
                }
                if (c == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (c == 2) {
                    return iArr2;
                }
                throw new ValidationException("Unexpected characters returned for ".concat(c8));
            }
            bmbVar.x();
            if (r) {
                b("invalid named reference [%s]", c8);
            }
        }
        return null;
    }

    public final Token.h d(boolean z) {
        Token.h hVar;
        if (z) {
            hVar = this.i;
            hVar.l();
        } else {
            hVar = this.j;
            hVar.l();
        }
        this.k = hVar;
        return hVar;
    }

    public final void e() {
        Token.m(this.h);
    }

    public final void f(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(c);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void g(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(str);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void h(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
        } else {
            StringBuilder sb2 = this.g;
            if (sb2.length() == 0) {
                sb2.append(this.f);
            }
            sb2.append((CharSequence) sb);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void i(Token token) {
        if (this.e) {
            throw new ValidationException("Must be false");
        }
        this.d = token;
        this.e = true;
        token.getClass();
        bmb bmbVar = this.a;
        bmbVar.getClass();
        this.q = -1;
        Token.TokenType tokenType = token.b;
        if (tokenType == Token.TokenType.StartTag) {
            this.o = ((Token.g) token).c;
            this.p = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.f fVar = (Token.f) token;
            if (fVar.r()) {
                Object[] objArr = {fVar.d};
                ParseErrorList parseErrorList = this.b;
                if (parseErrorList.i()) {
                    parseErrorList.add(new j0u0(bmbVar, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void j() {
        i(this.n);
    }

    public final void k() {
        i(this.m);
    }

    public final void l() {
        Token.h hVar = this.k;
        if (hVar.g) {
            hVar.u();
        }
        i(this.k);
    }

    public final void m(d dVar) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.i()) {
            parseErrorList.add(new j0u0(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{dVar}));
        }
    }

    public final void n(d dVar) {
        ParseErrorList parseErrorList = this.b;
        if (parseErrorList.i()) {
            bmb bmbVar = this.a;
            parseErrorList.add(new j0u0(bmbVar, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(bmbVar.l()), dVar}));
        }
    }

    public final boolean o() {
        return this.o != null && this.k.s().equalsIgnoreCase(this.o);
    }

    public final void p(d dVar) {
        int i = a.a[dVar.ordinal()];
        bmb bmbVar = this.a;
        if (i == 1) {
            bmbVar.w();
        } else if (i == 2 && this.q == -1) {
            this.q = bmbVar.w();
        }
        this.c = dVar;
    }
}
