package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelChangeAvatarCmd.kt */
/* loaded from: classes2.dex */
public final class bva extends le6<Boolean> {
    public final Peer b;
    public final String c;

    public bva(Peer peer, String str) {
        this.b = peer;
        this.c = str;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        bz2.c(new ava(this.c), null);
        Peer peer = this.b;
        w2wVar.J0(this, new gfb((List<? extends Peer>) Collections.singletonList(peer), Source.NETWORK, false, (Object) null)).await();
        w2wVar.S0().H(peer.b);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bva)) {
            return false;
        }
        bva bvaVar = (bva) obj;
        return epx.f(this.b, bvaVar.b) && epx.f(this.c, bvaVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelChangeAvatarCmd(channelPeer=");
        sb.append(this.b);
        sb.append(", filePath=");
        return i5s.a(sb, this.c, ", isAwaitNetwork=false, changerTag=null)");
    }
}
