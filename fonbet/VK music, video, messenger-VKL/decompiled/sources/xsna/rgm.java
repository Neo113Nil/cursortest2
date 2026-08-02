package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: DialogMarkAsReadCnvIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class rgm extends nx2<Boolean> {
    public final Peer b;
    public final int c;
    public final Boolean d;
    public final boolean e = true;
    public final Peer f;

    public rgm(Peer peer, int i, Boolean bool, Peer peer2) {
        this.b = peer;
        this.c = i;
        this.d = bool;
        this.f = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId userId = new UserId(this.b.b);
        Peer peer = this.f;
        peer.getClass();
        UserId userId2 = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.markAsRead", new dn(23), new en(26));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 0L, 0L, 8);
        }
        Boolean bool = this.d;
        if (bool != null) {
            tfxVar.j("mark_conversation_as_read", bool.booleanValue());
        }
        tfx.l(tfxVar, "up_to_cmid", this.c, 0, 0, 8);
        bz2.l(tfxVar, this.e);
        return Boolean.TRUE;
    }
}
