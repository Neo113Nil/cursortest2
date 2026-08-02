package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FriendsGetMutualApiCmd.kt */
/* loaded from: classes2.dex */
public final class qos extends nx2<List<? extends Peer>> {
    public final Peer b;
    public final Peer c;
    public final int d = Integer.MAX_VALUE;
    public final boolean e;

    public qos(Peer peer, Peer peer2, boolean z) {
        this.b = peer;
        this.c = peer2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qos)) {
            return false;
        }
        qos qosVar = (qos) obj;
        return epx.f(this.b, qosVar.b) && epx.f(this.c, qosVar.c) && this.d == qosVar.d && this.e == qosVar.e;
    }

    @Override // xsna.nx2
    public final List<? extends Peer> f(l7r0 l7r0Var) {
        Iterable iterable = (Iterable) bz2.l(nts.r(new ots(), com.vk.dto.common.a.b(this.b), com.vk.dto.common.a.b(this.c), Integer.valueOf(this.d), 108), this.e);
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.a((UserId) it.next()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetMutualApiCmd(currentPeer=");
        sb.append(this.b);
        sb.append(", targetPeer=");
        sb.append(this.c);
        sb.append(", limit=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
