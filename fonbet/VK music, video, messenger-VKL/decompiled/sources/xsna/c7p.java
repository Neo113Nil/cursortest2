package xsna;

import com.vk.dto.common.Peer;

/* compiled from: EduScheduleLpEvent.kt */
/* loaded from: classes2.dex */
public final class c7p implements e900 {
    public final Peer a;

    public c7p(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7p) && epx.f(this.a, ((c7p) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("UpdateUserSchedule(user="), this.a, ')');
    }
}
