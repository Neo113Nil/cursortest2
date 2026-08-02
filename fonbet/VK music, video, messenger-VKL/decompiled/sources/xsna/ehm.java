package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMemberRemoveLpEvent.kt */
/* loaded from: classes2.dex */
public final class ehm implements e900 {
    public final Peer a;
    public final Peer b;

    public ehm(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehm)) {
            return false;
        }
        ehm ehmVar = (ehm) obj;
        return epx.f(this.a, ehmVar.a) && epx.f(this.b, ehmVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMemberRemoveLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
