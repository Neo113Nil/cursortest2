package xsna;

/* compiled from: StringJsonLexer.kt */
/* loaded from: classes8.dex */
public class fqm0 extends af {
    public final String e;

    public fqm0(String str) {
        this.e = str;
    }

    @Override // xsna.af
    public int A() {
        char charAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    @Override // xsna.af
    public boolean c() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i;
                return af.v(charAt);
            }
            i++;
        }
    }

    @Override // xsna.af
    public final String e() {
        h('\"');
        int i = this.a;
        String str = this.e;
        int L = drm0.L(str, '\"', i, 4);
        if (L == -1) {
            l();
            r((byte) 1, false);
            throw null;
        }
        for (int i2 = i; i2 < L; i2++) {
            if (str.charAt(i2) == '\\') {
                return k(this.a, i2, str);
            }
        }
        this.a = L + 1;
        return str.substring(i, L);
    }

    @Override // xsna.af
    public byte f() {
        String str;
        int i = this.a;
        while (true) {
            str = this.e;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                return jgz.l(charAt);
            }
            i = i2;
        }
        this.a = str.length();
        return (byte) 10;
    }

    @Override // xsna.af
    public void h(char c) {
        int i = this.a;
        if (i == -1) {
            E(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                E(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                if (charAt == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // xsna.af
    public final CharSequence u() {
        return this.e;
    }

    @Override // xsna.af
    public final String w(String str, boolean z) {
        int i = this.a;
        try {
            if (f() == 6 && epx.f(y(z), str)) {
                this.c = null;
                if (f() == 5) {
                    return y(z);
                }
            }
            return null;
        } finally {
            this.a = i;
            this.c = null;
        }
    }

    @Override // xsna.af
    public final int z(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }
}
