package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelLeaveLpEvent.kt */
/* loaded from: classes2.dex */
public final class b1b implements e900 {
    public final Peer a;

    public b1b(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1b) && epx.f(this.a, ((b1b) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelLeaveLpEvent(channel="), this.a, ')');
    }
}
