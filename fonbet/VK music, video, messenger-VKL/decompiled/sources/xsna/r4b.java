package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelMsgDeleteLpEvent.kt */
/* loaded from: classes2.dex */
public final class r4b implements e900 {
    public final Peer a;
    public final int b;

    public r4b(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4b)) {
            return false;
        }
        r4b r4bVar = (r4b) obj;
        return epx.f(this.a, r4bVar.a) && this.b == r4bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgDeleteLpEvent(channel=");
        sb.append(this.a);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.b, ')');
    }
}
