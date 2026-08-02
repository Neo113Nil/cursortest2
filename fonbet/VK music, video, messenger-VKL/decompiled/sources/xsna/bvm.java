package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;

/* compiled from: DialogsPinnedMsgAttachCmd.kt */
/* loaded from: classes2.dex */
public final class bvm extends le6<Boolean> {
    public final Peer b;
    public final int c;
    public final Object d;

    public bvm(Peer peer, int i, Object obj) {
        this.b = peer;
        this.c = i;
        this.d = obj;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Dialog id is invalid");
        }
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            throw new IllegalArgumentException(gq.d(valueOf, "Illegal msgLocalId value: "));
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
        Msg L = w2wVar.I0().o().L(this.c);
        if (L != null && (L instanceof MsgFromUser)) {
            MsgFromUser msgFromUser = (MsgFromUser) L;
            if (!msgFromUser.H6()) {
                bz2.c(new ig20(msgFromUser.d, peer, w2wVar.Q0()), null);
                w2wVar.I0().b().e().w(j, new PinnedMsg(msgFromUser).Bb(new vfm(1, w2wVar)), true);
                w2wVar.S0().v(j, this.d);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvm)) {
            return false;
        }
        bvm bvmVar = (bvm) obj;
        return epx.f(this.b, bvmVar.b) && this.c == bvmVar.c && epx.f(this.d, bvmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(((Long.hashCode(this.b.b) * 31) + this.c) * 31, 31, false);
        Object obj = this.d;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsPinnedMsgAttachCmd(dialog=");
        sb.append(this.b);
        sb.append(", msgLocalId=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=false, changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
