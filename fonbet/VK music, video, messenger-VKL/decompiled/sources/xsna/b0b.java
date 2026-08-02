package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.WarningNotification;

/* compiled from: ChannelHideWarningCmd.kt */
/* loaded from: classes2.dex */
public final class b0b extends le6<s3q0> {
    public final Peer b;
    public final int c;

    public b0b(int i, Peer peer) {
        this.b = peer;
        this.c = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Long l;
        bdb c = w2wVar.I0().a().c(this.b.b);
        if (c != null && (l = c.w) != null) {
            long j = -l.longValue();
            w2wVar.I0().n().i(j, WarningNotification.NONE);
            bz2.c(new alu(j, this.c), null);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b)) {
            return false;
        }
        b0b b0bVar = (b0b) obj;
        return epx.f(this.b, b0bVar.b) && this.c == b0bVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelHideWarningCmd(channelPeer=");
        sb.append(this.b);
        sb.append(", warningId=");
        return vu5.b(sb, this.c, ')');
    }
}
