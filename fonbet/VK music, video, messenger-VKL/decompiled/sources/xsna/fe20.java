package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesEnableChatWritingApiCmd.kt */
/* loaded from: classes2.dex */
public final class fe20 extends nx2<s3q0> {
    public final Peer b;
    public final Peer c;
    public final boolean d;

    public fe20(Peer peer, boolean z) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
        this.b = peer;
        this.c = unknown;
        this.d = z;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "MessagesEnableChatWritingApiCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        int i = (int) this.b.d;
        Peer peer = this.c;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.enableChatWriting", new t11(22), new u11(25));
        tfxVar.f(i, 0, 100000000, "chat_id");
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        bz2.l(tfxVar, this.d);
        return s3q0.a;
    }
}
