package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogRemoveChatMrLpEvent.kt */
/* loaded from: classes2.dex */
public final class jjm implements e900 {
    public final Peer a;
    public final Peer b;

    public jjm(Peer peer, Peer peer2) {
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
        if (!(obj instanceof jjm)) {
            return false;
        }
        jjm jjmVar = (jjm) obj;
        return epx.f(this.a, jjmVar.a) && epx.f(this.b, jjmVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogRemoveChatMrLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
