package xsna;

import com.vk.api.generated.channels.dto.ChannelsUnpinMessagesResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelUnpinMessageCmd.kt */
/* loaded from: classes2.dex */
public final class udb extends le6<Boolean> {
    public final Peer b;
    public final int c;

    public udb(int i, Peer peer) {
        this.b = peer;
        this.c = i;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        r3b y = w2wVar.I0().y();
        Peer peer = this.b;
        long j = peer.b;
        int i = this.c;
        if (y.l(i, j) == null) {
            return Boolean.FALSE;
        }
        UserId b = com.vk.dto.common.a.b(peer);
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        tfx tfxVar = new tfx("channels.unpinMessages", new oq(8), new pq(5));
        tfx.n(tfxVar, "channel_id", b, 0L, -1L, 4);
        if (singletonList != null) {
            tfxVar.i("cmids", singletonList);
        }
        if (!((ChannelsUnpinMessagesResponseDto) bz2.l(tfxVar, false)).d().contains(Integer.valueOf(i))) {
            return Boolean.FALSE;
        }
        y.E(i, j, false);
        w2wVar.S0().q(j);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udbVar = (udb) obj;
        return epx.f(this.b, udbVar.b) && this.c == udbVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelUnpinMessageCmd(peer=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        return h5s.c(this.c, ", awaitNetwork=false)", sb);
    }
}
