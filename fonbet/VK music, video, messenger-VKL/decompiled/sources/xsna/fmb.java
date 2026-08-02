package xsna;

import com.vk.dto.common.Peer;

/* compiled from: Chat.kt */
/* loaded from: classes2.dex */
public final class fmb {
    public final Peer a;
    public final Peer b;

    public fmb(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmb)) {
            return false;
        }
        fmb fmbVar = (fmb) obj;
        return epx.f(this.a, fmbVar.a) && epx.f(this.b, fmbVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(peer=");
        sb.append(this.a);
        sb.append(", ownerId=");
        return eq.a(sb, this.b, ')');
    }
}
