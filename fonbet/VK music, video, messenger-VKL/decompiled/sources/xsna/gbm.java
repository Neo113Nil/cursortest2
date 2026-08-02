package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogBusinessNotifyInfoVisibilityChangeCmd.kt */
/* loaded from: classes2.dex */
public final class gbm extends le6<Boolean> {
    public final Peer b;
    public final String c = "ebm";

    public gbm(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.b;
        long j = peer.b;
        c.c.a(Long.valueOf(j), new com(0), new dom(j, c));
        w2wVar.S0().v(peer.b, this.c);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbm)) {
            return false;
        }
        gbm gbmVar = (gbm) obj;
        return epx.f(this.b, gbmVar.b) && epx.f(this.c, gbmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, false);
        String str = this.c;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBusinessNotifyInfoVisibilityChangeCmd(peer=");
        sb.append(this.b);
        sb.append(", visible=false, changerTag=");
        return tq.f(sb, this.c, ')');
    }
}
