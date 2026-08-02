package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;

/* compiled from: EduSendConversationRequestCmd.kt */
/* loaded from: classes2.dex */
public final class k7p extends le6<Boolean> {
    public final Peer b;

    public k7p(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            return (Boolean) bz2.c(new j7p(this.b), null);
        }
        throw new NoNetworkConnectionException(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7p) && epx.f(this.b, ((k7p) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("EduSendConversationRequestCmd(peerTo="), this.b, ')');
    }
}
