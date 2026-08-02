package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelJoinLpEvent.kt */
/* loaded from: classes2.dex */
public final class u0b implements e900 {
    public final Peer a;

    public u0b(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0b) && epx.f(this.a, ((u0b) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelJoinLpEvent(channel="), this.a, ')');
    }
}
