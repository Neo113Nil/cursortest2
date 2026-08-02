package xsna;

/* compiled from: MsgReactedPeer.kt */
/* loaded from: classes2.dex */
public final class hv30 {
    public final int a;
    public final qtd0 b;

    public hv30(int i, qtd0 qtd0Var) {
        this.a = i;
        this.b = qtd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv30)) {
            return false;
        }
        hv30 hv30Var = (hv30) obj;
        return this.a == hv30Var.a && epx.f(this.b, hv30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgReactedPeer(reactionId=");
        sb.append(this.a);
        sb.append(", profile=");
        return qq.f(sb, this.b, ')');
    }
}
