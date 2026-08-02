package xsna;

import com.vk.dto.common.Peer;

/* compiled from: FriendsDeleteApiCmd.kt */
/* loaded from: classes2.dex */
public final class gos extends nx2<Boolean> {
    public final Peer b;

    public gos(Peer peer) {
        this.b = peer;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalStateException("Expect only users as a peer");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gos) && epx.f(this.b, ((gos) obj).b);
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        bz2.l(nts.g(new ots(), com.vk.dto.common.a.b(this.b), null, null, null, null, 30), false);
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "FriendsDeleteApiCmd(peer=" + this.b + ", isAwaitNetwork=false)";
    }
}
