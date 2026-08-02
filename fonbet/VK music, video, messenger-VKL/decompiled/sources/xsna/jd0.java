package xsna;

/* compiled from: AdChoice.kt */
/* loaded from: classes14.dex */
public final class jd0 {
    public final long a;
    public final String b;

    public jd0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd0)) {
            return false;
        }
        jd0 jd0Var = (jd0) obj;
        return this.a == jd0Var.a && epx.f(this.b, jd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdChoice(id=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
