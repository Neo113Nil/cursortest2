package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: DialogGetOrLoadCmd.kt */
/* loaded from: classes2.dex */
public final class gem extends le6<Dialog> {
    public final Peer b;

    public gem(Peer peer) {
        this.b = peer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Dialog e(w2w w2wVar) {
        Source source = Source.CACHE;
        Peer peer = this.b;
        Dialog dialog = (Dialog) ((wpp) k9q0.f(w2wVar, this, new tqm(new sqm(peer, source, false, (Object) this, 16)))).e(Long.valueOf(peer.b)).b;
        if (dialog != null && !dialog.wc()) {
            return dialog;
        }
        Source source2 = Source.NETWORK;
        Peer peer2 = this.b;
        wpp wppVar = (wpp) k9q0.f(w2wVar, this, new tqm(new sqm(peer2, source2, true, (Object) this, 16)));
        return (Dialog) wppVar.c.get(Long.valueOf(peer2.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gem) && epx.f(this.b, ((gem) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("DialogGetOrLoadCmd(dialogPeer="), this.b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gem(long j) {
        this(Peer.a.b(j));
        Serializer.c<Peer> cVar = Peer.CREATOR;
    }
}
