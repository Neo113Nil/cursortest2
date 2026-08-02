package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class eb5 {
    public final la5 a;
    public final ka5 b;

    public eb5(la5 la5Var, ka5 ka5Var) {
        this.a = la5Var;
        this.b = ka5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb5)) {
            return false;
        }
        eb5 eb5Var = (eb5) obj;
        return epx.f(this.a, eb5Var.a) && epx.f(this.b, eb5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthorHeaderPicturePagerPagination(state=" + this.a + ", callbacks=" + this.b + ')';
    }
}
