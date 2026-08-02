package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DialogPinMoveCmd.kt */
/* loaded from: classes2.dex */
public final class lim extends xl6<s3q0> {
    public final Peer b;
    public final int c;

    public lim(int i, Peer peer) {
        this.b = peer;
        this.c = i;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-pin-unpin";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Peer peer;
        Object obj;
        ArrayList g = zik0.g(w2wVar.I0().b().e().T());
        L.c("DialogMissedIssue", new gbh(g, 9));
        Iterator it = g.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            peer = this.b;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.vk.im.engine.models.dialogs.b) obj).b == peer.b) {
                break;
            }
        }
        com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
        if (bVar == null) {
            throw new IllegalArgumentException("Dialog(" + peer + ") must be pinned");
        }
        int size = g.size() - this.c;
        ArrayList arrayList = new ArrayList(g);
        if (arrayList.size() > 1) {
            g5g.L(arrayList, new ocj(1));
        }
        arrayList.remove(arrayList.indexOf(bVar));
        arrayList.add(size, bVar);
        w2wVar.I0().u(new cqf(arrayList, 12));
        w2wVar.O0().c(new zj(24));
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.b) it2.next()).b));
        }
        w2wVar.O0().a(new njm(arrayList2, 2000L));
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new q680(this));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lim)) {
            return false;
        }
        lim limVar = (lim) obj;
        return epx.f(this.b, limVar.b) && this.c == limVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogPinMoveCmd(peer=");
        sb.append(this.b);
        sb.append(", pinSortId=");
        return vu5.b(sb, this.c, ')');
    }
}
