package xsna;

/* compiled from: ScopeItem.kt */
/* loaded from: classes6.dex */
public final class bah0 {
    public final String a;
    public final String b;

    public bah0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bah0)) {
            return false;
        }
        bah0 bah0Var = (bah0) obj;
        return epx.f(this.a, bah0Var.a) && epx.f(this.b, bah0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScopeItem(scope=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
