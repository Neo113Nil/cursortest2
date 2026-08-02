package xsna;

import com.vk.dto.common.Peer;
import kotlin.NoWhenBranchMatchedException;
import xsna.nmp;
import xsna.vnp0;

/* compiled from: EnqueueMsgTranslationCmd.kt */
/* loaded from: classes2.dex */
public final class lmp extends le6<nmp> {
    public final Peer b;
    public final int c;
    public final gop0 d;

    public lmp(Peer peer, int i, gop0 gop0Var) {
        this.b = peer;
        this.c = i;
        this.d = gop0Var;
    }

    @Override // xsna.le6
    public final nmp e(w2w w2wVar) {
        String a = this.d.a();
        vnp0.a aVar = (vnp0.a) bz2.c(new vnp0(this.c, this.b, a), null);
        if (aVar instanceof vnp0.a.b) {
            return nmp.b.a;
        }
        if (!(aVar instanceof vnp0.a.C3897a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = ((vnp0.a.C3897a) aVar).a;
        if (i != 968) {
            switch (i) {
                case 971:
                case 972:
                    return nmp.a.b.a;
                case 973:
                    break;
                default:
                    return nmp.a.c.a;
            }
        }
        return nmp.a.C3404a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmp)) {
            return false;
        }
        lmp lmpVar = (lmp) obj;
        return epx.f(this.b, lmpVar.b) && this.c == lmpVar.c && epx.f(this.d, lmpVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "EnqueueMsgTranslationCmd(dialog=" + this.b + ", cnvMsgId=" + this.c + ", translationLanguage=" + this.d + ')';
    }
}
