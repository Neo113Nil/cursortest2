package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: RestoreChatForAllApiCmd.kt */
/* loaded from: classes2.dex */
public final class ybg0 extends nx2<s3q0> {
    public final Peer b;
    public final Peer c;

    public ybg0(Peer peer, Peer peer2) {
        this.b = peer;
        this.c = peer2;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "RestoreChatForAllApiCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        int i = (int) this.b.d;
        Peer peer = this.c;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.restoreChatForAll", new sn(28), new mr(26));
        tfxVar.f(i, 0, 100000000, "chat_id");
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        bz2.l(tfxVar, false);
        return s3q0.a;
    }
}
