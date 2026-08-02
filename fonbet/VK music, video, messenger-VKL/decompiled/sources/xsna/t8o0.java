package xsna;

/* compiled from: TemplateInfo.kt */
/* loaded from: classes16.dex */
public final class t8o0 {
    public final int a;
    public final long b;

    public t8o0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8o0)) {
            return false;
        }
        t8o0 t8o0Var = (t8o0) obj;
        return this.a == t8o0Var.a && this.b == t8o0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateInfo(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        return vu5.a(')', this.b, sb);
    }
}
