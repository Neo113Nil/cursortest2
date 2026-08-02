package xsna;

/* compiled from: QueueAccessError.kt */
/* loaded from: classes5.dex */
public final class wqe0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public wqe0(int i, int i2) {
        this.a = i;
        this.b = i2;
        boolean z = false;
        this.c = i == 2 && (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5);
        if (i == 2 && i2 == 4) {
            z = true;
        }
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqe0)) {
            return false;
        }
        wqe0 wqe0Var = (wqe0) obj;
        return this.a == wqe0Var.a && this.b == wqe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueAccessError(failed=");
        sb.append(this.a);
        sb.append(", error=");
        return vu5.b(sb, this.b, ')');
    }
}
