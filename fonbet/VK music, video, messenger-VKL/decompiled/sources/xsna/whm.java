package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMigrateToNewIdLpEvent.kt */
/* loaded from: classes2.dex */
public final class whm implements e900 {
    public final Peer a;
    public final Peer b;

    public whm(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
        if (!peer.Ab(Peer.Type.CONTACT)) {
            throw new IllegalArgumentException(yq.b(peer, "Invalid old dialog — ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whm)) {
            return false;
        }
        whm whmVar = (whm) obj;
        return epx.f(this.a, whmVar.a) && epx.f(this.b, whmVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMigrateToNewIdLpEvent(contact=");
        sb.append(this.a);
        sb.append(", newDialog=");
        return eq.a(sb, this.b, ')');
    }
}
