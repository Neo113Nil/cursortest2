package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogAdminRemoveLpEvent.kt */
/* loaded from: classes2.dex */
public final class n9m implements e900 {
    public final Peer a;
    public final Peer b;

    public n9m(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9m)) {
            return false;
        }
        n9m n9mVar = (n9m) obj;
        return epx.f(this.a, n9mVar.a) && epx.f(this.b, n9mVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAdminRemoveLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
