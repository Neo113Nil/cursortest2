package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: EduSendConversationRequestApi.kt */
/* loaded from: classes2.dex */
public final class j7p extends nx2<Boolean> {
    public final Peer b;

    public j7p(Peer peer) {
        this.b = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7p) && epx.f(this.b, ((j7p) obj).b);
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("messages.sendMessageRequest", new k73(21), new pm0(23));
        tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        bz2.l(tfxVar, false);
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("EduSendConversationRequestApi(peerTo="), this.b, ')');
    }
}
