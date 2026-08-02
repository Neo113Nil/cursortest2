package xsna;

/* compiled from: OnChannelMsgFailedEvent.kt */
/* loaded from: classes2.dex */
public final class k280 extends q490 {
    public final String c = "ChannelMsgSendJob";
    public final long d;
    public final int e;
    public final Throwable f;

    public k280(int i, long j, Throwable th) {
        this.d = j;
        this.e = i;
        this.f = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k280)) {
            return false;
        }
        k280 k280Var = (k280) obj;
        return epx.f(this.c, k280Var.c) && this.d == k280Var.d && this.e == k280Var.e && epx.f(this.f, k280Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        return this.f.hashCode() + shy.a(this.e, bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgFailedEvent(changerTag=");
        sb.append((Object) this.c);
        sb.append(", channelId=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        sb.append(", e=");
        return oq.c(sb, this.f, ')');
    }
}
