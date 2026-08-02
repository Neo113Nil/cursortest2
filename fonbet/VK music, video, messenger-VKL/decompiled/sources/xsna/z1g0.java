package xsna;

import xsna.w1g0;

/* compiled from: RepliesAction.kt */
/* loaded from: classes18.dex */
public final class z1g0 implements w1g0.n {
    public final int b;

    public z1g0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1g0) && this.b == ((z1g0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnEditAction(replyId="), this.b, ')');
    }
}
