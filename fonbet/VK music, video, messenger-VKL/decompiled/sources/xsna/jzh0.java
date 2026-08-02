package xsna;

/* compiled from: SearchTag.kt */
/* loaded from: classes6.dex */
public final class jzh0 {
    public final long a;
    public final String b;

    public jzh0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzh0)) {
            return false;
        }
        jzh0 jzh0Var = (jzh0) obj;
        return this.a == jzh0Var.a && epx.f(this.b, jzh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchTag(id=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
