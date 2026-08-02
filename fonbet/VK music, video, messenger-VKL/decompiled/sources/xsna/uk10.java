package xsna;

/* compiled from: Regex.kt */
/* loaded from: classes8.dex */
public final class uk10 {
    public final String a;
    public final k9x b;

    public uk10(String str, k9x k9xVar) {
        this.a = str;
        this.b = k9xVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk10)) {
            return false;
        }
        uk10 uk10Var = (uk10) obj;
        return epx.f(this.a, uk10Var.a) && epx.f(this.b, uk10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
