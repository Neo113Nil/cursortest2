package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: DialogMarkAsUnreadApiCmd.kt */
/* loaded from: classes2.dex */
public final class tgm extends nx2<Boolean> {
    public final Peer b;
    public final boolean c = true;
    public final Peer d;

    public tgm(Peer peer, Peer peer2) {
        this.b = peer;
        this.d = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        Peer peer = this.d;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.markAsUnreadConversation", new io.reactivex.rxjava3.internal.operators.mixed.k(23), new io.reactivex.rxjava3.internal.operators.mixed.n(20));
        tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        bz2.l(tfxVar, this.c);
        return Boolean.TRUE;
    }
}
