package xsna;

/* compiled from: ReactionsConfig.kt */
/* loaded from: classes16.dex */
public final class c3f0 {
    public final w6z a;
    public final xbn b;

    public c3f0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3f0)) {
            return false;
        }
        c3f0 c3f0Var = (c3f0) obj;
        return epx.f(this.a, c3f0Var.a) && epx.f(this.b, c3f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionsConfig(likesConfig=" + this.a + ", dislikesConfig=" + this.b + ')';
    }

    public c3f0(w6z w6zVar, xbn xbnVar) {
        this.a = w6zVar;
        this.b = xbnVar;
    }

    public /* synthetic */ c3f0(int i) {
        this(new w6z(null, null, 15), new xbn(null, 15));
    }
}
