package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: RemoteChannelHistoryDataSource.kt */
/* loaded from: classes16.dex */
public final class puf0 implements l8v {
    public final long a;
    public final boolean b;
    public final a1w c;

    public puf0(long j, a1w a1wVar, boolean z) {
        this.a = j;
        this.b = z;
        this.c = a1wVar;
    }

    @Override // xsna.l8v
    public final gj30 b(de deVar, int i) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (gj30) vdg0.c(this.c.n(this, new x4b(Peer.a.b(this.a), deVar, this.b, i, Source.NETWORK, 32)));
    }

    public final String toString() {
        return "RemoteChannelHistoryDataSource-" + hashCode() + ": channelId=" + this.a + " isPostponed=" + this.b;
    }
}
