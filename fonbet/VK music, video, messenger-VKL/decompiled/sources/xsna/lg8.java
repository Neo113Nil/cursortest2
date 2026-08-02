package xsna;

/* compiled from: BroadcastHistory.kt */
/* loaded from: classes7.dex */
public final class lg8 {
    public final hd8 a;
    public final hd8 b;

    public lg8(hd8 hd8Var, hd8 hd8Var2) {
        this.a = hd8Var;
        this.b = hd8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg8)) {
            return false;
        }
        lg8 lg8Var = (lg8) obj;
        return epx.f(this.a, lg8Var.a) && epx.f(this.b, lg8Var.b);
    }

    public final int hashCode() {
        hd8 hd8Var = this.a;
        int hashCode = (hd8Var == null ? 0 : hd8Var.hashCode()) * 31;
        hd8 hd8Var2 = this.b;
        return hashCode + (hd8Var2 != null ? hd8Var2.hashCode() : 0);
    }

    public final String toString() {
        return "BroadcastHistory(currentState=" + this.a + ", previousState=" + this.b + ')';
    }
}
