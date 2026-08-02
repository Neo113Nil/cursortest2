package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;

/* compiled from: LocalChannelHistoryDataSource.kt */
/* loaded from: classes16.dex */
public final class duz implements xuz {
    public final long a;
    public final boolean b;
    public final a1w c;

    public duz(long j, a1w a1wVar, boolean z) {
        this.a = j;
        this.b = z;
        this.c = a1wVar;
    }

    @Override // xsna.xuz
    public final Collection<Msg> a(Collection<Integer> collection) {
        return ((wpp) vdg0.c(this.c.n(this, new n2b(this.a, collection, MsgIdType.LOCAL_ID, Source.CACHE, false, this.b)))).c.values();
    }

    @Override // xsna.l8v
    public final gj30 b(de deVar, int i) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (gj30) vdg0.c(this.c.n(this, new x4b(Peer.a.b(this.a), deVar, this.b, i, Source.CACHE, 96)));
    }

    public final String toString() {
        return "LocalChannelHistoryDataSource-" + hashCode() + ": channelId=" + this.a + " isPostponed=" + this.b;
    }
}
