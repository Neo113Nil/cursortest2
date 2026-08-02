package xsna;

import com.vk.dto.common.Peer;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DialogInfoBarHideCmd.kt */
/* loaded from: classes2.dex */
public final class pfm extends le6<Boolean> {
    public final Peer b;
    public final String c;
    public final String d;

    public pfm(Peer peer, String str, String str2) {
        this.b = peer;
        this.c = str;
        this.d = str2;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Peer is invalid");
        }
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        boolean z;
        if (epx.f(this.c, "private_dialog_info_bar_msg_push_disabled")) {
            avz.g(w2wVar.f1(), this.c, w2wVar);
            if (epx.f(this.d, "action")) {
                avz.f(w2wVar, this.c);
            }
            w2wVar.S0().V(this.b.b);
            z = true;
        } else {
            long j = this.b.b;
            String str = this.c;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            w2wVar.I0().u(new rfm(j, str, ref$BooleanRef));
            boolean z2 = ref$BooleanRef.element;
            if (z2) {
                w2wVar.S0().V(this.b.b);
                x6x O0 = w2wVar.O0();
                qfm qfmVar = new qfm(this.b, this.c, this.d);
                x6x O02 = w2wVar.O0();
                mla mlaVar = this.a;
                if (mlaVar == null) {
                    mlaVar = null;
                }
                O0.j(qfmVar, O02.h("", mlaVar.b()));
            }
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfm)) {
            return false;
        }
        pfm pfmVar = (pfm) obj;
        return epx.f(this.b, pfmVar.b) && epx.f(this.c, pfmVar.c) && epx.f(this.d, pfmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogInfoBarHideCmd(peer=");
        sb.append(this.b);
        sb.append(", barName=");
        sb.append(this.c);
        sb.append(", source=");
        return ho8.a(sb, this.d, ')');
    }
}
