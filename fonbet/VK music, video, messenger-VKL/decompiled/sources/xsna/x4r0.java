package xsna;

/* compiled from: UxPollsDelegatesBundle.kt */
/* loaded from: classes6.dex */
public final class x4r0 {
    public final u4r0 a;
    public final y4r0 b;

    public x4r0(u4r0 u4r0Var, y4r0 y4r0Var) {
        this.a = u4r0Var;
        this.b = y4r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4r0)) {
            return false;
        }
        x4r0 x4r0Var = (x4r0) obj;
        return epx.f(this.a, x4r0Var.a) && epx.f(this.b, x4r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UxPollsDelegatesBundle(uxPollsDelegate=" + this.a + ", uxPollsEntryPointDelegate=" + this.b + ')';
    }
}
