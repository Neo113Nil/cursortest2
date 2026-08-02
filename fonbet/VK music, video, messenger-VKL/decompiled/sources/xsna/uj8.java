package xsna;

/* compiled from: BroadcastStartInfo.kt */
/* loaded from: classes7.dex */
public final class uj8 {
    public final boolean a;
    public final qvw0 b;

    public uj8(qvw0 qvw0Var, boolean z) {
        this.a = z;
        this.b = qvw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj8)) {
            return false;
        }
        uj8 uj8Var = (uj8) obj;
        return this.a == uj8Var.a && epx.f(this.b, uj8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BroadcastStartInfo(isRecord=" + this.a + ", startedBy=" + this.b + ')';
    }
}
