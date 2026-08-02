package xsna;

import com.vk.dto.common.Peer;
import xsna.ij20;

/* compiled from: MessagesMarkAsPlayedApiCmd.kt */
/* loaded from: classes2.dex */
public final class hg20 extends nx2<Boolean> {
    public final int b;
    public final Peer c;
    public final boolean d = true;
    public final Peer e;

    public hg20(int i, Peer peer, Peer peer2) {
        this.b = i;
        this.c = peer;
        this.e = peer2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.markAsPlayed";
        aVar.f.put("cmid", Integer.valueOf(this.b).toString());
        aVar.f.put("peer_id", Long.valueOf(this.c.b).toString());
        Peer peer = this.e;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar.i = this.d;
        l7r0Var.f(new ij20(aVar));
        return Boolean.TRUE;
    }
}
