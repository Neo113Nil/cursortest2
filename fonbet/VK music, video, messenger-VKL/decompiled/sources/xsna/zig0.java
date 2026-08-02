package xsna;

/* compiled from: ReviewsReplyEditData.kt */
/* loaded from: classes18.dex */
public final class zig0 {
    public final int a;
    public final int b;

    public zig0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zig0)) {
            return false;
        }
        zig0 zig0Var = (zig0) obj;
        return this.a == zig0Var.a && this.b == zig0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewsReplyEditData(reviewId=");
        sb.append(this.a);
        sb.append(", replyId=");
        return vu5.b(sb, this.b, ')');
    }
}
