package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogsPinnedMsgDetachCmd.kt */
/* loaded from: classes2.dex */
public final class dvm extends le6<Boolean> {
    public final Peer b;
    public final boolean c;
    public final Object d;

    public dvm(Peer peer, boolean z, Object obj) {
        this.b = peer;
        this.c = z;
        this.d = obj;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Invalid peer");
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
        bz2.c(new ah20(peer, w2wVar.Q0(), this.c), null);
        w2wVar.I0().b().e().w(j, null, false);
        w2wVar.S0().v(j, this.d);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvm)) {
            return false;
        }
        dvm dvmVar = (dvm) obj;
        return epx.f(this.b, dvmVar.b) && this.c == dvmVar.c && epx.f(this.d, dvmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
        Object obj = this.d;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsPinnedMsgDetachCmd(peer=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
