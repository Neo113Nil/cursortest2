package xsna;

/* compiled from: NegativeRepliesPlaceholder.kt */
/* loaded from: classes16.dex */
public final class r060 {
    public final String a;
    public final String b;
    public final String c;

    public r060(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r060)) {
            return false;
        }
        r060 r060Var = (r060) obj;
        return epx.f(this.a, r060Var.a) && epx.f(this.b, r060Var.b) && epx.f(this.c, r060Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NegativeRepliesPlaceholder(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", animation=");
        return ho8.a(sb, this.c, ')');
    }
}
