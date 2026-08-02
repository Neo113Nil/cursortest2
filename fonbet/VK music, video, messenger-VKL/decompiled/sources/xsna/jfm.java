package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;

/* compiled from: DialogHistoryLocalDataSource.kt */
/* loaded from: classes13.dex */
public final class jfm implements xuz {
    public final a1w a;
    public final ifm b;
    public final bpn0 c = new bpn0(new p3h(this, 7));

    public jfm(a1w a1wVar, ifm ifmVar) {
        this.a = a1wVar;
        this.b = ifmVar;
    }

    @Override // xsna.xuz
    public final Collection<Msg> a(Collection<Integer> collection) {
        MsgIdType msgIdType = MsgIdType.LOCAL_ID;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return ((wpp) vdg0.c(this.a.n(this, new dj30(msgIdType, collection, Peer.a.b(((hfm) this.c.getValue()).b), null, false, null, 56)))).c.values();
    }

    @Override // xsna.l8v
    public final gj30 b(de deVar, int i) {
        long c = ((hfm) this.c.getValue()).c();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (gj30) vdg0.c(this.a.n(this, new pj30(Peer.a.b(c), deVar, i, Source.CACHE, false, this)));
    }

    public final String toString() {
        return "DialogHistoryLocalDataSource-" + hashCode() + ": boundDataSource=" + this.b;
    }
}
