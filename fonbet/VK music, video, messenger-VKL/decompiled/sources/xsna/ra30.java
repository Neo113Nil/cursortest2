package xsna;

/* compiled from: MotionLayoutData.kt */
/* loaded from: classes3.dex */
public final class ra30 {
    public static final ra30 c = new ra30(0, 0);
    public final long a;
    public final int b;

    public ra30(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra30)) {
            return false;
        }
        ra30 ra30Var = (ra30) obj;
        return this.a == ra30Var.a && this.b == ra30Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MotionLayoutData(time=");
        sb.append(this.a);
        sb.append(", frames=");
        return vu5.b(sb, this.b, ')');
    }
}
