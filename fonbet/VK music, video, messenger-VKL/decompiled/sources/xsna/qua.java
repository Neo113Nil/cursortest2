package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelBanInfo;

/* compiled from: ChannelBanInfoChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class qua implements e900 {
    public final Peer a;
    public final Peer b;
    public final ChannelBanInfo c;

    public qua(Peer peer, Peer peer2, ChannelBanInfo channelBanInfo) {
        this.a = peer;
        this.b = peer2;
        this.c = channelBanInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qua)) {
            return false;
        }
        qua quaVar = (qua) obj;
        return epx.f(this.a, quaVar.a) && epx.f(this.b, quaVar.b) && epx.f(this.c, quaVar.c);
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b);
        ChannelBanInfo channelBanInfo = this.c;
        return a + (channelBanInfo == null ? 0 : channelBanInfo.hashCode());
    }

    public final String toString() {
        return "ChannelBanInfoChangeLpEvent(channelPeer=" + this.a + ", userPeer=" + this.b + ", banInfo=" + this.c + ')';
    }
}
