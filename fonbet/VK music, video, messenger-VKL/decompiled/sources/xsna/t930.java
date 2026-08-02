package xsna;

/* compiled from: MoreState.kt */
/* loaded from: classes16.dex */
public final class t930 {
    public final r830 a;
    public final s830 b;

    public t930() {
        this((r830) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t930)) {
            return false;
        }
        t930 t930Var = (t930) obj;
        return epx.f(this.a, t930Var.a) && epx.f(this.b, t930Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoreState(config=" + this.a + ", content=" + this.b + ')';
    }

    public t930(r830 r830Var, s830 s830Var) {
        this.a = r830Var;
        this.b = s830Var;
    }

    public /* synthetic */ t930(r830 r830Var, int i) {
        this((i & 1) != 0 ? new r830(0) : r830Var, new s830(true));
    }
}
