package xsna;

/* compiled from: ReaderJsonLexer.kt */
/* loaded from: classes8.dex */
public class x7f0 extends af {
    public final bqz0 e;
    public final char[] f;
    public int g = 128;
    public final hk3 h;

    public x7f0(bqz0 bqz0Var, char[] cArr) {
        this.e = bqz0Var;
        this.f = cArr;
        this.h = new hk3(cArr);
        F(0);
    }

    @Override // xsna.af
    public int A() {
        int z;
        char c;
        int i = this.a;
        while (true) {
            z = z(i);
            if (z == -1 || !((c = this.h.b[z]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = z + 1;
        }
        this.a = z;
        return z;
    }

    @Override // xsna.af
    public final String B(int i, int i2) {
        hk3 hk3Var = this.h;
        return brm0.q(hk3Var.b, i, Math.min(i2, hk3Var.c));
    }

    public final void F(int i) {
        hk3 hk3Var = this.h;
        char[] cArr = hk3Var.b;
        if (i != 0) {
            int i2 = this.a;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = hk3Var.c;
        while (true) {
            if (i == i3) {
                break;
            }
            int a = ((dmb) this.e.b).a(cArr, i, i3 - i);
            if (a == -1) {
                hk3Var.c = Math.min(hk3Var.b.length, i);
                this.g = -1;
                break;
            }
            i += a;
        }
        this.a = 0;
    }

    public final void G() {
        olb olbVar = olb.c;
        olbVar.getClass();
        char[] cArr = this.f;
        if (cArr.length == 16384) {
            olbVar.d(cArr);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
        }
    }

    @Override // xsna.af
    public final void b(int i, int i2) {
        this.d.append(this.h.b, i, i2 - i);
    }

    @Override // xsna.af
    public boolean c() {
        n();
        int i = this.a;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.a = z;
                return false;
            }
            char c = this.h.b[z];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.a = z;
                return af.v(c);
            }
            i = z + 1;
        }
    }

    @Override // xsna.af
    public final String e() {
        h('\"');
        int i = this.a;
        hk3 hk3Var = this.h;
        int i2 = hk3Var.c;
        char[] cArr = hk3Var.b;
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
            int z = z(i);
            if (z != -1) {
                return k(this.a, z, hk3Var);
            }
            af.s(this, (byte) 1);
            throw null;
        }
        for (int i4 = i; i4 < i3; i4++) {
            if (cArr[i4] == '\\') {
                return k(this.a, i4, hk3Var);
            }
        }
        this.a = i3 + 1;
        return brm0.q(cArr, i, Math.min(i3, hk3Var.c));
    }

    @Override // xsna.af
    public byte f() {
        n();
        int i = this.a;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.a = z;
                return (byte) 10;
            }
            int i2 = z + 1;
            byte l = jgz.l(this.h.b[z]);
            if (l != 3) {
                this.a = i2;
                return l;
            }
            i = i2;
        }
    }

    @Override // xsna.af
    public void h(char c) {
        n();
        int i = this.a;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.a = z;
                E(c);
                throw null;
            }
            int i2 = z + 1;
            char c2 = this.h.b[z];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.a = i2;
                if (c2 == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // xsna.af
    public final void n() {
        int i = this.h.c - this.a;
        if (i > this.g) {
            return;
        }
        F(i);
    }

    @Override // xsna.af
    public final CharSequence u() {
        return this.h;
    }

    @Override // xsna.af
    public final String w(String str, boolean z) {
        return null;
    }

    @Override // xsna.af
    public final int z(int i) {
        hk3 hk3Var = this.h;
        if (i < hk3Var.c) {
            return i;
        }
        this.a = i;
        n();
        return (this.a != 0 || hk3Var.length() == 0) ? -1 : 0;
    }
}
