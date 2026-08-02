package xsna;

/* compiled from: TextWithAgeBadge.kt */
/* loaded from: classes6.dex */
public final class uno0 {
    public final String a;
    public final frv0 b;
    public final String c;
    public final int d;
    public final gzs<s3q0> e;

    public uno0() {
        throw null;
    }

    public uno0(String str, frv0 frv0Var, String str2, gzs gzsVar) {
        this.a = str;
        this.b = frv0Var;
        this.c = str2;
        this.d = 2;
        this.e = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uno0)) {
            return false;
        }
        uno0 uno0Var = (uno0) obj;
        return epx.f(this.a, uno0Var.a) && epx.f(this.b, uno0Var.b) && epx.f(this.c, uno0Var.c) && this.d == uno0Var.d && epx.f(this.e, uno0Var.e);
    }

    public final int hashCode() {
        int a = bjl0.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.e.hashCode() + shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextWithAgeBadgeState(text=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", ageBadgeText=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", onAgeBadgeClick=");
        return uf3.d(sb, this.e, ')');
    }
}
