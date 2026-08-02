package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMemberAddLpEvent.kt */
/* loaded from: classes2.dex */
public final class zgm implements e900 {
    public final Peer a;
    public final Peer b;

    public zgm(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgm)) {
            return false;
        }
        zgm zgmVar = (zgm) obj;
        return epx.f(this.a, zgmVar.a) && epx.f(this.b, zgmVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMemberAddLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
