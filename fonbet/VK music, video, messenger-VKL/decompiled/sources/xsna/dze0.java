package xsna;

/* compiled from: GetMsgReactedPeersCmd.kt */
/* loaded from: classes2.dex */
public final class dze0 {
    public final int a;
    public final int b;

    public dze0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dze0)) {
            return false;
        }
        dze0 dze0Var = (dze0) obj;
        return this.a == dze0Var.a && this.b == dze0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactedPeerCounter(count=");
        sb.append(this.a);
        sb.append(", reactionId=");
        return vu5.b(sb, this.b, ')');
    }
}
