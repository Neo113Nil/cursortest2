package defpackage;

import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes9.dex */
public class cci0 extends b8 {
    public final yvi0 f;
    public final char[] g;
    public int h;
    public final o43 i;

    public cci0(yvi0 yvi0Var, char[] cArr, ccx ccxVar) {
        super(ccxVar);
        this.f = yvi0Var;
        this.g = cArr;
        this.h = 128;
        this.i = new o43(cArr);
        D(0);
    }

    public final void D(int i) {
        o43 o43Var = this.i;
        char[] cArr = o43Var.a;
        if (i != 0) {
            int i2 = this.b;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = o43Var.b;
        while (true) {
            if (i == i3) {
                break;
            }
            int a = ((tza) this.f.a).a(cArr, i, i3 - i);
            if (a == -1) {
                o43Var.b = Math.min(o43Var.a.length, i);
                this.h = -1;
                break;
            }
            i += a;
        }
        this.b = 0;
    }

    public final void E() {
        wi9 wi9Var = wi9.c;
        char[] cArr = this.g;
        if (cArr.length == 16384) {
            wi9Var.a(cArr);
        } else {
            wi9Var.getClass();
            dac.e(cArr.length, "Inconsistent internal invariant: unexpected array size ");
        }
    }

    @Override // defpackage.b8
    public final void b(int i, int i2) {
        this.e.append(this.i.a, i, i2 - i);
    }

    @Override // defpackage.b8
    public boolean c() {
        n();
        int i = this.b;
        while (true) {
            int x = x(i);
            if (x == -1) {
                this.b = x;
                return false;
            }
            char c = this.i.a[x];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = x;
                return b8.t(c);
            }
            i = x + 1;
        }
    }

    @Override // defpackage.b8
    public final String e() {
        h(OpenList.CHAR_QUOTE);
        int i = this.b;
        o43 o43Var = this.i;
        int i2 = o43Var.b;
        char[] cArr = o43Var.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int x = x(i);
            int i4 = this.b;
            if (x != -1) {
                return k(i4, x, o43Var);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            b8.q(this, oyr.p("Expected quotation mark '\"', but had '", (i4 == o43Var.b || i5 < 0) ? "EOF" : String.valueOf(o43Var.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return k(this.b, i6, o43Var);
            }
        }
        this.b = i3 + 1;
        return cvu0.o(cArr, i, Math.min(i3, o43Var.b));
    }

    @Override // defpackage.b8
    public byte f() {
        n();
        int i = this.b;
        while (true) {
            int x = x(i);
            if (x == -1) {
                this.b = x;
                return (byte) 10;
            }
            int i2 = x + 1;
            byte l = tje.l(this.i.a[x]);
            if (l != 3) {
                this.b = i2;
                return l;
            }
            i = i2;
        }
    }

    @Override // defpackage.b8
    public void h(char c) {
        n();
        int i = this.b;
        while (true) {
            int x = x(i);
            if (x == -1) {
                this.b = x;
                C(c);
                throw null;
            }
            int i2 = x + 1;
            char c2 = this.i.a[x];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                C(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.b8
    public final void n() {
        int i = this.i.b - this.b;
        if (i > this.h) {
            return;
        }
        D(i);
    }

    @Override // defpackage.b8
    public final CharSequence s() {
        return this.i;
    }

    @Override // defpackage.b8
    public final String u(String str, boolean z) {
        return null;
    }

    @Override // defpackage.b8
    public final int x(int i) {
        o43 o43Var = this.i;
        if (i < o43Var.b) {
            return i;
        }
        this.b = i;
        n();
        return (this.b != 0 || o43Var.length() == 0) ? -1 : 0;
    }

    @Override // defpackage.b8
    public int y() {
        int x;
        char c;
        int i = this.b;
        while (true) {
            x = x(i);
            if (x == -1 || !((c = this.i.a[x]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = x + 1;
        }
        this.b = x;
        return x;
    }

    @Override // defpackage.b8
    public final String z(int i, int i2) {
        o43 o43Var = this.i;
        return cvu0.o(o43Var.a, i, Math.min(i2, o43Var.b));
    }
}
