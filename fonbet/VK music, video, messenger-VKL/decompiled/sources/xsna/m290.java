package xsna;

/* compiled from: OverlayData.kt */
/* loaded from: classes2.dex */
public final class m290 {
    public final int a;
    public final long b;
    public final int c;

    public m290(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m290)) {
            return false;
        }
        m290 m290Var = (m290) obj;
        return this.a == m290Var.a && this.b == m290Var.b && this.c == m290Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayData(slotId=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", closeButtonDelay=");
        return vu5.b(sb, this.c, ')');
    }
}
