package xsna;

/* compiled from: OnChannelUserNavEvent.kt */
/* loaded from: classes2.dex */
public final class s280 extends u280 {
    public final long b;

    public s280(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s280) && this.b == ((s280) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("OnChannelUserEnterEvent(channelId="));
    }
}
