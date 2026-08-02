package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogLeaveAndClearCmd.kt */
/* loaded from: classes2.dex */
public final class lgm extends le6<s3q0> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e = true;
    public final Object f;

    public lgm(Peer peer, boolean z, boolean z2, Object obj) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.f = obj;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.L0(this, new wrm(this.b, this.e, this.f));
        if (this.c || this.d) {
            Peer peer = this.b;
            boolean z = this.d;
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            w2wVar.L0(this, new kj30(peer, z, a1wVar.r().h.p(), this.e, this.f, 40));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgm)) {
            return false;
        }
        lgm lgmVar = (lgm) obj;
        return epx.f(this.b, lgmVar.b) && this.c == lgmVar.c && this.d == lgmVar.d && this.e == lgmVar.e && epx.f(this.f, lgmVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        Object obj = this.f;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogLeaveAndClearCmd(peer=");
        sb.append(this.b);
        sb.append(", clear=");
        sb.append(this.c);
        sb.append(", reportSpam=");
        sb.append(this.d);
        sb.append(", awaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        return k73.c(sb, this.f, ')');
    }
}
