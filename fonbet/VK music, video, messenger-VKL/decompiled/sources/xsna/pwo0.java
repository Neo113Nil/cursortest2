package xsna;

/* compiled from: TimelineIndex.kt */
/* loaded from: classes18.dex */
public final class pwo0 {
    public final int a;
    public final int b;

    public pwo0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwo0)) {
            return false;
        }
        pwo0 pwo0Var = (pwo0) obj;
        return this.a == pwo0Var.a && this.b == pwo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineIndex(x=");
        sb.append(this.a);
        sb.append(", y=");
        return vu5.b(sb, this.b, ')');
    }
}
