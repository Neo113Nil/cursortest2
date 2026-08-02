package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesUnpinApiCmd.kt */
/* loaded from: classes2.dex */
public final class ah20 extends nx2<Boolean> {
    public final Peer b;
    public final boolean c;
    public final Peer d;

    public ah20(Peer peer, Peer peer2, boolean z) {
        this.b = peer;
        this.c = z;
        this.d = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        long j = this.b.b;
        Peer peer = this.d;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.unpin", new sr(18), new rf3(20));
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        bz2.l(tfxVar, this.c);
        return Boolean.TRUE;
    }
}
