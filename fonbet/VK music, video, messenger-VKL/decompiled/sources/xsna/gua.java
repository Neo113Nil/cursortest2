package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelArchivedLpEvent.kt */
/* loaded from: classes2.dex */
public final class gua implements e900 {
    public final Peer a;

    public gua(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gua) && epx.f(this.a, ((gua) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelArchivedLpEvent(channel="), this.a, ')');
    }
}
