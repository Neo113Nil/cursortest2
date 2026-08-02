package xsna;

/* compiled from: OnConversationClosedEvent.kt */
/* loaded from: classes2.dex */
public final class q380 extends sxp {
    public final long b;
    public final String c;

    public q380(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q380)) {
            return false;
        }
        q380 q380Var = (q380) obj;
        return this.b == q380Var.b && epx.f(this.c, q380Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnConversationClosedEvent(peerId=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        return ho8.a(sb, this.c, ')');
    }
}
