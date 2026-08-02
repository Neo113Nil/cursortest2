package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesPinApiCmd.kt */
/* loaded from: classes2.dex */
public final class ig20 extends nx2<Boolean> {
    public final Peer b;
    public final int c;
    public final Peer d;

    public ig20(int i, Peer peer, Peer peer2) {
        this.b = peer;
        this.c = i;
        this.d = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        long j = this.b.b;
        Peer peer = this.d;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.pin", new cq(21), new dq(22));
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        tfx.l(tfxVar, "cmid", this.c, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        bz2.l(tfxVar, false);
        return Boolean.TRUE;
    }
}
