package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: DeadDialogsUpdateCommand.kt */
/* loaded from: classes2.dex */
public final class g2l extends xl6<s3q0> {
    public final List<Peer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public g2l(List<? extends Peer> list) {
        this.b = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialogs-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        List<Peer> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        Set<Long> K = c.K(arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(K, 10));
        Iterator<T> it2 = K.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue));
        }
        if (!arrayList2.isEmpty()) {
            Collection values = ((wpp) w2wVar.b1(this, new tqm(new sqm(arrayList2, Source.NETWORK, false, null, 0, 28)))).c.values();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : values) {
                if (!((Dialog) obj).wc()) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((Dialog) it3.next()).Sb());
            }
            if (!arrayList4.isEmpty()) {
                w2wVar.S0().n("DeadDialogsUpdate", arrayList4);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2l) && epx.f(this.b, ((g2l) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("DeadDialogsUpdateCommand(peers="), this.b);
    }
}
