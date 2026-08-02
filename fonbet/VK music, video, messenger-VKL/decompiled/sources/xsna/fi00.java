package xsna;

/* compiled from: ManagedGroupsCountersApiModel.kt */
/* loaded from: classes2.dex */
public final class fi00 {
    public final int a;
    public final int b;
    public final int c;

    public fi00() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi00)) {
            return false;
        }
        fi00 fi00Var = (fi00) obj;
        return this.a == fi00Var.a && this.b == fi00Var.b && this.c == fi00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroupsCountersApiModel(totalGroups=");
        sb.append(this.a);
        sb.append(", dialogsUnreadCount=");
        sb.append(this.b);
        sb.append(", dialogsUnreadUnmutedCount=");
        return vu5.b(sb, this.c, ')');
    }

    public fi00(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
