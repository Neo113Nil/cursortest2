package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelMembersCountChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class o1b implements e900 {
    public final Peer a;
    public final int b;

    public o1b(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1b)) {
            return false;
        }
        o1b o1bVar = (o1b) obj;
        return epx.f(this.a, o1bVar.a) && this.b == o1bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMembersCountChangeLpEvent(channelPeer=");
        sb.append(this.a);
        sb.append(", membersCount=");
        return vu5.b(sb, this.b, ')');
    }
}
