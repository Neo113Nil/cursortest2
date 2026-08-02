package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesAcceptMessageRequestApiCmd.kt */
/* loaded from: classes2.dex */
public final class jd20 extends nx2<Boolean> {
    public final Peer b;
    public final boolean c;

    public jd20(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        Peer peer = this.b;
        UserId b = peer.zb() ? com.vk.dto.common.a.b(peer) : null;
        UserId b2 = peer.Ab(Peer.Type.USER) ? com.vk.dto.common.a.b(peer) : null;
        tfx tfxVar = new tfx("messages.acceptMessageRequest", new defpackage.j0(26), new or(23));
        if (b2 != null) {
            tfx.n(tfxVar, "user_id", b2, 0L, 0L, 12);
        }
        if (b != null) {
            tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        }
        bz2.l(tfxVar, this.c);
        return Boolean.TRUE;
    }
}
