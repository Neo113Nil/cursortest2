package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelForceUpdateCmd.kt */
/* loaded from: classes2.dex */
public final class cza extends le6<s3q0> {
    public final Peer b;

    public cza(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        w2wVar.I0().u(new bza(peer.b, this, w2wVar, 0));
        w2wVar.J0(this, new gfb((List<? extends Peer>) Collections.singletonList(peer), Source.NETWORK, true, (Object) this)).await();
        w2wVar.S0().H(peer.b);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cza) && epx.f(this.b, ((cza) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ChannelForceUpdateCmd(channelPeer="), this.b, ')');
    }
}
