package xsna;

/* compiled from: ClipsUploadAuthorsViewState.kt */
/* loaded from: classes17.dex */
public final class ub5 {
    public final long a;
    public final String b;
    public final String c;

    public ub5(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub5)) {
            return false;
        }
        ub5 ub5Var = (ub5) obj;
        return this.a == ub5Var.a && epx.f(this.b, ub5Var.b) && epx.f(this.c, ub5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorItemViewState(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }
}
