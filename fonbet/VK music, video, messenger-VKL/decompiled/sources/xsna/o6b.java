package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelMsgUnpinLpEvent.kt */
/* loaded from: classes2.dex */
public final class o6b implements e900 {
    public final Peer a;
    public final int b;

    public o6b(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6b)) {
            return false;
        }
        o6b o6bVar = (o6b) obj;
        return epx.f(this.a, o6bVar.a) && this.b == o6bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgUnpinLpEvent(channel=");
        sb.append(this.a);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.b, ')');
    }
}
