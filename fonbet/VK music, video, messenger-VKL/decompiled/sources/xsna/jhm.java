package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMembersInvalidateEvent.kt */
/* loaded from: classes2.dex */
public final class jhm implements e900 {
    public final Peer a;

    public jhm(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhm) && epx.f(this.a, ((jhm) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogMembersInvalidateEvent(dialog="), this.a, ')');
    }
}
