package xsna;

/* compiled from: UnreadInfoDataSource.kt */
/* loaded from: classes2.dex */
public final class f5q0 {
    public final int a;
    public final int b;

    public f5q0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5q0)) {
            return false;
        }
        f5q0 f5q0Var = (f5q0) obj;
        return this.a == f5q0Var.a && this.b == f5q0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnreadInfo(countUnread=");
        sb.append(this.a);
        sb.append(", readTillInCnvMsgId=");
        return vu5.b(sb, this.b, ')');
    }
}
