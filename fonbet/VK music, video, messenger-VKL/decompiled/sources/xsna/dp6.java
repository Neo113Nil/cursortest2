package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import xsna.dp6;

/* compiled from: TextPreparedSelection.kt */
/* loaded from: classes11.dex */
public abstract class dp6<T extends dp6<T>> {
    public final us2 a;
    public final long b;
    public final ljo0 c;
    public final uv70 d;
    public final pko0 e;
    public long f;
    public final us2 g;

    public dp6(us2 us2Var, long j, ljo0 ljo0Var, uv70 uv70Var, pko0 pko0Var) {
        this.a = us2Var;
        this.b = j;
        this.c = ljo0Var;
        this.d = uv70Var;
        this.e = pko0Var;
        this.f = j;
        this.g = us2Var;
    }

    public final Integer a() {
        ljo0 ljo0Var = this.c;
        if (ljo0Var == null) {
            return null;
        }
        m540 m540Var = ljo0Var.b;
        int e = qko0.e(this.f);
        uv70 uv70Var = this.d;
        return Integer.valueOf(uv70Var.a(m540Var.c(m540Var.d(uv70Var.b(e)), true)));
    }

    public final Integer b() {
        ljo0 ljo0Var = this.c;
        if (ljo0Var == null) {
            return null;
        }
        m540 m540Var = ljo0Var.b;
        int f = qko0.f(this.f);
        uv70 uv70Var = this.d;
        return Integer.valueOf(uv70Var.a(m540Var.f(m540Var.d(uv70Var.b(f)))));
    }

    public final Integer c() {
        int length;
        ljo0 ljo0Var = this.c;
        if (ljo0Var == null) {
            return null;
        }
        int p = p();
        while (true) {
            us2 us2Var = this.a;
            if (p < us2Var.c.length()) {
                int length2 = this.g.c.length() - 1;
                if (p <= length2) {
                    length2 = p;
                }
                long l = ljo0Var.l(length2);
                int i = qko0.c;
                int i2 = (int) (l & 4294967295L);
                if (i2 > p) {
                    length = this.d.a(i2);
                    break;
                }
                p++;
            } else {
                length = us2Var.c.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i;
        ljo0 ljo0Var = this.c;
        if (ljo0Var == null) {
            return null;
        }
        int p = p();
        while (true) {
            if (p <= 0) {
                i = 0;
                break;
            }
            int length = this.g.c.length() - 1;
            if (p <= length) {
                length = p;
            }
            long l = ljo0Var.l(length);
            int i2 = qko0.c;
            int i3 = (int) (l >> 32);
            if (i3 < p) {
                i = this.d.a(i3);
                break;
            }
            p--;
        }
        return Integer.valueOf(i);
    }

    public final boolean e() {
        ljo0 ljo0Var = this.c;
        return (ljo0Var != null ? ljo0Var.j(p()) : null) != ResolvedTextDirection.Rtl;
    }

    public final int f(ljo0 ljo0Var, int i) {
        int p = p();
        pko0 pko0Var = this.e;
        if (pko0Var.a == null) {
            pko0Var.a = Float.valueOf(ljo0Var.c(p).a);
        }
        m540 m540Var = ljo0Var.b;
        int d = m540Var.d(p) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= m540Var.f) {
            return this.g.c.length();
        }
        float b = m540Var.b(d) - 1;
        Float f = pko0Var.a;
        float floatValue = f.floatValue();
        if ((e() && floatValue >= ljo0Var.i(d)) || (!e() && floatValue <= ljo0Var.h(d))) {
            return m540Var.c(d, true);
        }
        return this.d.a(m540Var.h((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void g() {
        pko0 pko0Var = this.e;
        pko0Var.a = null;
        us2 us2Var = this.g;
        if (us2Var.c.length() > 0) {
            if (e()) {
                i();
                return;
            }
            pko0Var.a = null;
            if (us2Var.c.length() > 0) {
                String str = us2Var.c;
                long j = this.f;
                int i = qko0.c;
                int f = kci.f((int) (j & 4294967295L), str);
                if (f != -1) {
                    o(f, f);
                }
            }
        }
    }

    public final void h() {
        this.e.a = null;
        us2 us2Var = this.g;
        String str = us2Var.c;
        String str2 = us2Var.c;
        if (str.length() > 0) {
            int b = xus.b(qko0.e(this.f), str2);
            if (b == qko0.e(this.f) && b != str2.length()) {
                b = xus.b(b + 1, str2);
            }
            o(b, b);
        }
    }

    public final void i() {
        this.e.a = null;
        us2 us2Var = this.g;
        if (us2Var.c.length() > 0) {
            String str = us2Var.c;
            long j = this.f;
            int i = qko0.c;
            int g = kci.g((int) (j & 4294967295L), str);
            if (g != -1) {
                o(g, g);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        us2 us2Var = this.g;
        String str = us2Var.c;
        String str2 = us2Var.c;
        if (str.length() > 0) {
            int c = xus.c(qko0.f(this.f), str2);
            if (c == qko0.f(this.f) && c != 0) {
                c = xus.c(c - 1, str2);
            }
            o(c, c);
        }
    }

    public final void k() {
        pko0 pko0Var = this.e;
        pko0Var.a = null;
        us2 us2Var = this.g;
        if (us2Var.c.length() > 0) {
            if (!e()) {
                i();
                return;
            }
            pko0Var.a = null;
            if (us2Var.c.length() > 0) {
                String str = us2Var.c;
                long j = this.f;
                int i = qko0.c;
                int f = kci.f((int) (j & 4294967295L), str);
                if (f != -1) {
                    o(f, f);
                }
            }
        }
    }

    public final void l() {
        Integer a;
        this.e.a = null;
        if (this.g.c.length() <= 0 || (a = a()) == null) {
            return;
        }
        int intValue = a.intValue();
        o(intValue, intValue);
    }

    public final void m() {
        Integer b;
        this.e.a = null;
        if (this.g.c.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        o(intValue, intValue);
    }

    public final void n() {
        if (this.g.c.length() > 0) {
            int i = qko0.c;
            this.f = jgz.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = jgz.c(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = qko0.c;
        return this.d.b((int) (j & 4294967295L));
    }
}
