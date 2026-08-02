package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: AccountInvalidateCmd.kt */
/* loaded from: classes2.dex */
public final class zo extends le6<s3q0> {
    public final Peer b;
    public final boolean c;

    public zo(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        Peer.User user = peer instanceof Peer.User ? (Peer.User) peer : null;
        if (user != null) {
            w2wVar.I0().d().u(user);
        }
        w2wVar.J0(this, new uqm(new sqm(this.b, Source.NETWORK, this.c, (Object) null, 24)));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return epx.f(this.b, zoVar.b) && this.c == zoVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInvalidateCmd(peer=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
