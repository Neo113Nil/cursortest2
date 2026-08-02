package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelNotificationsSettingsChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class f7b implements e900 {
    public final Peer a;
    public final long b;

    public f7b(Peer peer, long j) {
        this.a = peer;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7b)) {
            return false;
        }
        f7b f7bVar = (f7b) obj;
        return epx.f(this.a, f7bVar.a) && this.b == f7bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelNotificationsSettingsChangeLpEvent(channel=");
        sb.append(this.a);
        sb.append(", disabledUntil=");
        return vu5.a(')', this.b, sb);
    }
}
