package xsna;

/* compiled from: CommunityReplyEvents.kt */
/* loaded from: classes18.dex */
public final class bxh implements ywh {
    public final int a;
    public final int b;

    public bxh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxh)) {
            return false;
        }
        bxh bxhVar = (bxh) obj;
        return this.a == bxhVar.a && this.b == bxhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnEditAction(replyId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        return vu5.b(sb, this.b, ')');
    }
}
