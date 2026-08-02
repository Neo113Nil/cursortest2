package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesMarkAsListenedApiCmd.kt */
/* loaded from: classes2.dex */
public final class gg20 extends nx2<Boolean> {
    public final int b;
    public final Peer c;
    public final boolean d = true;
    public final Peer e;

    public gg20(int i, Peer peer, Peer peer2) {
        this.b = i;
        this.c = peer;
        this.e = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.c);
        Peer peer = this.e;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.markAsListened", new hr(22), new ir(27));
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        tfx.l(tfxVar, "cmid", this.b, 0, 0, 8);
        bz2.l(tfxVar, this.d);
        return Boolean.TRUE;
    }
}
