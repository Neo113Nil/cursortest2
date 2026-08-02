package xsna;

/* compiled from: Segment.kt */
/* loaded from: classes11.dex */
public final class m4i0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public m4i0 f;
    public m4i0 g;

    public m4i0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final m4i0 a() {
        m4i0 m4i0Var = this.f;
        m4i0 m4i0Var2 = m4i0Var != this ? m4i0Var : null;
        m4i0 m4i0Var3 = this.g;
        m4i0Var3.f = m4i0Var;
        this.f.g = m4i0Var3;
        this.f = null;
        this.g = null;
        return m4i0Var2;
    }

    public final void b(m4i0 m4i0Var) {
        m4i0Var.g = this;
        m4i0Var.f = this.f;
        this.f.g = m4i0Var;
        this.f = m4i0Var;
    }

    public final m4i0 c() {
        this.d = true;
        return new m4i0(this.a, this.b, this.c, true, false);
    }

    public final void d(m4i0 m4i0Var, int i) {
        boolean z = m4i0Var.e;
        byte[] bArr = m4i0Var.a;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = m4i0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (m4i0Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = m4i0Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            jw5.j(bArr, i4, i2, bArr, 2);
            m4i0Var.c -= m4i0Var.b;
            m4i0Var.b = 0;
        }
        int i5 = m4i0Var.c;
        int i6 = this.b;
        jw5.f(this.a, i5, i6, bArr, i6 + i);
        m4i0Var.c += i;
        this.b += i;
    }

    public m4i0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
