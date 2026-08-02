package xsna;

/* compiled from: BackoffConfig.kt */
/* loaded from: classes15.dex */
public final class ux5 {
    public final int a;
    public final long b;

    public ux5() {
        this(0);
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux5)) {
            return false;
        }
        ux5 ux5Var = (ux5) obj;
        return this.a == ux5Var.a && this.b == ux5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackoffConfig(failureAttempts=");
        sb.append(this.a);
        sb.append(", backoffStartTime=");
        return vu5.a(')', this.b, sb);
    }

    public /* synthetic */ ux5(int i) {
        this(0, -1L);
    }

    public ux5(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
