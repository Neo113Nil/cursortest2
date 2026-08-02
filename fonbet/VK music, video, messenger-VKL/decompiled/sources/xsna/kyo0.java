package xsna;

/* compiled from: TimestampedValue.kt */
/* loaded from: classes17.dex */
public final class kyo0<V> {
    public final long a;
    public final vkr0 b;

    public kyo0(long j, vkr0 vkr0Var) {
        this.a = j;
        this.b = vkr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyo0)) {
            return false;
        }
        kyo0 kyo0Var = (kyo0) obj;
        return this.a == kyo0Var.a && this.b.equals(kyo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TimestampedValue(timestamp=" + this.a + ", value=" + this.b + ')';
    }
}
