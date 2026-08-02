package xsna;

/* compiled from: OnMsgRequestReceivedEvent.kt */
/* loaded from: classes2.dex */
public final class k980 extends sxp {
    public final Object b;
    public final long c;

    public k980(Object obj, long j) {
        this.b = obj;
        this.c = j;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k980)) {
            return false;
        }
        k980 k980Var = (k980) obj;
        return epx.f(this.b, k980Var.b) && this.c == k980Var.c;
    }

    public final int hashCode() {
        Object obj = this.b;
        return Long.hashCode(this.c) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgRequestReceivedEvent(changerTag=");
        sb.append(this.b);
        sb.append(", dialogId=");
        return vu5.a(')', this.c, sb);
    }
}
