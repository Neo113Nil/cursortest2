package xsna;

/* compiled from: EditingBuffer.kt */
/* loaded from: classes11.dex */
public final class c2p {
    public final mk90 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public c2p(us2 us2Var, long j) {
        String str = us2Var.c;
        mk90 mk90Var = new mk90();
        mk90Var.a = str;
        mk90Var.c = -1;
        mk90Var.d = -1;
        this.a = mk90Var;
        this.b = qko0.f(j);
        this.c = qko0.e(j);
        this.d = -1;
        this.e = -1;
        int f = qko0.f(j);
        int e = qko0.e(j);
        if (f < 0 || f > str.length()) {
            StringBuilder b = ji.b(f, "start (", ") offset is outside of text region ");
            b.append(str.length());
            throw new IndexOutOfBoundsException(b.toString());
        }
        if (e < 0 || e > str.length()) {
            StringBuilder b2 = ji.b(e, "end (", ") offset is outside of text region ");
            b2.append(str.length());
            throw new IndexOutOfBoundsException(b2.toString());
        }
        if (f > e) {
            throw new IllegalArgumentException(efz.a(f, e, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i, int i2) {
        long c = jgz.c(i, i2);
        this.a.b(i, i2, "");
        long x = wwf0.x(jgz.c(this.b, this.c), c);
        j(qko0.f(x));
        i(qko0.e(x));
        if (e()) {
            long x2 = wwf0.x(jgz.c(this.d, this.e), c);
            if (qko0.c(x2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = qko0.f(x2);
                this.e = qko0.e(x2);
            }
        }
    }

    public final char b(int i) {
        mk90 mk90Var = this.a;
        sgt sgtVar = mk90Var.b;
        if (sgtVar == null) {
            return mk90Var.a.charAt(i);
        }
        if (i < mk90Var.c) {
            return mk90Var.a.charAt(i);
        }
        int a = sgtVar.a - sgtVar.a();
        int i2 = mk90Var.c;
        if (i >= a + i2) {
            return mk90Var.a.charAt(i - ((a - mk90Var.d) + i2));
        }
        int i3 = i - i2;
        int i4 = sgtVar.c;
        return i3 < i4 ? sgtVar.b[i3] : sgtVar.b[(i3 - i4) + sgtVar.d];
    }

    public final qko0 c() {
        if (e()) {
            return new qko0(jgz.c(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i, int i2, String str) {
        mk90 mk90Var = this.a;
        if (i < 0 || i > mk90Var.a()) {
            StringBuilder b = ji.b(i, "start (", ") offset is outside of text region ");
            b.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b.toString());
        }
        if (i2 < 0 || i2 > mk90Var.a()) {
            StringBuilder b2 = ji.b(i2, "end (", ") offset is outside of text region ");
            b2.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(efz.a(i, i2, "Do not set reversed range: ", " > "));
        }
        mk90Var.b(i, i2, str);
        j(str.length() + i);
        i(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void g(int i, int i2) {
        mk90 mk90Var = this.a;
        if (i < 0 || i > mk90Var.a()) {
            StringBuilder b = ji.b(i, "start (", ") offset is outside of text region ");
            b.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b.toString());
        }
        if (i2 < 0 || i2 > mk90Var.a()) {
            StringBuilder b2 = ji.b(i2, "end (", ") offset is outside of text region ");
            b2.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(efz.a(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.d = i;
        this.e = i2;
    }

    public final void h(int i, int i2) {
        mk90 mk90Var = this.a;
        if (i < 0 || i > mk90Var.a()) {
            StringBuilder b = ji.b(i, "start (", ") offset is outside of text region ");
            b.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b.toString());
        }
        if (i2 < 0 || i2 > mk90Var.a()) {
            StringBuilder b2 = ji.b(i2, "end (", ") offset is outside of text region ");
            b2.append(mk90Var.a());
            throw new IndexOutOfBoundsException(b2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(efz.a(i, i2, "Do not set reversed range: ", " > "));
        }
        j(i);
        i(i2);
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            vzw.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void j(int i) {
        if (!(i >= 0)) {
            vzw.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
