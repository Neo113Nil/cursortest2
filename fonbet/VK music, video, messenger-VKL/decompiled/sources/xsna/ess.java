package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import xsna.g1e0;

/* compiled from: FriendsRemoveCmd.kt */
/* loaded from: classes2.dex */
public final class ess extends xl6<qtd0> {
    public final Peer b;

    public ess(Peer peer) {
        this.b = peer;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException("Expect only users as a peer");
        }
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-friends-management-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Peer peer = this.b;
        bz2.c(new gos(peer), null);
        g1e0.a aVar = new g1e0.a();
        aVar.a.c(peer);
        aVar.b = Source.NETWORK;
        aVar.c = false;
        qtd0 Bb = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Bb(peer);
        if (Bb != null) {
            return Bb;
        }
        throw new IllegalStateException("Peer not found");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ess) && epx.f(this.b, ((ess) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "FriendsRemoveCmd(peer=" + this.b + ", isAwaitNetwork=false)";
    }
}
