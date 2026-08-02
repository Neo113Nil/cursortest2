package xsna;

/* compiled from: LinkPostInfo.kt */
/* loaded from: classes16.dex */
public final class faz {
    public final long a;
    public final int b;

    public faz(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faz)) {
            return false;
        }
        faz fazVar = (faz) obj;
        return this.a == fazVar.a && this.b == fazVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkPostInfo(channelId=");
        sb.append(this.a);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.b, ')');
    }
}
