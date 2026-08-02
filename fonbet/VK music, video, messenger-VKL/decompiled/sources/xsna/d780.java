package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ManagedGroupEngineEvent.kt */
/* loaded from: classes2.dex */
public final class d780 extends wh00 {
    public final l8q0 b;
    public final Peer.Group c;
    public final int d;

    public d780(l8q0 l8q0Var, Peer.Group group, int i) {
        this.b = l8q0Var;
        this.c = group;
        this.d = i;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d780)) {
            return false;
        }
        d780 d780Var = (d780) obj;
        return epx.f(this.b, d780Var.b) && epx.f(this.c, d780Var.c) && this.d == d780Var.d;
    }

    public final int hashCode() {
        l8q0 l8q0Var = this.b;
        return Integer.hashCode(this.d) + bh10.a((l8q0Var == null ? 0 : l8q0Var.hashCode()) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnManagedGroupCounterUpdateEngineEvent(changerTag=");
        sb.append(this.b);
        sb.append(", peer=");
        sb.append(this.c);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.d, ')');
    }
}
