package xsna;

/* compiled from: ManagedGroupsCounters.kt */
/* loaded from: classes3.dex */
public final class ei00 {
    public static final ei00 d = new ei00(0, 0, 0);
    public final int a;
    public final int b;
    public final int c;

    public ei00(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei00)) {
            return false;
        }
        ei00 ei00Var = (ei00) obj;
        return this.a == ei00Var.a && this.b == ei00Var.b && this.c == ei00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroupsCounters(totalGroups=");
        sb.append(this.a);
        sb.append(", dialogsUnreadCount=");
        sb.append(this.b);
        sb.append(", dialogsUnreadUnmutedCount=");
        return vu5.b(sb, this.c, ')');
    }
}
