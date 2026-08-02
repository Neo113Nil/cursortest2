package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogKeyboardUpdateVisibility.kt */
/* loaded from: classes2.dex */
public final class igm extends le6<s3q0> {
    public final Peer b;
    public final boolean c;

    public igm(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.b;
        c.m0(peer.b, this.c);
        w2wVar.S0().v(peer.b, null);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!igm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        igm igmVar = (igm) obj;
        return epx.f(this.b, igmVar.b) && this.c == igmVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogKeyboardUpdateVisibility(peer=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return n23.b(sb, this.c, ", changerTag=null)");
    }
}
