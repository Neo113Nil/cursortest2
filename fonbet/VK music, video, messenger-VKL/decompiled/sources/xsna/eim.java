package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogOwnerUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class eim implements e900 {
    public final Peer a;
    public final Peer b;

    public eim(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eim)) {
            return false;
        }
        eim eimVar = (eim) obj;
        return epx.f(this.a, eimVar.a) && epx.f(this.b, eimVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogOwnerUpdateEvent(dialog=");
        sb.append(this.a);
        sb.append(", newOwner=");
        return eq.a(sb, this.b, ')');
    }
}
