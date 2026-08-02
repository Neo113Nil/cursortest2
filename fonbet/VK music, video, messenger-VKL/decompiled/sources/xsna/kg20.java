package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesRejectMessageRequestApiCmd.kt */
/* loaded from: classes2.dex */
public final class kg20 extends nx2<Boolean> {
    public final Peer b;
    public final boolean c;
    public final boolean d;

    public kg20(Peer peer, boolean z, boolean z2) {
        this.b = peer;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("messages.rejectMessageRequest", new lq(24), new mq(24));
        tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        tfxVar.j("spam", this.c);
        bz2.l(tfxVar, this.d);
        return Boolean.TRUE;
    }
}
