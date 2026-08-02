package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContactsRemoveCmd.kt */
/* loaded from: classes2.dex */
public final class vcj extends le6<s3q0> {
    public final List<Long> b;

    public vcj(List<Long> list) {
        this.b = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        List<Long> list = this.b;
        if (!list.isEmpty()) {
            hpm c = sn.c(w2wVar);
            List<Long> list2 = list;
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                long e = Peer.a.e(longValue, Peer.Type.CONTACT);
                com.vk.im.engine.models.dialogs.b c2 = c.c(e);
                if (c2 != null) {
                    c.v(0, c2.b);
                    w2wVar.S0().V(e);
                }
            }
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                arrayList.add(Peer.a.a(longValue2, Peer.Type.CONTACT));
            }
            w2wVar.L0(this, new y6v(arrayList));
            w2wVar.I0().w().f(list);
            w2wVar.S0().i();
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcj) && epx.f(this.b, ((vcj) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("ContactsRemoveCmd(contactIds="), this.b);
    }
}
