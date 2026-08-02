package xsna;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class mm01 extends dn01 {
    public final int a;
    public final long b;

    public mm01(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // xsna.dn01
    public final int a() {
        return this.a;
    }

    @Override // xsna.dn01
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dn01)) {
            return false;
        }
        dn01 dn01Var = (dn01) obj;
        return this.a == dn01Var.a() && this.b == dn01Var.b();
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        return (i * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder b = jr.b(this.a, "EventRecord{eventType=", ", eventTimestamp=", this.b);
        b.append("}");
        return b.toString();
    }
}
