package xsna;

/* loaded from: classes8.dex */
public final class bhz0 {
    public final Long a;
    public final String b;

    public bhz0(Long l, String str) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhz0)) {
            return false;
        }
        bhz0 bhz0Var = (bhz0) obj;
        return epx.f(this.a, bhz0Var.a) && epx.f(this.b, bhz0Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PeerInfo(peerId=" + this.a + ", conversationId=" + this.b + ")";
    }
}
