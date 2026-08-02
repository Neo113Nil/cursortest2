package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ht6 implements fk2 {
    public static final ht6 d;
    public final long a;
    public final long b;
    public final long c;

    static {
        uh6.x(1);
        long w = uh6.w(0.25d);
        d = new ht6(w, w, uh6.w(0.25d));
    }

    public ht6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ht6)) {
            return false;
        }
        ht6 ht6Var = (ht6) obj;
        if (!sty0.a(this.a, ht6Var.a) || !sty0.a(this.b, ht6Var.b)) {
            return false;
        }
        sty0.a(this.c, ht6Var.c);
        return false;
    }

    public final int hashCode() {
        int hashCode = yub.b.hashCode() * 31;
        tty0[] tty0VarArr = sty0.b;
        return i3r.a.hashCode() + g8e.c(Float.NaN, qv10.c(qv10.c(qv10.c(hashCode, 31, this.a), 31, this.b), 961, this.c), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + yub.b + ", size=(" + ((Object) sty0.e(this.a)) + Extension.FIX_SPACE + ((Object) sty0.e(this.b)) + "), padding=" + ((Object) sty0.e(this.c)) + ", brush=null, alpha=NaN, drawStyle=" + i3r.a + ')';
    }
}
