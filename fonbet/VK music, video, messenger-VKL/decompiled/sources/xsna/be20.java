package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesDisableChatWritingApiCmd.kt */
/* loaded from: classes2.dex */
public final class be20 extends nx2<s3q0> {
    public final Peer b;
    public final Peer c;
    public final int d;
    public final boolean e;

    public be20(int i, Peer peer, boolean z) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
        this.b = peer;
        this.c = unknown;
        this.d = i;
        this.e = z;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "MessagesDisableChatWritingApiCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        int i = (int) this.b.d;
        Peer peer = this.c;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.disableChatWriting", new tf3(21), new uf3(18));
        tfxVar.f(i, 0, 100000000, "chat_id");
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        tfx.l(tfxVar, "duration_sec", this.d, 0, 0, 8);
        bz2.l(tfxVar, this.e);
        return s3q0.a;
    }
}
