package xsna;

import com.vk.api.generated.messages.dto.MessagesGetMessageReadPeersResponseDto;
import com.vk.dto.common.Peer;

/* compiled from: MsgGetMessageReadPeersCmd.kt */
/* loaded from: classes2.dex */
public final class fj30 extends me6<MessagesGetMessageReadPeersResponseDto> {
    public final int b;
    public final Peer c;
    public final int d;
    public final int e;

    public fj30(int i, int i2, int i3, Peer peer) {
        this.b = i;
        this.c = peer;
        this.d = i2;
        this.e = i3;
    }

    @Override // xsna.me6
    public final Object e(w2w w2wVar, spj<? super MessagesGetMessageReadPeersResponseDto> spjVar) {
        long j = this.c.b;
        Integer num = new Integer(this.d);
        Integer num2 = new Integer(0);
        Integer num3 = new Integer(this.e);
        tfx tfxVar = new tfx("messages.getMessageReadPeers", new tr(16), new ur(24));
        tfx.l(tfxVar, "cmid", this.b, 0, 0, 8);
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        tfxVar.f(num.intValue(), 0, 200, "count");
        tfx.l(tfxVar, "offset_minor_id", num2.intValue(), 0, 0, 8);
        tfx.l(tfxVar, "offset_major_id", num3.intValue(), 0, 0, 8);
        return evj.p(yfb.A(tfxVar), spjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj30)) {
            return false;
        }
        fj30 fj30Var = (fj30) obj;
        return this.b == fj30Var.b && epx.f(this.c, fj30Var.c) && this.d == fj30Var.d && this.e == fj30Var.e;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgGetMessageReadPeersCmd(cmid=");
        sb.append(this.b);
        sb.append(", peer=");
        sb.append(this.c);
        sb.append(", recordsCount=");
        sb.append(this.d);
        sb.append(", offsetMajorId=");
        return vu5.b(sb, this.e, ')');
    }
}
