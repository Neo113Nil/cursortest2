package xsna;

/* compiled from: MsgHistoryOnServerIsEmpty.kt */
/* loaded from: classes2.dex */
public final class yj30 {
    public final long a;
    public final boolean b;
    public final int c;

    public yj30(int i, long j, boolean z) {
        this.a = j;
        this.b = z;
        this.c = i;
    }

    public static yj30 a(yj30 yj30Var, boolean z) {
        long j = yj30Var.a;
        int i = yj30Var.c;
        yj30Var.getClass();
        return new yj30(i, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj30)) {
            return false;
        }
        yj30 yj30Var = (yj30) obj;
        return this.a == yj30Var.a && this.b == yj30Var.b && this.c == yj30Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryOnServerIsEmpty(dialogId=");
        sb.append(this.a);
        sb.append(", isEmpty=");
        sb.append(this.b);
        sb.append(", phase=");
        return vu5.b(sb, this.c, ')');
    }
}
