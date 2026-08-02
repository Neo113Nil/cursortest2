package xsna;

/* compiled from: OnChannelUserNavEvent.kt */
/* loaded from: classes2.dex */
public final class t280 extends u280 {
    public final long b;

    public t280(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t280) && this.b == ((t280) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("OnChannelUserLeaveEvent(channelId="));
    }
}
