package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.group.MessagesFromGroupType;

/* compiled from: GroupsDisableMsgAndClearHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class lpu extends le6<s3q0> {
    public final Peer b;

    public lpu(Peer peer) {
        this.b = peer;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal dialogId value");
        }
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        bz2.c(new ipu(this.b, false, MessagesFromGroupType.ALL), null);
        w2wVar.L0(this, new kj30(this.b, false, false, true, null, 108));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpu) && epx.f(this.b, ((lpu) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("GroupsDisableMsgAndClearHistoryCmd(dialog="), this.b, ')');
    }
}
