package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgEditLpEvent.kt */
/* loaded from: classes2.dex */
public final class t4b implements e900 {
    public final Peer a;
    public final int b;
    public final Msg c;

    public t4b(Peer peer, int i, Msg msg) {
        this.a = peer;
        this.b = i;
        this.c = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4b)) {
            return false;
        }
        t4b t4bVar = (t4b) obj;
        return epx.f(this.a, t4bVar.a) && this.b == t4bVar.b && epx.f(this.c, t4bVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        Msg msg = this.c;
        return a + (msg == null ? 0 : msg.hashCode());
    }

    public final String toString() {
        return "ChannelMsgEditLpEvent(channel=" + this.a + ", cnvMsgId=" + this.b + ", msg=" + this.c + ')';
    }
}
