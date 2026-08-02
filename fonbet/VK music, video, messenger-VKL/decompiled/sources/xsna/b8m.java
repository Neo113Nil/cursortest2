package xsna;

/* compiled from: Node.kt */
/* loaded from: classes.dex */
public final class b8m implements z470 {
    public final pwj0 a;

    public b8m(pwj0 pwj0Var) {
        this.a = pwj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8m) && epx.f(this.a, ((b8m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DiScopeNodeKey(scopeKey=" + this.a + ')';
    }
}
