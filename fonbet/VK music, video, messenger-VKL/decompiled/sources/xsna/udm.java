package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogFullUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class udm implements e900 {
    public final Peer a;

    public udm(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udm) && epx.f(this.a, ((udm) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogFullUpdateLpEvent(dialog="), this.a, ')');
    }
}
