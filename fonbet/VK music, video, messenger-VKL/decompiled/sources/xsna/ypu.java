package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import java.util.List;

/* compiled from: GroupsGetMembersCmd.kt */
/* loaded from: classes2.dex */
public final class ypu extends le6<List<? extends User>> {
    public final Peer b;
    public final int c;
    public final int d = 1000;
    public final String e = "donut";

    public ypu(int i, Peer peer) {
        this.b = peer;
        this.c = i;
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.le6
    public final List<? extends User> e(w2w w2wVar) {
        return (List) bz2.c(new xpu(this.c, this.d, this.b, this.e), "GroupsGetMembersApiCmd");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypu)) {
            return false;
        }
        ypu ypuVar = (ypu) obj;
        return epx.f(this.b, ypuVar.b) && this.c == ypuVar.c && this.d == ypuVar.d && epx.f(this.e, ypuVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetMembersCmd(group=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", filter=");
        return ho8.a(sb, this.e, ')');
    }
}
