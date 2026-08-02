package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogAcceptChatMrLpEvent.kt */
/* loaded from: classes2.dex */
public final class t8m implements e900 {
    public final Peer a;
    public final Peer b;

    public t8m(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
        if (!peer2.Ab(Peer.Type.CONTACT) && !peer2.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException(yq.b(peer2, "Message Request member required to be contact or user. ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8m)) {
            return false;
        }
        t8m t8mVar = (t8m) obj;
        return epx.f(this.a, t8mVar.a) && epx.f(this.b, t8mVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAcceptChatMrLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
