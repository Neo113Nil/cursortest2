package xsna;

import com.vk.dto.common.Peer;

/* compiled from: RestoreChatForAllCmd.kt */
/* loaded from: classes2.dex */
public final class zbg0 extends le6<s3q0> {
    public final Peer b;

    public zbg0(Peer peer) {
        this.b = peer;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "RestoreChatForAllCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        bz2.c(new ybg0(this.b, w2wVar.Q0()), null);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbg0) && epx.f(this.b, ((zbg0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 961);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "RestoreChatForAllCmd(peer=" + this.b + ", changerTag=null, awaitNetwork=false)";
    }
}
