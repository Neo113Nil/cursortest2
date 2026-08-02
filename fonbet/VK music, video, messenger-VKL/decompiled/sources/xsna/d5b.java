package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgRestoreLpEvent.kt */
/* loaded from: classes2.dex */
public final class d5b implements e900 {
    public final Peer a;
    public final int b;
    public final Msg c;

    public d5b(Peer peer, int i, Msg msg) {
        this.a = peer;
        this.b = i;
        this.c = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5b)) {
            return false;
        }
        d5b d5bVar = (d5b) obj;
        return epx.f(this.a, d5bVar.a) && this.b == d5bVar.b && epx.f(this.c, d5bVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        Msg msg = this.c;
        return a + (msg == null ? 0 : msg.hashCode());
    }

    public final String toString() {
        return "ChannelMsgRestoreLpEvent(channelPeer=" + this.a + ", cnvMsgId=" + this.b + ", message=" + this.c + ')';
    }
}
