package xsna;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class n180 extends ny50 {
    public final m180 a;
    public final f5z b;

    public n180(f5z f5zVar, m180 m180Var) {
        this.a = m180Var;
        this.b = f5zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n180)) {
            return false;
        }
        n180 n180Var = (n180) obj;
        return epx.f(this.a, n180Var.a) && epx.f(this.b, n180Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f5z f5zVar = this.b;
        return hashCode + (f5zVar == null ? 0 : f5zVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
