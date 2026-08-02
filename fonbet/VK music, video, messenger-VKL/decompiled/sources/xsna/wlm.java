package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.ImEngineException;

/* compiled from: DialogTitleChangeCmd.kt */
/* loaded from: classes2.dex */
public final class wlm extends le6<Boolean> {
    public final Peer b;
    public final String c;
    public final Object d;

    public wlm(Peer peer, String str, Object obj) {
        this.b = peer;
        this.c = str;
        this.d = obj;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        if (!peer.zb()) {
            throw new ImEngineException("Specified peer=" + peer + " is not a chat");
        }
        bz2.c(new ce20(this.b, this.c, null, null, null, false, w2wVar.Q0(), null, null, null, 924), null);
        w2wVar.J0(this, new tqm(new sqm(this.b, Source.NETWORK, false, this.d, 16))).await();
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlm)) {
            return false;
        }
        wlm wlmVar = (wlm) obj;
        return epx.f(this.b, wlmVar.b) && epx.f(this.c, wlmVar.c) && epx.f(this.d, wlmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, false);
        Object obj = this.d;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsChangeTitleCmd(peer=");
        sb.append(this.b);
        sb.append(", title='");
        sb.append(this.c);
        sb.append("', isAwaitNetwork=false, changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
