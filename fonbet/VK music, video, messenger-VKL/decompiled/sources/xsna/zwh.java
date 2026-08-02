package xsna;

/* compiled from: CommunityReplyEvents.kt */
/* loaded from: classes18.dex */
public final class zwh implements ywh {
    public final int a;
    public final int b;

    public zwh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwh)) {
            return false;
        }
        zwh zwhVar = (zwh) obj;
        return this.a == zwhVar.a && this.b == zwhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCopyAction(replyId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        return vu5.b(sb, this.b, ')');
    }
}
