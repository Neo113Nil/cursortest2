package xsna;

import com.vk.dto.common.Peer;

/* compiled from: MsgAddChatUserCmd.kt */
/* loaded from: classes2.dex */
public final class yg30 extends le6<Boolean> {
    public final Peer b;
    public final Peer c;
    public final int d;
    public final boolean e = true;
    public final Object f;

    public yg30(Peer peer, Peer peer2, int i, Object obj) {
        this.b = peer;
        this.c = peer2;
        this.d = i;
        this.f = obj;
        if (!peer.zb()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!peer2.Ab(Peer.Type.USER) && !peer2.Ab(Peer.Type.CONTACT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        bz2.c(new kd20(this.b, this.c, this.d, this.e), null);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg30)) {
            return false;
        }
        yg30 yg30Var = (yg30) obj;
        return epx.f(this.b, yg30Var.b) && epx.f(this.c, yg30Var.c) && this.d == yg30Var.d && this.e == yg30Var.e && epx.f(this.f, yg30Var.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(shy.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31), 31, this.e);
        Object obj = this.f;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgAddChatUserCmd(chat=");
        sb.append(this.b);
        sb.append(", contactOrUserId=");
        sb.append(this.c);
        sb.append(", shareLastMsgsCount=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        return k73.c(sb, this.f, ')');
    }
}
