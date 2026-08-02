package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelDeleteLpEvent.kt */
/* loaded from: classes2.dex */
public final class rxa implements e900 {
    public final Peer a;

    public rxa(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxa) && epx.f(this.a, ((rxa) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelDeleteLpEvent(channel="), this.a, ')');
    }
}
