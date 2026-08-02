package xsna;

import com.vk.dto.common.Peer;

/* compiled from: EduRolesLpEvent.kt */
/* loaded from: classes2.dex */
public final class s6p implements e900 {
    public final Peer a;

    public s6p(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6p) && epx.f(this.a, ((s6p) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("EduRolesLpEvent(user="), this.a, ')');
    }
}
