package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelSuggestLpEvent.kt */
/* loaded from: classes2.dex */
public final class hdb implements e900 {
    public final Peer a;

    public hdb(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdb) && epx.f(this.a, ((hdb) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelSuggestLpEvent(channel="), this.a, ')');
    }
}
