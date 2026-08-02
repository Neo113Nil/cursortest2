package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mbb implements izs {
    public final /* synthetic */ nbb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ChannelSource d;

    public /* synthetic */ mbb(nbb nbbVar, long j, ChannelSource channelSource) {
        this.b = nbbVar;
        this.c = j;
        this.d = channelSource;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        nbb nbbVar = this.b;
        lzv lzvVar = nbbVar.a;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return lzvVar.b(nbbVar, new s0b(Peer.a.b(this.c), this.d));
    }
}
