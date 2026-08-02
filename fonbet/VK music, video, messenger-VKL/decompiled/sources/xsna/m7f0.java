package xsna;

/* compiled from: ChannelApiModel.kt */
/* loaded from: classes2.dex */
public final class m7f0 {
    public final int a;
    public final int b;

    public m7f0() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7f0)) {
            return false;
        }
        m7f0 m7f0Var = (m7f0) obj;
        return this.a == m7f0Var.a && this.b == m7f0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadState(readUpToCmid=");
        sb.append(this.a);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.b, ')');
    }

    public m7f0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
