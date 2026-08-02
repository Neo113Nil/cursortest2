package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogsIdList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: AddDialogsToRecentCmd.kt */
/* loaded from: classes2.dex */
public final class gl0 extends le6<s3q0> {
    public final List<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public gl0(List<? extends Peer> list) {
        this.b = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        List<Peer> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!epx.f((Peer) obj, w2wVar.H0())) {
                arrayList.add(obj);
            }
        }
        czh0 v = w2wVar.I0().v();
        DialogsIdList q = v.q();
        w2wVar.getConfig().getClass();
        ArrayList arrayList2 = new ArrayList(q.b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Peer peer = (Peer) it.next();
            arrayList2.remove(Long.valueOf(peer.b));
            arrayList2.add(0, Long.valueOf(peer.b));
        }
        v.c(new DialogsIdList(j5g.H0(arrayList2, 10)));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl0) && epx.f(this.b, ((gl0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("AddDialogsToRecentCmd(peers="), this.b);
    }

    public gl0(Peer peer) {
        this((List<? extends Peer>) Collections.singletonList(peer));
    }
}
