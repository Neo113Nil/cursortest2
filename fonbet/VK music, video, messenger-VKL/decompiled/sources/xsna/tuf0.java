package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;

/* compiled from: RemoteChannelsUnreadInfoDataSource.kt */
/* loaded from: classes2.dex */
public final class tuf0 implements g5q0 {
    public final w2w b;
    public final boolean c;

    public tuf0(w2w w2wVar, boolean z) {
        this.b = w2wVar;
        this.c = z;
    }

    @Override // xsna.g5q0
    public final f5q0 b(Peer peer) {
        if (this.c) {
            return new f5q0(0, Integer.MAX_VALUE);
        }
        Channel channel = (Channel) this.b.J0(this, new kza(peer, true)).await();
        return new f5q0(channel.k, channel.i);
    }
}
