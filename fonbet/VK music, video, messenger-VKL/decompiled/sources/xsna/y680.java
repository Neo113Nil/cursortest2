package xsna;

/* compiled from: OnLeavingFromChannelErrorEvent.kt */
/* loaded from: classes2.dex */
public final class y680 extends sxp {
    public final long b;

    public y680(long j) {
        this.b = j;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y680) && this.b == ((y680) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) * 31;
    }

    public final String toString() {
        return efz.b(this.b, ", changerTag=null)", new StringBuilder("OnLeavingFromChannelErrorEvent(channelId="));
    }
}
