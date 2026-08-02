package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.group.MessagesFromGroupType;

/* compiled from: GroupsCanSendToMeChangeCmd.kt */
/* loaded from: classes2.dex */
public final class fpu extends le6<Boolean> {
    public final Peer b;
    public final boolean c;
    public final MessagesFromGroupType d;

    public /* synthetic */ fpu(Peer peer, boolean z) {
        this(peer, z, MessagesFromGroupType.ALL);
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        w2wVar.O0().b("old msg receive enabled, because user sent message", new wcg(this, 23));
        boolean z = this.c;
        Peer peer = this.b;
        w2wVar.I0().n().g(new yiu(peer, z, z));
        w2wVar.O0().a(new xiu(peer, this.d));
        w2wVar.S0().D(peer.d, "fpu");
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpu)) {
            return false;
        }
        fpu fpuVar = (fpu) obj;
        return epx.f(this.b, fpuVar.b) && this.c == fpuVar.c && this.d == fpuVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GroupsCanSendToMeChangeCmd(peer=" + this.b + ", canSendAnyToMe=" + this.c + ", type=" + this.d + ')';
    }

    public fpu(Peer peer, boolean z, MessagesFromGroupType messagesFromGroupType) {
        this.b = peer;
        this.c = z;
        this.d = messagesFromGroupType;
        if (peer.Ab(Peer.Type.GROUP)) {
            return;
        }
        throw new IllegalStateException(("Illegal peer value " + peer + ". Required group peer").toString());
    }
}
