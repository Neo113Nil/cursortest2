package xsna;

/* compiled from: OnChannelMsgReadEvent.kt */
/* loaded from: classes2.dex */
public final class m280 extends sxp {
    public final Object b;
    public final long c;
    public final int d;

    public m280(Object obj, long j, int i) {
        this.b = obj;
        this.c = j;
        this.d = i;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m280)) {
            return false;
        }
        m280 m280Var = (m280) obj;
        return epx.f(this.b, m280Var.b) && this.c == m280Var.c && this.d == m280Var.d;
    }

    public final int hashCode() {
        Object obj = this.b;
        return Integer.hashCode(this.d) + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgReadEvent(changerTag=");
        sb.append(this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", tillMsgCnvId=");
        return vu5.b(sb, this.d, ')');
    }
}
