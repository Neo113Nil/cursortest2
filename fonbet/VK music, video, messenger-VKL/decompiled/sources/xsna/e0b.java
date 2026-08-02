package xsna;

/* compiled from: ChannelHistoryBoundDataSource.kt */
/* loaded from: classes16.dex */
public final class e0b implements h8v {
    public final long a;
    public final d0b b;

    public e0b(long j, a1w a1wVar, boolean z) {
        this.a = j;
        this.b = new d0b(j, a1wVar, z);
    }

    @Override // xsna.h8v
    public final g8v a() {
        return this.b;
    }

    public final String toString() {
        return "ChannelHistoryBoundDataSource-" + hashCode() + ": channelId=" + this.a;
    }
}
