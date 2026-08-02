package xsna;

/* compiled from: RepliesViewEvents.kt */
/* loaded from: classes18.dex */
public final class u2g0 implements t2g0 {
    public final int a;

    public u2g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2g0) && this.a == ((u2g0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnReplyItemClick(replyId="), this.a, ')');
    }
}
