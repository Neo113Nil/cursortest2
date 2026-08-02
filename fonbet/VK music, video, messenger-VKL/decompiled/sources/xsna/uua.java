package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelCanCommentChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class uua implements e900 {
    public final Peer a;
    public final boolean b;

    public uua(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uua)) {
            return false;
        }
        uua uuaVar = (uua) obj;
        return epx.f(this.a, uuaVar.a) && this.b == uuaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCanCommentChangeLpEvent(channelPeer=");
        sb.append(this.a);
        sb.append(", canComment=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
