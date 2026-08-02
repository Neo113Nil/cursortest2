package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogsPinnedMsgChangeVisibilityCmd.kt */
/* loaded from: classes2.dex */
public final class cvm extends le6<Boolean> {
    public final Peer b;
    public final boolean c;
    public final Object d;

    public cvm(Peer peer, boolean z, Object obj) {
        this.b = peer;
        this.c = z;
        this.d = obj;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Peer is invalid");
        }
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        boolean zb = peer.zb();
        long j = peer.b;
        if (!zb) {
            return Boolean.FALSE;
        }
        hpm c = sn.c(w2wVar);
        com.vk.im.engine.models.dialogs.b c2 = c.c(j);
        if ((c2 != null ? c2.t : null) == null) {
            return Boolean.FALSE;
        }
        c.d.d(j, this.c);
        w2wVar.S0().v(j, this.d);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvm)) {
            return false;
        }
        cvm cvmVar = (cvm) obj;
        return epx.f(this.b, cvmVar.b) && this.c == cvmVar.c && epx.f(this.d, cvmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
        Object obj = this.d;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsPinnedMsgChangeVisibilityCmd(dialogId=");
        sb.append(this.b);
        sb.append(", isVisible=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
