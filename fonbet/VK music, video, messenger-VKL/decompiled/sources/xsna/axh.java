package xsna;

/* compiled from: CommunityReplyEvents.kt */
/* loaded from: classes18.dex */
public final class axh implements ywh {
    public final int a;
    public final int b;

    public axh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axh)) {
            return false;
        }
        axh axhVar = (axh) obj;
        return this.a == axhVar.a && this.b == axhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDeleteAction(replyId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        return vu5.b(sb, this.b, ')');
    }
}
