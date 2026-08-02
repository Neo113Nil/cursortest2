package xsna;

import com.vk.dto.common.Peer;

/* compiled from: AccountBanCmd.kt */
/* loaded from: classes2.dex */
public final class ln extends le6<s3q0> {
    public final Peer b;

    public ln(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        bz2.c(new kn(peer, false, null), null);
        w2wVar.J0(this, new zo(peer, false));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln) && epx.f(this.b, ((ln) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AccountBanCmd(peer=" + this.b + ", awaitNetwork=false)";
    }
}
