package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.Reaction;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: AudioMsgTranscriptRateCmd.kt */
/* loaded from: classes2.dex */
public final class vr4 extends le6<s3q0> {
    public final Msg b;
    public final int c;
    public final boolean d;

    public vr4(Msg msg, int i, boolean z) {
        this.b = msg;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Attach b = w2wVar.I0().o().b(this.c);
        if (b instanceof AttachAudioMsg) {
            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) b;
            if (!attachAudioMsg.b3()) {
                attachAudioMsg.q = this.d ? Reaction.LIKE : Reaction.DISLIKE;
                w2wVar.I0().o().s0(b);
                w2wVar.S0().s(this.b.b, this);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr4)) {
            return false;
        }
        vr4 vr4Var = (vr4) obj;
        return epx.f(this.b, vr4Var.b) && this.c == vr4Var.c && this.d == vr4Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMsgTranscriptRateCmd(msg=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", like=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
