package xsna;

/* compiled from: OnLeavingFromChannelSuccessEvent.kt */
/* loaded from: classes2.dex */
public final class z680 extends sxp {
    public final long b;

    public z680(long j) {
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
        return (obj instanceof z680) && this.b == ((z680) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) * 31;
    }

    public final String toString() {
        return efz.b(this.b, ", changerTag=null)", new StringBuilder("OnLeavingFromChannelSuccessEvent(channelId="));
    }
}
