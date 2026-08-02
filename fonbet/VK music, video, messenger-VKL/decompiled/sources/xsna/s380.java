package xsna;

/* compiled from: OnConversationOpenedEvent.kt */
/* loaded from: classes2.dex */
public final class s380 extends sxp {
    public final long b;
    public final String c;

    public s380(long j, String str) {
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
        if (!(obj instanceof s380)) {
            return false;
        }
        s380 s380Var = (s380) obj;
        return this.b == s380Var.b && epx.f(this.c, s380Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnConversationOpenedEvent(peerId=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        return ho8.a(sb, this.c, ')');
    }
}
