package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;

/* compiled from: EduApplyConversationRequestCmd.kt */
/* loaded from: classes2.dex */
public final class s5p extends le6<Boolean> {
    public final Peer b;
    public final boolean c;

    public s5p(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            throw new NoNetworkConnectionException(0);
        }
        boolean z = this.c;
        Peer peer = this.b;
        return (Boolean) bz2.c(z ? new jd20(peer, false) : new kg20(peer, false, false), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5p)) {
            return false;
        }
        s5p s5pVar = (s5p) obj;
        return epx.f(this.b, s5pVar.b) && this.c == s5pVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("EduApplyConversationRequestCmd(peerTo=");
        sb.append(this.b);
        sb.append(", shouldAcceptRequest=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
