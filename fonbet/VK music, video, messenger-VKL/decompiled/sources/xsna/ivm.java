package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ImEngineException;

/* compiled from: DialogsReturnCmd.kt */
/* loaded from: classes2.dex */
public final class ivm extends le6<Boolean> {
    public final Peer b;
    public final Object c;

    public ivm(Peer peer, Object obj) {
        this.b = peer;
        this.c = obj;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        if (peer.zb()) {
            bz2.c(new kd20(peer, w2wVar.H0(), 0, false), null);
            return Boolean.TRUE;
        }
        throw new ImEngineException("Specified dialogId=" + peer + " is not a chat");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivm)) {
            return false;
        }
        ivm ivmVar = (ivm) obj;
        return epx.f(this.b, ivmVar.b) && epx.f(this.c, ivmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, false);
        Object obj = this.c;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsReturnCmd(peer=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=false, changerTag=");
        return k73.c(sb, this.c, ')');
    }
}
