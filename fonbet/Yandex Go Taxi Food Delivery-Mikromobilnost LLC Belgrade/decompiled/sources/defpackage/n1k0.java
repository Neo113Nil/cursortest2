package defpackage;

@gsq0
/* loaded from: classes8.dex */
public final class n1k0 {
    public static final m1k0 Companion = new m1k0();
    public final int a;
    public final int b;

    public /* synthetic */ n1k0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, l1k0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1k0)) {
            return false;
        }
        n1k0 n1k0Var = (n1k0) obj;
        return this.a == n1k0Var.a && this.b == n1k0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryContext(attempt=");
        sb.append(this.a);
        sb.append(", maxAttempts=");
        return oyr.s(sb, this.b, ')');
    }

    public n1k0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
