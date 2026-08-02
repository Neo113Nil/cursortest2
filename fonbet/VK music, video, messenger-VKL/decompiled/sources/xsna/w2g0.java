package xsna;

/* compiled from: RepliesViewEvents.kt */
/* loaded from: classes18.dex */
public final class w2g0 implements t2g0 {
    public final int a;
    public final int b;

    public w2g0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2g0)) {
            return false;
        }
        w2g0 w2g0Var = (w2g0) obj;
        return this.a == w2g0Var.a && this.b == w2g0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTextExpandClick(replyId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        return vu5.b(sb, this.b, ')');
    }
}
