package xsna;

/* compiled from: OnMsgSendNotAllowedDueToUnstableConnectionEvent.kt */
/* loaded from: classes2.dex */
public final class m980 extends sxp {
    public final String b = ny30.o;
    public final long c;

    public m980(long j) {
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
        if (!(obj instanceof m980)) {
            return false;
        }
        m980 m980Var = (m980) obj;
        return epx.f(this.b, m980Var.b) && this.c == m980Var.c;
    }

    public final int hashCode() {
        String str = this.b;
        return Long.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgSendNotAllowedDueToUnstableConnectionEvent(changerTag=");
        sb.append((Object) this.b);
        sb.append(", dialogId=");
        return vu5.a(')', this.c, sb);
    }
}
