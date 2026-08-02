package xsna;

/* compiled from: SharesState.kt */
/* loaded from: classes16.dex */
public final class abj0 {
    public final yaj0 a;
    public final zaj0 b;

    public abj0() {
        this((yaj0) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abj0)) {
            return false;
        }
        abj0 abj0Var = (abj0) obj;
        return epx.f(this.a, abj0Var.a) && epx.f(this.b, abj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharesState(config=" + this.a + ", content=" + this.b + ')';
    }

    public abj0(yaj0 yaj0Var, zaj0 zaj0Var) {
        this.a = yaj0Var;
        this.b = zaj0Var;
    }

    public /* synthetic */ abj0(yaj0 yaj0Var, int i) {
        this((i & 1) != 0 ? new yaj0(null, null, 15) : yaj0Var, new zaj0(0));
    }
}
