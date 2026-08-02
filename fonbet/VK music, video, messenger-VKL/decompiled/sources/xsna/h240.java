package xsna;

/* compiled from: MultiAccountIdData.kt */
/* loaded from: classes11.dex */
public final class h240 {
    public static final h240 d = new h240("", 0, false);
    public final String a;
    public final long b;
    public final boolean c;

    public h240(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h240)) {
            return false;
        }
        h240 h240Var = (h240) obj;
        return epx.f(this.a, h240Var.a) && this.b == h240Var.b && this.c == h240Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiAccountIdData(id=");
        sb.append(this.a);
        sb.append(", created=");
        sb.append(this.b);
        sb.append(", sent=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
