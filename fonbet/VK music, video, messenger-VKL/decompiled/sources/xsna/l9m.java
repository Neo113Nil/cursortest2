package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogAdminAddLpEvent.kt */
/* loaded from: classes2.dex */
public final class l9m implements e900 {
    public final Peer a;
    public final Peer b;

    public l9m(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9m)) {
            return false;
        }
        l9m l9mVar = (l9m) obj;
        return epx.f(this.a, l9mVar.a) && epx.f(this.b, l9mVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAdminAddLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
