package xsna;

import com.vk.dto.common.Peer;

/* compiled from: AccountUnbanCmd.kt */
/* loaded from: classes2.dex */
public final class ys extends le6<Boolean> {
    public final Peer b;

    public ys(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        Boolean bool = (Boolean) bz2.c(new xs(peer), null);
        bool.getClass();
        w2wVar.J0(this, new zo(peer, false));
        return bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys) && epx.f(this.b, ((ys) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AccountUnbanCmd(peer=" + this.b + ", awaitNetwork=false)";
    }
}
