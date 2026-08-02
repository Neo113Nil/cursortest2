package xsna;

import xsna.w1g0;

/* compiled from: RepliesAction.kt */
/* loaded from: classes18.dex */
public final class a2g0 implements w1g0.n {
    public final int b;

    public a2g0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2g0) && this.b == ((a2g0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnReplyAction(replyId="), this.b, ')');
    }
}
