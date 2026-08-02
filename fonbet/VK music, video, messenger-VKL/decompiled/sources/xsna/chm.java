package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMemberMaxLpEvent.kt */
/* loaded from: classes2.dex */
public final class chm implements e900 {
    public final Peer a;
    public final Peer b;

    public chm(Peer peer, Peer peer2) {
        this.a = peer;
        this.b = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chm)) {
            return false;
        }
        chm chmVar = (chm) obj;
        return epx.f(this.a, chmVar.a) && epx.f(this.b, chmVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMemberMaxLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", member=");
        return eq.a(sb, this.b, ')');
    }
}
