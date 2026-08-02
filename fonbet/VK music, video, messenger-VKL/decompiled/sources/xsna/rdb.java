package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelUnarchivedLpEvent.kt */
/* loaded from: classes2.dex */
public final class rdb implements e900 {
    public final Peer a;

    public rdb(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdb) && epx.f(this.a, ((rdb) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ChannelUnarchivedLpEvent(channel="), this.a, ')');
    }
}
