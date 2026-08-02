package defpackage;

import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes9.dex */
public class ltu0 extends b8 {
    public final String f;

    public ltu0(String str, ccx ccxVar) {
        super(ccxVar);
        this.f = str;
    }

    @Override // defpackage.b8
    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                return b8.t(charAt);
            }
            i++;
        }
    }

    @Override // defpackage.b8
    public final String e() {
        h(OpenList.CHAR_QUOTE);
        int i = this.b;
        String str = this.f;
        int G = evu0.G(str, OpenList.CHAR_QUOTE, i, 4);
        if (G == -1) {
            l();
            int i2 = this.b;
            b8.q(this, oyr.p("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < G; i3++) {
            if (str.charAt(i3) == '\\') {
                return k(this.b, i3, str);
            }
        }
        this.b = G + 1;
        return str.substring(i, G);
    }

    @Override // defpackage.b8
    public byte f() {
        String str;
        int i = this.b;
        while (true) {
            str = this.f;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                return tje.l(charAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    @Override // defpackage.b8
    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            C(c);
            throw null;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = -1;
                C(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                if (charAt == c) {
                    return;
                }
                C(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.b8
    public final CharSequence s() {
        return this.f;
    }

    @Override // defpackage.b8
    public final String u(String str, boolean z) {
        int i = this.b;
        try {
            if (f() == 6 && jl40.l(w(z), str)) {
                this.d = null;
                if (f() == 5) {
                    return w(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    @Override // defpackage.b8
    public final int x(int i) {
        if (i < this.f.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.b8
    public int y() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }
}
