package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ContactsHideNewVkContacts.kt */
/* loaded from: classes2.dex */
public final class ebj extends le6<s3q0> {
    public final Collection<Peer> b;
    public final Object c;

    public ebj(Object obj, Collection collection) {
        this.b = collection;
        this.c = obj;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        hdj w = w2wVar.I0().w();
        Collection<Peer> collection = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            Peer peer = (Peer) obj;
            peer.getClass();
            if (peer.Ab(Peer.Type.USER)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection) {
            Peer peer2 = (Peer) obj2;
            peer2.getClass();
            if (peer2.Ab(Peer.Type.CONTACT)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Long.valueOf(((Peer) it.next()).d));
        }
        Collection values = ((wpp) w2wVar.L0(this, new b1r0(arrayList, Source.CACHE))).c.values();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : values) {
            if (((User) obj3).c != null) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Long l = ((User) it2.next()).c;
            l.getClass();
            arrayList5.add(l);
        }
        ArraySet arraySet = new ArraySet();
        arraySet.addAll(arrayList3);
        arraySet.addAll(arrayList5);
        w.i(arraySet);
        w2wVar.I0().w().q(false);
        w2wVar.S0().i();
        bzp S0 = w2wVar.S0();
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Long.valueOf(((Peer) it3.next()).d));
        }
        bzp.E(S0, arrayList6, arraySet, null, 12);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebj)) {
            return false;
        }
        ebj ebjVar = (ebj) obj;
        return epx.f(this.b, ebjVar.b) && epx.f(this.c, ebjVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsHideNewVkContacts(members=");
        sb.append(this.b);
        sb.append(", changerTag=");
        return k73.c(sb, this.c, ')');
    }
}
