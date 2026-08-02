package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import java.util.List;

/* compiled from: DonutGetFriendsCmd.kt */
/* loaded from: classes2.dex */
public final class xzn extends le6<List<? extends User>> {
    public final Peer b;
    public final int c;
    public final int d = 100;

    public xzn(int i, Peer peer) {
        this.b = peer;
        this.c = i;
    }

    @Override // xsna.le6
    public final List<? extends User> e(w2w w2wVar) {
        return (List) bz2.c(new wzn(this.c, this.d, this.b), "DonutGetFriendsApiCmd");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzn)) {
            return false;
        }
        xzn xznVar = (xzn) obj;
        return epx.f(this.b, xznVar.b) && this.c == xznVar.c && this.d == xznVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGetFriendsCmd(owner=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", count=");
        return vu5.b(sb, this.d, ')');
    }
}
