package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;

/* compiled from: ChannelMarkAsReadCompletelyCmd.kt */
/* loaded from: classes2.dex */
public final class l1b extends le6<s3q0> {
    public final long b;

    public l1b(long j) {
        this.b = j;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        long j = this.b;
        Object obj = ((wpp) w2wVar.L0(this, new gfb(Collections.singletonList(new Peer.Channel(j)), Source.CACHE, false, 12))).c.get(Long.valueOf(j));
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Channel channel = (Channel) obj;
        w2wVar.L0(this, new k1b(channel.b, channel.h));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1b) && this.b == ((l1b) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("ChannelMarkAsReadCompletelyCmd(channelId="));
    }
}
