package xsna;

import com.vk.dto.common.Peer;

/* compiled from: UpdateManagedGroupUnreadCountCmd.kt */
/* loaded from: classes2.dex */
public final class l8q0 extends le6<s3q0> {
    public final Peer.Group b;
    public final int c;

    public l8q0(Peer.Group group, int i) {
        this.b = group;
        this.c = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().u(new r5i0(6, w2wVar, this));
        w2wVar.e1(this, new d780(this, this.b, this.c));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8q0)) {
            return false;
        }
        l8q0 l8q0Var = (l8q0) obj;
        return epx.f(this.b, l8q0Var.b) && this.c == l8q0Var.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateManagedGroupUnreadCountCmd(group=");
        sb.append(this.b);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.c, ')');
    }
}
