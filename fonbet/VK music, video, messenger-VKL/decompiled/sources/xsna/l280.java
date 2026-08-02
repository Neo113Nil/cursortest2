package xsna;

/* compiled from: OnChannelMsgPaidReactionSuccessEvent.kt */
/* loaded from: classes2.dex */
public final class l280 extends sxp {
    public final String b = "IncrementChannelMsgPaidReactionCmd";
    public final long c;
    public final int d;

    public l280(long j, int i) {
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
        if (!(obj instanceof l280)) {
            return false;
        }
        l280 l280Var = (l280) obj;
        return epx.f(this.b, l280Var.b) && this.c == l280Var.c && this.d == l280Var.d;
    }

    public final int hashCode() {
        String str = this.b;
        return Integer.hashCode(this.d) + bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgPaidReactionSuccessEvent(changerTag=");
        sb.append((Object) this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        return vu5.b(sb, this.d, ')');
    }
}
